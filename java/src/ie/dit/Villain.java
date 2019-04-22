package ie.dit;

import processing.data.TableRow;

public class Villain{

    private String Alias;
    private String Location;
    private String Threat_Level;
    private String Name;

    /**
     * @return the alias
     */
    public String getAlias() {
        return Alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        Alias = alias;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        Location = location;
    }

    /**
     * @return the threat_Level
     */
    public String getThreat_level() {
        return Threat_Level;
    }

    /**
     * @param threat_Level the threat_Level to set
     */
    public void setThreat_Level(String threat_Level) {
        Threat_Level = threat_Level;
    }

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }

    public String toString()
    {
        return Alias + "\t" + Location + "\t" + Threat_Level + "\t" + Name ;
    }

    public Villain(TableRow row)
    {
        Alias = row.getString("Alias");
        Location = row.getString("Location");
        Threat_Level = row.getString("Threat_Level");
        Name = row.getString("Name");
    }

    public Villain()
    {

    }
}