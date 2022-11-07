import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener {
    private JLabel label;

    public MyButtonListener(JLabel label){
        this.label=label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK clicked !");
        label.setText("OK clicked !");
    }
}
