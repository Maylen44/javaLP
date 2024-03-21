package javaLP;
import static javax.swing.JOptionPane.*;

public class Main 
{

	public static void main(String[] args) 
	{
		//test code
		System.out.print("Hello World!\n");
		String name = "Gennadiy Belz";
		
		//Aufgabe 1
		System.out.println(name);
		System.out.println("");
		System.out.println("Ich bin froh, dass ich an der FOM studieren darf!");
		
		//Aufgabe 2
		System.out.print(name + "\n\nIch bin froh, dass ich an der FOM studieren darf!");
		
		//Aufgabe 3
		/*
		Dialog Window popup method from class JOptionPane from swing with 4 parameters:
		object (not standartized, can be null)
		msg (not standartized)
		title (standartized)
		icon (standartized) 
		*/
		showMessageDialog(null, name, "Wichtige Nachrichten", WARNING_MESSAGE);
		
		
		
		
	}

}
