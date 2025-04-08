public class Car {
    private boolean on;
    private double speed;
    private int gear;
    private int wheelSide;


    public int getGear() {
        return gear;
    }

    public Car() {
        on = false;
        speed = 0;
        gear = 0;
        wheelSide = 0;
    }
    public double getSpeed() {
        return speed;
    }
    private boolean canTurnWheel() {
        return speed > 0 && speed <= 40;
    }

    public void turnOn() {
        if (!on) {
            on = true;
            System.out.println("Ligando o carro");
        } else {
            System.out.println("O carro já está ligado");
        }
    }

    public void turnOff() {
        if (on && gear == 0 && speed == 0) {
            on = false;
            System.out.println("Desligando o carro");
        } else if (on) {
            System.out.println("O carro já está desligado");
        } else {
            System.out.println("O veículo só pode ser desligado se estiver parado e em neutro");
            System.out.println("Velocidade atual: " + speed + " km/h.");
            System.out.println("Marcha atual: " + gear);

        }
    }

    public void slowDown() {
        if (speed > 0) {
            speed--;
            System.out.println("Velocidade reduzida para: " + speed);
        } else {
            System.out.println("Velocidade atual: " + speed + "Km/h. O carro encontra-se parado");
        }
    }

    public void accelerate() {
        if (!on) {
            System.out.println("Ligue o carro para poder acelerar");
        } else if (gear == 0) {
            System.out.println("Não é possível acelerar com a marcha em neutro");
        } else if (speed >= 120) {
            System.out.println("Velocidade máxima atingida");
        } else if (speed + 1 > gear * 20) {
            System.out.println("Trocar de marcha para continuar acelerando");
        } else {
            speed++;
        }
        System.out.println("Velocidade atual: " + speed + " km/h.");
    }

    public void switchGearUp() {
        if (on) {
            if (gear < 6) {
                gear++;
                System.out.println("Marcha avançou para: " + gear);
            } else {
                System.out.println("Marcha máxima atingida: " + gear);
            }
        } else {
            System.out.println("Não é possível mudar a marcha com o carro desligado.");
        }
    }

    public void switchGearDown() {
        if (on) {
            if (gear > 0) {
                gear--;
                System.out.println("Marcha reduzida para: " + gear);
            } else {
                System.out.println("Carro em neutro:" + gear);
            }
        } else {
            System.out.println("Não é possível mudar a marcha com o carro desligado.");
        }
    }

    public void turnLeft() {
        if (canTurnWheel()) {
            if (wheelSide > -270) {
                wheelSide -= 30;
                System.out.println("Virou para a esquerda. Direção: " + wheelSide + "°");
            } else {
                System.out.println("Volante já totalmente para a esquerda.");
            }
        } else if (speed == 0) {
            System.out.println("Não é possível virar o volante com o carro parado.");
        } else {
            System.out.println("Velocidade muito alta para virar o volante.");
        }
    }

    public void turnRight() {
        if (canTurnWheel()) {
            if (wheelSide < 270) {
                wheelSide += 30;
                System.out.println("Virou para a direita. Direção: " + wheelSide + "°");
            } else {
                System.out.println("Volante já totalmente para a direita.");
            }
        } else if (speed == 0) {
            System.out.println("Não é possível virar o volante com o carro parado.");
        } else {
            System.out.println("Velocidade muito alta para virar o volante.");
        }
    }

    public void checkWheelSide() {
        if (wheelSide > 0) {
            System.out.println("Volante esterçado " + wheelSide + "° à direita.");
        } else if (wheelSide < 0) {
            System.out.println("Volante esterçado " + wheelSide + "° à esquerda.");
        } else {
            System.out.println("Volante centralizado.");
        }
    }
}


