package com.example.restexample.model;

import com.example.restexample.util.RandomClassGenerator;
import com.neovisionaries.i18n.CountryCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter@Setter@AllArgsConstructor
public class Address {

	private String house;
	private String street;
	private String postalCode;
	private String city;
	private String county;
	private Optional<String> state;
	private Optional<String> stateCode;
	private Optional<String> country;
	private String countryCode;

	static String keyContryNameCode;
	static Map<String, String> map= new HashMap<>();

	static {
		map.put("US", "US");
		map.put("MX", "Mexico");
		map.put("CA", "Canada");
		map.put("NL", "Netherlands");
	}

	private enum StreetNames{
		Allen, Alexandr, Apollo, Bladwin, Beacon, Bergen, Broadway, Brown, East, Fairmount, Ferry, Fulton, Grove
	}

	private enum Street{
		Street, Avenue
	}

	private enum City {
		NewYork, LosAngeles, Chicago, Houston, Phoenix, Philadelphia, SanAntonio, SanDiego, Dallas, SanJose
	}

	private enum County{
		Washington, Jefferson, Franklin, Jackson, Lincoln, Madison, Clay, Montgomery, Union, Monroe, Wayne
	}

	private enum State{
		California, Texas, Florida, NewYork, Pennsylvania, Illinois, Ohio, Georgia, NorthCarolina
	}

	private enum StateCode{
		AL, AZ, AR, CA, CO, CT, DC, FL, NJ, NV, NY, OR, TN, TX, UT, WA
	}

	static final String SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	/**
	 * Generate a random house
	 * @return house
	 */
	public static String random_house(){
		return RandomClassGenerator.numberGenerator(1, 600);
	}

	/**
	 * Generate a random street
	 * @return street
	 */
	public static String random_street(){
		return RandomClassGenerator.enumGenerator(StreetNames.class) + " " +
				RandomClassGenerator.enumGenerator(Street.class);
	}

	/**
	 * Generate a random postal code
	 * @return postalCode
	 */
	public static String random_postalCode(){
		return RandomClassGenerator.numberGenerator(10000, 99999);
	}

	/**
	 * Generate a random city
	 * @return city
	 */
	public static String random_city(){
		return RandomClassGenerator.enumGenerator(City.class);
	}

	/**
	 * Generate a random county
	 * @return county
	 */
	public static String random_county(){
		return RandomClassGenerator.enumGenerator(County.class);
	}

	/**
	 * Generate a random state
	 * @return state
	 */
	public static String random_state(){
		return RandomClassGenerator.enumGenerator(State.class);
	}

	/**
	 * Generate a random stateCode
	 * @return stateCode
	 */
	public static String random_stateCode(){
		return RandomClassGenerator.enumGenerator(StateCode.class);
	}

	/**
	 * Generate a random Country
	 * @return Country
	 */
	public static String random_country(){
		keyContryNameCode = RandomClassGenerator.mapGenerator(map);
		return map.get(keyContryNameCode);
	}

	/**
	 * Generate a CountryCode having ISO 3166-1 alpha-3 code format
	 * @return CountryCode
	 */
	public static String random_countryCode(){
		CountryCode countryCode = CountryCode.getByCode(keyContryNameCode);
		return countryCode.getAlpha3();
	}
}
