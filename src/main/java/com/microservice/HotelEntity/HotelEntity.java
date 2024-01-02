package com.microservice.HotelEntity;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HotelEntity {
	@Id
	@UuidGenerator
	private String hotelId;
	private String hotelName;
	private String location;
	private String about;

}
