import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 1. Nesne Oluşturma
        Student student = new Student();
        student.setId(101);
        student.setName("Simay Taskin");

        // 2. Serileştirme (Dosyaya Yazma)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
            out.writeObject(student);
            System.out.println("Ogrenci nesnesi dosyaya kaydedildi.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. De-Serileştirme (Dosyadan Okuma)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"))) {
            Student savedStudent = (Student) in.readObject();
            System.out.println("Dosyadan okunan ogrenci: " + savedStudent.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}