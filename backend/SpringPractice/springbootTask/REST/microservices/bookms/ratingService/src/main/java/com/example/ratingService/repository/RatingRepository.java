package com.example.ratingService.repository;

import com.example.ratingService.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating,String> {
    List<Rating> findByUserId(String userId);
}
