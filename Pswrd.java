package login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Pswrd extends JFrame{
    String r1,r2;
   Pswrd()
        {
           setTitle("Password");
           Container c=this.getContentPane();
           //c.setBackground(Color.green);
           Font f=new Font("Arial",Font.PLAIN,20);
           JLabel l1=new JLabel("Enter Registered MobileNumber");
           l1.setBounds(230,120,320,70);
           c.add(l1);
           JTextField t1=new JTextField();
           t1.setBounds(250,180,200,40);
           c.add(t1);
           JButton b1=new JButton("Submit");
           b1.setBounds(300,300,100,50);
           c.add(b1);
            b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String str=t1.getText();
                int flag=0;
                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sys");
                    Statement stmt=con.createStatement();
                    ResultSet rst=stmt.executeQuery("select * from signup");
                    
                         while(rst.next())
                         {
                               r1=rst.getString("mobile");
                               r2=rst.getString("password");
                 if((str.equals(r1)))
                {
                    
                     /*String fn=JOptionPane.showInputDialog("Enter new password");
                     System.out.println(fn);
                     PreparedStatement ps=con.prepareStatement("update project set password=? where mobile=?");
                     ps.setString(1, fn);
                     ps.setString(2, str);
                     ps.executeUpdate();
                     this.setVisible(false);
                     new login1().setVisible(true);
                     t1.setText(null);*/
                    try {
String apikey = "i8QIT8pGd0eHqnlZBEnZNw";
String senderid = "TESTIN";
String channel = "2";
String DCS = "0";
String flashsms = "0";
String mobile = "91"+r1;
String message = "Your Password is\n"+r2;
String route = "13";
 
String requestUrl = "https://www.smsgatewayhub.com/api/mt/SendSMS?" +
"APIKey=" + URLEncoder.encode(apikey, "UTF-8") +
"&senderid=" + URLEncoder.encode(senderid, "UTF-8") +
"&channel=" + URLEncoder.encode(channel, "UTF-8") +
"&DCS=" + URLEncoder.encode(DCS, "UTF-8") +
"&flashsms=" + URLEncoder.encode(flashsms, "UTF-8") +
"&number=" + URLEncoder.encode(mobile, "UTF-8") +
"&text=" + URLEncoder.encode(message, "UTF-8") +
"&route=" + URLEncoder.encode(route, "UTF-8");
 
 
 
URL url = new URL(requestUrl);
HttpURLConnection uc = (HttpURLConnection)url.openConnection();
 
System.out.println(uc.getResponseMessage());
 JOptionPane.showMessageDialog(rootPane,"Your password has been sent!!");
  t1.setText(null);
uc.disconnect();
 
} catch(Exception ex) {
System.out.println(ex.getMessage());
 
}
                     flag=1;
                }
                         }
                 if(str.equals(""))
                {
                    JOptionPane.showMessageDialog(rootPane,"Field is empty!!");
                    t1.setText(null);
                }
                 else if(flag==0)
                {
                    JOptionPane.showMessageDialog(rootPane,"Invalid Mobile Number!!");
                    t1.setText(null);  
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
           JButton b2=new JButton("Back");
           b2.setBounds(300,400,100,50);
           c.add(b2);
           b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Login.p.setVisible(false); 
                new Login();
            }
        });
           JLabel b4=new JLabel(new ImageIcon("E:\\sign.jpg"));
        b4.setBounds(0,0,680,600);
        c.add(b4);
           //setVisible(true);
           setLayout(null);
           setSize(700,600);
           l1.setForeground(Color.red);
           l1.setFont(f);
           b1.setFont(f);
           b1.setBackground(Color.CYAN);
           b2.setFont(f);
           b2.setBackground(Color.CYAN);

           t1.setFont(f);
           t1.setBackground(Color.yellow);
           t1.setForeground(Color.black);
           //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }    
}
