package animais;

import javax.swing.JOptionPane;

public class Cavalo extends Animal {
	
	protected String pelagem;
	
	public Cavalo() {
		pelagem = "Indefinido";
	}
	
	public Cavalo(String nome, String ambiente, String pelagem) {
		super(nome, ambiente);
		this.pelagem = pelagem;
	}
	
	public String getPelagem() {
		return pelagem;
	}
	
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	public void mover() {
		JOptionPane.showMessageDialog(null, nome + " trotando");
	}

}
