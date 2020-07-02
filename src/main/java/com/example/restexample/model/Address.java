package com.example.restexample.model;

import com.example.restexample.util.RandomClassGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor
public class Address {

	private String house;
	private String street;
	private String postalCode;
	private String city;
	private String county;
	private String state;
	private String stateCode;
	private String country;
	private String countryCode;

	enum Country {
		US,
		Canada,
		Mexico,
		Netherland
	}

	enum StreetNames{
		Allen,
		Alexandr,
		Apollo,
		Bladwin,
		Beacon,
		Bergen,
		Broadway,
		Brown,
		East,
		Fairmount,
		Ferry,
		Fulton,
		Grove
	}

	enum Street{
		Street,
		Avenue
	}

	enum City {
		NewYork,
		LosAngeles,
		Chicago,
		Houston,
		Phoenix,
		Philadelphia,
		SanAntonio,
		SanDiego,
		Dallas,
		SanJose
	}

	enum County{
		Washington,
		Jefferson,
		Franklin,
		Jackson,
		Lincoln,
		Madison,
		Clay,
		Montgomery,
		Union,
		Monroe,
		Wayne
	}

	enum State{
		California,
		Texas,
		Florida,
		NewYork,
		Pennsylvania,
		Illinois,
		Ohio,
		Georgia,
		NorthCarolina
	}

	static final String SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static String random_house(){
		return RandomClassGenerator.numberGenerator(1, 600);
	}

	public static String random_street(){
		return RandomClassGenerator.enumGenerator(StreetNames.class) + " " +
				RandomClassGenerator.enumGenerator(Street.class);
	}

	public static String random_postalCode(){
		return RandomClassGenerator.numberGenerator(10000, 99999);
	}

	public static String random_city(){
		return RandomClassGenerator.enumGenerator(City.class);
	}

	public static String random_county(){
		return RandomClassGenerator.enumGenerator(County.class);
	}

	public static String random_state(){
		return RandomClassGenerator.enumGenerator(State.class);
	}

	public static String random_stateCode(){
		return RandomClassGenerator.stringGenerator(2, SOURCE);
	}

	public static String random_country(){
		return RandomClassGenerator.enumGenerator(Country.class);
	}

	public static String random_countryCode(){
		return RandomClassGenerator.numberGenerator(100, 200);
	}

}
