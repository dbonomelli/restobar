package cl.musolutions.restobar.controllers;

import cl.musolutions.restobar.entities.Tables;
import cl.musolutions.restobar.services.table.TablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TablesController {
    @Autowired
    private TablesService tableService;
    @GetMapping("/tables")
    public ResponseEntity<Iterable<Tables>> get(){
        try{
            return ResponseEntity.ok(tableService.get());
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/tables")
    public ResponseEntity<String> add(@RequestBody Tables table){
        try{
            return ResponseEntity.ok(tableService.add(table));
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
}
