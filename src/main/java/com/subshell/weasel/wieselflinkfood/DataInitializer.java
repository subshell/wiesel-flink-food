package com.subshell.weasel.wieselflinkfood;

import com.subshell.weasel.wieselflinkfood.model.Restaurant;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * The purpose of this class is to initialize the application with some ready-to-work-with data
 * upon startup.
 */
@Component
public class DataInitializer {

	private final RestaurantService restaurantService;

	public DataInitializer(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}

	/**
	 * This method prepares the restaurants and tables that user then can book
	 */
	@PostConstruct
	private void initializeData() {
		Restaurant restaurant1 = new Restaurant("Oberhafenkantine");
		//TODO: continue initialization
		restaurantService.addRestaurant(restaurant1);

		Restaurant restaurant2 = new Restaurant("Katzentempel");
		//TODO: continue initialization
		restaurantService.addRestaurant(restaurant2);
	}

}
