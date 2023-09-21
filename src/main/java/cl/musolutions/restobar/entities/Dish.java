package cl.musolutions.restobar.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Dish extends Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDish;

    @ManyToOne
    @JoinColumn(name = "dish_type_id")
    private DishType dishType;

    //TODO: implementar los tipos de platos que pueden ser (postre, ensalada, fuerte, sopa) a la bdd
}
