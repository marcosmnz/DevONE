
public class EjemploCondicionales {
	public static void main(String[] args) {


		int edad = 18;
		int cantidad = 3;

		if (edad >= 18) {
			System.out.println("Si puedes entrar");
		} else {
			if(cantidad >= 2) {
				System.out.println("Usted es menor de edad pero puede pasar.");
			} else
			System.out.println("No puedes entrar");
		}

	}
}
