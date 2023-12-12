package cl.musolutions.restobar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class AlcoholType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlcoholType;
    private String name;
    private String family;
    private boolean inStock;
}
