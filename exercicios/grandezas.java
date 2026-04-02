import java.util.Scanner;

public class grandezas {
    static void main() {
        Scanner sc = new Scanner(System.in);

       /* 4. Uma empresa, que presta serviço à companhia de energia elétrica do estado,
       necessita de um programa que auxilie os seus eletricistas no cálculo das principais
       grandezas da Eletricidade
        que são Tensão, Resistência e Corrente. Sabe-se que:
        U = R * I,
                onde,
                U é a Tensão      (em V),
                R é a Resistência (em Ώ) e,
                I é a Corrente    (em A).

                Você foi contratado(a) pela empresa para atender a essa solicitação.
        Construa um programa que apresente o seguinte menu:

******************************
        CÁLCULO DE GRANDEZAS ELÉTRICAS
******************************
        1. Tensão (em Volt)
        2. Resistência (em Ohm)
        3. Corrente (em Ampére)
        4. Sair do programa
******************************
Qual grandeza deseja calcular?

                Em seguida, o programa deve solicitar que o eletricista informe o valor das
                outras duas grandezas para realizar o cálculo.

                Quando o eletricista escolher:
        1. Tensão, o programa deve solicitar que ele informe os valores da Resistência e
        da Corrente.
                Utilizar a fórmula: U = R * I

        2. Resistência, o programa deve solicitar que ele informe os valores da Tensão e
        da Corrente.
                Utilizar a fórmula: R = U / I

        3. Corrente, o programa deve solicitar que ele informe os valores da Tensão e da
        Resistência.
                Utilizar a fórmula: I = U / R

        Por fim, o programa deve calcular e apresentar o valor encontrado para a grandeza
        escolhida.
        Obs.: Qualquer opção diferente das apresentadas no menu (1 a 4) deverão ser informadas
        ao usuário como 'Opção inválida!'
        Salvar o código como: grandezas.java*/

        //Declaração de Variaveis
        double resistencia;
        double corrente;
        double tensao;

        System.out.println("""
                ************************************************
                        CÁLCULO DE GRANDEZAS ELÉTRICAS
                ************************************************
                        1. Tensão (em Volt)
                        2. Resistência (em Ohm)
                        3. Corrente (em Ampére)
                        4. Sair do programa
                ************************************************
                Qual grandeza deseja calcular?""");

        int resposta = sc.nextInt();

        if (resposta == 1){
            System.out.print("Informe o valor da Resistência (R): ");
            resistencia = sc.nextDouble();
            System.out.print("Informe o valor da Corrente (I): ");
            corrente = sc.nextDouble();

            tensao = resistencia * corrente;
            System.out.println("Esse é o valor da Tensão (V): "+ tensao);
        }

        else if (resposta == 2) {
            System.out.print("Informe o valor da Tensão (U): ");
            tensao = sc.nextDouble();
            System.out.print("Informe o valor da Corrente elétrica (I): ");
            corrente = sc.nextDouble();

            resistencia = tensao / corrente;
            System.out.println("Esse é o valor da Resistência (R): "+resistencia);
        }

        else if (resposta == 3 ) {
            System.out.print("Informe o valor da Tensão (U): ");
            tensao = sc.nextDouble();
            System.out.print("Informe o valor da Resistência (R): ");
            resistencia = sc.nextDouble();

            corrente = tensao / resistencia;
            System.out.println("Esse é o valor da Corrente: "+ corrente);
        }

        else if (resposta == 4) {
            return;
        }

        else {
            System.out.println("Opção invalida!");
        }
    }
}

