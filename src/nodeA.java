import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
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
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ProgressMonitor;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;




public class nodeA implements ActionListener

{
	
	String text;
	DataOutputStream output;

	BufferedInputStream bis;
	
	BufferedOutputStream bos;

	byte[] receivedData;
	int in;
	
	String strLine;
	public Font f = new Font("Times new roman" , Font.BOLD , 18);	
	public Font f1 = new Font("Times new roman", Font.BOLD , 28);
	public Font f2 = new Font("Times new roman", Font.BOLD , 18);
	public Font f3 = new Font("Engravers MT", Font.BOLD , 15);
    public JLabel T1= new JLabel("Node A");
	public JLabel T2= new JLabel();
	public JLabel l = new JLabel("Received File");
	public JLabel selectfile= new JLabel("Select the File     :");
	public JLabel selectpath= new JLabel("Select the Path   :");
	public JLabel Availablenode= new JLabel("Available Node");
	public JLabel pathdisplay= new JLabel();
	
	public JButton browse = new JButton("Browse");
	public JButton btn = new JButton("Submit");
	public JButton btn1 = new JButton("Exit");
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	
	public JTextArea tf1 = new JTextArea();
	public JScrollPane pane1 = new JScrollPane();
	
	
	public JLabel jLabel11 ;
	public JLabel jLabel12 ;
	public JFrame jf;
	public Container c;
	JPanel jp=new JPanel();
	JPanel jp1=new JPanel();
	
	
	
	public Font f0 = new Font("Times new roman" , Font.BOLD , 25);

	
	//public Font f1 = new Font("Times new roman" , Font.BOLD , 18);
	nodeA()
	{
		
				
		jf = new JFrame("Node A");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(800,670);
		
		c.setBackground(new Color(9,51,15));
		
		
		JTabbedPane jTabbedPane1 = new JTabbedPane();
		JPanel jPanel1= new JPanel();
		
		
		jPanel1.setBackground(Color.DARK_GRAY);
		
		JPanel jPanel2 = new JPanel();
		
		
		jPanel2.setBackground(new Color(157,159,141));
		
		
		
		jLabel11=new JLabel();
		
		jLabel11.setBounds(380,60,350,45);
		
		
		
		jLabel11.setForeground(Color.RED);
         
		jLabel11.setFont(f0);
		
       jLabel12=new  JLabel("NODE A ");
		
		jLabel12.setForeground(Color.RED);
         
		jLabel12.setFont(f1);
		
		pathdisplay.setBounds(400,230,572,18);
		pathdisplay.setForeground(Color.RED);
		pathdisplay.setFont(f);
		
		Availablenode.setBounds(730,270,172,18);
		Availablenode.setForeground(Color.GREEN);
		Availablenode.setFont(f);
		
		selectfile.setBounds(200,180,172,18);
		selectfile.setFont(f);
		selectfile.setForeground(Color.CYAN);
		
		selectpath.setBounds(200,230,172,18);
		selectpath.setFont(f);
		selectpath.setForeground(Color.CYAN);
		
		T1.setBounds(400,10,950,50);
		T2.setBounds(210,50,950,50);
		T1.setForeground(Color.CYAN);
		T2.setForeground(Color.RED);
		
		l.setBounds(720,330,250,35);
		
	
		
		
		l.setForeground(new Color(6,45,14));
		
		
		l.setFont(f2);
		
		
		jp.setBounds(120,125,810,500);
		jp.setBackground(Color.DARK_GRAY);
		jp1.setBounds(118,123,814,504);
		
	   tf.setColumns(20);
	   tf.setRows(10);
	   tf.setFont(f);
	   tf.setBackground(new Color(246,233,191));
	   tf.setForeground(Color.BLUE);
	   tf.setName("tf");
	   pane.setBounds(200,300,400,230);
		
	   pane.setName("pane");
	   pane.setViewportView(tf);
	   
	   
	   browse.setBounds(500,170,150,35);
	   browse.setFont(f);
	   
	   btn.setBounds(300,560,150,35);
	   btn.setFont(f);
	   
	   btn1.setBounds(500,560,150,35);
	   btn1.setFont(f);
	      
	   tf1.setColumns(20);
	   tf1.setRows(10);
	   tf1.setFont(f);
	   tf1.setBackground(new Color(246,233,191));
	   tf1.setForeground(new Color(120,0,0));
	   tf1.setName("tf");
	   pane1.setBounds(700,300,200,250);
		
	   pane1.setName("pane");
	   pane1.setViewportView(tf1);
	      
		T1.setFont(f1);
		T2.setFont(f1);
		browse.addActionListener(this);	 
		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn.setMnemonic(KeyEvent.VK_S); 
		jf.show();
		c.add(pane, BorderLayout.CENTER);
		c.add(pane1, BorderLayout.CENTER);
		c.add(selectfile);
		c.add(selectpath);
		c.add(pathdisplay);
		c.add(Availablenode);
		c.add(browse);
		c.add(btn);
		c.add(btn1);
		c.add(T1);
		c.add(jp);
		c.add(jp1);
				
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});		
		
		int[] ports = new int[] { 1000,1003 };

		for (int i = 0; i < 2; i++) {
			Thread t = new Thread(new PortListener(ports[i]));
			t.setName("Listener-" + ports[i]);
			t.start();

		}
			
	}
	
	
	public static void main(String args[])
	{
	new nodeA();
	///PortListener but;
		
	}
	

	 
	class PortListener implements Runnable {

		ServerSocket server;
		Socket connection;
		BufferedReader br = null;
		int port;
		Socket client = null;
	
		public PortListener(int port) {
			this.port = port;
		}

		public void run() {
			
			
			
   if(this.port==1000)
 {
		
		try { 
			   
			    server = new ServerSocket(1000);
				
			     while (true)
			   {
				                   connection = server.accept();
				
				                   br = new BufferedReader(
						           new InputStreamReader(new BufferedInputStream(
								   connection.getInputStream())));
				
				                      String strLine;
				                     // Read File Line By Line
				                   StringBuffer buffer = new StringBuffer();
				                   System.out.println("hi");
				                   while ((strLine = br.readLine()) != null)
				                  {
					                  // Print the content on the console
					                   System.out.println(strLine);
					                   buffer.append(strLine + "\n");

				                   }
			                               	br.close();
				                            connection.close();
				                            String a=buffer .toString();
				                            String b=a.substring(0,23);
				                            String c=a.substring(25,42);
				                            
				                            
				                            tf1.setText(b.toString()+"\n"+c.toString());	
				                            String ev=tf1 .toString();
				                            text=a.substring(17,23);
				                            System.out.println(text);
				                            String nodeb="Available Node : Node A , Distance 4 metre";
				         	               
				    		              
				    		                  String nodebsendstr;//=nodebString.toString();
				    		                 nodebsendstr=nodeb.toString();;
				    		                
				                			
				/******************************************************************/
				/*******************************************************************/
				                       byte[] byteArray;			 
				                       Socket client = null;
				    try     { 
					
					                  client = new Socket("127.0.0.1", 1001);
		    		                  bos = new BufferedOutputStream(client.getOutputStream()); 
		    		                      
		    		                  
		    		                  byteArray =nodebsendstr.getBytes();
		    		                  bos.write(byteArray, 0, byteArray.length);
		    		                  bos.flush();
		    		                  bos.close();
		    		                  client.close();
				           }
				              
				    catch (UnknownHostException e1) 
				          {
					        // TODO Auto-generated catch block
					           e1.printStackTrace();
				         }
				    catch (IOException e1) 
				         {
					       // TODO Auto-generated catch block
					          e1.printStackTrace();
				         }
				    
				    
				   
				    finally 
				           {
					            if (bos != null)
					            {
						                try 
						                  {
							              bos.close();
						                  }            
						                 catch (IOException e1)
						                   {
							                 // TODO Auto-generated catch block
							                 e1.printStackTrace();
						                    }
					           }
					 
					            try {
						                client.close();
				                   	} 
					            catch (IOException e1)
					                {
						             // TODO Auto-generated catch block
						               e1.printStackTrace();
					                }
				         }
				    
			        }
		  }       
		           catch (IOException e)
		            {
		        	   
		             }   
		           finally
		           {
		        	   
		            }
		
		
	           }
   else
   if(this.port==1003)
   {

		
		try { 
			   
			    server = new ServerSocket(1003);
				
			     while (true)
			   {
				                   connection = server.accept();
				
				                   br = new BufferedReader(
						           new InputStreamReader(new BufferedInputStream(
								   connection.getInputStream())));
				
				                      String strLine;
				                     // Read File Line By Line
				                   StringBuffer buffer = new StringBuffer();
				                   System.out.println("hi");
				                   while ((strLine = br.readLine()) != null)
				                  {
					                  // Print the content on the console
					                   System.out.println(strLine);
					                   buffer.append(strLine + "\n");

				                   }
			                               	br.close();
				                            connection.close();
				                           // String a=buffer .toString();
				                           // String b=a.substring(0,23);
				                           // String c=a.substring(25,42);
				                            
				                            
				                           // tf.setText(b.toString()+"\n"+c.toString());	
				                            
				                            tf.setText(buffer.toString());
			        }
		  }       
		           catch (IOException e)
		            {
		        	   
		             }   
		           finally
		           {
		        	   
		            }
		
		
	           
   }
		
	
	}
	}	
		public void actionPerformed(ActionEvent e)
		 {
		
			 if (e.getSource()==browse)
			    {
			          JFileChooser chooser = new JFileChooser();
					       try
					          {
			    		        File f = new File(new File("filename.txt").getCanonicalPath());

			   		        chooser.setSelectedFile(f);
							
			                } 
			        catch (IOException e1) 
			               {
			                }
			 
			                   chooser.showOpenDialog(browse);
			                   int retval = chooser.showOpenDialog(browse);
			                   if (retval == JFileChooser.APPROVE_OPTION){
			                   File field = chooser.getSelectedFile();
			                   pathdisplay.setText(field.getAbsolutePath());
			     }		    

			              File curFile = chooser.getSelectedFile();

			           try
			                 {

			               FileInputStream fstream = new FileInputStream(curFile);
					          DataInputStream ins = new DataInputStream(fstream);
			               BufferedReader br = new BufferedReader(new InputStreamReader(ins));
			               StringBuffer buffer = new StringBuffer();

			                while ((strLine = br.readLine()) != null)   {

			                  System.out.println (strLine);
			                 buffer.append(strLine+ "\n");
			   

			                   }
			               tf.setText(buffer.toString());

			//
			            }
			                catch (Exception e1)
			                {
			               System.err.println("Error: " + e1.getMessage());
			              }
			           }
			 if (e.getSource()==btn)
			    {
				 
				 System.out.println(text);
				//PortListener but = null;
				 if(text.equals("Node B"))
				 {


				    	
						
						int Port = 1002;
										
						Socket client=null;
						try {
							client = new Socket("127.0.0.1", Port);
							
				    		bos = new BufferedOutputStream(client.getOutputStream()); 
				    		byte[] byteArray = tf.getText().getBytes();
				    		bos.write(byteArray, 0, byteArray.length);
				    		bos.flush();
				    		bos.close();
				    		client.close();
						} catch (UnknownHostException e1) {
							
							e1.printStackTrace();
						} catch (Exception e1) {}
							
						finally {
							if (bos != null) {
								try {
									bos.close();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							try {
								client.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
								
						}	
				    
			    	
					 
				 }
			    }
			 if(e.getSource()==btn1)
			 {
				 System.exit(0);
			 }
		 }
		
}
