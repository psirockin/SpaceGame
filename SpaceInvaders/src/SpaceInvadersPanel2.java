import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SpaceInvadersPanel2 extends JPanel implements ActionListener{
	Timer gameTimer;
	private int numClicks = 0;
	private int dx=1;
	public SpaceInvadersPanel2() {
	this.setPreferredSize(new Dimension(1000,800));
	gameTimer = new Timer(10, this);
	this.addKeyListener(new KeyAdapter(){
		public void key(KeyEvent c){
			if(c.KEY_PRESSED == c.VK_LEFT){
				
			}
			else if(c.KEY_PRESSED == c.VK_RIGHT){
				
			}
			else if(c.KEY_PRESSED == c.VK_SPACE){
				
			}
		}
	});
	//gameTimer.start();
	}
	
	//Creature c = new Enemy("Tenshi");
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("you just clicked new...");
		moveEverything();
		//if(e.)
		//startGame();
	}
	
	private void moveEverything() {
	// what do you want to do every 10th of a second?
	System.out.println("just clicked! "+numClicks);

	checkForCollision();
	repaint();
	// update the number of clicks
	numClicks++;
	if(numClicks %5==0) {
		x += dx;
		y += dy;
		}
	if(numClicks %500 == 0) {
		y/=2;
		}
	}
	
	private void checkForCollision() {
		
	}
	
	public void repaint(){
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawString(""+numClicks, x, y);
	System.out.println(""+numClicks+ " and width "+ this.getWidth());
	}
	
	
}
