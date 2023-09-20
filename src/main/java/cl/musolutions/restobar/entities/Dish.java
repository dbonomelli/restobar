package cl.musolutions.restobar.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    //TODO: implementar los tipos de platos que pueden ser (postre, ensalada, fuerte, sopa) a la bdd
}
