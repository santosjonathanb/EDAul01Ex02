package controller;

public class VetorController {

	public VetorController() {
		super();
	}
	public int menor(int vetor[], int tamanho, int valor) {
		tamanho--;
		if (tamanho >=0) {	//Condição de parada: encerraram as posições do vetor
			if (vetor[tamanho] <= valor) {
				valor = vetor[tamanho];
			}
			return menor(vetor, tamanho, valor);//chamada da próxima função atualizando a nova posição dov etor comparada e o menor valor encontrado
		} else {
			return valor;
		}
	}
}
