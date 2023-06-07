package exercicios.praticos.orientado.a.objetos.testes;

import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int sexo = 0, qtmulheres = 0, qthomens = 0;
        double altura = 0, somaH = 0, maiorAlt = 0, menorAlt = 0, mediaHomens;
        Scanner input = new Scanner(System.in);

        do {
        for (int i = 0; i < 3; i++) {
            System.out.print("Qual seu Sexo: 1-Masculino  2-Feminino\n--->> ");
            sexo = input.nextInt();

            System.out.println("Digite sua altura: ");
            altura = input.nextDouble();

            if (altura >= maiorAlt) {
                maiorAlt = altura;
            } else  if(altura < menorAlt) {
                    menorAlt = altura;
                }
            }

                  if ( sexo == 1   ){
                    qthomens++;
                    somaH +=  altura;

                }else if (sexo == 2){
                    qtmulheres++;
                } else {
                      do {
                          System.out.println("Opção sexo Inválida!");
                          System.out.print("Qual seu Sexo: 1-Masculino  2-Feminino\n--->> ");
                          sexo = input.nextInt();
                      }while (sexo > 2 || sexo == 0);

            }
            mediaHomens = somaH / qthomens;
            System.out.println("A maior Altura do grupo é de " + maiorAlt + "m, e a menor é de " + altura + " m");
            System.out.println("A média de altura dos homens é " + mediaHomens + " m");
            System.out.println("O número de mulheres é " + qtmulheres);
            input.close();
        }while (true);





    }
}




