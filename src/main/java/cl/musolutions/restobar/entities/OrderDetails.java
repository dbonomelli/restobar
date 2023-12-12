package cl.musolutions.restobar.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrderDetail;


    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;

   // @ManyToOne
    //@JoinColumn(name = "cocktail_id")
    //private Cocktail cocktail;

    @ManyToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;
}
