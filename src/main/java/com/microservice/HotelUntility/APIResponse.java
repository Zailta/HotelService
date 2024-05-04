package com.microservice.HotelUntility;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class APIResponse {

	private String message;
	private Boolean responseFlag;
	private HttpStatus status;
	
	public APIResponse(String message, Boolean responseFlag, HttpStatus status) {
		super();
		this.message = message;
		this.responseFlag = responseFlag;
		this.status = status;
	}
	
}
