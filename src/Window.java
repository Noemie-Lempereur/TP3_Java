import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

    public Window(){
        super("My first JFrame");
        this.setSize(300,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel2Bis = new JPanel();
        JPanel panel2Ter = new JPanel();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout (new BorderLayout(5,5));

        panel1.setLayout(new GridLayout(2,1,5,5));
        JLabel label = new JLabel("Click on OK");
        panel1.add(label);
        JLabel label2 = new JLabel("Click on Cancel");
        label2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        panel1.add(label2);


        panel2Bis.setLayout(new FlowLayout(FlowLayout.RIGHT,5,5));
        JButton button =new JButton("OK");
        panel2.add(button,BorderLayout.WEST);
        MyButtonListener buttonListener = new MyButtonListener(label);
        button.addActionListener(buttonListener);

        panel2Ter.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
        JButton button2 =new JButton("Cancel");
        panel2.add(button2,BorderLayout.EAST);
        MyButtonListener2 buttonListener2 = new MyButtonListener2(label2);
        button2.addActionListener(buttonListener2);
        button2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));


        mainPanel.add(panel1);
        mainPanel.add(panel2,BorderLayout.SOUTH);

        this.add(mainPanel);

        Animation a1 = new Animation(label, "ABCDEF", 500);
        a1.start();
        Animation a2 = new Animation(label2, "123456", 500);
        a2.start();

        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
