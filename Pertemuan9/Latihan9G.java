package Pertemuan9;

public class Latihan9G {
    public static void main(String[] args) {
        int n = 20, result = 0;
        try {
            result = n/0;
            System.out.println("The result is " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception occured: " + ex);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException ex1) {
                System.out.println("Chained exception thrown manually: " + ex1);
            }
        }
    }
}
