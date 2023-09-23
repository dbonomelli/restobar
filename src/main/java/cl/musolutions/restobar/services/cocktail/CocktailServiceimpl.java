package cl.musolutions.restobar.services.cocktail;


import cl.musolutions.restobar.entities.Cocktail;
import cl.musolutions.restobar.repositories.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class CocktailServiceimpl implements CocktailService{
    @Autowired
    private CocktailRepository cocktailRepository;

    @Override
    public Iterable<Cocktail> get() {
        return cocktailRepository.findAll();
    }

    @Override
    public String add(Cocktail cocktail) {
        try{
            cocktailRepository.save(cocktail);
            return "Cocktail inserted successfully";
        }catch (Exception ex){
            return "There was a problem inserting a cocktail, error: " + ex;
        }
    }

    @Override
    public Cocktail edit(int id, Cocktail editCocktail) {
        try{
            boolean existsDrink = cocktailRepository.findById(id).isPresent();
            if(existsDrink){
                Cocktail savedCocktail = cocktailRepository.findById(id).get();
                savedCocktail.setName(editCocktail.getName());
                savedCocktail.setAlcoholLevel(editCocktail.getAlcoholLevel());
                cocktailRepository.save(savedCocktail);
                return savedCocktail;
            }else{
                return null;
            }
        }catch (Exception ex){
            return null;
        }

    }

    @Override
    public Cocktail delete(int id) {
        try{
            boolean existingCocktail = cocktailRepository.findById(id).isPresent();
            if(existingCocktail){
                Cocktail toBeDeletedCocktail = cocktailRepository.findById(id).get();
                cocktailRepository.deleteById(id);
                return toBeDeletedCocktail;
            }else{
                return null;
            }
        }catch (Exception ex){
            return null;
        }
    }
}
