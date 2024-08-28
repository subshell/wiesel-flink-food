package com.subshell.weasel.wieselflinkfood.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaurantTest {

	private Restaurant sampleRestaurant;

	@BeforeEach
	void setUp() {
		sampleRestaurant = new Restaurant("Wiesel Flinkenwerder");
	}

	@Test
	void testHasAvailableTable() {
		//TODO: add sample tables and test whether the restaurant has available seats
		fail("implement me");
	}

	@Test
	void testBookTableSuccess() {
		//TODO: the checked call could be something like: sampleRestaurant.bookTable("F. Weasel", 5);
		fail("implement me");
	}

	@Test
	void testBookTableFailure1() {
		//TODO: the checked call could be something like: sampleRestaurant.bookTable("F. Weasel", -17);
		fail("implement me");
	}

	@Test
	void testBookTableFailure2() {
		//TODO: the checked call could be something like: sampleRestaurant.bookTable("F. Weasel", 50000);
		fail("implement me");
	}

	//TODO: add more tests if needed

}