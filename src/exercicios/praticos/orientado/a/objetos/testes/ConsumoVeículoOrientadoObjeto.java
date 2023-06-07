package exercicios.praticos.orientado.a.objetos.testes;

import exercicios.praticos.orientado.a.objetos.dominio.Veiculo;

import java.util.Scanner;

public class ConsumoVeículoOrientadoObjeto {

    //Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida  e o total de combustível gasto.
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o KM inicial: ");
        veiculo.setKm1(input.nextDouble());

        System.out.print("Informe o KM final: ");
        veiculo.setKm2(input.nextDouble());

        System.out.print("Informe a quantidade de litros consumidos: ");
        veiculo.setLitros(input.nextDouble());

        // Cada método deve ter apenas uma responsabilidade. Se ele calcula, ele calcula. Se ele imprimi,somente imprimir.
        //Single Responsibility (Pesquisar)
        veiculo.calculaKmTotal();
        veiculo.calculaMediaLitroKm();
        veiculo.calculaMediaKmLitro();
        veiculo.imprimirResultados();

    }
}

