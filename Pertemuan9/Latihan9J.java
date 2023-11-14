package Pertemuan9;

public class Latihan9J {
    public static void main(String[] args) {
        int array[] = {20, 20, 40};
        int num1 = 15, num2 = 0;
        int result = 0;

        try {
            result = num1/num2;
            System.out.println("The result is" + result);
            for (int i = 2; i >= 0; i--) {
                System.out.println("The value of array is" + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Array is out of Bounds" + e);
        } catch (ArithmeticException e) {
            System.out.println("can't be divided by Zero" + e);
        }
    }
}
