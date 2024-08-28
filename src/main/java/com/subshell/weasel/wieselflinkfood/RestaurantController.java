package com.subshell.weasel.wieselflinkfood;

import com.subshell.weasel.wieselflinkfood.model.Restaurant;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is a simple Spring Boot RestController.
 * The endpoint to get all restaurants is available at http://localhost:8080/api/restaurant
 */
@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {

	private final RestaurantService restaurantService;

	public RestaurantController(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}

	@GetMapping("")
	public Set<Restaurant> getAllRestaurants() {
		return restaurantService.getRestaurants();
	}

	@GetMapping("/{name}")
	public Restaurant getRestaurant(@PathVariable String name) {
		return restaurantService.getRestaurants()
				.stream()
				.filter(restaurant -> restaurant.getName()
						.equals(name))
				.findFirst()
				.orElseThrow();
	}

}
