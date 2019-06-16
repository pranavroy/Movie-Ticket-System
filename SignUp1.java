package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class SignUp1 extends JFrame{
    SignUp1(){
        JPanel c=new JPanel();
        c.setBounds(0,0,700,600);
        //Container c=this.getContentPane();
        //c.setBackground(Color.YELLOW);
        setTitle("Signup");
        String category[]={"Male","Female","Other"};
        JComboBox jb=new JComboBox(category);
        jb.setBounds(320,380,90,30);
        Font f=new Font("Arial",Font.PLAIN,20);
        JLabel l6=new JLabel("MobileNo.");
        l6.setBounds(160,170,90,40);
        JLabel l1=new JLabel("Username");
        l1.setBounds(160,120,90,40);
        JLabel l2=new JLabel("Email Id");
        l2.setBounds(160,220,90,40);
        JLabel l3=new JLabel("Password");
        l3.setBounds(160,270,90,40);
        JLabel l4=new JLabel("ConfirmPassword");
        l4.setBounds(160,320,170,40);
        JLabel l5=new JLabel("Category");
        l5.setBounds(160,370,90,40);
        JTextField t6=new JTextField();
        t6.setBounds(320,170,180,30);
        JTextField t1=new JTextField();
        t1.setBounds(320,120,180,30);
        JTextField t2=new JTextField();
        t2.setBounds(320,220,180,30);
        JPasswordField t3=new JPasswordField();
        t3.setBounds(320,270,180,30);
        JPasswordField t4=new JPasswordField();
        t4.setBounds(320,320,180,30);
        JButton b1=new JButton("Submit");
        b1.setBounds(320,450,100,25);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String i0=t6.getText();
                String i1=t1.getText();
                String i2=t2.getText();
                String i3=t3.getText();
                String i4=t4.getText();
                String i5=(String) jb.getItemAt(jb.getSelectedIndex());
                if(e.getSource()==b1)
                {
                    if(i1.equals("") || i2.equals("") || i3.equals("") || i4.equals("") || i0.equals(""))
                    {
                        JOptionPane.showMessageDialog(rootPane,"Fields are Empty!!"); 
                    }
                    else
                    {
                   
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sys");
Statement stmt=con.createStatement();
stmt.executeUpdate("insert into signup values('"+i1+"','"+i2+"','"+i3+"','"+i4+"','"+i5+"','"+i0+"')");
con.close();
}
catch(ClassNotFoundException ex)
{
System.out.println(ex);
}
catch(SQLException ex)
{
System.out.println(ex);
}
                    JOptionPane.showMessageDialog(rootPane,"You are Successfully signedup");
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                    t4.setText(null);
                    t6.setText(null);
                }
                }
                    
            }
        });
        JButton b2=new JButton("Back");
        b2.setBounds(320,490,100,25);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               Login.sgnup.setVisible(false); 
               //new Login();
            }
        });
        JLabel b4=new JLabel(new ImageIcon("E:\\sign1.png"));
        b4.setBounds(0,0,658,560);
        JScrollBar sb=new JScrollBar(JScrollBar.VERTICAL);
        sb.setBounds(660,0,25,560);
        t1.setFont(f);
        t1.setBackground(Color.CYAN);
        t1.setForeground(Color.black);
        t2.setFont(f);
        t2.setBackground(Color.CYAN);
        t2.setForeground(Color.black);
        t3.setFont(f);
        t3.setBackground(Color.CYAN);
        t3.setForeground(Color.black);
        t4.setFont(f);
        t4.setBackground(Color.CYAN);
        t4.setForeground(Color.black);
        t6.setFont(f);
        t6.setBackground(Color.CYAN);
        t6.setForeground(Color.black);
        l1.setForeground(Color.YELLOW);
        l1.setFont(f);
        l2.setForeground(Color.YELLOW);
        l2.setFont(f);
        l3.setForeground(Color.YELLOW);
        l3.setFont(f);
        l4.setForeground(Color.YELLOW);
        l4.setFont(f);
        l5.setForeground(Color.YELLOW);
        l5.setFont(f);
        l6.setForeground(Color.YELLOW);
        l6.setFont(f);
        b1.setFont(f);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.black);
        b2.setFont(f);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.black);
        jb.setFont(f);
        jb.setBackground(Color.CYAN);
        jb.setForeground(Color.red);
        c.add(l1);
        c.add(l6);
        c.add(l2);
        c.add(l3);
        c.add(l4);
        c.add(l5);
        c.add(t1);
        c.add(t2);
        c.add(t3);
        c.add(t4);
        c.add(t6);
        c.add(b1);
        c.add(b4);
        b4.add(b2);
        b4.add(jb);
        c.add(sb);
        add(c);
        c.setLayout(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}    
}
