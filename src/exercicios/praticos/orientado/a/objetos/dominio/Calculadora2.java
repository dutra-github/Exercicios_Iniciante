package exercicios.praticos.orientado.a.objetos.dominio;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calculadora2 {
    private double number1; // segundo número a adicionar
    private double number2; // segundo número a adicionar
    private int operador;
    private int continua;

public void desejaContinuar() {

    Scanner input = new Scanner(System.in);
    System.out.println("Deseja Continuar? 1 - Sim  2 - Não");
    int continua = input.nextInt();
    if (continua == 2) {
        System.out.println("Que pena. Até a próxima!!");

    }
}
    public void Soma() {
        System.out.println(number1 + number2);
    }

    public void subtracao() {
        System.out.println(number1 - number2);
        return;
    }

    public void divisao() {
        if (number2 == 0) {
            System.out.println("Não existe número divisível por Zero. Volte ao início e escolha um novo valor!!!");
            return;
        } else {
            System.out.println("Resultado da divisão dos dois números é : " + number1 / number2);
        }
    }

    public void multiplicacao() {
        System.out.println(number1 * number2);
    }


    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public int getOperador() {
        return operador;
    }

    public void setOperador(int operador) {
        this.operador = operador;
    }

    public int getContinua() {
        return continua;
    }

    public void setContinua(int continua) {
        this.continua = continua;
    }
}







