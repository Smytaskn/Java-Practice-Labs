import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        // Kendi ismini nesneye vermişsin :)
        Student student = new Student("Simay", 22);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Student objesi başarıyla dosyaya kaydedildi (Serialized)!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}