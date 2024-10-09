import java.util.Scanner;

public class TesteAleatorio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o número");
    Integer numero = leitor.nextInt();
        MetodosDivertidos metodosDivertidos = new MetodosDivertidos();

        metodosDivertidos.avaliandoSorte(numero);

    }
}
