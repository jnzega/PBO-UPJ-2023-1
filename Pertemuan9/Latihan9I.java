package Pertemuan9;

public class Latihan9I {
    public static void main(String[] args) {
        try{
            throw new Exception("throwing an exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
