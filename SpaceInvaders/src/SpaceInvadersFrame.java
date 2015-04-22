import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;




public class SpaceInvadersFrame extends JFrame{
	public SpaceInvadersFrame() {
		super("Space Invaders!! ");
		setLayout(new BorderLayout());
		createMenus();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		SpaceInvadersPanel sip = new SpaceInvadersPanel();
		this.add(sip);
		pack();
		}
	
	private void createMenus() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setVisible(true);
		JMenu fileMenu = new JMenu("File");
		JMenuItem newItem = new JMenuItem("New");
		newItem.addActionListener(this);
		// this allows the JMenuItem called newItem to tell the Frame that someone has chosen "new"
		fileMenu.add(newItem);
		menuBar.add(fileMenu);
		//menuBar.setUI(new BasicMenuBarUI());
		setJMenuBar(menuBar);
		//add(menuBar, BorderLayout.NORTH);
		}
	
}

