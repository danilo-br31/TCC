package animais;

import javax.swing.JOptionPane;
import animais.Animal;
import animais.Cavalo;
import animais.Peixe;
import animais.Pombo;



public class Principal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		String tipoAnimal = JOptionPane.showInputDialog(null, "Informe o Animal: \n" +
				"CV = Cavalo. \nPX = Peixe. \nPB = Pombo.");
		
		if (tipoAnimal.equals("CV")) {
			animal = new Cavalo();
			((Cavalo)animal).setPelagem("Pelo Curto");
			animal.setNome("Cavalo");
			animal.setAmbiente("Terrestre");
		}
		else if (tipoAnimal.equals("PX")) {
			animal = new Peixe();
			((Peixe)animal).setEscamas("Escamado");
			animal.setNome("Peixe");
			animal.setAmbiente("Aguático");
		}
		
		else if (tipoAnimal.equals("PB")) {
			animal = new Pombo();
			((Pombo)animal).setPlumagem("Emplumado");
			animal.setNome("Pombo");
			animal.setAmbiente("Aereo");
		}
		else {
			JOptionPane.showMessageDialog(null, "Animal desconhecido. \nFinalizando...");
			return;
		}
		
		animal.mover();


	}

}
