package entity;

import Enums.Color;
import Enums.Type;

import javax.persistence.*;
import java.util.List;

@Entity(name="GUITAR")
public class Guitar {


    @Id
    @GeneratedValue
    String id;

    @Column(name = "NAME")
    String name;

    @Column(name = "PRODUCTION_COST")
    double productionCost;

    @Column(name = "PRICE")
    double price;

    @Column(name = "TYPE_ID")
    Long typeId;

    @Column(name = "COLOR_IDS")
    String colorIds;

    @Column(name = "SOLD")
    Boolean sold;


    @Transient
    Type type;

    @Transient
    List<Color> color;

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

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getColorIds() {
        return colorIds;
    }

    public void setColorIds(String colorIds) {
        this.colorIds = colorIds;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
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
