import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        Integer numero1;
        numero1=leitor.nextInt();
        System.out.println("Digite o segundo número");
        Integer numero2;
        numero2=leitor.nextInt();

        System.out.println("""
                Escolha a operação desejada:
                1- Soma
                2- Multiplicação
                3- Divisão
                4- Subtração
                
                """);

        Integer operacaoEscolhida;
        operacaoEscolhida= leitor.nextInt();
        Integer calculo;
        switch(operacaoEscolhida) {
            case 1:
               calculo= numero1+numero2;
               break;

            case 2:
                calculo =numero1*numero2;
                break;

            case 3:
                calculo=numero1/numero2;
                break;
            case 4:
                calculo= numero1-numero2;
                break;

            default:
                calculo=0;

        }

        System.out.println(calculo);


    }
}
