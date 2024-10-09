import java.util.Scanner;

public class TesteExibe {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite par ou ímpar");
        String diferente = leitor.nextLine();
        MetodosDivertidos metodosDivertidos = new MetodosDivertidos();
        metodosDivertidos.exibe(diferente);



    }
}
