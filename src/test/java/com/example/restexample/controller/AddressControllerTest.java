package com.example.restexample.controller;

import com.example.restexample.model.Address;
import com.example.restexample.service.AddressService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

@ExtendWith(SpringExtension.class)
class AddressControllerTest {

    @Mock
    AddressService addressService;

    @InjectMocks
    AddressController addressController;
    MockMvc mockMvc;

    @BeforeEach
    public void init(){
        mockMvc = MockMvcBuilders.standaloneSetup(addressController).build();
    }

    @Test
    @DisplayName("Test Controller Class to Generate An Address")
    public void testRandomizedAddress() throws Exception {
        Mockito
        .when(addressService.findRandomizedAddress())
        .thenReturn(new Address(
                "321",
                "Beacon Street",
                "79549",
                "LosAngeles",
                "Monroe",
                Optional.of("Illinois"),
                Optional.of("HT"),
                Optional.of("Netherlands"),
                "NLD"
        ));

        mockMvc.perform(
                MockMvcRequestBuilders.get("/randomizer/address")
                )
        .andExpect(status().isOk())
        .andExpect(content().json("{\n" +
                "    \"house\": \"321\",\n" +
                "    \"street\": \"Beacon Street\",\n" +
                "    \"postalCode\": \"79549\",\n" +
                "    \"city\": \"LosAngeles\",\n" +
                "    \"county\": \"Monroe\",\n" +
                "    \"state\": \"Illinois\",\n" +
                "    \"stateCode\": \"HT\",\n" +
                "    \"country\": \"Netherlands\",\n" +
                "    \"countryCode\": \"NLD\"\n" +
                "}"));
    }
}