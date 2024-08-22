package ku.cs.restaurant.repository;

import ku.cs.restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

//Chutipong Triyasith 6510450291
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {

    Restaurant findByName(String name);
    List<Restaurant> findByLocation(String location);
}
