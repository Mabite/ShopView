import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Shop {

	Description descr;

	final JFrame frame = new JFrame();
	public Shop(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 650);
		frame.setLocation(300,300);
		frame.setTitle("Shop");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	    frame.getContentPane().add(new Description());
	    
	    JMenuBar menuBar = new JMenuBar();
        
        frame.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("Home");
        JMenu editMenu = new JMenu("Profile");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        
        menuBar.add(javax.swing.Box.createGlue());
        JLabel log = new JLabel("Logged as USER ");
        menuBar.add(log);
        
        JLabel space = new JLabel("     ");
        menuBar.add(space);
        
        JLabel log1 = new JLabel("Balance: XXXX ");
        menuBar.add(log1);

	}
	
	  public static void main(final String args[]) {
	    new Shop();
	  }
}
