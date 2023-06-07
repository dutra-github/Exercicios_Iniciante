package exercicios.praticos.orientado.a.objetos.testes;

//  Escreva um programa que apresente todos os números ímpares entre 1 e 100
public class imprimaNumerosImparesEntre1e100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        System.out.print("Fim da Execução!");
    }
}
