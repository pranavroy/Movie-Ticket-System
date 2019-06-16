package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static login.Second.ss;

public class Seats extends JFrame{ 
    JRadioButton b[][]=new JRadioButton[20][20];;
    int i,j;
    static Payment p;
    Seats()
    {
        Font f=new Font("Arial",Font.PLAIN,20);
         Container c=this.getContentPane();
        c.setBackground(Color.darkGray);
    JPanel p1=new JPanel();
    p1.setBounds(50,130,250,320);
    p1.setBackground(Color.red);
    JPanel p2=new JPanel();
    p2.setBounds(360,130,250,320);
    p2.setBackground(Color.red);  
    JPanel p3=new JPanel();
    p3.setBounds(310,130,40,320);
    p3.setBackground(Color.green);
              JLabel t=new JLabel("Screen This Way");
              t.setBounds(260,50,150,40);
              t.setFont(f);
              t.setForeground(Color.YELLOW);
              JButton b1=new JButton("Continue");
              b1.setBounds(30,500,90,30);
              b1.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
               p=new Payment();
               p.setVisible(true);
               p.setSize(700,600);
               //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             } 
          });
              JButton b2=new JButton("Back");
              b2.setBounds(560,500,90,30);
              b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               Second.ss.setVisible(false); 
               //new Second().setVisible(true);
            }
        });
        for(j=1;j<10;j++)
        {
            for(i=1;i<=12;i++)
           {
            b[j][i]=new JRadioButton();
            b[j][i].setBounds(70+i*30,230+j*20,15,15);
            p1.add(b[j][i]);
           } 
        }
       // p1.hide();
       //p1.show();
         for(j=1;j<10;j++)
        {
            for(i=1;i<=12;i++)
           {
            b[j][i]=new JRadioButton();
            b[j][i].setBounds(70+i*30,230+j*20,15,15);
            p2.add(b[j][i]);
           } 
        }
        add(p1);
        add(b1);
        add(b2);
        add(p2);
        add(p3);
        //add(tf);
        add(t);
        setTitle("Select Seats");
        setLayout(null);
        setVisible(true);
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Seats s=new Seats();
    }   
}

