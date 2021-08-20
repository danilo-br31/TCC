package animais;

import javax.swing.JOptionPane;

public class Animal {
	
	protected String nome;
	protected String ambiente;
	
	public Animal() {
		nome = "Desconhecido";
		ambiente = "Desconhecido";
	}
	
	public Animal(String nome, String ambiente) {
		this.nome = nome;
		this.ambiente = ambiente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	
	public void mover() {
		JOptionPane.showMessageDialog(null, nome + " em movimento");
	}
	
}
