package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.TableRow;
import processing.data.Table;

public class popUpWindow extends PApplet
{
    public void loadData()
    {
        Table table_2 =loadTable("Contact.csv","header");//load contacts table 

        for (TableRow row : table_2.rows()) 
        {
            Contact contact = new Contact(row);
            contacts.add(contact);
        }

    }
    public void Window()
         {
            Contact contact = contacts.get(1);
            fill(0);
            stroke(0,255,0);
            rect(225,50,525,325);
            textAlign(LEFT, CENTER);
            fill(0);
            stroke(0,255,0);
            fill(0,255,0);
        
            text(contact.getContact(),  230 , 55 );
        }

        public void draw()
        {
            Window();
        }
    
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
}