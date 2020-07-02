package com.example.restexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restexample.model.Address;
import com.example.restexample.service.AddressService;


@RestController
public class AddressController {
	
	@Autowired
	private AddressService address;
	
	@GetMapping(value = "/randomizer/address",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Address> getRandomizedAddress() {
		Address addr = address.findRandomizedAddress();

		if (addr == null) {
			return new ResponseEntity<>(addr, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(addr, HttpStatus.OK);
	}

}

