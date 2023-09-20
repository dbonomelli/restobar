package cl.musolutions.restobar.entities;

import lombok.*;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@MappedSuperclass
public abstract class Product {
    private String name;
    private String description;
    private int price;
    private int discount;

}
