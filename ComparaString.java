import java.util.Scanner;

public class ComparaString {
  public static void main(String[] args) {
    String senha = "semana2";
    String resposta = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com a senha: ");
    resposta = sc.next();

    if (resposta.equals(senha)) {
      System.out.println("Acesso permitido");
    } else {
      System.out.println("Acesso negado");
    }
  }
}
