package ie.dit;

import processing.core.PApplet;

public class Window extends PApplet {
    PApplet papplet;
 
    public Window(PApplet papplet){
       this.papplet = papplet;
    }
 
    public void draw(){
        rect(225,50,525,325);
    }
 }