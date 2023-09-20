package cl.musolutions.restobar.controllers;

import cl.musolutions.restobar.entities.Cocktail;
import cl.musolutions.restobar.services.cocktail.CocktailService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocktailController {
    @Autowired
    private CocktailService cocktailService;

    @GetMapping("/cocktails")
    public ResponseEntity<Iterable<Cocktail>> get(){
        try{
            return ResponseEntity.ok(cocktailService.get());
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/cocktail")
    public ResponseEntity<String> add(@RequestBody Cocktail cocktail){
        System.out.println(cocktail);
        try{
            return ResponseEntity.ok(cocktailService.add(cocktail));
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
}
