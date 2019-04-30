# SciFi UI Project

Name:Harry Bebbington

Student Number: C17319656


Im Afraid That i did not fork this repository for my assignment and would like to apologize for any complications that may occur 
as a result of this. I started working away on this assignment in my forked repository of OOP-2018-2019. As a result i had to add
the README.md myslef and some of the other code segments from your repository are in my asssignment branch.

The important files for this assignment are as follows
Batman_UI.java
Main.java
Villain.java
Contact.java
Radar.java
Villain.csv
Contact.csv

# Description of the assignment
This Assignment is aimed to be a basic example of the of the Ui used in
the Batman Arkham game series. The screen that pops up on Batmans wrist and 
displays various functions for batman to access. In this case Batman would have constant
view of his most wanted from the Batman under the red hood series, access to a radar,and the
ability to call either alfred, the batmobile or the batplane.

# Instructions
First to access the program we must get into the correct branch
git checkout assignment
Once here all code segments should be available 

Clicking the buttons
	Click each name withing each button in order to activate the buuton
	Look to the left hand side of the screen in order to see the result

# How it works
Table-Csv file loaded in through Villains.java and stored in an arraylist then outputted to screen
Buttons- Drawn and made withing Batman_UI.java- uses mousepressed in order to determine location.
Batman logo- Drawn using vertexs and was custom drawn by me.
Radar- Implemented in radar.java- given a radius, position, frequency(for the line),and theta to get equation of the circle used.
	image updates constantly to display moving line.
Contact- Csv file names for buttons
	

# What I am most proud of in the assignment
	If i am going to be honest about this assignment, i did find it difficult to do even with the amount of time i put into it
	Implementing the radar and understanding how it worked took some time, as did implementing a correct version of the buttons.
	However i am personally most proud of how it looks. I wanted to get the old school look and add my own flare to it and i 
	feel like i have achieved that, even if the project is not perfect.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

