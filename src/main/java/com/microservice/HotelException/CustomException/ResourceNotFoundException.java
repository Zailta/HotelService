package com.microservice.HotelException.CustomException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String resourceName;
private String fieldName;
private String resourceValue;

public ResourceNotFoundException(String resourceName, String fieldName, String resourceValue) {
	super(String.format("%s not found with %s : %s", resourceName, fieldName, resourceValue));
	this.resourceName = resourceName;
	this.fieldName = fieldName;
	this.resourceValue = resourceValue;
}



}
