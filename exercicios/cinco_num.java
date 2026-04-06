import java.util.Scanner;

public class cinco_num {
    static void main() {

        /*9. Desenvolver um programa que leia cinco números e os exiba na tela.
        Salvar o código como: cinco_num.java*/

        Scanner sc = new Scanner(System.in);

        double[] valores = new double[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Informe o valor " + (i + 1) + ":");
            valores[i] = sc.nextDouble();
        }

        System.out.println("Esses são os valores que você inseriu: ");

        for (int i = 0; i < 5; i++){
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
        }
    }
}
