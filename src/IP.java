import javax.swing.*;
import java.awt.*;

public class IP extends JPanel
{
 Image image;
 IP(Image image)
 {
  this.image=image;
 }
 public void paintComponent(Graphics g)
 {
  super.paintComponent(g);
  g.drawImage(image,0,0,this);
 }
 }
 