
public class Executa {

	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Pedro");
		System.out.println(vendedor.getNome());
		
		Gerente gerente = new Gerente();
		gerente.setNome("Maria");
		System.out.println(gerente.getNome());
		gerente.validaSenha(11);
	}

}
