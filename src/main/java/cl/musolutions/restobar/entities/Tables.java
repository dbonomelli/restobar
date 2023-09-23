package cl.musolutions.restobar.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTable;
    private String section;
    private int capacity;

    @OneToMany(mappedBy = "tables", cascade = CascadeType.ALL)
    private List<Orders> orders = new ArrayList<>();
}
