package com.example.Stockms.entity;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "Stocks")
@Entity
public class Stock {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String name;
    private int units;

    public Stock() {
    }

    public Stock(String name, int units) {
        this.name = name;
        this.units = units;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", units=" + units +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return id == stock.id && units == stock.units && Objects.equals(name, stock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
