package cl.musolutions.restobar.repositories;

import cl.musolutions.restobar.entities.Cocktail;
import org.springframework.data.repository.CrudRepository;

public interface CocktailRepository extends CrudRepository<Cocktail, Integer> {
}
