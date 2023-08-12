package view;

import javax.swing.JOptionPane;
import controller.VetorController;

public class Principal {

	public static void main(String[] args) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do vetor?"));
		int vetor[] = new int[tamanho];
		int i = 0;
		
		do {
		vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posição "+ (i+1) + ":"));
		i++;
		} while (i < (tamanho));
		
		VetorController vc = new VetorController();
		int res = vc.menor(vetor, tamanho, vetor[tamanho-1]);
		System.out.println(res);
	}

}
