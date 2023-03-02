
public class TestFuncionario {
	 public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setNombre("Diego");
		diego.setTipo(0);
		diego.setDocumento("33546477");
		diego.setSalario(2000);
		
		
		System.out.println(diego.getNombre());
		System.out.println(diego.getDocumento());
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	} 
}
