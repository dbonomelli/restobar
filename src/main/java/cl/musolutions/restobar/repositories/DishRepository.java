package cl.musolutions.restobar.repositories;

import cl.musolutions.restobar.entities.Dish;
import org.springframework.data.repository.CrudRepository;

public interface DishRepository extends CrudRepository<Dish,Integer> {

}
