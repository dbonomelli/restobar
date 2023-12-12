package cl.musolutions.restobar.services.cocktail;


import cl.musolutions.restobar.entities.AlcoholType;
import cl.musolutions.restobar.entities.Cocktail;
import cl.musolutions.restobar.repositories.AlcoholTypeRepository;
import cl.musolutions.restobar.repositories.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CocktailServiceimpl implements CocktailService{
    @Autowired
    private CocktailRepository cocktailRepository;

    @Autowired
    private AlcoholTypeRepository alcoholTypeRepository;

    @Override
    public Iterable<Cocktail> get() {
        return cocktailRepository.findAll();
    }

    @Override
    public String add(Cocktail cocktail) {
        try{
            //TODO: Check if the alcohol type exists
            //TODO: Change alcoholType id before save
            if(alcoholTypeRepository.findById(cocktail.getAlcoholType().getIdAlcoholType()).isPresent()){
                return null;
            }
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
