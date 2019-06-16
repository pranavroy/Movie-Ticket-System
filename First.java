package login;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class First extends JFrame{
   static JButton b3;
   static Second sec;
   static String data ;
   JComboBox jb1,jb2,jb3;
    First()
    {
       Font f=new Font("Arial",Font.PLAIN,20);
       Font f1=new Font("Arial",Font.PLAIN,15);
       JLabel l5=new JLabel("Hollywood");
       l5.setBounds(350,170,70,30);
       add(l5);
       String category1[]={"Black Panther","Avenger Infinity War","The Fate of the Furious","Wonder Woman"};
        jb1=new JComboBox(category1);
        jb1.setBounds(450,170,170,30);
        add(jb1);
        jb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==jb1)
                {
                  data=(String)jb1.getSelectedItem();
                }
            }
        });
       JLabel l6=new JLabel("Bollywood");
       l6.setBounds(350,270,70,30);
       add(l6);
        String category2[]={"Baaghi 2","Pari","Padmavat","Padman"};
        jb2=new JComboBox(category2);
        jb2.setBounds(450,270,170,30);
        add(jb2);
        jb2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==jb2)
                {
                  data=(String)jb2.getSelectedItem();
                }
            }
        });
        JLabel l7=new JLabel("Tollywood");
       l7.setBounds(350,370,70,30);
       add(l7);
        String category3[]={"Bahubali:The Conclusion","Robot 2.0","Vivegam","Vedalam"};
        jb3=new JComboBox(category3);
        jb3.setBounds(450,370,170,30);
        add(jb3);
        jb3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==jb3)
                {
                  data=(String)jb3.getSelectedItem();
                }
            }
        });
       JLabel l1=new JLabel(new ImageIcon("E:\\group.jpg"));
       l1.setBounds(10,20,250,520);
       add(l1);
       JLabel l2=new JLabel(new ImageIcon("E:\\Earth.png"));
       l2.setBounds(60,10,80,80);
       add(l2);
       JLabel l3=new JLabel(new ImageIcon("E:\\contact.jpg"));
       l3.setBounds(310,10,80,80);
       add(l3);
       JLabel l4=new JLabel(new ImageIcon("E:\\about.jpg"));
       l4.setBounds(560,10,80,80);
       add(l4);
       Container c=this.getContentPane();
       c.setBackground(Color.darkGray);
       setTitle("WELCOME");
       JButton b1=new JButton("Submit");
       b1.setBounds(50,450,120,30);
       add(b1);
       b1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               if(data==null)
               {
                   JOptionPane.showMessageDialog(rootPane,"Select Movie"); 
               }
               else
               {
                   
               sec=new Second();
               sec.setVisible(true);
               sec.setSize(700,600);
               }
           } 
       });
       JButton b2=new JButton("Logout");
       b2.setBounds(50,500,120,30);
       add(b2);
       b2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               setVisible(false);
             new Login();//setVisible(true);
           }
       });
       b3=new JButton("Site map");
       b3.setBounds(30,100,140,20);
       add(b3);
       b3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             Desktop d=Desktop.getDesktop();
               try {
                   d.browse(new URI("https://maps.google.co.in"));
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
       JButton b4=new JButton("Contact us");
       b4.setBounds(280,100,140,20);
       add(b4);
        b4.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
            dispose();
             new contactus().setVisible(true);
           }
       });
       JButton b5=new JButton("About us");
       b5.setBounds(530,100,140,20);
       add(b5);
        b5.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
            dispose();
             new aboutus().setVisible(true);
           }
       });
       l5.setFont(f1);
       l5.setForeground(Color.red);
       l6.setFont(f1);
       l6.setForeground(Color.red);
       l7.setFont(f1);
       l7.setForeground(Color.red);
       b1.setFont(f);
       b1.setBackground(Color.ORANGE);
       b1.setForeground(Color.black);
       b2.setFont(f);
       b2.setBackground(Color.ORANGE);
       b2.setForeground(Color.black);
       b3.setFont(f);
       b3.setBackground(Color.pink);
       b3.setForeground(Color.black);
       b4.setFont(f);
       b4.setBackground(Color.pink);
       b4.setForeground(Color.black);
       b5.setFont(f);
       b5.setBackground(Color.pink);
       b5.setForeground(Color.black);
       setLayout(null);
      // setSize(700,600);
       //setVisible(true);
       //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    public static void main(String args[])
    {
        First fst=new First();
        fst.setSize(700,600);
        fst.setVisible(true);
    }
}