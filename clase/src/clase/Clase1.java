package clase;

/**
 * Sacar cartas de la baraja
 * 
 * @author Rune Isla
 *  Impreme las cartas por pantallaaaa Rubén tonto
 *  
 */


public class Clase1 { 

/**
 * 
 * @param args 
 * Imprime las cartas por pantallaa
 */
	public static void main(String args[]) { 
		Clase3 miPaqueteDeCartas = new Clase3();
		miPaqueteDeCartas.run();

	
		System.out.println("\n");
		for (int i = 0; i < 13; i++) {
			System.out.printf("%-20s%-20s%-20s%-20s\n", miPaqueteDeCartas.move(),
					miPaqueteDeCartas.move(), miPaqueteDeCartas.move(),
					miPaqueteDeCartas.move());
		} 

		System.out.println("\n");
	} 
} 