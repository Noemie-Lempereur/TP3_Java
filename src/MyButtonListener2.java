import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener2 implements ActionListener {
    private JLabel label;

    public MyButtonListener2(JLabel label){
        this.label=label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cancel clicked !");
        label.setText("Cancel clicked !");
    }
}