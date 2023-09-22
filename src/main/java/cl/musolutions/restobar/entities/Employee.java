package cl.musolutions.restobar.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    @Id
    @GeneratedValue()
    private int idEmployee;
    private String firstName;
    private String lastName;
    private LocalTime birthDay;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Orders> orders = new ArrayList<>();
    //TODO implement type of job
}
