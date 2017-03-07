package clase;

/**
 * 
 * @author p.isla
 *
 */
public class Clase2

{ 
/**
 * Da la cara de la carta
 */
	private String cara;
	/**
	 * Da el palo de la carta
	 */
	private String palo;
/**
 * 
 * @param caraCarta
 * Da el palo de la carta
 * @param paloCarta
 * Da la cara de la carta
 */
	public Clase2( String caraCarta, String paloCarta)
 {   
 cara = caraCarta;
 palo = paloCarta;

 } // Cierra constructor

	/**
	 * Devuelve la cara
	 * @return cara
	 * Devuelve el palo
	 * @return Palo
	 */
	public String toString() { 
		return cara + " de " + palo;
	} 
} 