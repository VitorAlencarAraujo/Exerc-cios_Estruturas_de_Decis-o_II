import java.util.Scanner;

public class tabuada {
    static void main() {

    /*    10. Desenvolver um programa que calcule e exiba a tabuada de hum a dez de um número qualquer.
                Exemplo:
    ******************************
        Informe o número da tabuada: 5
                ******************************
                1 x 5 = 5
        2 x 5 = 10
        3 x 5 = 15
        4 x 5 = 20
        5 x 5 = 25
        6 x 5 = 30
        7 x 5 = 35
        8 x 5 = 40
        9 x 5 = 45
        10 x 5 = 50*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número da tabuada: ");

        int num = sc.nextInt();

        for (int i = 0; i < 10; i++){
            System.out.println((i+1) + " x " + num + " = " + (num*(i+1)));
        }
    }
}
