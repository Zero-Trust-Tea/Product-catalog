package com.example.shopping_list.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter
    private long id;
    @Setter @Getter
    private String name;
    @Setter @Getter
    private String description;
    @Setter @Getter
    private double price;

    public ProductEntity() {
    }

    public ProductEntity(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return "name: " + getName() + ", description: " + getDescription() +
                ", price: " + getPrice() + ", id: " + getId();
    }

}
