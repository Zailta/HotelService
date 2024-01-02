package com.microservice.HotelService.ServiceInterface;

import java.util.List;

import com.microservice.HotelEntity.HotelEntity;


public interface HotelServiceInterface {
	HotelEntity createUser(HotelEntity bean);
	HotelEntity getSingleUser(String userid);
	List<HotelEntity> getAllIUsers();
}
