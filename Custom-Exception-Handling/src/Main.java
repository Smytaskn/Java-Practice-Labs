public class Main {
    public static void main(String[] args) {
        try {
            function1(1);
            // System.exit(1); // Bunu açarsan finally bloğu bazen çalışmayabilir, dikkat.
        } catch (MyException ex) {
            System.out.println(ex.toString());
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            System.out.println("last operation");
        }
    }

    // Metodu main'in dışına çıkardık ve ismini düzelttik
    public static void function1(int number) throws MyException {
        if (number % 2 == 0) {
            throw new MyException("It should not be even!");
        } else {
            System.out.println("good");
        }
    }
}