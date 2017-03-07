package clase;

import java.util.Random;

public class Clase3

{ 
	/**
	 * Guarda las cartas
	 */
	private Clase2 paquete[];
	/**
	 * Guarda la carta actual
	 */
	private int cartaActual;
	/**
	 * Añade el numero de cartas que tiene la baraja
	 */
	private final int NUMERO_DE_CARTAS = 52;
	/**
	 * Da un numero aleatorio
	 */
	private Random numerosAleatorios;
	

	
/**
 * Se añaden todas las cartas con 2 cadenas caras y palos 
 * Se crean con el Ramdon Cartas aleatorias 
 */
	public Clase3()
 {  

 String caras[] = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE",
 "OCHO", "NUEVE", "DIEZ", "JOTO", "QUINA", "REY"};
 String palos[] = { "CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS"};

 paquete = new Clase2[ NUMERO_DE_CARTAS ];
 cartaActual = 0;
 numerosAleatorios = new Random();

 for ( int cuenta = 0; cuenta < paquete.length; cuenta++ )
 paquete[ cuenta ] = new Clase2( caras[cuenta % 13], palos[cuenta/13]); 
 }
																													// constructor
																													// PaqueteDeCartas


/**
 * Abre metodo barajar
 */
	public void run() { 
		cartaActual = 0;

		for (int primera = 0; primera < paquete.length; primera++) {
			int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

			Clase2 temp = paquete[primera];

			paquete[primera] = paquete[segunda];
			paquete[segunda] = temp;

		} 
	} 
/**
 * Reparte cartas
 * @return paquete Da la carta 
 */
	public Clase2 move() {
		if (cartaActual < paquete.length)
			return paquete[cartaActual++];
		else
			return null;
	} 
} 