import java.util.Scanner;

public class dois_logins {
    static void main() {

       /* 5. Suponha que o professor Atila possua dois logins na rede do SENAI-SP.
                Construa um programa que valide o acesso do professor à rede.
                Caso o par usuário/senha informado esteja correto, o programa deve
        imprimir a mensagem “Seja bem vindo!”.
        Caso contrário, “Usuário e senha não conferem”.
        Dados dos dois logins:
        login 1			login 2
        usuário: atila		usuário: olivi
        senha: 12345		senha: 54321
        Salvar o código como: dois_logins.java*/

        Scanner sc = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.print("Usuário: ");
        usuario = sc.next();

        System.out.print("Senha: ");
        senha = sc.next();

        boolean login1 = usuario.equals("atila") && senha.equals("12345");
        boolean login2 = usuario.equals("olivi") && senha.equals("54321");

        if (login1 || login2) {
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Usuário e senha não conferem.");
        }

    }
}
