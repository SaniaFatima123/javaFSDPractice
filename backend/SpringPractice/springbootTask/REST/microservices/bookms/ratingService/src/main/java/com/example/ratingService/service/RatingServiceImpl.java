package com.example.ratingService.service;

import com.example.ratingService.entity.Rating;
import com.example.ratingService.exception.RatingNotFoundException;
import com.example.ratingService.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements IRatingService{
    @Autowired
    private RatingRepository repository;
    @Override
    public Rating add(Rating rating) {
       String ratingId = UUID.randomUUID().toString();
       rating.setRatingId(ratingId);
       return repository.save(rating);

    }

    @Override
    public Rating findByRatingId(String ratingId) {
       Rating rating = repository.findById(ratingId).orElseThrow(()->new RatingNotFoundException("Ratings not found for Rating Id"+ratingId));
       return rating;
    }

    @Override
    public List<Rating> findByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> findAll() {
        return repository.findAll();
    }
}
