package exercicios.praticos.orientado.a.objetos.testes;

/**
 * @author Gregol
 * Escreva um programa que mostre na tela o desenho abaixo
 *   XXXX
 *   XXX
 *   XX
 *   X
 */
public class imprimaSequenciasDeXDecrecente {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            for (int j=0; j < i; j++){
                System.out.print(" X ");
            }
            System.out.println();

        }
        System.out.print("Fim da Execução!");
    }
}
