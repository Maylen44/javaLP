package javaLP;
import static javax.swing.JOptionPane.*;

public class Main 
{

	public static void main(String[] args) 
	{
		/*
		//testing inclusion of other classes in different files
		Calculator calc = new Calculator();
		System.out.print(calc.sum(9, 43) + "\n");
		
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
		//Dialog Window popup method from class JOptionPane from swing with 4 parameters:
		//object (not standartized, can be null)
		//msg (not standartized)
		//title (standartized)
		//icon (standartized) 
		showMessageDialog(null, name, "Wichtige Nachrichten", WARNING_MESSAGE);
		
		//Aufgabe 4
		String newName = showInputDialog("Name eingeben");
		String newHobby = showInputDialog("Was machst du?");
		showMessageDialog(null, newName + "\n" + newHobby, "Aufgabe 4", INFORMATION_MESSAGE);
		*/
		
		//Aufgabe 5
		//Variante 1
		int ergebnis = 0;
		ergebnis += 10;
		System.out.println(ergebnis);
		ergebnis += 5;
		System.out.println(ergebnis);
		ergebnis += 3.0;
		System.out.println(ergebnis);
		ergebnis += 2147483647;
		System.out.println(ergebnis);
		ergebnis *= 10;
		System.out.println(ergebnis);
		ergebnis /= 2;
		System.out.println(ergebnis);
		ergebnis /= 3;
		System.out.println(ergebnis);
		String intWithStringConcatenation = ergebnis + "Test";
		System.out.println(intWithStringConcatenation);
		String stringWithIntConcatenation ="Test" + ergebnis;
		System.out.println(stringWithIntConcatenation);
		//Variante 2
		ergebnis = 10;
		System.out.println(ergebnis);
		System.out.println(ergebnis + 5);
		System.out.println(ergebnis + 3.0);
		System.out.println(ergebnis + 2147483647);
		System.out.println(ergebnis * 10);
		System.out.println(ergebnis / 2);
		System.out.println(ergebnis / 3);
		System.out.println(ergebnis + "Test");
		System.out.println("Test" + ergebnis);
		//bonus
		float bonusAufgabe = 17 / 5;
		System.out.printf("%,.2f", bonusAufgabe);

		//Variante 1: Operationenreihung
		//15 erwartet
		//18 erwartet aber mischung von double und int => genauigkeitsverlust?
		//-2147483631 = erwartet int uberfullung
		//170 trash 
		//85 trash
		//28 trash
		//28Test nicht erwartet da type immutabilitat dennoch ein static_cast in die String passiert
		//Test28 nicht erwartet da type immutabilitat dennoch ein static_cast in die String passiert
		
		//Variante 2: Operationenseparierung
		//15 erwartet
		//13.0 nicht erwartet => type umwandlung ins double. ist Type Umwandlung automatisch auf grossten Type?
		//-2147483639 erwartet MAX_VALUE 2147483647 MIN_VALUE -2147483648
		//100 erwartet
		//5 erwartet
		//3 erwartet int/int = int => Genauigkeitsverlust
		//10Test gleich wie oben
		//Test10 gleich wie oben
		
	}

}















