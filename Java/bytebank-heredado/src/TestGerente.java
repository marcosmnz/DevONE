
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setTipo(1);
		gerente.setClave("AluraClasesOnLine");
		
		System.out.println(gerente.iniciarSesion("AluraClasesOnLine"));
		System.out.println(gerente.getBonificacion());
	}
}
