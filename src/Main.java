import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    private static final String CARACTERES_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CARACTERES_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String CARACTERES_ESPECIAIS = "!@#$%^&*()-_=+<>?";

    private static final String TODOS_CARACTERES = CARACTERES_MAIUSCULAS + CARACTERES_MINUSCULAS + NUMEROS + CARACTERES_ESPECIAIS;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da senha: ");
        int tamanhoSenha = scanner.nextInt();

        String senha = gerarSenha(tamanhoSenha);

        System.out.println("Senha gerada: " + senha);
    }

    public static String gerarSenha(int tamanho) {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(TODOS_CARACTERES.length());
            senha.append(TODOS_CARACTERES.charAt(indice));
        }
        return senha.toString();
    }
}
