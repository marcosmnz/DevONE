
public class EjemploScope {
	public static void main(String[] args) {


		int edad = 21;
		int cantidadPersonas = 1;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		if (puedeEntrar) {
			System.out.println("Si puedes entrar");
		} else {
			System.out.println("No puede entrar");
		}

	}
}
