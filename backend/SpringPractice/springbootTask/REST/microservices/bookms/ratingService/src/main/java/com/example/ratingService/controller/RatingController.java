package com.example.ratingService.controller;

import com.example.ratingService.entity.Rating;
import com.example.ratingService.service.IRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private IRatingService service;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public Rating add(@RequestBody Rating rating){
       return service.add(rating);
    }
    @GetMapping("/findrating/byratingid/{ratingId}")
    public Rating findRatingByRatingId(@PathVariable String ratingId){
        return service.findByRatingId(ratingId);
    }
    @GetMapping("/findrating/byuserid/{userId}")
    public List<Rating> findRatingsByUserId(@PathVariable String userId){
        List<Rating> rating = service.findByUserId(userId);
        return rating;
    }
    @GetMapping("/findall")
    public List<Rating> findAllRatings(){
        return service.findAll();
    }
}
