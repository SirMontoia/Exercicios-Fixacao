package entitiesPOO;

public class Aluno {
	
	
	public String nome;
	public double nota1, nota2, nota3;

	
	public double calculonota() {
		return nota1+nota2+nota3;
	}
	
	public double aproximarnota() {
		return 60 - calculonota();
	}
}
