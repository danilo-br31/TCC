package animais;

import javax.swing.JOptionPane;

public class Peixe extends Animal {
	
	protected String escamas;
	
	public Peixe() {
		escamas = "Indefinido";
	}
	
	public Peixe(String nome, String ambiente, String escamas) {
		super(nome, ambiente);
		this.escamas = escamas;
	}
	
	public String getEscamas() {
		return escamas;
	}
	
	public void setEscamas(String escamas) {
		this.escamas = escamas;
	}
	
	public void mover() {
		JOptionPane.showMessageDialog(null, nome + " nadando");
	}
	

}
