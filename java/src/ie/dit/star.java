package ie.dit;

public class star
{
    private int hab;

    private String displayName;

    private float distance;
    private float xG,yG,zG;
    private float absMag;
    
    public int getHab()
    {
        return hab;
    }
    public void setHab(int hab)
    {
        this.hab= hab;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }
    public String getDisplayName(String displayName)
    {
        return displayName;
    }

    public void setDistance(float distance)
    {
        this.distance = distance;
    }

    public void getDistance()
    {
        return distance;
    }

    public void setCoords(float xG,float yG,float zG)
    {
        coords = new PVector(xG,yG,zG);
    }

    public float getCooords()
    {
        return coords;
    }

    public void setabsMag()
    {
        this.absMag = absMag;
    }

    public float getabsMag()
    {
        return absMag;
    }
}