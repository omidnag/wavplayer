package wavplayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MessageListener implements ActionListener {

	JButton pButton1;
	JButton pButton2;
	
	playSound run = new playSound();
	
	
	
    public MessageListener() {
    		
    	
    	
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
   
    /*Hämtar getActionCommand från Userinterface classen som är kopplad till 
    kanpparna för att se vilket ljud det ska spelas i det här fallet.*/
    if (ae.getActionCommand().equals("Play clip 1")) {
    	run.play("bu.wav");
    	
    	
    }
    else if (ae.getActionCommand().equals("Play clip 2")) {
    	run.play("pop.wav");
    }
    
    if (ae.getActionCommand().equals("Play clip 3")) {
    	run.play("mp5.wav");
    }
    
    
    
 
    }

        
 
}



    
    
