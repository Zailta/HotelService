package com.microservice.HotelService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.HotelEntity.HotelEntity;
import com.microservice.HotelException.CustomException.ResourceNotFoundException;
import com.microservice.HotelRepository.HotelRepository;
import com.microservice.HotelService.ServiceInterface.HotelServiceInterface;

@Service
public class HotelServiceLayer implements HotelServiceInterface{

	@Autowired
	HotelRepository hotelRepository;
	@Override
	public HotelEntity createUser(HotelEntity bean) {
		HotelEntity savedHotel = hotelRepository.save(bean);
		return savedHotel;
	}

	@Override
	public HotelEntity getSingleUser(String userid) {
		HotelEntity singleHotel = hotelRepository.findById(userid).orElseThrow(()-> new ResourceNotFoundException("User", "ID", userid));
		return singleHotel;
	}

	@Override
	public List<HotelEntity> getAllIUsers() {
		List<HotelEntity> allHotels = hotelRepository.findAll();
		
		return allHotels;
	}

	

}
