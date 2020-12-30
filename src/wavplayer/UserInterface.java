package wavplayer;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

	private JFrame frame;

	public UserInterface() {

	}
     
	//Bygger själva ramen på programmet och gör den synlig.
 
	@Override
	public void run() {
		frame = new JFrame("WavPlayer");
		frame.setPreferredSize(new Dimension(400, 100));

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Stänger programmet helt när vi avslutar det.

		createComponents(frame.getContentPane());

		frame.pack();
		frame.setVisible(true); 
	}
	
	//Här skapar innehållet i ramen och hur ramen ska se ut.
	private void createComponents(Container container) {
		
		
		//Var och hur knapparna och textrutan ska synas.
		GridLayout layout = new GridLayout(4, 1);
		container.setLayout(layout);

		// Textruta till vänster om knapparna.
		JLabel text = new JLabel("<html>1 .Click on one of the buttons to play the sound.<br/><br/> 2. To stop the sound or go back click Ok in the popup window.<html>");
		
		
		MessageListener one = new MessageListener();
		
		//Knapparna i interfacen där man klickar för ljud ska spelas upp.
		
		JButton pButton1 = new JButton("Bu!");
		pButton1.setActionCommand("Play clip 1");
		pButton1.addActionListener(one);
		
		
		JButton pButton2 = new JButton("Pop!");
		pButton2.setActionCommand("Play clip 2");
		pButton2.addActionListener(one);
		
		JButton pButton3 = new JButton("MP5 Gunshot!");
		pButton3.setActionCommand("Play clip 3");
		pButton3.addActionListener(one);

		//Gör knapparna och textrutan synlig i ramen.
		container.add(text);
		container.add(pButton1);
		container.add(pButton2);
		container.add(pButton3);
		
		
		
	}
	
	

	public JFrame getFrame() {
		return frame;
	}

}
		
	
	
	

	

