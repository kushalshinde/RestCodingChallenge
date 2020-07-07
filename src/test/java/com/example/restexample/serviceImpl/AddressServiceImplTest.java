package com.example.restexample.serviceImpl;

import com.example.restexample.service.AddressService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AddressServiceImplTest {

    @Autowired
    AddressService addressService;

    @Test
    @DisplayName("Test a valid House number generated")
    public void testRandomHouseNumber(){
        assertTrue(addressService.findRandomizedAddress().getHouse().matches("^[0-9]+$"));
    }

    @Test
    @DisplayName("Test a valid Street generated")
    public void testRandomStreet(){
        assertNotNull(addressService.findRandomizedAddress().getStreet());
    }

    @Test
    @DisplayName("Test a valid Postal Code generated")
    public void testRandomPostalCode(){
        assertTrue(addressService.findRandomizedAddress().getPostalCode().length() == 5);
    }

    @Test
    @DisplayName("Test a valid City generated")
    public void testRandomCityName(){
        assertNotNull(addressService.findRandomizedAddress().getCity());
    }

    @Test
    @DisplayName("Test a valid Country generated")
    public void testRandomCountryName(){
        assertNotNull(addressService.findRandomizedAddress().getCounty());
    }

    @Test
    @DisplayName("Test a valid Country Code generated")
    public void testRandomCountryCode(){
        assertTrue(addressService.findRandomizedAddress().getCountryCode().length() == 3);
    }

    @Test
    @DisplayName("Test a valid State generated")
    public void testRandomStateName(){
        assertNotNull(addressService.findRandomizedAddress().getState());
    }

    @Test
    @DisplayName("Test a valid State Code generated")
    public void testRandomStateCode(){
        assertNotNull(addressService.findRandomizedAddress().getStateCode());
    }


}