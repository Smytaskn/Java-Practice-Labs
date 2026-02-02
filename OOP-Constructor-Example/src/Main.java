class Car {
    private String color;
    private int capacity;

    // Parametresiz Kurucu (Default)
    public Car() {
        this.color = "Blue";
        this.capacity = 5;
    }

    // Parametreli Kurucu (Overloading)
    public Car(String color, int capacity) {
        this.color = color;
        this.capacity = capacity; // DÜZELTİLDİ: Artık dışarıdan gelen değeri kaydediyor.
    }

    // Araba bilgisini ekrana yazdırmak için gerekli metot
    @Override
    public String toString() {
        return "Araba [Renk=" + color + ", Kapasite=" + capacity + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Red", 4);

        System.out.println(car1); // Çıktı: Araba [Renk=Blue, Kapasite=5]
        System.out.println(car2); // Çıktı: Araba [Renk=Red, Kapasite=4]
    }
}