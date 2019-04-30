package ie.dit;


public class Main
{	


	public void Batman()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Batman_UI());
		
	}

	public static void main(String[] args)
	{
			Main main = new Main();
			main.Batman();
	}
	
}