import java.util.Scanner;

public class maior_menor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] valores = new double[3];
        for (int i = 0; i < 3; i++){
            System.out.print("Informe o valor " + (i + 1) + ":");
            valores[i] = sc.nextDouble();


        }
    }
}
