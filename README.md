# Wiesel Flink Food

This application - once it is ready - can handle the seat bookings of all the restaurants belonging to the Wiesel-Flink-Food-Chain.

## How to work with this project

* This project uses Maven as the dependency and build management system.
* The application can be started using the `main` method in the `Application` class. It will spin up a webserver on port 8080.
* Once up and running, you can access its API-methods e.g. here: http://localhost:8080/api/restaurant
* The project requires a Java 21 JDK.
* This project is just a starting point and should be extended as needed.
* The JUnit test class `RestaurantTest` needs to be extended and pass all tests.
* The class `DataInitializer` is used to pre-fill the application with data upon startup