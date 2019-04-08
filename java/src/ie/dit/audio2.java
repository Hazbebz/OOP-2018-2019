package ie.dit;

import ddf.minim.AudioInput;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import processing.core.PApplet;

public class audio2 extends PApplet{

    public static int SAMPLE_RATE = 44100;
    public static int RESOLUTION = 16;
    public static int FRAME_SIZE = 1024;

    Minim minim;
    AudioInput ai;
    FFT fft;

    public void settings()
    {
        size(FRAME_SIZE,800);
        minim = new Minim(this);
        ai = minim.getLineIn(Minim.MONO,FRAME_SIZE,SAMPLE_RATE,RESOLUTION);
        fft = new FFT();
    }

    float lerpedAverage = 0;
    public void draw()
    {
        background(0);
        colorMode(HSB);
        float halfH = height/2;
        float total =0;
        for(int i = 0;i<ai.bufferSize();i++)
        {
            total += (float)Math.abs(ai.left.get(i));
            stroke (map(i,0,FRAME_SIZE,0,255),255,255);
            line(i,halfH,i, halfH +ai.left.get(i)* halfH);
        }//end for
        float average = total/(float)FRAME_SIZE;
        lerpedAverage = lerp(lerpedAverage,average,0.1f);
        noStroke();
        fill(map(lerpedAverage,0,1,0,255),255,255);
        ellipse(width/2,100,average *400,average*400);
    }
}