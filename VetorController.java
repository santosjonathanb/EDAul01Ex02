package controller;

public class VetorController {

	public VetorController() {
		super();
	}
	public int menor(int vetor[], int tamanho, int valor) {
		tamanho--;
		if (tamanho >=0) {	//Condi��o de parada: encerraram as posi��es do vetor
			if (vetor[tamanho] <= valor) {
				valor = vetor[tamanho];
			}
			return menor(vetor, tamanho, valor);//chamada da pr�xima fun��o atualizando a nova posi��o dov etor comparada e o menor valor encontrado
		} else {
			return valor;
		}
	}
}
