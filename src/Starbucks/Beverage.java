package Starbucks;

public abstract class Beverage {
    String description = "Unknown Beverage";

    String size = "tall";

    public String getDescription(){
        return description;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract double cost();
}
