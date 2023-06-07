package exercicios.praticos.orientado.a.objetos.testes;
import exercicios.praticos.orientado.a.objetos.dominio.Temperatura;

import java.util.Scanner;
public class temperaturaTest {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();

        Scanner input =new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius--> ");
        temperatura.setCelsius(input.nextDouble());
temperatura.convertCelsiusFahrenheit();
       // temperatura.setFahrenheit((9*temperatura.getCelsius()+160)/5);

        System.out.println("A temperatura convertida em Fahrenheit é: --> " + temperatura.getFahrenheit());

        System.out.print("Digite a temperatura em graus Fahrenheit --> ");
        temperatura.setFahrenheit(input.nextDouble());

        temperatura.convertFahrenheitCelsius();
       // System.out.println();
        System.out.println("A temperatura convertida em Celsius é ---> " + temperatura.getCelsius());


    }
}
