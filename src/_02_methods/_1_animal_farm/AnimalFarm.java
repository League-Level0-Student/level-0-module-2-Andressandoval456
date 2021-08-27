//    Copyright (c) The League of Amazing Programmers 2013-2020
//    Level 0

package _02_methods._1_animal_farm;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;

	
	public static void main(String[] args) {
		new AnimalFarm().animals();
	}
	
	void animals() {

		/* 1. Ask the user which animal they want, then see and hear 
		 *    the animal they chose using one of the methods below.
		*/
		
		for (int i= 0; i<=5; i+=0) {
		String animal = JOptionPane.showInputDialog(null, "Which animal do you what to hear?"); 
		/* 2. Make it so that the user can keep entering new animals. */
			if(animal.equals("cow")) {
				playNoise(mooFile);
				showImage(cowIcon);
			}			
			else if(animal.equals("duck")) {
				playNoise(quackFile);
				showImage(duckIcon);
			}
			else if(animal.equals("dog")) {
				playNoise(woofFile);
				showImage(dogIcon);
			}
			else if(animal.equals("cat")) {
				playNoise(meowFile);
				showImage(catIcon);
			}
			else if(animal.equals("llama")) {
				playNoise(llamaFile);
				showImage(llamaIcon);
			}
		}		
	}
// cow
	void moo() {
		playNoise(mooFile);
		showImage(cowIcon);
	}
// duck
	void quack() {
		playNoise(quackFile);
		showImage(duckIcon);
	}
// dog
	void woof() {
		playNoise(woofFile);
		showImage(dogIcon);
	}
// cat
	void meow() {
		playNoise(meowFile);
		showImage(catIcon);
	}
// llama
	void llamaScream() {
		playNoise(llamaFile);
		showImage(llamaIcon);
	}
	


	

	/* Ignore this stuff */
	String path = "src/_02_methods/_1_animal_farm/";
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";
	ImageIcon llamaIcon;
	ImageIcon catIcon;
	ImageIcon dogIcon;
	ImageIcon duckIcon;
	ImageIcon cowIcon;
	
	private void showImage (ImageIcon icon) {
			JOptionPane.showMessageDialog(null, "", "You chose", 0, icon);
	}
	
	private void playNoise(String soundFile) {
		if (canPlaySounds) {	
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
	public AnimalFarm() {
		try {
			llamaIcon = new ImageIcon(path+"llama.jpg");
			cowIcon = new ImageIcon(path+"cow.jpg");
			dogIcon = new ImageIcon(path+"dog.jpg");
			catIcon = new ImageIcon(path+"cat.jpg");
			duckIcon = new ImageIcon(path+"duck.jpg");

		} catch (Exception e) {
					
		}
	}
}