import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {


    Integer avaliandoSorte(Integer numero) {


        Integer contador = 0;

        while (true) {
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);

            if (numero.equals(numeroSorteado)) {
                break;
            }


            contador += 1;

        }

        if (contador <= 3) {
            System.out.println("Você é muito sortudo");
        } else if (contador > 3 && contador <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar apostar e ir trabalhar");
        }
        System.out.println("""
                %d vezes
                
                """.formatted(contador));
        return numero;

    }

    Integer exibeSomaSorteio(Integer numero) {

    Integer contador =0;
        while (true) {
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);


            if (numeroSorteado ==numero) {
                break;
            } else {
                contador += numeroSorteado;
            }
            System.out.println(numeroSorteado);
        }
        System.out.println("""
                A soma dos
                números é %d
                """.formatted(contador));
        return numero;

    }

    String exibe(String diferente) {

        if (diferente.equals("par")) {

            for (int i = 2; i < 92; i += 2) {
                System.out.println(i);
            }

        } else {
            for (int i = 1; i < 92; i++) {
                System.out.println(i);
            }
        }

        return diferente;

    }


}
