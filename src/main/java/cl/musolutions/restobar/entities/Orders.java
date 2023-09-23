package cl.musolutions.restobar.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder;

    private Timestamp arrivedOrder;

    private Timestamp departureOrder;
    private float total;
    private String comments;

    //@ManyToOne
    //@JoinColumn(name = "employee_id")
    //private Employee employee;

    @ManyToOne
    @JoinColumn(name = "tables_id")
    private Tables tables;

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
    List<OrderDetails> orderDetail = new ArrayList<>();

}
