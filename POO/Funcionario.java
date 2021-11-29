package entitiesPOO;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioliquido () {
		return salarioBruto - imposto;
		
	}
	
	public void aumentosalario(double porcentagem) {
		salarioBruto += (salarioBruto * porcentagem/100);
	}
	
	public String toString() {
		return (nome + " $" + salarioliquido());
		
	}
	
}
