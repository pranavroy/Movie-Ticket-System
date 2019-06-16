package login;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
 public class Login extends JFrame implements ActionListener{
     static  SignUp1 sgnup;
     static Pswrd p;
     static First fst;
     static JTextField t1;
     static JTextField t2;
     String r1;
     String r2;
     static String str;
     Login()
     {
        JFrame jf=new JFrame("Login");
        //Container c=jf.getContentPane();
        //c.setBackground(Color.white);
        Font f=new Font("Arial",Font.PLAIN,20);
        Font f1=new Font("Monotype Corsiva",Font.ROMAN_BASELINE,60);
        JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("About us");
        JMenu m2=new JMenu("Contact us");
        JMenu m3=new JMenu("Problem in signin or login");
        JMenu m4=new JMenu("Why us");
        JMenu m5=new JMenu("Head Office");
        JMenuItem mi1=new JMenuItem("We are here to design an application and studied in sharda university");
        JMenuItem mi2=new JMenuItem("9413758600");
        JMenuItem mi3=new JMenuItem("9717128642");
        JMenuItem mi4=new JMenuItem("Either you have not valid login credentials or putting wrong infomation");
        JMenuItem mi5=new JMenuItem("We provide easy and better way");
        JMenuItem mi6=new JMenuItem("New Delhi");
        m1.add(mi1);
        m2.add(mi2);
        m2.add(mi3);
        m3.add(mi4);
        m4.add(mi5);
        m5.add(mi6);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        JCheckBox cb=new JCheckBox("Fill it if you are not a robot");
        cb.setBounds(180,300,280,30);
        JLabel l1=new JLabel("User Name");
        l1.setBounds(180,160,100,20);
        JLabel l2=new JLabel("Password");
        l2.setBounds(180,230,100,20);
        JLabel l3=new JLabel("PKR MOVIES");
        l3.setBounds(150,40,400,50);
        JButton b1=new JButton("Login");
        b1.setBounds(200,390,120,30);
        
         b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            { 
                str=t1.getText();
                String s=t2.getText();
                int flag=0;
                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sys");
                    Statement stmt=con.createStatement();
                    ResultSet rst=stmt.executeQuery("select username,password from signup");
                         while(rst.next())
                         {
                               r1=rst.getString("username");
                               r2=rst.getString("password");
                 if((str.equals(r1)) && (s.equals(r2)) && (cb.isSelected()))
                {
                    
                     JOptionPane.showMessageDialog(null,"You Logged in Successfully");
                     fst=new First();
                     fst.setVisible(true);
                     fst.setSize(700,600);
                     //jf.dispose();
                     t1.setText(null);
                     t2.setText(null); 
                     flag=1;
                //sgnup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                         }
                 if(str.equals("") || s.equals("") || !cb.isSelected())
                {
                    JOptionPane.showMessageDialog(rootPane,"Logins are Empty!!");
                    t1.setText(null);
                    t2.setText(null); 
                }
                 else if(flag==0)
                {
                    JOptionPane.showMessageDialog(rootPane,"Invalid Logins!!");
                    t1.setText(null);
                    t2.setText(null);   
                }    
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
                catch(NullPointerException ex)
                {
                  System.out.println(ex);
                }
            }
        });
        JButton b2=new JButton("Forgot Password");
        b2.setBounds(370,390,190,30);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              p=new Pswrd();  
              p.setVisible(true);
              p.setSize(700,600);
              //jf.dispose();
              //p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        JButton b3=new JButton("Sign up");
        b3.setBounds(300,440,120,30);
        JLabel b4=new JLabel(new ImageIcon("E:\\movie1.jpg"));
        b4.setBounds(0,-10,658,560);
        b4.add(cb);
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                sgnup = new SignUp1();
                sgnup.setVisible(true);
                sgnup.setSize(700,600);
                //jf.dispose();
                //sgnup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        t1=new JTextField();
        t1.setBounds(300,160,200,30);
        t2=new JPasswordField();
        t2.setBounds(300,230,200,30);
        //JScrollBar sb=new JScrollBar(JScrollBar.VERTICAL);
        //sb.setBounds(660,0,25,540);
        l1.setForeground(Color.magenta);
        l1.setFont(f);
        l2.setForeground(Color.magenta);
        l2.setFont(f);
        l3.setFont(f1);
        l3.setForeground(Color.RED);
        cb.setForeground(Color.green);
        cb.setFont(f);
        t1.setFont(f);
        t1.setBackground(Color.yellow);
        t1.setForeground(Color.black);
        t2.setFont(f);
        t2.setBackground(Color.yellow);
        t2.setForeground(Color.black);
        b1.setFont(f);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.black);
        b2.setFont(f);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.black);
        b3.setFont(f);
        b3.setBackground(Color.ORANGE);
        b3.setForeground(Color.black);
        jf.setJMenuBar(mb);
        jf.add(l1);
        jf.add(l2);
        jf.add(l3);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        b4.add(t1);
        b4.add(t2);
        //jf.add(jb);
        //jf.add(cb);
        //jf.add(sb);
        //jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setSize(680,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
     public static void main(String args[])
    {
      Login l=new Login();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }