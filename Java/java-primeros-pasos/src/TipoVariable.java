
public class TipoVariable {
public static void main (String[] args) {
	System.out.println("Hola mundo");
	
	int edad = 28;
	System.out.println(edad);
	
	edad = 47;
	System.out.println(edad);
	edad = 47 + 88;
	System.out.println("Hola, tu edad es: " + edad);
	
	double salario = 1250.56;
	System.out.println(salario);
	
	double salarioMitad = salario / 2;
	System.out.println(salarioMitad);
	
	
	double variable1 = 230.89;
	int variable1Entero = (int) variable1; // Se le dice cast
	
	System.out.println(variable1Entero);
	
	long numerosGrandes = 1222222222222222222L;
	System.out.println(numerosGrandes);
	
	short numeroPequeño = 13555;
	
	byte numeroAunMasPequenho = 127;
	
	float numeroDecimalPequenho = 2.5F;
	
	

}
}
