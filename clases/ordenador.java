package clases;

import java.util.Random;

/**
 * Esta clase simula el comportamiento de un sem�foro. El color devuelto es
 * aleatorio.
 * 
 * @author entornos
 * @version 2.0
 * @since 1.5
 * @see <a href = https://docs.oracle.com/javase/7/docs/api/java/util/Random.html> Clase Ramdom del API de java </a> 
 * 
 *  */
public class ordenador {

	/**
	 * Devuelve un valor aleatorio entre rojo, amarillo y verde
	 * @return Color del semaforo que responde el ordenador
	 */
	public String color() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(3);
		if (randomInt == 0) {
			return "rojo";
		} else if (randomInt == 1) {
			return "amarillo";
		} else {
			return "verde";
		}
	}
}
