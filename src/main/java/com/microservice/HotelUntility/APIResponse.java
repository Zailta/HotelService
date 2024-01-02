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
}
