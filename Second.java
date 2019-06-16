package login;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class Second extends JFrame
{
    JComboBox jb1,jb2,jb3;
    JButton b1,b2;
    ImageIcon i1;
    static String data1 ;
    static String data2 ;
    static Seats ss;
    //static First fst;
    Second()
    {
        Font f=new Font("Arial",Font.PLAIN,30);
        setTitle("Book Ticket"); 
        Container c=this.getContentPane();
        c.setBackground(Color.darkGray);
        JLabel l1=new JLabel();
        l1.setBounds(170,30,350,40);
        add(l1);
        l1.setText(First.data);
        l1.setFont(f);
        l1.setForeground(Color.red);
          if(First.data=="Black Panther")
             {
               i1=new ImageIcon("E:\\panther.jpg");
             }
           if(First.data=="Avenger Infinity War")
             {
               i1=new ImageIcon("E:\\avenger.png");
             }
            if(First.data=="The Fate of the Furious")
             {
               i1=new ImageIcon("E:\\fate.jpg");
             }
             if(First.data=="Wonder Woman")
             {
               i1=new ImageIcon("E:\\wonder.jpg");
             }
              if(First.data=="Baaghi 2")
             {
               i1=new ImageIcon("E:\\baaghi.jpg");
             }
           if(First.data=="Pari")
             {
               i1=new ImageIcon("E:\\pari.jpg");
             }
            if(First.data=="Padmavat")
             {
               i1=new ImageIcon("E:\\padmavat.jpg");
             }
             if(First.data=="Padman")
             {
               i1=new ImageIcon("E:\\padman.jpg");
             }
             if(First.data=="Bahubali:The Conclusion")
             {
               i1=new ImageIcon("E:\\bahu.jpg");
             }
           if(First.data=="Robot 2.0")
             {
               i1=new ImageIcon("E:\\robot.jpg");
             }
            if(First.data=="Vivegam")
             {
               i1=new ImageIcon("E:\\vivegam.jpg");
             }
             if(First.data=="Vedalam")
             {
               i1=new ImageIcon("E:\\vedalam.jpg");
             }
        JLabel l2=new JLabel("Show Time");
        l2.setBounds(330,140,70,30);
        add(l2);
        String category1[]={"9:00am","12:00pm","3:00pm","6:00pm","9:00pm"};
        jb1=new JComboBox(category1);
        jb1.setBounds(430,140,210,30);
        add(jb1);
         jb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==jb1)
                {
                  data1=(String)jb1.getSelectedItem();
                }
            }
        });
        JLabel l3=new JLabel("Cinema Hall");
        l3.setBounds(330,270,70,30);
        add(l3);
        String category2[]={"INOX:Omaxe CP Mall,G.N","Movietime,G.N","Cinepolis The Grand Venice Mall,G.N","INOX MSX Mall,Swarn Nagari"};
        jb2=new JComboBox(category2);
        jb2.setBounds(430,270,210,30);
        add(jb2);
         jb2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==jb2)
                {
                  data2=(String)jb2.getSelectedItem();
                }
            }
        });
        JLabel l4=new JLabel("Price");
        l4.setBounds(330,400,70,30);
        add(l4);
        JLabel l5=new JLabel(i1);
        l5.setBounds(20,80,300,370);
        add(l5);
        JLabel l6=new JLabel("Rs200");
        l6.setBounds(430,400,40,30);
        add(l6);
        l2.setForeground(Color.cyan);
        l3.setForeground(Color.cyan);
        l4.setForeground(Color.cyan);
        l6.setForeground(Color.white);
        b1=new JButton("Submit");
        b1.setBounds(40,500,80,30);
        add(b1);
        b1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               
               if(data1==null || data2==null)
               {
                   JOptionPane.showMessageDialog(rootPane,"Select Both Items");
               }
               else
               {
               //ss=new Seats();
               //ss.setVisible(true);
               //ss.setSize(700,600);
                String i1=l1.getText();
                String i2=(String) jb1.getItemAt(jb1.getSelectedIndex());
                String i3=(String) jb2.getItemAt(jb2.getSelectedIndex());
                String i4=l6.getText();
                String i5=Login.str;
                System.out.println(i5);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now();  
                String i6=dtf.format(now);  
            
try
{
    
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sys");
Statement stmt=con.createStatement();

stmt.executeUpdate("insert into minor values('"+i1+"','"+i2+"','"+i3+"','"+i4+"','"+i5+"','"+i6+"')");
System.out.println("value inserted");
//JOptionPane.showMessageDialog(rootPane,"You are Successfully signedup");
con.close();
               ss=new Seats();
               ss.setVisible(true);
               ss.setSize(700,600);
}
catch(ClassNotFoundException ex)
{
System.out.println(ex);
}
catch(SQLException ex)
{
System.out.println(ex);
}                   
                               
               //dispose();
               //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               }
           } 
       });
         setLayout(null);
        setVisible(true);
        setSize(700,600);
        b2=new JButton("Back");
        b2.setBounds(570,500,80,30);
        add(b2);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
            First.sec.setVisible(false);
            //First second=new First();
              //new First().setVisible(true);
               //new First();
            }
        });
       
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    public static void main(String args[])
    {
        Second s=new Second();
    }
    }
