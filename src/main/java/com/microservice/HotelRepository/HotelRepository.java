package com.microservice.HotelRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.HotelEntity.HotelEntity;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, String>{

}
