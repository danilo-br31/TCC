package animais;

import javax.swing.JOptionPane;

public class Pombo extends Animal {
	
	protected String plumagem;
	
	public Pombo( ) {
		plumagem = "Indefinido";
	}
	
	public Pombo(String nome, String ambiente, String plumagem) {
		super(nome, ambiente);
		this.plumagem = plumagem;
	}
	
	public String getPlumagem() {
		return plumagem;
	}
	
	public void setPlumagem(String plumagem) {
		this.plumagem = plumagem;
	}
	
	public void mover() {
		JOptionPane.showMessageDialog(null, nome + " voando");
	}

}
