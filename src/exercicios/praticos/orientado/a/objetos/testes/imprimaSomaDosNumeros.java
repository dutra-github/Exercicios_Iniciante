package exercicios.praticos.orientado.a.objetos.testes;

/**
 * @author Gregol
 * Escreva um programa que calcule e escreva o resultado da soma dos números entre 1 e 50.
  */
public class imprimaSomaDosNumeros {
    public static void main(String[] args) {
        int resultado = 1;
        for (int i = 2; i <= 50; i++) {
            resultado = i + resultado;

            System.out.println("A soma de "+ (resultado -i)+ "+" + i + " é: " + resultado);

        }
        System.out.print("Fim da Execução!");
    }
}
