import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Deck extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private static final Insets insets = new Insets(0, 0, 0, 0);
	Deck cart;
	public JTextArea jtAreaOutput;
	public JLabel price;
	public JLabel amount;
	JButton button;
    JLabel desc;
	
	public Deck(){
	
		//createDecks();
		//createBuy();
		JButton button;
	    JLabel desc;
	    // Row One - Three Buttons
	    button = new JButton("Carte 1");
	    button.addActionListener(this);
	    addComponent(this, button, 0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    button = new JButton("Carte 2");
	    button.addActionListener(this);
	    addComponent(this, button, 1, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    button = new JButton("Carte 3");
	    button.addActionListener(this);
	    addComponent(this, button, 2, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    desc = new JLabel("Carte Description");
	    desc.setHorizontalAlignment(SwingConstants.CENTER);
	    desc.setFont(new Font("Serif", Font.PLAIN, 18));
	    addComponent(this, desc, 3, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    // Row Two - Three Buttons  
	    button = new JButton("Carte 4");
	    button.addActionListener(this);
	    addComponent(this, button, 0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    button = new JButton("Carte 5");
	    button.addActionListener(this);
	    addComponent(this, button, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    button = new JButton("Carte 6");
	    button.addActionListener(this);
	    addComponent(this, button, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    // Row Three - Three Buttons
	    button = new JButton("Carte 7");
	    button.addActionListener(this);
	    addComponent(this, button, 0, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    button = new JButton("Carte 8");
	    button.addActionListener(this);
	    addComponent(this, button, 1, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    button = new JButton("Carte 9");
	    button.addActionListener(this);
	    addComponent(this, button, 2, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    button = new JButton("Buy");
	    button.addActionListener(this);
	    button.setSize(10, 10);
	    addComponent(this, button, 3, 2, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.LINE_END);
	    
	    new JTextField(100);
        jtAreaOutput = new JTextArea(100,400);
        jtAreaOutput.setLocation(600, 450);
        jtAreaOutput.setText("Description of carte super......");
        //jtAreaOutput.setEditable(false);
        addComponent(this, jtAreaOutput, 3, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
        
        price = new JLabel("Price: ");
        addComponent(this, price, 3, 2, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
        
        amount = new JLabel("                 0");
        addComponent(this, amount, 3, 2, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	}
	
	public static void addComponent(Container container, Component component, int gridx, int gridy,
		      int gridwidth, int gridheight, int anchor, int fill) {
		    GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
		        anchor, fill, insets, 0, 0);
		    container.add(component, gbc);
		  }
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Carte 1")) {
		      System.out.println("Button1 has been clicked");
		      jtAreaOutput.setText("You have choosen this carte 1");  
		      amount.setText("                 100");
		    }
		if (e.getActionCommand().equals("Carte 2")) {
		      System.out.println("Button2 has been clicked");
		      jtAreaOutput.setText("You have choosen this carte 2");  
		      amount.setText("                 200");
		    }
		if (e.getActionCommand().equals("Carte 3")) {
		      System.out.println("Button3 has been clicked");
		      jtAreaOutput.setText("You have choosen this carte 3");  
		      amount.setText("                 300");
		    }
		if (e.getActionCommand().equals("Carte 4")) {
		      System.out.println("Button4 has been clicked");
		      jtAreaOutput.setText("You have choosen this carte 4");  
		      amount.setText("                 400");
		    }
		if (e.getActionCommand().equals("Carte 5")) {
		      System.out.println("Button5 has been clicked");
		      jtAreaOutput.setText("You have choosen this carte 5");  
		      amount.setText("                 500");
		    }
		if (e.getActionCommand().equals("Carte 6")) {
		      System.out.println("Button6 has been clicked");
		      jtAreaOutput.setText("You have choosen this carte 6");  
		      amount.setText("                 600");
		    }
		if (e.getActionCommand().equals("Carte 7")) {
		      System.out.println("Button7 has been clicked");
		      jtAreaOutput.setText("You have choosen this carte 7"); 
		      amount.setText("                 700");
		    }
		if (e.getActionCommand().equals("Carte 8")) {
		      System.out.println("Button8 has been clicked");
		      jtAreaOutput.setText("You have choosen this carte 8"); 
		      amount.setText("                 800");
		    }
		if (e.getActionCommand().equals("Carte 9")) {
		      System.out.println("Button9 has been clicked");
		      jtAreaOutput.setText("You have choosen this carte 9"); 
		      amount.setText("                 900");
		    }
		
		if (e.getActionCommand().equals("Buy")) {
		      System.out.println("Buy has been clicked");
		      JOptionPane.showMessageDialog(this,"Transaction Completed !");
		    }
	}
}
