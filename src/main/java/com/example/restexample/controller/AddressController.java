package com.example.restexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private final Logger logger = LoggerFactory.getLogger(AddressController.class);

	@Autowired
	private AddressService address;

	/**
	 * get HTTP response via an api endpoint "/randomizer/address"
	 * @return address ResponseEntity in a JSON format
	 */
	@GetMapping(value = "/randomizer/address",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Address> getRandomizedAddress() {
		Address addr = address.findRandomizedAddress();

		logger.info("Generating a random address HTTP response");

		if (addr == null) {
			return new ResponseEntity<>(addr, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(addr, HttpStatus.OK);
	}

}

