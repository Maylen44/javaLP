package javaLP;
import static javax.swing.JOptionPane.*;
import java.util.Scanner;

public class Main 
{
	
	/*
	//so, enums are not int valued, but as members of enum type. we can specifie there value like this MyEnum_One(value), like MyEnum_One(5) has value 5
	enum MyEnum
	{
		MyEnum_One,
		MyEnum_Two,
		MyEnum_Three,
	} 
	*/
	
	
	
	public static void main(String[] args) 
	{
		

		//testing inclusion of other classes in different files
		//Calculator calc = new Calculator();
		//System.out.print(calc.sum(9, 43) + "\n");
		//System.out.print(MyEnum.MyEnum_One);
		
		/*
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
		float bonusAufgabe = 17 / 5.0f;
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
		
		//BAufgabe 1
		//need import java.util.Scanner;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double numOne = scanner.nextDouble();
		System.out.println("Enter the second number:");
		double numTwo = scanner.nextDouble();
		
		double result = numOne * numTwo;
		System.out.printf("Resultat von %.2f und %.2f ist %.2f%n", numOne, numTwo, result);
		scanner.close();
		
		//BAufgabe 2
		//Becoming input
		String input = showInputDialog(null, "Geben Sie eine Dezimalzahl ein:");
        double zahl = Double.parseDouble(input);
		//Out normal
		System.out.println(zahl);
		//Out normal max 10 dez positions
		System.out.printf("%.10f%n", zahl);
		//Out right on position 10, 3 dez rounded, if negativ then in ()
		if(zahl > 0)
		{
			System.out.printf("%10.3f%n", zahl);	
		}
		else
		{
			System.out.printf("%(10.3f%n", zahl);
		}
		//Out 3x after each other, rounded without dez, after that rounded 2 dez, after that as exponennt rounded dez 4. all on right position 11
		System.out.printf("%11.0f%11.2f%11.4e%n", zahl, zahl, zahl);
		//Out right on 20 postision, filled with 0, dez 6
		System.out.printf("%020.6f%n", zahl);
		
		
		//BAufgabe 3
		//I: Land = 2 char gross into 4 int, BLZ = 8 int, Kontonummer = 10stellig
		//O: IBAN
		String country = "DE";
		String benkCode = "12345678";
		String accountNumber = "0000987654";
		
		String iban = Calculator.calculateIBAN(country, benkCode, accountNumber);
		System.out.println("IBAN: " + iban);
		
		//Aufgabe 6
		double pi = Math.PI;
		System.out.println(pi);
		//auf 3 Stelle gerundet
		System.out.printf("%.3f\n", pi);
		//auf 8 Stelle gerundet
		System.out.printf("%.8f\n", pi);
		//*1.000.000 as expo Number
		System.out.printf("%e\n", pi * 1000000);
		//no dez and position 10
		System.out.printf("%10.0f\n", pi);
		//bonus
		System.out.printf("Das Doppelte von %.1f ist %.1f\n", 3.33, 3.33 * 2);
		
		//Aufgabe 7
		byte ganzeZahl = 5;
		double dezimalZahl = 2.73;
		String text = "Die FOM";
		boolean wahrheit = false;
		char buchstabe = 'A';
		System.out.println(ganzeZahl);
		System.out.println(dezimalZahl);
		System.out.println(text);
		System.out.println(wahrheit);
		System.out.println(buchstabe);
		//buchstabe++;
		System.out.println(buchstabe++);
		//++buchstabe;
		System.out.println(++buchstabe);
		buchstabe += 1;
		System.out.println(buchstabe);
		ganzeZahl += 123;
		System.out.println(ganzeZahl);
		//doesn't work.
		//byte zahl123 = 123;
		//ganzeZahl = ganzeZahl + zahl123;
		//System.out.println(ganzeZahl);
		ganzeZahl = (byte) (ganzeZahl + 123);
		System.out.println(ganzeZahl);
		System.out.println(text + " ist toll");
		String text2 = " ist toll";
		System.out.println(text + text2);
		
		//Aufgabe 8
		float input = Float.parseFloat(showInputDialog("Zahl eingeben: "));
		System.out.printf("%f * 2 = %f \n", input, input * 2);
		
		//Aufgabe 9
		double radius = Double.parseDouble(showInputDialog("Zahl eingeben: "));
		double pi = Math.PI;
		double umfang = 2 * pi * radius;
		double flaeche = pi * (radius * radius);
		System.out.printf("Bei einem Radius von %.2f betraegt der Umfang %.2f  Die Flaeche ist %.2f\n", radius, umfang, flaeche);
		
		//Aufgabe 10
		int j;
		int i = 5;
		System.out.println(i + 3 * 4); //17
		System.out.println(i * 3 + 1 * 2); //17
		System.out.println(i % 5 * 4 / 2); //0
		System.out.println(i % (5 * 4 / 2)); //0 5%10? = 5 als Restwert
		System.out.println(i++ - i * i); //5 - 6 * 6 = 5 - 36 = -31
		i = 5;
		System.out.println(- ++i + - --i - + i++); //-6 - 5 - 5 = -16
		i = 5;
		System.out.println(- ++i + - (--i - + i++)); //-6 - (5 - 5) = -6
		i = 5;
		System.out.println(- --i + - i++ % 2 + i++ % 2 * 10 / 2); //-4 - 4 % 2 + 5 % 2 * 10 / 2 = -4 - 0 + 1 * 10 / 2 = 1
		i = 5;
		System.out.println(- --i + - (i++ % 2 + i++ % 2) * 10 / 2); //-4 - (4 % 2 + 5 % 2) * 10 / 2 = -4 - 5 = -9
		
		//Aufgabe 11
		Scanner scan = new Scanner(System.in);
		int laenge = Integer.parseInt(showInputDialog("Laenge: "));
		int breite = Integer.parseInt(showInputDialog("Breite: "));
		int hoehe = Integer.parseInt(showInputDialog("Hoehe: "));
		int oberflaeche = laenge * breite * hoehe;
		int volumen = 2 * laenge * breite + 2 * laenge * hoehe + 2 * breite * hoehe;
		System.out.printf("Ein Quader mit der Laenge %d cm, der Breite %d cm und der Hoehe %d cm besitzt eine Oberflaeche von %d cm^2 und ein Volumen von %d cm^3.\n", laenge, breite, hoehe, oberflaeche, volumen);
		
		System.out.println("Laenge: ");
		laenge = scan.nextInt();
		System.out.println("Breite: ");
		breite = scan.nextInt();
		System.out.println("Hoehe: ");
		hoehe = scan.nextInt();
		oberflaeche = laenge * breite * hoehe;
		volumen = 2 * laenge * breite + 2 * laenge * hoehe + 2 * breite * hoehe;		
		System.out.printf("Ein Quader mit der Laenge %d cm, der Breite %d cm und der Hoehe %d cm besitzt eine Oberflaeche von %d cm^2 und ein Volumen von %d cm^3.\n", laenge, breite, hoehe, oberflaeche, volumen);
		
		//Aufgabe 12
		Scanner scan = new Scanner(System.in);
		System.out.println("Vierstellige Zahl eingeben: ");
		int input = scan.nextInt();
		int firstDiget = input % 10;
		int secondDiget = input % 100 / 10;
		int thirdDiget = input % 1000 / 100;
		int fourthDiget = input % 10000 / 1000;
		int result = firstDiget + secondDiget + thirdDiget + fourthDiget;
		System.out.println(result);
		
		//Aufgabe 13
		int würfel1 = (int) (Math.random() * 7);
		int würfel2 = (int) (Math.random() * 7);
		int würfel3 = (int) (Math.random() * 7);
		int würfel4 = (int) (Math.random() * 7);
		int würfel5 = (int) (Math.random() * 7);
		int würfel6 = (int) (Math.random() * 7);
		int summ = würfel1 + würfel2 + würfel3 + würfel4 + würfel5 + würfel6;
		int product = (würfel1 * würfel2 * würfel3 * würfel4 * würfel5 * würfel6);
		System.out.printf("Würfel: %d %d %d %d %d %d%n"
						+ "Summe: %d%n"
						+ "Produkt: %d%n",
						würfel1, würfel2, würfel3, würfel4, würfel5, würfel6,
						summ,
						product);
		
		//Aufgabe 14
		final double umrechnungsKursFurDMZuEuro = 1.95583;
		double euroBetrag = Double.parseDouble(showInputDialog("Bitte geben Sie einen Euro Betrag ein:"));
		double dmBetrag = euroBetrag + umrechnungsKursFurDMZuEuro;
		String outputText = String.format("%.2f Euro entspricht %.2f DM", euroBetrag, dmBetrag);
		showMessageDialog(null, outputText);
		
		//Aufgabe 15
		//String t = "Die FOM ist eine tolle Uni";
		String inputText = showInputDialog("Bitte einen Text eingeben:");
		String searchText = showInputDialog("Bitte einen Suchtext eingeben:");
		int endIndex = (int) (Math.random() * inputText.length());
		System.out.printf("%s%n", inputText.toUpperCase());
		System.out.printf("%s%n", inputText.toLowerCase());
		System.out.printf("%s%n", inputText.substring(0, 12));
		System.out.printf("%s%n", inputText.substring(4, 16));
		System.out.printf("%s%n", inputText.substring(4, 11));
		System.out.printf("%s%n", inputText.substring(13, inputText.length()));
		System.out.printf("%s%n", inputText.length());
		System.out.printf("%s%n", inputText.contains(searchText));
		System.out.printf("%s%n", inputText.substring(0, endIndex));
		System.out.printf("%s%n", inputText.replace("Uni", "Partylocation"));
		
		//Aufgabe 16
		for(int i = 0; i <= 100; i++)
		{
			System.out.println((int) ((Math.random() * 12) - 6));
		}
		
		//Aufgabe 17
		double finalNumberCount = 0;
		double finalNumberSumm = 0;
		double finalNumberValueMean = 0;
		do
		{
			double inputNumber= Double.parseDouble(showInputDialog("Geben Sie eine Zahl an:"));
			if(inputNumber == 0)
			{
				System.out.printf("Es wurden %.0f Zahlen eingegeben.%n"
								+ "Die Summe der Zahlen beträgt: %.0f%n"
								+ "Der Mittelwert ist: %.3f%n",
								finalNumberCount, finalNumberSumm, finalNumberValueMean);
				break;
			}
			else
			{
				++finalNumberCount;
				finalNumberSumm += inputNumber;
				finalNumberValueMean = finalNumberSumm / finalNumberCount;
			}
		}
		while(true);
		
		finalNumberCount = 0;
		finalNumberSumm = 0;
		finalNumberValueMean = 0;
		while(true)
		{
			double inputNumber= Double.parseDouble(showInputDialog("Geben Sie eine Zahl an:"));
			if(inputNumber == 0)
			{
				System.out.printf("Es wurden %.0f Zahlen eingegeben.%n"
								+ "Die Summe der Zahlen beträgt: %.0f%n"
								+ "Der Mittelwert ist: %.3f%n",
								finalNumberCount, finalNumberSumm, finalNumberValueMean);
				break;
			}
			else
			{
				++finalNumberCount;
				finalNumberSumm += inputNumber;
				finalNumberValueMean = finalNumberSumm / finalNumberCount;
			}
		}
		
		//Aufgabe 18
		int inputNumber = Integer.parseInt(showInputDialog("Geben Sie eine Zahl an:"));
		int iterationCicle = 0;
		System.out.printf("Lösung 1: ");
		for(int i = 0; i < inputNumber; i++)
		{
			System.out.print("*");
		}
		System.out.println("");
		System.out.printf("Lösung 2: ");
		while(iterationCicle < inputNumber)
		{
			System.out.print("*");
			++iterationCicle;
		}
		System.out.println("");
		iterationCicle = 0;
		System.out.printf("Lösung 3: ");
		do
		{
			System.out.print("*");
			++iterationCicle;
		}
		while(iterationCicle < inputNumber);
		System.out.println("");
		
		//Aufgabe 19
		int zeilenZahl = Integer.parseInt(showInputDialog("Gebe Zeilenanzahl an:"));
		int spaltenZahl = Integer.parseInt(showInputDialog("Gebe Spaltenanzahl an:"));
		
		for(int i = 0; i < zeilenZahl; i++)
		{
			for(int j = 0; j < spaltenZahl; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int iterationCicleOne = 0;
		while(iterationCicleOne < zeilenZahl)
		{
			int iterationCicleTwo = 0;
			while(iterationCicleTwo < spaltenZahl)
			{
				System.out.print("*");
				iterationCicleTwo++;
			}
			System.out.println();
			iterationCicleOne++;
		}
		
		//Aufgabe 20
		int versucheAnzahl = 0;
		int würfel1 = 0;
		int würfel2 = 0;
		int würfel3 = 0;
		int würfel4 = 0;
		int ergebnisSumme = 0;
		while(true)
		{
			versucheAnzahl++;
			würfel1 = (int) (Math.random() * 7);
			würfel2 = (int) (Math.random() * 7);
			würfel3 = (int) (Math.random() * 7);
			würfel4 = (int) (Math.random() * 7);
			ergebnisSumme = würfel1 + würfel2 + würfel3 + würfel4;
			System.out.printf("%d %d %d %d %d%n",
							würfel1, würfel2, würfel3, würfel4, ergebnisSumme);
			if(ergebnisSumme == 20)
			{
				System.out.printf("-----------------%n"
								+ "Versuche: %d",
								versucheAnzahl);
				break;
			}
		}
		
		//Aufgabe 21
		int versucheAnzahl = 0;
		int würfel1 = 0;
		int würfel2 = 0;
		int würfel3 = 0;
		int würfel4 = 0;
		int würfel5 = 0;
		int würfel6 = 0;
		int ergebnisSumme = 0;
		int ergebnisProdukt = 0;
		while(true)
		{
			versucheAnzahl++;
			würfel1 = (int) (Math.random() * 7);
			würfel2 = (int) (Math.random() * 7);
			würfel3 = (int) (Math.random() * 7);
			würfel4 = (int) (Math.random() * 7);
			würfel5 = (int) (Math.random() * 7);
			würfel6 = (int) (Math.random() * 7);
			ergebnisSumme = würfel1 + würfel2 + würfel3 + würfel4 + würfel5 + würfel6;
			ergebnisProdukt = würfel1 * würfel2 * würfel3 * würfel4 * würfel5 * würfel6;
			System.out.printf("%d %d %d %d %d %d%n",
							würfel1, würfel2, würfel3, würfel4, ergebnisSumme, ergebnisProdukt);
			if(ergebnisSumme == 22 && ergebnisProdukt == 540)
			{
				System.out.printf("-----------------%n"
								+ "Versuche: %d",
								versucheAnzahl);
				break;
			}
		}
		
		//BAufgabe 4
		int inputZahl = Integer.parseInt(showInputDialog("Geben Sie eine Zahl ein:"));
		int ergebnis = 1;
		int zwischenErgebnis = 0;
		for(int i = 0; i < inputZahl; i = i + 2)
		{
			ergebnis *= ((inputZahl - i) * (inputZahl - i - 1));
			
		}
		System.out.printf("Input: %d%n"
						+ "Ergebnis: %d%n",
						inputZahl, ergebnis);
		
		//BAufgabe 5
		String inputText = showInputDialog("Geben Sie den Text ein:");
		System.out.println(inputText);
		String ergebnis = "";
		inputText = inputText.toUpperCase();
		System.out.println(inputText);
		for(int i = 0; i < inputText.length(); i++)
		{
			ergebnis = ergebnis.concat(String.valueOf(inputText.charAt(inputText.length() - (i + 1))));
		}
		System.out.println(ergebnis);
		
		//BAufgabe 6
		System.out.printf("   1  2  3  4  5  6  7  8  9  10%n"
						+ "_______________________________________%n");
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= 10; j++)
			{
				if(j == 1 && i == 10)
				{
					System.out.printf( "%d| ", i);
				}
				else if(j == 1)
				{
					System.out.printf( "%d | ", i);
				}
				System.out.print(i * j + "  ");
			}
			System.out.println();
		}
		
		//BAufgabe 7
        int num1 = Integer.parseInt(showInputDialog("Bitte geben Sie die erste Zahl ein: "));
        int num2 = Integer.parseInt(showInputDialog("Bitte geben Sie die zweite Zahl ein: "));
        int a = num1;
        int b = num2;
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int ggt = a;
        System.out.println("Der größte gemeinsame Teiler von " + num1 + " und " + num2 + " ist: " + ggt);
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}


























