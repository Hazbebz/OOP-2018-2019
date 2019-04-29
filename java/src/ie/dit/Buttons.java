
package ie.dit;

import processing.core.PApplet;

public class Buttons extends PApplet
{
    Batman_UI ui;
    private float alfred_x1;
    private float alfred_y1;
    private float batmobile_x1;
    private float batmobile_y1;
    private float batplane_x1;
    private float batplane_y1;
    private float alfred_x2;
    private float alfred_y2;
    private float batmobile_x2;
    private float batmobile_y2;
    private float batplane_x2;
    private float batplane_y2;
    
    
    

    public Buttons(Batman_UI ui,float alfred_x1,float alfred_y1,float batmobile_x1,float batmobile_y1,float batplane_x1,float batplane_y1,float alfred_x2,float alfred_y2,float batmobile_x2,float batmobile_y2,float batplane_x2,float batplane_y2)
    {
        this.alfred_x1=alfred_x1;
        this.alfred_y1=alfred_y1;
        this.batmobile_x1 = batmobile_x1;
        this.batmobile_y1 = batmobile_y1;
        this.batplane_x1 = batplane_x1;
        this.batplane_y2 = batplane_y2;
        this.alfred_x2 = alfred_x2;
        this.alfred_y2= alfred_y2;
        this.batmobile_x2 = batmobile_x2;
        this.batmobile_y2 = batmobile_y2;
        this.batplane_x2 = batplane_x2;
        this.batplane_y2 = batplane_y2;
        alfred_x1=20;
        alfred_x2=170;
        alfred_y1=75;
        alfred_y2=75;
        batmobile_x1=20;
        batmobile_x2=170;
        batmobile_y1=125;
        batmobile_y2=125;
        batplane_x1=20;
        batplane_x2=170;
        batplane_y1=175;
        batplane_y2=175;
        

    }

    public void render()
    {
        if(ui.mousePressed)
        {
            if(ui.mouseX > alfred_x1 && ui.mouseX < alfred_x2 && ui.mouseY> alfred_y1)
            {
               
            }
        }
    }

    
        

}
