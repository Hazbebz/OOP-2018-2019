package ie.dit;

import processing.core.PVector;
import sun.jvm.hotspot.debugger.windbg.WindbgThreadFactory;

public class Bullet extends GameObject
{
    public Bullet(YASC yasc, float x, float y, float rotation)
    {
<<<<<<< HEAD
        this.yasc = yasc;
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        this.rotation = rotation; 
        speed = 5;

        if(pos.x<0)
        {
            pos.x =yasc.width;
        }

        if(pos.x>yasc.width)
        {
            pos.x = 0;
        }

        if(pos.y<0)
        {
            pos.y = yasc.height;
        }

        if (pos.y > yasc.height)
        {
            pos.y=0;
        }

        alive += yasc.timeDelta;
        if(alive >= 5.0)
        {
            yasc.bullets.remove(this);
        }

=======
        super(yasc, x, y, rotation, 5);
>>>>>>> d7d78f9b01f7865682ab1f94e2c03fdc6def4a4e
    }  

    public void render()
    {
        yasc.pushMatrix();
        yasc.translate(pos.x, pos.y);
        yasc.rotate(rotation);
        yasc.line(0, -5, 0, 5);
        yasc.popMatrix();
    }

    public void update()
    {
        // static methods on the Math class
        forward.x = (float)Math.sin(rotation);
        forward.y = - (float)Math.cos(rotation);

        // pos += forward * speed
        pos.add(PVector.mult(forward, speed));
<<<<<<< HEAD


    }

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the forward
     */
    public PVector getForward() {
        return forward;
    }

    /**
     * @param forward the forward to set
     */
    public void setForward(PVector forward) {
        this.forward = forward;
    }
=======
>>>>>>> d7d78f9b01f7865682ab1f94e2c03fdc6def4a4e

        if (pos.x < 0)
        {
            pos.x = yasc.width;
        }
        if (pos.x > yasc.width)
        {
            pos.x = 0;
        }
        if (pos.y < 0)
        {
            pos.y = yasc.height;
        }
        if (pos.y > yasc.height)
        {
            pos.y = 0;
        }
        alive += yasc.timeDelta;
        if (alive >= 5.0)
        {
            yasc.gameObjects.remove(this);
        }
    }

    float alive;

}