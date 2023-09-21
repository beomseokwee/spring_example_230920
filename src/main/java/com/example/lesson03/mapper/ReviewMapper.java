package com.example.lesson03.mapper;

import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;

@Service
public interface ReviewMapper {
	public Review selectReview();
	

}
