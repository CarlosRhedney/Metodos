package com.projeto.metodos;

public class Metodos {
	/**
	 * @autor Carlos Rhedney
	 */

	public static void main(String[] args) {
		meuMetodo();
		int resultado = multiplicar(5, 5);
		System.out.println(resultado);
	}
	
	public static void meuMetodo() {
		//M�todo sem retorno.
		System.out.println("Meu m�todo");
	}
	
	public static int multiplicar(int num1, int num2) {
		//M�todo com retorno.
		int resultado = 0;
		resultado = num1 * num2;
		return resultado;
	}

}
