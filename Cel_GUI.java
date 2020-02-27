import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cel_GUI extends JFrame {
    private JPanel mainPanel;
    private JTextField Cel_txt_fld;
    private JLabel Celsius_Label;
    private JLabel FarLabel;
    private JButton Convert;

    public Cel_GUI(String title)
    {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        Convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //grab text from celsius Cel_txt_fld
                //convert it into double
                //update the Farhenheit Table
                double cel = Double.parseDouble(Cel_txt_fld.getText());
                double far = 1.8 * cel + 32;
                FarLabel.setText(far+" Fahrenheit ");
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new Cel_GUI("my converter");
        frame.setVisible(true);
    }
}
