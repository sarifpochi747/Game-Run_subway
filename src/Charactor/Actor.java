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
public class Actor{
    //attribute 
    
    public int x=300;
    public int xStart ;
    public int yStart ;
    public int y=650;
    public int Hp = 200;
    public int count = 0;
    public int jumpHeight = 100;
    public int width = 70;
    public int height  =70;
    public ImageIcon[] imgActor = new ImageIcon[9];
    public Actor()
    {
        xStart = x;
        yStart = y;
        for(int i=0;i<9;i++)
        {
            imgActor[i] = new ImageIcon(this.getClass().getResource("../img/actor/"+(i+1)+".png"));
        }
    }
    
    
    
    
    
    public void moveLeft()
    {
        x -= 10;
    }
    public void moveRight()
    {
        x += 10;
    }
    
    public Rectangle2D getBounds()
    {
        return (new Rectangle2D.Double(x, y, width,height ));
    }
    
    
}
