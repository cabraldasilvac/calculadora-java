import java.util.HashMap;
import java.util.Scanner;

import poo.Calculadora;

public class CalculadoraApp {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        boolean continuar = true;

        Scanner scan = new Scanner(System.in);
        while (continuar) {
            double x = 0;
            double y = 0;
            int operacao = 0;

            System.out.println("Digite a Operação que deseja realizar: "
                    + "\n1 para soma "
                    + "\n2 para subtração "
                    + "\n3 para multiplicação "
                    + "\n4 para divisão "
                    + "\n ou 0  para finalizar o programa ");

            operacao = scan.nextInt();

            if (operacao == 0) {
                continuar = false;
                return;
            }

            System.out.println("Informe o valor do primeiro número ");
            x = scan.nextDouble();

            System.out.println("Informe o valor do segundo número ");
            y = scan.nextDouble();

            switch (operacao) {
                case 1:
                    imprimeCalculadora(operacao, calc.soma(x, y), x, y);
                    break;

                case 2:
                    imprimeCalculadora(operacao, calc.subtracao(x, y), x, y);
                    break;

                case 3:
                    imprimeCalculadora(operacao, calc.multiplicacao(x, y), x, y);
                    break;

                case 4:
                    imprimeCalculadora(operacao, calc.divisao(x, y), x, y);
                    break;

                // default:
                // break;
            }

        }
        scan.close();
    }

    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        HashMap<Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(1, " somado");
        mapOperacao.put(2, " subtraido");
        mapOperacao.put(3, " multiplicado");
        mapOperacao.put(4, " dividido");

        System.out
                .println("\n o resultado de " + x + mapOperacao.get(operacao) + " por " + y + " é igual a " + resultado
                        + "\n");

    }

}
