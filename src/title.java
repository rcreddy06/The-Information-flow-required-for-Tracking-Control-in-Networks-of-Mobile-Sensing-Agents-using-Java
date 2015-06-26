

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class title implements ActionListener
{
	
	public Font f = new Font("Times new Roman" , Font.BOLD , 24);
	public Font f1 = new Font("Calibrie", Font.BOLD + Font.ITALIC, 25);
	public Font f2 = new Font("Calibrie", Font.BOLD + Font.ITALIC, 15);

	public Font f3 = new Font("Bell MT", Font.BOLD , 20);
    public Font f4 = new Font("Arial Rounded MT Bold", Font.BOLD , 30);
	public JLabel T1= new JLabel("On the Information Flow Required for Tracking");
	public JLabel T2= new JLabel("Control in Networks of Mobile Sensing Agents");
	public JLabel T3= new JLabel("IEEE TRANSACTIONS ON MOBILE COMPUTING, APRIL 2011");
	public JButton b1 = new JButton("Activate");
	public JButton b2 = new JButton("File Transfer");
	public JButton b3 = new JButton("SIMPS Mobility");
	public JButton b4 = new JButton("Graphical Coverage");
	
	public JComboBox TAreu = new JComboBox();	
	public JButton btn = new JButton("Submit");
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	public JButton btn1 = new JButton("Browse");
	public JFrame jf;
	public Container c;
	 
	
	title()
	{
       Image image1=Toolkit.getDefaultToolkit().getImage("E:/image/node1.gif");

       IP ip1= new IP(image1);
       ip1.setBounds(2,200,300,340);
	   ip1.setBackground(Color.white);


		jf = new JFrame("Node A");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(800,670);
        
		//c.setBackground(new Color(3,79,67));
		
		 c.setBackground(new Color(2,36,32));
		

        b1.setBounds(300, 200, 200,35);
        b2.setBounds(300, 300, 200,35);
        b3.setBounds(300, 400, 200,35);
        b4.setBounds(300, 500, 200,35);
        
        
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        
        b1.setForeground(Color.BLACK);
        b2.setForeground(Color.BLACK);
        b3.setForeground(Color.BLACK);
        b4.setForeground(Color.BLACK);
        
        b1.setBackground(Color.CYAN);
        b2.setBackground(Color.CYAN);
        b3.setBackground(Color.CYAN);
        b4.setBackground(Color.CYAN);
        
		btn1.setBounds(610,190,230,45);
		btn1.setFont(f3);
		
		btn1.setForeground(Color.BLACK);
		
		
		T1.setBounds(60,30,950,45);
        T1.setForeground(Color.ORANGE);
		TAreu.setBounds(550,550,200,35);
		btn.setBounds(450,620,230,45);
		T1.setFont(f4);
		
		T2.setBounds(200, 80, 850,45);
		T2.setFont(f);
		T2.setForeground(new Color(120,120,0));
        T2.setForeground(Color.CYAN);
        
        T3.setBounds(60, 130, 850, 60);
		T3.setFont(f);
		T3.setForeground(new Color(120,120,0));
        T3.setForeground(Color.MAGENTA);
		btn.setFont(f);
		
		btn.setForeground(Color.BLACK);
		TAreu.addItem("Mesh Route");
		TAreu.addItem(" Node ");
		TAreu.setFont(f3);
		TAreu.setBackground(Color.WHITE);
		TAreu.setForeground(Color.BLUE);
		pane.setBounds(350,300,500,200);
		
		tf.setColumns(20);
		tf.setRows(10);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);
	
        btn1.setBackground(new Color(176,174,144));
       
		btn.setBackground(new Color(176,174,144));
		btn1.addActionListener(this);
		btn.addActionListener(this);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		btn1.setMnemonic(KeyEvent.VK_B);
		btn.setMnemonic(KeyEvent.VK_S); 
		jf.show();
		c.add(T1);
		c.add(T2);
		c.add(T3);
		
     	jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		
	}
		 public void actionPerformed(ActionEvent e)
		 {
			 
            if(e.getSource()==b1)
           {
            	String str = e.getActionCommand();
            	if(str.equals("Activate")){
    				if(JOptionPane.showConfirmDialog(null, "Are you Activate your Node?", "Message Box", JOptionPane.OK_CANCEL_OPTION) == 0)
    					JOptionPane.showMessageDialog(null, "Successfully Activated", "Message Box", 1);
    				else
    					JOptionPane.showMessageDialog(null, "Activation Conceled", "Message Box", 1);
    			         }	
         	      	
            }
            if(e.getSource()==b2)
            {
            	
         // new nodeA();
            }
                       
            if(e.getSource()==b3)
            {
                        
          //  new simpsmobility();
            }
            if(e.getSource()==b4)
            {
          //  	 new Clipping1();
		     } 
            }
            	
	public static void main(String args[])
	{
		new title();
	}
}
