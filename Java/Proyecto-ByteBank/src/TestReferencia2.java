
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "323832";
		diego.telefono = "9982245882";
		
		Cuenta cuentaDeDiego = new Cuenta();
		
		cuentaDeDiego.agencia = 1;
		cuentaDeDiego.titular = diego;
		
		System.out.println(cuentaDeDiego.titular.documento);
		
		
	}
}
