package exercicios.praticos.orientado.a.objetos.testes;
import java.util.Scanner;
public class ConsumoVeículo1 {

    //Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida  e o total de combustível gasto.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distotal;
        double qtdcombustivel;

        System.out.print("Informe a quantidade de Km percorrido --> ");

        distotal = input.nextDouble();

        System.out.print("Informe a quantidade de litros de combustível --> ");
        qtdcombustivel = input.nextDouble();

        double autonomia = distotal / qtdcombustivel;
        double consumomedio = qtdcombustivel / distotal;

        if (consumomedio < 1) {
            consumomedio *= 1000;
            System.out.println("A média de consumo por KM --> " + consumomedio + " ml/km");
            System.out.println("A autonomia por litro de combustivel --> " + autonomia + " km/l");
        } else {
            System.out.println("A média de consumo por KM --> " + consumomedio + " l/km");
            System.out.println("A autonomia por litro de combustivel --> " + autonomia + " km/l");

        }
    }
}