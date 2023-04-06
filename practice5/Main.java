import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;


public class Main{

    Main(){
        JFrame frame = new JFrame("Check Divider");
        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("Total: ");
        JTextField text1 = new JTextField();
        panel.add(label1);
        panel.add(text1);

        JLabel label2 = new JLabel("Tip Percentage: ");
        JTextField text2 = new JTextField();
        panel.add(label2);
        panel.add(text2);

        JLabel label3 = new JLabel("Number of People: ");
        JTextField text3 = new JTextField();
        panel.add(label3);
        panel.add(text3);

        JLabel label4 = new JLabel("Each person pays: ");
        JLabel label5 = new JLabel("<Enter the above information and click calculate>");
        panel.add(label4);
        panel.add(label5);

        JButton button = new JButton("Calculate");
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.setSize(300,200); // determines width by height which it will appear (in pixels)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //stops running when program is closed
        frame.pack();
        frame.setVisible(true);
        
    }
    public static void main(String []args){
        new Main();
    }
}
