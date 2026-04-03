import java.util.Scanner;

public class black_friday {
    static void main() {

        /*5. Na última Black Friday, o gerente de uma loja de perfumes colocou todo o seu
        estoque em promoção, de acordo com a tabela a seguir:

        Código	Condição de Pagamento	Desconto (%)
        1 	À vista (em espécie) 	10
        2	Cartão de débito	5
        3	Cartão de crédito	3
        4	PIX			7.5

        Construa um programa que solicite ao operador do caixa o preço total da venda, bem
        como a forma de pagamento. Ao fim, o programa deve informar o valor final a ser pago.
                Salvar o código como: black_friday.java*/

        double valor_final = ' ';
        double compra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da compra: ");
        compra = sc.nextDouble();


        System.out.println("""
                *************** Informe a forma de pagamento ********************* 
                
                Código          	Condição de Pagamento	         Desconto (%)
                
                   1 	            À vista (em espécie) 	            10
                   2	            Cartão de débito	                5
                   3	            Cartão de crédito	                3
                   4	            PIX			                       7.5""");

        int opcao = sc.nextInt();
        if (opcao == 1){
            valor_final = compra - (compra * 10.0/100);
        }

        else if (opcao == 2) {
            valor_final = compra - (compra * 5.0/100);

        }

        else if (opcao == 3) {
            valor_final = compra - (compra * 3.0/100);

        }

        else if (opcao == 4) {
            valor_final = compra - (compra * 7.5/100);

        }

        else {
            System.out.println("Opção Inválida!");
        }



        System.out.println("Valor da compra: "+ valor_final);

    }
}
