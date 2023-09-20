package cl.musolutions.restobar.services;

import java.util.List;

public interface CommonFoodService<F> {
    Iterable<F> get();
}
