package vn.edu.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double price;

    @OneToOne
    private User user;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
