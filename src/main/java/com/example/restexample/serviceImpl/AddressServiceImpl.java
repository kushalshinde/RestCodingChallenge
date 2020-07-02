package com.example.restexample.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.restexample.model.Address;
import com.example.restexample.service.AddressService;

import static com.example.restexample.model.Address.*;

@Service
public class AddressServiceImpl implements AddressService {

	@Override
	public Address findRandomizedAddress() {
		return new Address(
				random_house(),
				random_street(),
				random_postalCode(),
				random_city(),
				random_county(),
				random_state(),
				random_stateCode(),
				random_country(),
				random_countryCode()
		);
	}

}
