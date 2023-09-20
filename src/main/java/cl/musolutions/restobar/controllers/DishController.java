package cl.musolutions.restobar.controllers;

import cl.musolutions.restobar.entities.Dish;
import cl.musolutions.restobar.services.CommonFoodService;
import cl.musolutions.restobar.services.dish.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DishController {
    @Autowired
    private CommonFoodService<Dish> commonFoodService;
    @Autowired
    private DishService dishService;
    @GetMapping("/dishes")
    public ResponseEntity<Iterable<Dish>> get(){
        try{
            return ResponseEntity.ok(commonFoodService.get());
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
    @PostMapping("/dishes")
    public ResponseEntity<String> add(@RequestBody Dish dish){
        try{
            return ResponseEntity.ok(dishService.add(dish));
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
}
