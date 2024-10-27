import java.security.SecureRandom;

public class Main {

    private static final String CARACTERES_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CARACTERES_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String CARACTERES_ESPECIAIS = "!@#$%^&*()-_=+<>?";

    private static final String TODOS_CARACTERES = CARACTERES_MAIUSCULAS + CARACTERES_MINUSCULAS + NUMEROS + CARACTERES_ESPECIAIS;

    private static final int TAMANHO_SENHA = 12; // Altere para o tamanho desejado

    public static void main(String[] args) {
        String senha = gerarSenha(TAMANHO_SENHA);
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
