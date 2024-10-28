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

        System.out.print("Digite o tipo de usario (gerente, funcionario, cliente): \n");
        String tipoUsuario = scanner.nextLine();

        int tamanhoSenha;

        //Definir o tamanho da senha com base no tipo de usuário
        switch (tipoUsuario){
            case "gerente":
                tamanhoSenha = 20;
                break;
            case "funcionario":
                tamanhoSenha = 10;
                break;
            case "cliente":
                tamanhoSenha = 5;
                break;
                default:
                    System.out.println("Tipo de usuário invalido. Por favor, escolha entre uma das opções");
                    scanner.close();
                    return;
        }
        //Gerar e exibir  senha
        String senha = gerarSenha(tamanhoSenha);
        System.out.println("Senha: " + senha);
        scanner.close();
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
