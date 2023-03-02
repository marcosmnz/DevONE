
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		miCuenta.depositar(200);
		
		
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		
		System.out.println(miCuenta.saldo);
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);
		
		if (puedeTransferir) {
			System.out.println("Se realizó la transferencia con éxito...");
		}
		
		System.out.println("El nuevo saldo de Jimena es: " + cuentaDeJimena.saldo);
		System.out.println("El nuevo saldo de mi cuenta es: " + miCuenta.saldo);

	}
}
