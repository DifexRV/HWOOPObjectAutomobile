package Pro.sky;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();

    }

    public static void task1() {

        Car automobile = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "России");
        Car automobile1 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный ", 2020, "Германии");
        Car automobile2 = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германии");
        Car automobile3 = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея");
        Car automobile4 = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");
        System.out.println(automobile);
        System.out.println(automobile1);
        System.out.println(automobile2);
        System.out.println(automobile3);
        System.out.println(automobile4);
    }

    public static void task2() {
        Car automobilA = new Car(null, "", 1.7f, "желтый", 2015, "России");
        Car automobileB = new Car("", null, 3.0f, "", 2020, null);
        Car automobileC = new Car("BMW", "", 3.0f, null, -2018, "");
        Car automobileD = new Car("Kia", "Sportage 4-го поколения", -1.1f, "красный", 2018, "Южная Корея");
        Car automobileE = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");
        System.out.println(automobilA);
        System.out.println(automobileB);
        System.out.println(automobileC);
        System.out.println(automobileD);
        System.out.println(automobileE);

    }

}