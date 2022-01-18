package web.model;

public class Car {

    String brand;
    String color;
    int number;

    public Car() {
    }

    public Car(String brand, String color, int manufactureYear) {
        this.brand = brand;
        this.color = color;
        this.number = manufactureYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufactureYear() {
        return number;
    }

    public void setManufactureYear(int manufactureYear) {
        this.number = manufactureYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", manufactureYear=" + number +
                '}';
    }
}
