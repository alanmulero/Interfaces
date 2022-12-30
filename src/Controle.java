
public abstract class Controle {
	
	private int senha = 11;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	// Metodo senha
	public void ValidaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Senha validada com sucesso.");
			
		}else {
			System.out.println("Erro na validação.");
		}
	}
	 

}
