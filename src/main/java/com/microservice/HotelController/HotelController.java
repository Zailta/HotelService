package com.microservice.HotelController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.HotelEntity.HotelEntity;
import com.microservice.HotelService.HotelServiceLayer;


@RestController
@RequestMapping(value = "/microservice/hotel")
public class HotelController {

	@Autowired
	HotelServiceLayer service;
	//create user
	
	@PostMapping(value = "/create")
	public ResponseEntity<HotelEntity> createUser( @RequestBody HotelEntity bean){
		HotelEntity creatdHotel = service.createUser(bean);
		return ResponseEntity.ok(creatdHotel);
	}
	//findSingle User
	@GetMapping(value = "/{hotelId}")
	public ResponseEntity<HotelEntity> findUser( @PathVariable String hotelId){
		HotelEntity singleHotel = service.getSingleUser(hotelId);
		return ResponseEntity.ok(singleHotel);
	}
	
	//FindAllusers
	@GetMapping(value = "/")
	public ResponseEntity<List<HotelEntity>> findAll(){
		List<HotelEntity> allHotels = service.getAllIUsers();
		return ResponseEntity.ok(allHotels);
	}
}
