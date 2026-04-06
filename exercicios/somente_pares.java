public class somente_pares {
    static void main() {

        /*13. Desenvolva um programa que exiba somente os números pares de um a cem.
                Salvar o código como: somente_pares.java*/

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
}