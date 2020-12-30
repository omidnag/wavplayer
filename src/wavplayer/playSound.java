package wavplayer;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;



public class playSound {

	 
	
	public void play(String myPath) {
		
		 
		
		
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File(myPath)));
			clip.start(); //Startar klippet.
		       
			JOptionPane.showMessageDialog(null, "Press OK to stop"); //Visar en ruta med OK knapp som ger möjlighet att stoppa klippet.
			clip.stop(); //Själva stopp koden.
			
		       
			
			
		}
		
		
		catch (Exception ex) {
			//Ger error meddelande om det inte går att spela upp ljudet.
			System.out.println("Error with playing sound.");
		     ex.printStackTrace( );
	}
		
	

		
			

	}
}

	
		 
		  
		  
		 

		
		
	

	

	

