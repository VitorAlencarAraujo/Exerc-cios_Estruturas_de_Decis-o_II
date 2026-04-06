import java.util.Scanner;

public class desc_combustiveis {
    static void main() {

        double valor_apagar;

        /*8. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        Álcool:
        até 20 litros, desconto de 3% por litro
        acima de 20 litros, desconto de 5% por litro
        Gasolina:
        até 20 litros, desconto de 4% por litro
        acima de 20 litros, desconto de 6% por litro

        O programa deverá ler o número de litros vendidos, o tipo de combustível
        codificado da seguinte forma:
        A - Álcool,
                G - Gasolina,
                Calcule e imprima o valor a ser pago pelo cliente sabendo-se que o
                preço do litro da gasolina é R$ 4,95 o preço do litro do álcool é R$ 2,89.
        Salvar o código como: desc_combustiveis.java*/

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Informe o tipo de combustivel:
                
                A - Álcool
                G - Gasolina""");

        char tipo_combustivel = sc.next().charAt(0);

        System.out.println("Informe a quantidade de litros vendidos: ");
        double litros_combustivel = sc.nextDouble();

        if (tipo_combustivel == 'A'){
            if (litros_combustivel <= 20){
                valor_apagar = litros_combustivel * (2.89 - (2.89*0.03));
            }
            else {
                valor_apagar = litros_combustivel * (2.89 - (2.89*0.05));
            }
        }

        else if (tipo_combustivel == 'G') {
            if (litros_combustivel <= 20){
                valor_apagar = litros_combustivel * (4.95 - (4.95*0.04));
            }
            else {
                valor_apagar = litros_combustivel * (4.95 - (4.95*0.06));
            }
        }
        else {
            System.out.println("Valor Invalido!");
            return;
        }

        System.out.println("Valor final: "+ Math.ceil(valor_apagar));
    }
}
