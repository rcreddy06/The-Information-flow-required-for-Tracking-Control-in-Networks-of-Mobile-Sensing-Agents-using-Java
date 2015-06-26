import java.awt.*;

import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.font.TextLayout;
import java.awt.font.FontRenderContext;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClipExample {
  public static void main(String[] args) {
    JFrame f = new Clipping();
    f.show();
  }
}
class Clipping extends JFrame implements ActionListener, Runnable 
{
	Thread th;
  public Clipping() 
  {
	  
    setTitle("Show clippings");
    setSize(350, 300);
    addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent event) {
    System.exit(0);
   }
 });
    
    
    Container contentPane = getContentPane();
  
    panel = new ClipPanel();
    panel.setBackground(new Color(2,36,32));
    contentPane.add(panel, "Center");
    JPanel buttonPanel = new JPanel();
    buttonPanel.setBackground(new Color(2,36,32));
    ButtonGroup group = new ButtonGroup();
    button1 = new JButton("Move Node A");
    button1.setFont(new Font("Times new roman",Font.BOLD,16));
    button1.setBackground(Color.CYAN);
    buttonPanel.add(button1);
    group.add(button1);
    button1.addActionListener(this);
    button2 = new JButton("Move Node B");
    button2.setFont(new Font("Times new roman",Font.BOLD,16));
    button2.setBackground(Color.RED);
    buttonPanel.add(button2);
    group.add(button2);
    button2.addActionListener(this);
    button3 = new JButton("Move Node C");
    button3.setFont(new Font("Times new roman",Font.BOLD,16));
    button3.setBackground(Color.MAGENTA);
    buttonPanel.add(button3);
    group.add(button3);
    button3.addActionListener(this);
    button4 = new JButton("Move Node D");
    button4.setFont(new Font("Times new roman",Font.BOLD,16));
    button4.setBackground(Color.YELLOW);
    buttonPanel.add(button4);
    group.add(button4);
    button4.addActionListener(this);
    button5= new JButton("   Exit  ");
    button5.setFont(new Font("Times new roman",Font.BOLD,16));
    button5.setBackground(Color.GREEN);
    buttonPanel.add(button5);
    group.add(button5);
    button5.addActionListener(this);
    contentPane.add(buttonPanel, "North");
  }
  

  public void start ()
	{
		
		 th = new Thread (this);
		
		th.start ();
		
		
	}
 
  public void stop ()
	{
	  
	}

	public void destroy()
	{

	}

	public void run ()
	{		
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
			while (true)
		{	
				
			if(nodeprocess==1)	{
				
			if(panel.pos_y==200)
			{
			}
			else
			{
				panel.pos_x ++;
				panel.pos_y ++;
				panel.pos_x0 ++;
				panel.pos_y0 ++;
				panel.pos_x1 --;
				panel.pos_y1 --;
				panel.pos_x1a --;
				panel.pos_y1a --;
				
				
				
			}
			 
			}
			else if(nodeprocess==2)
				
			{
				
				
				if(panel.pos_x2==300)
			{
			}
			else
			{
				panel.pos_x2--;
				panel.pos_x2a --;
				if(panel.pos_y1==200)
				{
				}
				else
				{
				panel.pos_y1++;
				panel.pos_y1a++;
				}
							
			}
			}
			else if(nodeprocess==3)
			{
				if(panel.pos_y3==450)
				{
				}
				else
				{
					panel.pos_y3++;
					panel.pos_y3a++;
					
					if(panel.pos_y==400)
					{
					}
					else
					{
					panel.pos_y ++;
					panel.pos_y0 ++;
					}
					
				}
			}
			
			else if(nodeprocess==4)
			{
			
				if(panel.pos_x1==500)
				{
				}
				else
				{
					panel.pos_x1++;
					panel.pos_x1a++;
					
					if(panel.pos_y3==120)
					{
					
					}
					else
					{
						panel.pos_y3--;
						panel.pos_y3a--;
					}
					
					
				}
			}
			
			repaint();
			try
			{
				
				Thread.sleep (10);
			}
			catch (InterruptedException ex)
			{
				}
					
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		}
	}		

 public void actionPerformed(ActionEvent e) {
  
    if(e.getSource()==button1)
    {
    	nodeprocess=1;
    	start();
    	BufferedOutputStream bos = null;
    	byte[] byteArray;
    	String strLine = null;
	    String newline = "\n";
    	String  sendstr;
	 	   Socket client = null;
		    StringBuffer buffer = new StringBuffer();
		 	int Port = 1000;
				try {
				client = new Socket("127.0.0.1", Port);
				bos = new BufferedOutputStream(client.getOutputStream());
	    		String a="Available Node : Node B , Distance 4 metre";
	               
	               sendstr=a.toString();
	               
	                sendstr+=buffer.toString();
	                
	    		byteArray = sendstr.getBytes();
	    		bos.write(byteArray, 0, byteArray.length);
	    		bos.flush();
	    		bos.close();
	    		client.close();
	    		    			
			}
			
			catch (UnknownHostException e1)
			{
								
			}
					 
			catch (Exception e1) {}
			
    }
    
    if(e.getSource()==button2)
    {
    	nodeprocess=4;
    	start();
    	BufferedOutputStream bos = null;
    	byte[] byteArray;
    	String strLine = null;
	    String newline = "\n";
    	String  sendstr;
	 	   Socket client = null;
		    StringBuffer buffer = new StringBuffer();
		 	int Port = 1004;
				try {
				client = new Socket("127.0.0.1", Port);
				bos = new BufferedOutputStream(client.getOutputStream());
	    		String a="Available Node : Node D , Distance 5 metre";
	               
	               sendstr=a.toString();
	               
	                sendstr+=buffer.toString();
	                
	    		byteArray = sendstr.getBytes();
	    		bos.write(byteArray, 0, byteArray.length);
	    		bos.flush();
	    		bos.close();
	    		client.close();
	    		    			
			}
			
			catch (UnknownHostException e1)
			{
								
			}
					 
			catch (Exception e1) {}
		   }
    if(e.getSource()==button3)
    {
    	nodeprocess=2;
    	start();
    }
    if(e.getSource()==button4)
    {
    	nodeprocess=3;
    	start();
    }
    if(e.getSource()==button5)
    {
    	System.exit(0);
    }
  }


  public JButton button1;
  public JButton button2;
  public JButton button3;
  public JButton button4;
  public JButton button5;
  int nodeprocess;
  public ClipPanel panel;
}
class ClipPanel extends JPanel {
	    public int pos_x = 25;
	    public int pos_y =25;
	    
	    public int pos_x0 = 110;
	    public int pos_y0 = 110;
	        
	    public int pos_x1 = 400;
	    public int pos_y1 = 300;
	    public int pos_x1a = 485;
	    public int pos_y1a = 385;
	    
	    public int pos_x2 = 700;
	    public int pos_y2 = 50;
	    
	    public int pos_x2a = 785;
	    public int pos_y2a = 135;
	    
	    public int pos_x3 = 750;
	    public int pos_y3 = 400;
	    public int pos_x3a = 835;
	    public int pos_y3a = 485;
	    
	    public int radius = 190;
	    public int radius0 = 15;
	    
	    public int radius1 = 190;
	    public int radius1a = 15;
	    
	    public int radius2 = 190;
	    public int radius2a = 15;
	    
	    public int radius3= 190;
	    public int radius3a = 15;
        public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                          RenderingHints.VALUE_ANTIALIAS_ON);

    g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                         RenderingHints.VALUE_RENDER_QUALITY);

    int w = getWidth();
    int h = getHeight();

    Ellipse2D circle = new Ellipse2D.Double(pos_x, pos_y, radius, radius);
    Ellipse2D circle0 = new Ellipse2D.Double(pos_x0, pos_y0, radius0, radius0);
    
    Ellipse2D circle1 = new Ellipse2D.Double(pos_x1, pos_y1, radius, radius);
    Ellipse2D circle1a = new Ellipse2D.Double(pos_x1a, pos_y1a, radius1a, radius1a);
    
    Ellipse2D circle2 = new Ellipse2D.Double(pos_x2, pos_y2, radius, radius);
    Ellipse2D circle2a = new Ellipse2D.Double(pos_x2a, pos_y2a, radius2a, radius2a);
    
    Ellipse2D circle3= new Ellipse2D.Double(pos_x3, pos_y3, radius3, radius3);
    Ellipse2D circle3a = new Ellipse2D.Double(pos_x3a, pos_y3a, radius3a, radius3a);
   

 
     g2d.setColor(Color.CYAN);
     g2d.fill(circle);
     g2d.setColor(Color.BLACK);
    
     g2d.fill(circle0);
    
     g2d.setColor(Color.RED);
    
     g2d.fill(circle1);
     g2d.setColor(Color.BLACK);
   
     g2d.fill(circle1a);
     g2d.setColor(Color.MAGENTA);
    
    
     g2d.fill(circle2);
    
     g2d.setColor(Color.BLACK);
     g2d.fill(circle2a);
     
     g2d.setColor(Color.YELLOW);
    
    
     g2d.fill(circle3);
     g2d.setColor(Color.BLACK);
     g2d.fill(circle3a);

 
    g2d.draw(circle);
    g2d.draw(circle0);
    g2d.draw(circle1);
    g2d.draw(circle1a);
    g2d.draw(circle2);
    
    g2d.draw(circle2a);
    
    g2d.draw(circle3);
    g2d.draw(circle3a);
    
  

  }
  public void step() {
  	
  	int w = getWidth();
      int h = getHeight();
      
     if(pos_x==500)
      	 
		{
			
		}
		else
		{
     
			pos_x0=pos_x0+100;
			pos_y0=pos_y0+100;
			pos_x=pos_x+100;
			pos_y=pos_y+100;
		}
     
  }
  
  
  
}