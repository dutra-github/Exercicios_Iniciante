package exercicios.praticos.orientado.a.objetos.testes;
import java.util.Scanner;
public class ComissaoVendas {
    //Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
    // Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vendedor;
        double salario;
        double vendas;

        System.out.print("Nome do Vendedor : ");
        vendedor = input.next();
        System.out.print("Salário Fixo do Vendedor : ");
        salario = input.nextDouble();
        System.out.print("Total de Vendas no Mês : ");
        vendas = input.nextDouble();

        double salarioTotal = (vendas*0.15)+salario;

        System.out.println("O salario total é : R$ " + salarioTotal + " Reais");

    }
}
