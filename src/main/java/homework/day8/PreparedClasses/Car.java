package homework.day8.PreparedClasses;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String name) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(int weight) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Cars " + "brand = " + brand + ", model = " + model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car cars = (Car) o;
        return model == cars.model && Objects.equals(brand, cars.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
