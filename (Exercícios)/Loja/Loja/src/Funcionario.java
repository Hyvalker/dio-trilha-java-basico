import java.util.Scanner;

public abstract class Funcionario {
    private String name;
    private String email;
    private String password;
    private boolean isAdmin;



    Scanner scanner = new Scanner(System.in);

    public Funcionario(String name, boolean isAdmin, String email, String password) {
        this.name = name;
        this.isAdmin = isAdmin;
        this.email = email;
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void login(){
        System.out.println("=== Prezado(a), por favor entre com seu e-mail e senha para fazer login ===");
        System.out.println("Login :");
        String login = scanner.nextLine();
        System.out.println("Senha : ");
        String password = scanner.nextLine();

        try {
            if (login.equals(this.getEmail()) && password.equals(this.getPassword())) {
                System.out.println("Login efetuado com sucesso!");
            } else {
                System.out.println("E-mail ou senha incorretos. Favor tentar novamente.");
            }
        }catch (Exception e){
            System.out.println("E-mail ou senha inválidos");
        }
    }
    public void logoff(){
        System.out.println("Saindo da conta.");
    }
    public void changeLogin(){
        System.out.println("=== Alterar e-mail ===");
        System.out.println("Digite seu novo e-mail");
        String newEmail = scanner.nextLine();
        this.email = newEmail;
    }

    public void changePassword(){
        System.out.println("=== Alterar senha ===");
        System.out.print("Digite sua nova senha: ");
        String newPassword = scanner.nextLine();
        this.password = newPassword;
    }
}
