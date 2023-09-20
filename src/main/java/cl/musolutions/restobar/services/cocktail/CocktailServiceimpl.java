package cl.musolutions.restobar.services.cocktail;


import cl.musolutions.restobar.entities.Cocktail;
import cl.musolutions.restobar.repositories.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
