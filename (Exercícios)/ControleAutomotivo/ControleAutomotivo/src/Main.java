import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        Car car = new Car();
       var option = -1;
       do {
           System.out.println("\n=== Menu do Carro ===");
           System.out.println("1 - Ligar o carro");
           System.out.println("2 - Desligar o carro");
           System.out.println("3 - Passar marcha");
           System.out.println("4 - Reduzir marcha");
           System.out.println("5 - Acelerar");
           System.out.println("6 - Frear");
           System.out.println("7 - Verificar velocidade");
           System.out.println("8 - Virar para direita");
           System.out.println("9 - Virar para esquerda");
           System.out.println("10 - Verificar a marcha");
           System.out.println("11 - Verificar direção");
           System.out.println("12 - Sair");

           while (!scanner.hasNextInt()) {
               System.out.println("Por favor, digite um número válido:");
               scanner.next();
           }
           option = scanner.nextInt();

           switch (option) {
               case 1:
                   car.turnOn();
                   break;
               case 2:
                   car.turnOff();
                   break;
               case 3:
                   car.switchGearUp();
                   break;
               case 4:
                   car.switchGearDown();
                   break;
               case 5:
                   car.accelerate();
                   break;
               case 6:
                   car.slowDown();
                   break;
               case 7:
                   System.out.println("Velocidade atual: " + car.getSpeed() + "Km/h");
                   break;
               case 8:
                   car.turnRight();
                   break;
               case 9:
                  car.turnLeft();
                   break;
               case 10:
                   System.out.println("A marcha atual do carro é " + car.getGear());
                   break;
               case 11:
                   car.checkWheelSide();
                   break;
               case 12:
                   System.out.println("Saindo do veículo.");
                   System.exit(0);
               default:
                   System.out.println("Opção inválida. Digite um número entre 1 e 12");
           }
       }while (true);
    }
}