package cl.musolutions.restobar.services.table;

import cl.musolutions.restobar.entities.Tables;
import cl.musolutions.restobar.repositories.TablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TablesServiceimpl implements TablesService {
    @Autowired
    private TablesRepository tablesRepository;
    @Override
    public Iterable<Tables> get() {
        return tablesRepository.findAll();
    }

    @Override
    public String add(Tables table) {
        try {
            tablesRepository.save(table);
            return "The table has been saved successfully";
        }catch (Exception ex) {
            return  "There has been an error saving this table, error: " + ex;
        }
    }
}
