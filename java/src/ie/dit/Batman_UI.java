//Controlling class that allows for drawing 
package ie.dit;

import processing.core.PApplet;

public class Batman_UI extends PApplet
{

    public void settings()
    {
        size(1000,600);
    }

    public void setup()
    {
        
    }
    
    float Rect_X = 10;
    float Rect_Y = Rect_X;
    float Rect_H = 580;
    float Rect_W = 980;
    public void drawFrame()
    {
        stroke(0,255,0);
        rect(Rect_X,Rect_Y,Rect_W,Rect_H);
        
    }

    public void draw()
    {
        background(0);
        drawFrame();
    }
    
}