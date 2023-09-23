package cl.musolutions.restobar.controllers;

import cl.musolutions.restobar.entities.Cocktail;
import cl.musolutions.restobar.services.cocktail.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/cocktails")
    public ResponseEntity<String> add(@RequestBody Cocktail cocktail){
        if (cocktail.getAlcoholType() == null){
            return ResponseEntity.badRequest().build();
        }
        try{
            return ResponseEntity.ok(cocktailService.add(cocktail));
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
    @PutMapping("/cocktails/{id}")
    public ResponseEntity<Cocktail> edit(@PathVariable int id,@RequestBody Cocktail editCocktail){
        try{
            Cocktail updatedDrink = cocktailService.edit(id, editCocktail);
            if(updatedDrink != null){
                return ResponseEntity.ok(updatedDrink);
            }else{
                return ResponseEntity.notFound().build();
            }
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("/cocktails/{id}")
    public ResponseEntity<Cocktail> delete(@PathVariable int id){
        try{
            Cocktail toBeDeletedCocktail = cocktailService.delete(id);
            if(toBeDeletedCocktail != null){
                return ResponseEntity.ok(toBeDeletedCocktail);
            }else{
                return ResponseEntity.notFound().build();
            }
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
}
