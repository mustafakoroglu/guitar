package dto;

import Enums.Color;
import Enums.Type;
import entity.Guitar;

import javax.persistence.*;
import java.util.List;

@Entity(name="GUITAR")
public class GuitarDTO {


    String id;

    String name;

    double price;

    Type type;

    List<Color> color;

    public GuitarDTO(Guitar guitar){
        new GuitarDTO(guitar.getId(),guitar.getName(),guitar.getPrice(),guitar.getType(),guitar.getColor());
    }

    public GuitarDTO(String id, String name, double price, Type type, List<Color> color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Color> getColor() {
        return color;
    }

    public void setColor(List<Color> color) {
        this.color = color;
    }
}
