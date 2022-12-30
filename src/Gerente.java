
public class Gerente extends Main implements Autentica {
	// implements de Autentica e extends da classe Main
	
	private int senha = 16;

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Função ValidaSenha ok");
			
			
		}else {
			System.out.println("Função ValidaSenha retorna erro de senha");
			
		}
		
	}

}
