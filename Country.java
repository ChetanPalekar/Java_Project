import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Country extends JFrame implements ActionListener
{
    JLabel title,title1,img;
    Choice cont;
    JButton select,exit;
    JTextArea textarea;
    String a="",b="";

    Font f = new Font("Arial", Font.BOLD + Font.ITALIC,24);
    Font f1 = new Font("Arial", Font.BOLD,14);
    
    public Country()
    {
        //ImageIcon aa=new ImageIcon("Globe.jpg");
        setContentPane(new JLabel(new ImageIcon("Globe1.jpg")));
        //img1 = new JLabel(aa);
         img=new JLabel();
        textarea=new JTextArea(70,70);
        title=new JLabel("WELCOME TO GLOBE INFO");
        title.setForeground(Color.white);
        title.setFont(f);
        title1=new JLabel("Select Country");
        title1.setForeground(Color.white);
        title1.setFont(f1);
        cont=new Choice();
        select=new JButton("Select");
        exit=new JButton("Logout");
        
        cont.add(" ");
        cont.add("India");
        cont.add("China");
        cont.add("Shrilanka");
        cont.add("America");
        cont.add("Australia");
        cont.add("Brazil");
        cont.add("Canada");

        cont.setBounds(70,80,120,20);
        select.setBounds(200,80,70,20); 
        img.setBounds(580,10,1000,700);
        title.setBounds(100,10,500,30);
        title1.setBounds(70,50,150,30);
        textarea.setBounds(10,120,550,550);
        exit.setBounds(300,80,100,20);
        //img1.setBounds(0,0,1500,1500);
        
        //add(img1);
    add(cont);
    add(select);
    add(title);
    add(title1);
    add(textarea);
    add(img);
    add(exit);

    
    
        setLayout(null);
        setSize(1500,900);
        setVisible(true);
        setTitle("Country Information");

    select.addActionListener(this);
    exit.addActionListener(this);
    
    
    }

    public void actionPerformed(ActionEvent ae)
    {
        b=cont.getSelectedItem();

        if (ae.getSource()==select) 
        {
            if (b.equals("India")) 
            {
            a="Selected Country is ";
            a += b;
            textarea.setText(a);
           ImageIcon bb=new ImageIcon("india.jpg");
           img.setIcon(bb);
           try
            {
           FileReader file = new FileReader("india.txt");
           textarea.read(file,null);
            }
            catch(IOException ioe)
            {
                JOptionPane.showMessageDialog(null,"");
            }
            }

            if (b.equals("China"))
            {
            a="Selected Country is ";
            a += b;
            textarea.setText(a);
           ImageIcon bb=new ImageIcon("china.jpg");
           img.setIcon(bb);
           try
            {
           FileReader file = new FileReader("china.txt");
           textarea.read(file,null);
            }
            catch(IOException ioe)
            {
                JOptionPane.showMessageDialog(null,"");
            } 
            }

            if (b.equals("Shrilanka"))
            {
            a="Selected Country is ";
            a += b;
            textarea.setText(a);
           ImageIcon bb=new ImageIcon("shrilanka.jpg");
           img.setIcon(bb); 
           try
            {
           FileReader file = new FileReader("shrilanka.txt");
           textarea.read(file,null);
            }
            catch(IOException ioe)
            {
                JOptionPane.showMessageDialog(null,"");
            }
            }

            if (b.equals("America"))
            {
                a="Selected Country is ";
            a += b;
            textarea.setText(a);
           ImageIcon bb=new ImageIcon("america.jpg");
           img.setIcon(bb);
            try
            {
           FileReader file = new FileReader("america.txt");
           textarea.read(file,null);
            }
            catch(IOException ioe)
            {
                JOptionPane.showMessageDialog(null,"");
            }
            }     

            if (b.equals("Australia"))
            {
                a="Selected Country is ";
            a += b;
            textarea.setText(a);
           ImageIcon bb=new ImageIcon("australia.jpg");
           img.setIcon(bb);
           try
            {
           FileReader file = new FileReader("australia.txt");
           textarea.read(file,null);
            }
            catch(IOException ioe)
            {
                JOptionPane.showMessageDialog(null,"");
            } 

            }

            if (b.equals("Brazil"))
            {
                a="Selected Country is ";
            a += b;
            textarea.setText(a);
           ImageIcon bb=new ImageIcon("brazil.jpg");
           img.setIcon(bb); 
           try
            {
           FileReader file = new FileReader("brazil.txt");
           textarea.read(file,null);
            }
            catch(IOException ioe)
            {
                JOptionPane.showMessageDialog(null,"");
            } 
            }

            if (b.equals("Canada"))
            {
                a="Selected Country is ";
            a += b;
            textarea.setText(a);
           ImageIcon bb=new ImageIcon("canada.jpg");
           img.setIcon(bb); 
           try
            {
           FileReader file = new FileReader("canada.txt");
           textarea.read(file,null);
            }
            catch(IOException ioe)
            {
                JOptionPane.showMessageDialog(null,"");
            } 

            }
            if (b.equals(" "))
            {
                textarea.setText("");
                img.setIcon(null);

            }


            
        }
if(ae.getSource()==exit)
{
    setVisible(false);
    //dispose();
    Login l1= new Login();
    l1.setVisible(true);
}
        repaint();
    }


}