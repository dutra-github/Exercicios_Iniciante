package exercicios.praticos.orientado.a.objetos.testes;

import java.util.Scanner;

public class ConsumoVeículo2 {

    //Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida  e o total de combustível gasto.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double TaxaDeConsumo; // media de combustível por km
        double km1; // km inicial
        double km2; // km final
        double kmtotal; // km percorridos
        double litros; // combustivel gasto

        System.out.print("Informe o KM inicial: ");
        km1 = input.nextDouble();
        System.out.print("Informe o KM final: ");
        km2 = input.nextDouble();
        System.out.print("Informe a quantidade de litros consumidos: ");
        litros = input.nextDouble();
        kmtotal = km2 - km1;

        TaxaDeConsumo = litros / kmtotal;
        if (TaxaDeConsumo < 1) {

            TaxaDeConsumo = TaxaDeConsumo * 1000;
            System.out.println("O total percorrido foi de " + kmtotal + " Km");
            System.out.println("A Taxa media de consumo é de " + TaxaDeConsumo + " ml por km");
            System.out.println("Autonomia : " + kmtotal/litros + " Km / litro");
        } else {
            System.out.println("O total percorrido foi de " + kmtotal + " Km");
            System.out.println("A Taxa media de consumo é de " + TaxaDeConsumo + " litros por km");
            System.out.println("Autonomia : " + kmtotal/litros + " Km / litro");
        }
    }
}

