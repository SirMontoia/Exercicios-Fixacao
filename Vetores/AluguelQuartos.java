package vetores.entities;

public class AluguelQuartos {
	
	
	
	private String nome, email;
	private int quarto;
	
	
	
	public AluguelQuartos(String nome, String email, int quarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	public String toString() {
		return (nome+ "," + email);
	}
	
	
	

}
