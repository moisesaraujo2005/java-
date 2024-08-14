import java.util.concurrent.ThreadLocalRandom;

public class ExemploLacosDeRepeticao {
    public static void main(String[] args) {

        //For que exibe numero de 0 a 10

        for (int i =10; i >=1  ; i--) {

            System.out.println("\n" + i);

        }

        //while que exibe número de 0 a 10
        Integer cont = 10;
        while(cont >= 1) {
            System.out.println(cont);
            cont--;
        }

        Integer numeroGerado = ThreadLocalRandom.current().nextInt(5);
        //Enquanto não sortear 3

        while(numeroGerado !=3) {
            System.out.println("Numero não gerado! " + numeroGerado);
            numeroGerado++;
            numeroGerado = ThreadLocalRandom.current().nextInt(5);
        }

        System.out.println("Numero gerado " + numeroGerado);


        int numeroTabuada = 5;

        for (int  i = 0;  i <= 10 ;  i++) {

            System.out.println(i*numeroTabuada);

        }


    }
}
