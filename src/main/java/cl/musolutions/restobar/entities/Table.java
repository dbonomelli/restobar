package cl.musolutions.restobar.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Table {
    @Id
    @GeneratedValue
    private int idTable;
    private String section;
    private int capacity;

}
