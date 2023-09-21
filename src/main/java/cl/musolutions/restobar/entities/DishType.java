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

public class DishType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDishType;
    private String name;

    @OneToMany(mappedBy = "dishType", cascade = CascadeType.ALL)
    private List<Dish> dishes = new ArrayList<>();
}
