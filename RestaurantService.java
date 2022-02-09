import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName){
        final String restaurantName1 = restaurantName;
        for (Restaurant restaurant : restaurants) {

            if (restaurant.getName().equals(restaurantName1)) {
                return restaurant;
            }
    }

    public Restaurant addRestaurant(String String name; String location;
         LocalTime LocalTime;
        java.time.LocalTime openingTime;
        openingTime, LocalTime LocalTime closingTime; )
        {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName1) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName1);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
