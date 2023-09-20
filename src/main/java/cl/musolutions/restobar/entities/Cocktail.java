package cl.musolutions.restobar.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Cocktail extends Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCocktail;
    private float alcoholLevel;

}
