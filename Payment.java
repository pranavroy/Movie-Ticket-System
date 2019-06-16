package login;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
public class Payment extends JFrame{
    static String i6,i7;
    Payment()
    {
     Container c=this.getContentPane();
     c.setBackground(Color.darkGray);
     Font f=new Font("Arial",Font.PLAIN,30);
     JButton b1=new JButton(new ImageIcon("E://paytm.png"));
     b1.setBounds(120,60,400,140);
     add(b1);
     b1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             Desktop d=Desktop.getDesktop();
               try {
                   d.browse(new URI ("https://paytm.com/"));
               } catch (IOException ex) 
                  {
                   System.out.println(ex);
                  }
               catch (URISyntaxException ex)
                   {
                   System.out.println(ex);
                   } 
           }
       });
     JButton b2=new JButton(new ImageIcon("E://net.jpg"));
     b2.setBounds(120,230,400,140);
     add(b2);
     JButton b3=new JButton(new ImageIcon("E://card.jpg"));
     b3.setBounds(120,400,400,140);
     add(b3);
     JButton b4=new JButton("Bill");
     b4.setBounds(560,500,90,30);
     add(b4);
       b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
                DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();  
                i6=dtf1.format(now);  
                i7=dtf2.format(now); 
                dispose();
              Bills bl=new Bills();
              bl.setVisible(true);
              Bills.jLabel11.setText(First.data);
              Bills.jLabel12.setText(i6);
              Bills.jLabel13.setText(i7);
            }
        });
     JLabel l1=new JLabel("Click Image For Payment");
     l1.setBounds(150,10,350,40);
     add(l1);
     l1.setFont(f);
     l1.setForeground(Color.red);
        setTitle("Pay here");
        setLayout(null);
        setVisible(true);
        setSize(700,600);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String[] args) {
       new Payment(); 
    }    
}
