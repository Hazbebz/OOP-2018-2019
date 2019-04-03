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
    /*
    float Rect_X = 10;
    float Rect_Y = Rect_X;
    float Rect_H = 580;
    float Rect_W = 980;
    */
    public void drawFrame()
    {
        //outer frame for screen objects
        stroke(0,255,0);
        fill(0);
        line(10,10,10,590);
        line(10,590,40,590);
        line(40,590,60,550);
        line(60,550,180,550);
        line(180,550,200,590);
        line(200,590,990,590);
        line(990,590,990,10);
        line(990,10,10,10);
        //end outer frame

        //inner frame for screen objects 
        line(200,10,200,400);
        line(205,10,205,400);
        line(205,400,770,400);
        line(10,400,200,400);
        line(10,405,770,405);

        line(770,10,770,400);
        line(770,405,770,590);
        line(775,10,775,590);
      
        
        
    }

    public void draw()
    {
        background(0);
        drawFrame();
    }
    
}