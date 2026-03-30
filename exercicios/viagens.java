import java.util.Scanner;

public class viagens {
    public static void main(String[] args) {

       /* 3. Desenvolva um programa que pergunte a distância que um passageiro deseja percorrer em km.
        Calcule o preço da passagem, cobrando R$ 0,50 por km para viagens de até de 200 km, e R$
        0,45 para viagens mais longas.
        Salvar o código como: viagens.py*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a distancia que você deseja percorrer em KM?");
        double distancia = sc.nextDouble();
       double valor_apagar;

        if (distancia <= 200.0){
            valor_apagar = distancia * 0.50;
        }
        else {
            valor_apagar = distancia * 0.45;
        }

        System.out.println("Esse é o valor que você tem que pagar: " + valor_apagar);

    }
}