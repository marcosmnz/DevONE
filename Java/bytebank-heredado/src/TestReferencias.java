
public class TestReferencias {
	
	public static void main(String[] args) {
		
		
		//El elemento más genérico puede ser adaptado
		//al elemento mas especifico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Ximena");
		
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
	}
	
}
