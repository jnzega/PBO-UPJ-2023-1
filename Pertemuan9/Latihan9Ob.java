package Pertemuan9;
import java.io.*;

class InputConsole {
    public static String readString(){
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String string = " ";

        try{
            string = bfr.readLine();
        } catch (IOException ex){
            System.out.println(ex);
        }

        return string;
    }
    public static int readInt(){
        return Integer.parseInt(readString());
    }
    public static double readDouble(){
        return Double.parseDouble(readString());
    }

}

public class Latihan9Ob {
    public static void main(String[] args) {
        System.out.println("data1 = ");
        InputConsole ic = new InputConsole();
        int data1 = ic.readInt();
        System.out.println("data2 = ");
        int data2 = ic.readInt();
        int data3 = data1 + data2;
        System.out.println("data1 + data2 = " + data3);
    }
}

