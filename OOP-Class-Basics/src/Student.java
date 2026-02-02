public class Student { 
    private int number; // Değişkenleri private yaparak encapsulation (kapsülleme) sağlarız.
    private int id;

    // Parametresiz Kurucu (Default Constructor)
    public Student() {
    }

    // Parametreli Kurucu
    public Student(int number, int id) {
        this.number = number;
        this.id = id;
    }

    // Getter ve Setter Metotları
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() { // void yerine int yaptık
        return number;
    }
}