import java.util.Scanner;

public class multa {
    public static void main(String[] args) {

       /* 1. Desenvolva um programa que pergunte a velocidade do carro de um usuário.
        Se a velocidade ultrapassar 80km/h, exiba uma mensagem dizendo que o usuário foi multado.
        Nesse caso, exiba o valor da multa, cobrando R$ 50,00 por cada km acima de 80 km/h.
                Exemplo: Digite a velocidade em Km/h: 85
        Limite = 80Km/h
        Excedeu 5Km/h
        multa = 5Km/h * R$ 50,00
        Valor da multa: R$ 250,00
        Salvar o código como: multa.py*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a velocidade do veiculo: ");
        double velocidade_veiculo = sc.nextDouble();

        String situacao;

        if (velocidade_veiculo > 80.0){
            situacao = "Este veiculo foi Multado";
            System.out.println(situacao);
            double processo1 = velocidade_veiculo - 80.0;
            System.out.println("Velocidade ultrapassada: " + processo1);
            double valor_multa = processo1 * 50.0;
            System.out.println("Valor da multa: "+ valor_multa);
        }
        else {
            situacao = "Não foi multado";
            System.out.println(situacao);
        }

    }
}
