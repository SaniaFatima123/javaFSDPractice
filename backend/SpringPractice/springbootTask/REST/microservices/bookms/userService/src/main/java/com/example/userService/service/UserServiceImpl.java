package com.example.userService.service;

import com.example.userService.entities.Book;
import com.example.userService.entities.Rating;
import com.example.userService.entities.User;
import com.example.userService.exception.UserNotFoundException;
import com.example.userService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserRepository repository;

    @Override
    public User add(User user) {
        String userId = UUID.randomUUID().toString();
        user.setUserId(userId);
        return repository.save(user);
    }


    @Override
    public User findByUserId(String userId) {
        User user = repository.findById(userId).orElseThrow(() -> new UserNotFoundException("user with id " + userId + " is not found."));
        Rating[] ratings = restTemplate.getForObject("http://RATING-SERVICE/ratings/findrating/byuserid/" + user.getUserId(), Rating[].class);
        List<Rating> ratingList = Arrays.asList(ratings);
        for (Rating rating : ratingList) {
            Book book = restTemplate.getForObject("http://BOOK-SERVICE/books/findbook/bybookid?bookId=" + rating.getBookId(), Book.class);
            rating.setBook(book);
        }
        user.setRatings(ratingList);
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> users = repository.findAll();
        for (User user : users) {
            //changing host name and port to service name
            // Rating[] ratings = restTemplate.getForObject("http://localhost:8080/ratings/findrating/byuserid/" + user.getUserId(), Rating[].class);
            Rating[] ratings = restTemplate.getForObject("http://RATING-SERVICE/ratings/findrating/byuserid/" + user.getUserId(), Rating[].class);
            List<Rating> ratingList = Arrays.asList(ratings);
            for (Rating rating : ratingList) {
                Book book = restTemplate.getForObject("http://BOOK-SERVICE/books/findbook/bybookid?bookId=" + rating.getBookId(), Book.class);
                rating.setBook(book);
            }
            user.setRatings(ratingList);

        }
        return users;
    }
}
