package hiber.model;

import javax.persistence.*;
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String model;
    int series;
}
