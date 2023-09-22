package cl.musolutions.restobar.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "dish", cascade = CascadeType.ALL)
    List<OrderDetails> orderDetails = new ArrayList<>();

    //TODO: implementar los tipos de platos que pueden ser (postre, ensalada, fuerte, sopa) a la bdd
}
