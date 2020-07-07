package com.example.restexample.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.restexample.model.Address;
import com.example.restexample.service.AddressService;

import java.util.Optional;

import static com.example.restexample.model.Address.*;

@Service
public class AddressServiceImpl implements AddressService {

	private final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

	/**
	 * Generating random address
	 * @return random address
	 */
	@Override
	public Address findRandomizedAddress() {

		logger.info("Generating a random Address");

		return new Address(
				random_house(),
				random_street(),
				random_postalCode(),
				random_city(),
				random_county(),
				Optional.of(random_state()),
				Optional.of(random_stateCode()),
				Optional.of(random_country()),
				random_countryCode()
		);
	}
}
