/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Charactor;

/**
 *
 * @author sarif
 */
import java.awt.geom.Rectangle2D;
import javax.swing.*;
public class Wave {
    public int x =  (int)((Math.random()*350) + 100) ;
    public int y = -100 ;
    public int xStart;
    public int yStart;
    public int width = 100;
    public int height  =100;
    public Thread waveMove;
    public ImageIcon imgWave = new ImageIcon(this.getClass().getResource("../img/wave.png"));
    public Wave(JPanel game)
    {
        xStart = x;
        yStart = y;
        
        waveMove = new Thread(new Runnable(){
            @Override
            public void run() {
                while(true)
                {
                    y += 10;
                    game.repaint();
                    try{
                            Thread.sleep(50);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        });
        waveMove.start();
    }
    
    
    public Rectangle2D getBounds()
    {
        return (new Rectangle2D.Double(x, y, width,height ));
    }
}
