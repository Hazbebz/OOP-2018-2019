package ie.dit;

import processing.data.TableRow;

public class Contact
{
    private String Contact;

    /**
     * @return the contact
     */
    public String getContact() {
        return Contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        Contact = contact;
    }
    public Contact(TableRow row)
    {
        Contact = row.getString("Contact");
    
    }
    public Contact()
    {

    }

}