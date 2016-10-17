import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Login extends JFrame implements ActionListener
{
	JLabel luser,lpass,title,image;
	TextField username,password;
	JButton login,reset;
	String un,ps;
	int o=1;
	boolean x=false;
	Font f1 = new Font("Arial", Font.BOLD,12);
	Font f2 = new Font("Arial", Font.BOLD + Font.ITALIC,24);

public Login()
{
	setContentPane(new JLabel(new ImageIcon("Globe1.jpg")));
	setBackground(Color.RED);
	setLayout(null);
	title=new JLabel("Globe Information");
	title.setForeground(Color.white);
	title.setFont(f2);
	luser=new JLabel("User Name");
	luser.setForeground(Color.white);
	luser.setFont(f1);
	lpass=new JLabel("Password");
	lpass.setForeground(Color.white);
	lpass.setFont(f1);
	username=new TextField(20);
	password=new TextField(20);
	login=new JButton("Login");
	reset =new JButton("Reset");
	

	password.setEchoChar('*');

	ImageIcon bb=new ImageIcon("img12.JPG");
	JLabel image=new JLabel();
	image.setIcon(bb);
	image.setBounds(0,0,700,700);
	//BufferedImage bb = ImageIO.read(new File("img.JPG"));
	//image= new JLabel(new ImageIcon("img.JPG"));

	//setLayout(new BorderLayout());

	//setContentPane(new JLabel(new ImageIcon("img.JPG")));

	//bb.add(image);
	add(image);
	image.add(luser);
	image.add(lpass);
	image.add(username);
	image.add(password);
	image.add(login);
	image.add(reset);
	image.add(title);
	
	

	luser.setBounds(100,500,100,20);
	username.setBounds(200,500,100,20);
	lpass.setBounds(100,550,100,20);
	password.setBounds(200,550,100,20);
	login.setBounds(150,600,70,20);
	reset.setBounds(250,600,70,20);
	title.setBounds(130,400,300,100);
	
	//image.setBounds(0,0,1000,1000);


	setSize(2000,2000);
	setVisible(true);
	setTitle("Login Page");

	login.addActionListener(this);
	reset.addActionListener(this);
	
}
public void actionPerformed(ActionEvent ae)
{
	un=username.getText();
	ps=password.getText();
	if(ae.getSource()==login)
	{
		while(o<=3)
			{
				un=username.getText();
				ps=password.getText();

		if(un.equals("Chetan") && ps.equals("1234"))
		{
			JOptionPane.showMessageDialog(null,"Login Successful");
			 dispose();
			
			Country c=new Country();
			c.setVisible(true);
			
		}
		else 
		{
					JOptionPane.showMessageDialog(null,"Login Unsuccessful.Appempt:"+o);
					if(o==3)
					{
						JOptionPane.showMessageDialog(null,"You have exceded the no. of attempts.Thank You");
						System.exit(0);
					}	
			}o++;break;
			
		
	}
}


			
	if(ae.getSource()==reset)
	{
		username.setText("");
		password.setText("");
	}
	repaint();
}
public static void main(String args[] )
{
	Login l=new Login();
}
}