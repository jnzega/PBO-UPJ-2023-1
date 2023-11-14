package Pertemuan9;

public class Latihan9D {
    static void f(){
        throw new RuntimeException("From f()");
    }
    static void g() {
        f();
    }
    public static void main(String[] args) {
        g();
    }
}
