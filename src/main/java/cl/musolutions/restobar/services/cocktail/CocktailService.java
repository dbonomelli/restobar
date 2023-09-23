package cl.musolutions.restobar.services.cocktail;

import cl.musolutions.restobar.entities.Cocktail;
import cl.musolutions.restobar.services.CommonFoodService;

public interface CocktailService extends CommonFoodService<Cocktail> {
    String add(Cocktail cocktail);
    Cocktail edit(int id, Cocktail editCocktail);
    Cocktail delete(int id);

}
