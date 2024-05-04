package com.microservice.HotelException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.microservice.HotelException.CustomException.ResourceNotFoundException;
import com.microservice.HotelUntility.APIResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<APIResponse> resourceNotFoundException(ResourceNotFoundException ex){
		String message = ex.getMessage();
		APIResponse apiResponse = new  APIResponse(message, false, HttpStatus.NOT_FOUND);
		return new ResponseEntity<APIResponse>(apiResponse,HttpStatus.NOT_FOUND);
		
	}

}
