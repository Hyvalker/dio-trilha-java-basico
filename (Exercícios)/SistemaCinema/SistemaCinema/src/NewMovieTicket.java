import java.util.InputMismatchException;
import java.util.Scanner;
public class NewMovieTicket {
    public static void main(String[] args) {
        newTicket();
    }
    public static Ticket newTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá colaborador. Por favor preencha os dados do novo ingresso.");
        double value = readDoubleSafely(scanner, "=== Digite o valor do ingresso ===");
        String movieName = readStringSafely(scanner, "=== Digite o nome do filme ===");
        boolean dubbedOrSubtitled = readIfDubbedSafely(scanner);

        Ticket ticket = new Ticket(value, movieName, dubbedOrSubtitled);
        System.out.println("=== Ingresso criado com sucesso: ===");
        System.out.println("Filme: " + movieName);
        System.out.println("Valor do ingresso: " + value);
        System.out.println("Dublado: " + booleanParaSimNao(ticket.isDubbedOrSubtitled()));
        System.out.println("Legendado: " + booleanParaSimNao(!ticket.isDubbedOrSubtitled()));

        return ticket;
    }

    public static double readDoubleSafely(Scanner scanner, String message) {
        double number = 0.0;
        while (true) {
            try {
                System.out.println(message);
                number = scanner.nextDouble();
                scanner.nextLine();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Favor preencher apenas com números e separar casas decimais com ponto.");
                scanner.nextLine();
            }
        }
    }

    public static String readStringSafely(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static boolean readIfDubbedSafely(Scanner scanner) {
        int option = 0;
        while (true) {
            try {
                System.out.println("O filme é: \n1 - Dublado\n2 - Legendado");
                option = scanner.nextInt();
                scanner.nextLine();
                if (option == 1) return true;
                if (option == 2) return false;
                System.out.println("Opção inválida! Digite 1 para Dublado ou 2 para Legendado.");
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas 1 ou 2.");
                scanner.nextLine();
            }
        }
    }
    public static String booleanParaSimNao(boolean valor) {
        return valor ? "Sim" : "Não";
    }
}

