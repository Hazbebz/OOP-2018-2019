//Controlling class that allows for drawing 
package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import java.awt.Font;


public class Batman_UI extends PApplet
{

    public void settings()
    {
        size(1000,600);
    }

    public void setup()
    {
        loadData();   
        printVills();//function call to print out villains.csv to debug console 
        myWindow = new Window(this);
    }
    Window myWindow;

    public void loadData()
    {
        Table table = loadTable("Villains.csv","header");//load villains.csv table 
        Table table_2 =loadTable("Contact.csv","header");//load contacts table 

        //for loops to add csv table data to array list 
        for (TableRow row : table.rows()) 
        {
            Villain villain = new Villain(row);
            villains.add(villain);
        }

        for (TableRow row : table_2.rows()) 
        {
            Contact contact = new Contact(row);
            contacts.add(contact);
        }
    }

    public void printVills() {
        //for loop to outprint all villains and their details 
        for (Villain villain : villains) {
            System.out.println(villain);
        }
    }

    //out putting the villains to the lower quadrant of the screen 
    public void villains_to_screen() {
        int x = 250;
        int y = 425;
        int ygap = 10;
        int xgap = 60;
        for(int i = 0 ; i < villains.size() ; i ++)
        {
            Villain villain = villains.get(i);
            stroke(0,255,0);
            textAlign(LEFT, CENTER);
            fill(0,255,0);
           // g.setFont(new Font("monospaced",Font.BOLD));
            text(villain.getAlias(),x,y + ygap);
            x += 60;
            text(villain.getLocation(),x + xgap,y + ygap);
            x += 100;
            text(villain.getThreat_level(),x+ xgap,y + ygap);
            x += 100;
            text(villain.getName(),x + xgap,y + ygap);
            x+=100;
            text(villain.getWeakness(),x + xgap,y + ygap);

            y +=28;
            x=250;
        }
    }
    
    //constructs the framework for the jFrame
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

    //start of drawing bat symbol 
    public void Bat_symbol()
    {
        int x =480; 
        int y=210;
        int width =500;
        int height =300; 
        fill(0,255,0);
        ellipse(x,y,width,height);

        fill(0);
        beginShape();
        vertex(270,150);
        vertex(420,150);
        vertex(440,180);
        vertex(460,130);
        vertex(470,150);
        vertex(490,150);
        vertex(500,130);
        vertex(520,180);
        vertex(540,150);
        vertex(690,150);
        vertex(620,200);
        vertex(620,210);
        vertex(580,230);
        vertex(580,240);
        vertex(485,300);
        vertex(380,240);
        vertex(380,230);
        vertex(340,210);
        vertex(340,200);
        vertex(270,150);
        endShape();

    }
    //end of bat symbol drawing 

    //drawing ellipses for radar
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
    //initialise variables to for drawButtons() and mouseClicked()
    float border = 20;
    float buttonWidth = 170;
    float buttonHeight = 75;
    float gap = 50;
    //function to draw buttons for the left hand quadrant of the screen.
    void drawButtons()
    {
        for(int i = 0 ; i < contacts.size(); i ++)
        {
            Contact contact = contacts.get(i);

            float y = border + (i * (buttonHeight + gap));
            float x = border;
            noFill();
            stroke(0,255,0);
            rect(x, y, buttonWidth, buttonHeight);
            textAlign(CENTER, CENTER);
            fill(0);
            stroke(0,255,0);
            fill(0,255,0);
            text(contact.getContact(),  x + buttonWidth * 0.5f, y + buttonHeight * 0.5f);
        }
    }

    public void mouseClicked()
    {
        int which = -1;

        // The best way!!
        if ((mouseX > border && mouseX < border + buttonWidth))
        {
            if ((mouseY - border) % (buttonHeight + gap) < buttonHeight)
            {
                which = (int) ((mouseY - border) / (buttonHeight + gap));
            }
        }

        if (which != -1)
        {
            myWindow.draw();
        }
    }
    public void popUpWindow()
    {
        stroke(0,255,0);
        fill(0);
        rect(225,50,525,325);
    }

    public void draw()
    {
        background(0);
        drawFrame();
        drawEllipse();
        villains_to_screen();
        Bat_symbol();
        drawButtons();
        myWindow.draw();
    }

    private ArrayList<Villain> villains = new ArrayList<Villain>();
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
}