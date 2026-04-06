import java.util.Scanner;

public class validar_str {
    static void main() {

        /*6. Desenvolva um programa que receba uma string e exiba a mesma na tela. Se o valor
    digitado for em branco exibir 'Dado inválido'
        Salvar o código como: validar_str.java*/

        Scanner sc = new Scanner(System.in);
        String texto;

        do {
            System.out.println("Digite um texto: ");
            texto = sc.nextLine();

            if (texto.trim().isEmpty()) {
                System.out.println("Dado inválido! Tente novamente.\n");
            }

        } while (texto.trim().isEmpty());

        System.out.println("Você digitou: " + texto);
    }
}
