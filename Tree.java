//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Canvas;

public class Tree extends Canvas
{
	public Tree()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.drawString("Lab14h - Tree Lab", 50, 50);
		
		tree(window);
    star(window);
    ornament(window);
    trunk(window);



	}
	
	public void tree(Graphics window)
	{
		int[] treeXPoints = {400,200,600};
		int[] treeYPoints = {100,500,500};
		Polygon tree = new Polygon(treeXPoints,treeYPoints,treeXPoints.length);
		window.setColor(Color.GREEN);
		window.fillPolygon(tree);


	}
	public void star(Graphics window)
	{
    int[] starXPoints = {399,418,452,423,432,397,362,371,350,380};
		int[] starYPoints = {67,98,99,124,155,135,156,122,98,97};
		Polygon star = new Polygon(starXPoints,starYPoints,starXPoints.length);
		window.setColor(Color.YELLOW);
		window.fillPolygon(star);

	}
  	public void ornament(Graphics window)
	{
    int[] ornamentXPoints = {397,364,445,326,483,333,390};
		int[] ornamentYPoints = {195,261,297,383,444,458,366};
    for (int i = 0; i<ornamentXPoints.length;i++)
    {
     int r = (int)(Math.random()*256);
     int g = (int)(Math.random()*256);
     int b= (int)(Math.random()*256);
     window.setColor(new Color(r,g,b));
     window.fillOval(ornamentXPoints[i],ornamentYPoints[i],25,25);
    }
	}
	public void trunk(Graphics window)
	{
		window.setColor(new Color(122,103,76));
		window.fillRect(375,500,50,100);


	}

}
