package cl.musolutions.restobar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Cocktail extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCocktail;
    private float alcoholLevel;

    @ManyToOne
    @JoinColumn(name = "alcohol_type_id")
    private AlcoholType alcoholType;

    @OneToMany(mappedBy = "cocktail", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<OrderDetails> orderDetails = new ArrayList<>();

}
