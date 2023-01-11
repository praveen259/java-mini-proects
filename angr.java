import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class angr extends Applet implements KeyListener
{
 int x=600,y=360;
 public void paint(Graphics g)
 {

  addKeyListener(this);
        //face
        g.setColor(Color.red);
        g.fillOval(x, y,200,200);

        g.setColor(Color.black);
        g.drawLine(x+90,y+50,x+65,y+25);
        g.drawLine(x+110,y+50,x+140,y+25);
        g.fillOval(x+50, y+50,30,30);
        g.fillOval(x+125, y+50,30,30);

        g.fillOval(x+40,y+125,120,60);
        //smile
        g.setColor(Color.red);
        g.fillOval(x+40,y+140,120,60);

 }
 public void keyPressed(KeyEvent ke){

    int KeyCode = ke.getKeyCode();

    switch(KeyCode)
    {
        case KeyEvent.VK_UP:
        if(y>0)
        y=y-1;
        break;
        case KeyEvent.VK_DOWN:
        if(y<getHeight()-200)
        y=y+1;
        break;
        case KeyEvent.VK_LEFT:
        if(x>0)
        x=x-1;
        break;
        case KeyEvent.VK_RIGHT:
        if(x<getWidth()-200)
        x++;
        break;
    }
    repaint();
 }

 public void keyTyped(KeyEvent ke) {} 

 public void keyReleased(KeyEvent ke){}


 

}