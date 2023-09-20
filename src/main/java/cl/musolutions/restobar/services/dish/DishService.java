package cl.musolutions.restobar.services.dish;

import cl.musolutions.restobar.entities.Dish;
import cl.musolutions.restobar.services.CommonFoodService;

import java.util.List;

public interface DishService extends CommonFoodService<Dish> {
    String add(Dish dish);
}
