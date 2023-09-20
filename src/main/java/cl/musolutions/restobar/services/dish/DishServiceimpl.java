package cl.musolutions.restobar.services.dish;

import cl.musolutions.restobar.entities.Dish;
import cl.musolutions.restobar.repositories.DishRepository;
import cl.musolutions.restobar.services.dish.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishServiceimpl implements DishService {

    @Autowired
    private DishRepository dishRepository;
    @Override
    public Iterable<Dish> get() {
        return dishRepository.findAll();
    }

    @Override
    public String add(Dish dish) {
        try{
            dishRepository.save(dish);
            return "Dish saved successfully";
        }catch (Exception ex){
            return "there was an error inserting the dish, error: " + ex;
        }



    }
}
