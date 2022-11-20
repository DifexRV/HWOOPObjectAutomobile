package Pro.sky;

public class Car {

    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, float engineVolume, String color, int year, String country) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", " + color + " цвет, объем двигателя — " + engineVolume + " л.";
    }

}
