package cl.musolutions.restobar.services.table;

import cl.musolutions.restobar.entities.Tables;

public interface TablesService {

    Iterable<Tables> get();
    String add(Tables table);
}
