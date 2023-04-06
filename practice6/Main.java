// Chase
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.ArrayList;


public class Main{
    private boolean test;
    private int currnum;
    

    Main(){
        this.test=false;
        JFrame frame = new JFrame("Lab 3");
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,3)); // rows by columns

        JPanel large = new JPanel();
        large.setLayout(new BoxLayout(large, BoxLayout.Y_AXIS));

        JTextField text1 = new JTextField();
        panel.add(text1);


        //JButton button = new JButton("Calculate");
        //panel.add(button);
        JButton b1 = new JButton("1");

        b1.addActionListener(e -> {
			text1.setText("1");
            if (test==true){
                currnum+=1;
                text1.setText(currnum+"");
            }
            else{
                currnum=1;
            }
            test=false;
		});

        JButton b2 = new JButton("2");

        b2.addActionListener(e -> {
			text1.setText("2");
            if (test==true){
                currnum+=2;
                text1.setText(currnum+"");
            }
            else{
                currnum=2;
            }
            test=false;
		});

        JButton b3 = new JButton("3");

        b3.addActionListener(e -> {
            
			text1.setText("3");
            if (test==true){
                currnum+=3;
                text1.setText(currnum+"");
            }
            else{
                currnum=3;
        }
        test=false;
    });

        JButton b4 = new JButton("4");

        b4.addActionListener(e -> {
			text1.setText("4");
            if (test==true){
                currnum+=4;
                text1.setText(currnum+"");
            }
            else{
                currnum=4;
            }
            test=false;
		});

        JButton b5 = new JButton("5");

        b5.addActionListener(e -> {
			text1.setText("5");
            if (test==true){
                currnum+=5;
                text1.setText(currnum+"");
            }
            else{
                currnum=5;
            }
            test=false;
		});

        JButton b6 = new JButton("6");

        b6.addActionListener(e -> {
			text1.setText("6");
            if (test==true){
                currnum+=6;
                text1.setText(currnum+"");
            }
            else{
                currnum=6;
            }
            test=false;
		});

        JButton b7 = new JButton("7");

        b7.addActionListener(e -> {
			text1.setText("7");
            if (test==true){
                currnum+=7;
                text1.setText(currnum+"");
            }
            else{
                currnum=7;
            }
            test=false;
		});

        JButton b8 = new JButton("8");

        b8.addActionListener(e -> {
			text1.setText("8");
            if (test==true){
                currnum+=8;
                text1.setText(currnum+"");
            }
            else {
                currnum=8;
            }
            test=false;
		});

        JButton b9 = new JButton("9");

        b9.addActionListener(e -> {
			text1.setText("9");
            if (test==true){
                currnum+=9;
                text1.setText(currnum+"");
            }
            else {
                currnum=9;
            }
            test=false;
		});

        JButton bc = new JButton("C");
        
        bc.addActionListener(e -> {
            currnum=0;
			text1.setText("");
		});
    
        JButton b0 = new JButton("0");

        b0.addActionListener(e -> {
			text1.setText("0");
            if (test==true){
                currnum+=0;
                text1.setText(currnum+"");
            }
            else{
                currnum=0;
            }
            test=false;
		});
        JButton bplus = new JButton("+");
        
        bplus.addActionListener(e -> {
        test=true;
        });
        


        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bc);
        p2.add(b0);
        p2.add(bplus);


        large.add(panel); // adds first panel which is text field
        large.add(p2); // the numbers



        frame.getContentPane().add(large);
        frame.setSize(300,300); // determines width by height which it will appear (in pixels)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //stops running when program is closed
        frame.setVisible(true);
        
    }
    public static void main(String []args){
        new Main();
    }
}
