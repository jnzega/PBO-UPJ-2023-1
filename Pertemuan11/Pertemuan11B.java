package Pertemuan11;
import java.awt.*;
public class Pertemuan11B extends Frame{
    public static void main(String[] args) {
        Pertemuan11B fld = new Pertemuan11B();
        fld.setLayout(new FlowLayout());
        fld.add(new Button("ONE"));
        fld.add(new Button("TWO"));
        fld.add(new Button("THREE"));
        fld.setSize(100,100);
        fld.setVisible(true);
    }
}
