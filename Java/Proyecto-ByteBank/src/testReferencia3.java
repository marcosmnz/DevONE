
public class testReferencia3 {
public static void main(String[] args) {
	
	Cuenta cuentadeDiego = new Cuenta();
	
	cuentadeDiego.titular = new Cliente();
	
	cuentadeDiego.titular.nombre = "Diego";
	
	System.out.println(cuentadeDiego.titular.nombre);
}
}
