import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;



public class Calc {
    public static void main(String[] args) {
            University Bracu = new University(8250,136,130,8250,88000,61150,0.75);
            University Nsu = new University(6500,134,120,10000,0,20000,0);
            University uiu = new University(6500,138,125,6500,0,22000,0.50);

            JFrame frame = new JFrame("Tution Fee Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setSize(960, 540);

            frame.setLayout(new GridLayout(3,3));
            JLabel label1 = new JLabel("Enter Your University Name:");
            frame.add(label1);
            JTextField name = new JTextField(10);
            frame.add(name);
            JLabel label2 = new JLabel("Enter Your CGPA and Number of credits you have taken for the semester:");
            frame.add(label2);
            JTextField cgpa = new JTextField(10);
            frame.add(cgpa);

            JLabel label3 = new JLabel("Your cost for the next trimester is: ");
            frame.add(label3);
            JTextField cost = new JTextField(20);
            frame.add(cost);


            name.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                            cgpa.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {

                                            String[] parts= cgpa.getText().split(" ");
                                            double cg= Double.parseDouble(parts[0]);
                                            int credits=Integer.parseInt(parts[1]);
                                            double total;
                                            if(name.getText().equals("brac")){
                                                    if(cg>=3.80){
                                                            total=((credits* Bracu.creditfee)*0.75+Bracu.semesterfee);
                                                            cost.setText(total+"        BDT,"+"\n"+"Total waived cost for graduation: "+ Bracu.waivedfee()+"  BDT");

                                                    }else{
                                                            total=((credits*Bracu.creditfee)+Bracu.semesterfee);
                                                            cost.setText(total+"        BDT,"+"\n"+"Total cost for graduation: "+ Bracu.totalcostcse()+"  BDT");
                                                    }
                                            }

                                            if(name.getText().equals("uiu")){
                                                    if(cg>=3.50){
                                                            total=((credits* uiu.creditfee)*0.50+uiu.semesterfee);
                                                            cost.setText(total+"        BDT,"+"\n"+"Total waived cost for graduation: "+ uiu.waivedfee()+"  BDT");

                                                    }else{
                                                            total=((credits*uiu.creditfee)+uiu.semesterfee);
                                                            cost.setText(total+"        BDT,"+"\n"+"Total cost for graduation: "+ uiu.totalcostcse()+"  BDT");
                                                    }
                                            }

                                            if(name.getText().equals("nsu")){
                                                            total=((credits*Nsu.creditfee)+Nsu.semesterfee);
                                                            cost.setText(total+"        BDT,"+"\n"+"Total cost for graduation: "+ Nsu.totalcostcse()+"  BDT");
                                                    }
                                    }
                            });
                    }
            });



            frame.setVisible(true);

    }
}
