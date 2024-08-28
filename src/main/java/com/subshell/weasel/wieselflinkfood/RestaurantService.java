package com.subshell.weasel.wieselflinkfood;

import com.subshell.weasel.wieselflinkfood.model.Restaurant;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

	private final Set<Restaurant> restaurants = new HashSet<>();

	public void addRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
	}

	public Set<Restaurant> getRestaurants() {
		return Collections.unmodifiableSet(restaurants);
	}

	//TODO: add other methods as needed

}
