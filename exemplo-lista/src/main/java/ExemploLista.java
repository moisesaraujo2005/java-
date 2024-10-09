import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

    public static void main(String[] args) {
        List listaEstranha = new ArrayList();
        listaEstranha.add(true);
        listaEstranha.add(false);
        listaEstranha.add("Bob");
        listaEstranha.add(42);

    List nomes = new ArrayList<>();
            nomes.add("Bob da Silva");
            nomes.add("José");
            nomes.add("Maria");

        System.out.println("Segundo nome da lista:" + nomes.get(2));


        for (int i = 0; i <nomes.size() ; i++) {

            System.out.println("""
                    Nomes %d: %s
                    """.formatted(i,nomes.get(i)));
        }

        listaEstranha.set(1, "Xampson");

        //Principais métodos da lista no java
        //clear - clean the list
        //add - add some element
        //size- return the size of list
        //get- take some element
        //set - alter the element in determined index
        //remove = delete some element
        //isEmpty = if list be empty
    }
}
