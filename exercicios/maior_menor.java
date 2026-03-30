import java.util.Scanner;

public class maior_menor {
    public static void main(String[] args) {

        /*2. Desenvolva um programa que leia três números e que imprima:
        2.1. o maior,
        2.2. o menor,
        2.3. a soma,
        2.4. a média.
                Exemplo:
        num1 = 5	num2 = 3	num3 = 10
                **********
                maior = 10
        menor = 3
        soma = 18
        media = 6
        Salvar o código como: maior_menor.py*/

        Scanner sc = new Scanner(System.in);

        //lendo os 3 valores
        double[] valores = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o valor " + (i + 1) + ":");
            valores[i] = sc.nextDouble();
        }

        //Determinação do maior
            double maior = valores[0];
            for (double v : valores){
                if (v > maior){
                    maior = v;
                }
            }

        //Determinação do menor
        double menor = valores[0];
        for (double v : valores){
            if (v < menor){
                menor = v;
            }
        }

        double soma_tudo = valores[0] + valores[1] + valores[2];
        double media = soma_tudo/3;

        System.out.println("Maior valor: " +maior);
        System.out.println("Menor valor: "+menor);
        System.out.println("Soma dos valores: "+soma_tudo);
        System.out.println("Média dos valores: "+media);
        }
    }
