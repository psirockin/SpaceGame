import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public abstract class Creature {
	public static JPanel panel;
	private String name;
	private Image img;
	private int x;
	private int y;
	public Creature(String n){
		name = n;
		readImg();
	}
	private void readImg(){
		try {
			img = ImageIO.read(fullpath());
		} catch (IOException e) {
			System.out.println("!!");
		}
	}
	
	private File fullpath() {
		String origin = "images/"+getName();
		File a = new File(origin+".jpg");
		File b = new File(origin+".gif");
		File c = new File(origin+".png");
		if(a.exists()){
			System.out.println("Jpg found");
			return a;
		}
		else if(b.exists()){
			System.out.println("Gif found");
			return b;
		}
		else if(c.exists()){
			System.out.println("Png found");
			return c;
		}
		return null;
	}
	
	public String getName(){
		return name;
	}
	
	public Image getImage(){
		return img;
	}
	
	public void setLocation(int xs, int ys){
		x = xs;
		y = ys;
	}
	
	public abstract void attack();
	
}
