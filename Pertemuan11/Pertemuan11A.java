package Pertemuan11;
import java.awt.*;

public class Pertemuan11A extends Frame {
    public static void main(String[] args) {
        Pertemuan11A fwc = new Pertemuan11A();
        fwc.setLayout(new FlowLayout());
        fwc.setSize(600, 600);
        fwc.add(new Button("Test Me!"));
        fwc.add(new Label("Label"));
        fwc.add(new TextField());
        CheckboxGroup cbg = new CheckboxGroup();
        fwc.add(new Checkbox("chk1", cbg, true));
        fwc.add(new Checkbox("chk2", cbg, false));
        fwc.add(new Checkbox("chk3", cbg, false));
    }
}
