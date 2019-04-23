//Controlling class that allows for drawing 
package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;


public class Batman_UI extends PApplet
{

    public void settings()
    {
        size(1000,600);
    }

    public void setup()
    {
        loadData();   
        printVills();

    }

    public void loadData()
    {
        Table table = loadTable("Villains.csv","header");

        for (TableRow row : table.rows()) 
        {
            Villain villain = new Villain(row);
            villains.add(villain);
        }
    }

    public void printVills() {
        for (Villain villain : villains) {
            System.out.println(villain);
        }
    }

    public void villains_to_screen() {
        int x = 250;
        int y = 425;
        int ygap = 10;
        int xgap = 50;
        for(int i = 0 ; i < villains.size() ; i ++)
        {
            Villain villain = villains.get(i);
            stroke(0,255,0);
            textAlign(CENTER, CENTER);
            fill(0,255,0);
            text(villain.getAlias(),x,y + ygap);
            x += 60;
            text(villain.getLocation(),x + xgap,y + ygap);
            x += 80;
            text(villain.getThreat_level(),x+ xgap,y + ygap);
            x += 100;
            text(villain.getName(),x + xgap,y + ygap);
            x+=100;
           // text(villain.getWeakness(),x + xgap,y + ygap);
            y +=28;
            x=250;
        }
    }
    
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

    public void drawEllipse(){
        int ellipse_x1 = 882;
        int ellipse_y1 = 485;
        int width = 200;
        int height = 200;
        int num_ellipses = 5;


        for(int i = 0 ; i < num_ellipses;i++)
        {
            ellipse(ellipse_x1,ellipse_y1,width,height);
            height -=40;
            width-=40;
        }
    }

    public void draw()
    {
        background(0);
        drawFrame();
        drawEllipse();
        villains_to_screen();
    }

    private ArrayList<Villain> villains = new ArrayList<Villain>();
}