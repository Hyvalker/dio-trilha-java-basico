
import java.util.Scanner;

public class MenuCinema {



        public static void menuCinema(Ticket ticket) {

            Scanner scanner = new Scanner(System.in);

            var option = -1;
            double totalPrice = 0;
            do {
            System.out.println("=== Seja bem-vindo ao menu do cinema ===");
            System.out.println("O filme da próxima sessão é: " + ticket.getMovieName());
            System.out.println("O ingresso custa: R$ " + ticket.getPrice());
            System.out.println("O filme é: Dublado - " + NewMovieTicket.booleanParaSimNao(ticket.isDubbedOrSubtitled()));
            System.out.println("O filme é: Legendado - " + NewMovieTicket.booleanParaSimNao(!ticket.isDubbedOrSubtitled()));

            System.out.println("\nEscolha o tipo de ingresso: ");
            System.out.println("1 - Inteira");
            System.out.println("2 - Meia");
            System.out.println("3 - Família (acima de 3 ingressos você ganha 5% de desconto)");
            System.out.println("4 - Sair");

                while (!scanner.hasNextInt()) {
                    System.out.println("Opção inválida! Por favor digite apenas uma das opções: 1, 2, 3 ou 4.");
                    scanner.next();
                }

                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {
                        totalPrice = ticket.getPrice();
                        System.out.printf("Valor total a pagar:  R$ %.2f%n", totalPrice);
                    }
                    case 2 -> {
                        HalfPrice halfPriceTicket = new HalfPrice(ticket.getValue(), ticket.getMovieName(), ticket.isDubbedOrSubtitled());
                        totalPrice = halfPriceTicket.getPrice();
                        System.out.printf("Valor total a pagar:  R$ %.2f%n", totalPrice);
                    }
                    case 3 -> {
                        FamilyTicket familyTicket = new FamilyTicket(ticket.getValue(), ticket.getMovieName(), ticket.isDubbedOrSubtitled());
                        System.out.print("Quantos ingressos você deseja? ");
                        familyTicket.setFamilyMembers(scanner.nextInt());

                        if (familyTicket.getFamilyMembers() < 3) {
                            System.out.println("Para o pacote família, é necessário pelo menos 3 membros.");
                            break;
                        }
                        totalPrice = familyTicket.getPrice();
                        System.out.printf("Valor total a pagar: R$ %.2f%n", totalPrice);
                    }
                    case 4 -> {
                        System.out.println("Encerrando a compra.");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Opção inválida! Por favor digite apenas uma das opções: 1, 2, 3 ou 4.");
                }
            }while (true);
        }
}

