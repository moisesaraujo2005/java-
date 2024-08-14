public class ExemploRevisao {
    public static void main(String[] args) {

        //Tipos Wrapper = são classe, ou seja possuem métodos que ajudam :)
        //Valor inicial de Wrapper = null
        String nome = "Bob da Silva";
        Integer idade = 42;

        // Tipo primitivo, não são classes
        //Sempre tem valor inicial;
        double altura = 1.55;
        boolean bloqueado = false;
        int idadeSemClass = 34;

        //idade.toString()
        //idadesemClass não tem toString()

    //Método Interpolação
        System.out.println("Meu nome é " + nome + " minha altura é " + altura + "\n e minha idade é " + idade);


    //Método formatado
        System.out.println
                ("Meu nome é %s,\n minha altura é %.2f e \n minha idade é %d"
                .formatted(nome, altura, idade));

    //Método textBlock
        System.out.println("""
                Nome: %s 
                Idade: %d 
                Altura : %.2f
                NomeTeste : %s
                """.formatted(nome,idade, altura, "Caramelo"));
    }


}
