import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProdutos {
    public static void main(String[] args) {
        Scanner leitor01= new Scanner(System.in);
        List<Produtos> produtos=  new ArrayList<>();
        while(true) {
        System.out.println("""
                
                1 - Cadastrar um novo produto
                2 - Consultar produto pelo nome
                3 - Exibir todos os produtos cadastrados
                4 - Atualizar estoque de um produto
                5 - Excluir um produto
                6 - Calcular valor total do estoque
                0 - Sair
                
                
                """);

        Integer escolhaUser = leitor01.nextInt();

        if(escolhaUser == 1) {


            System.out.println("Digite o preço");
            Double preço = leitor01.nextDouble();

            System.out.println("Digite a quantidade em estoque");
            Integer quantidadeEstoque = leitor01.nextInt();
            leitor01.nextLine();
            System.out.println("Digite o nome do produto");
            String nome= leitor01.nextLine();


            Produtos produto = new Produtos(preço, quantidadeEstoque, nome);

            produtos.add(produto);


        System.out.println(produtos.toString());  }

        else if(escolhaUser==2) {
            System.out.println("Digite o nome do produto");
            String nome = leitor01.next();

            for (int i = 0; i <produtos.size() ; i++) {

                if(produtos.get(i).getNome().equals(nome)) {
                    System.out.println("Produto encontrado " + produtos.get(i).toString());
                }


            }
        }

        else if(escolhaUser==3) {
            System.out.println(produtos.toString());
        }

        else if(escolhaUser==4) {

            System.out.println("Digite o nome produto");
            leitor01.nextLine();
            String nome = leitor01.nextLine();
            System.out.println("""
                    1- Remover produtos
                    2- Adicionar produtos
                    
                    """);
            Integer escolherProdutos = leitor01.nextInt();
            leitor01.nextLine();
            System.out.println("Digite a quantidade");
            Integer qtdEstoque= leitor01.nextInt();
            leitor01.nextLine();

            if(escolherProdutos==1) {
                for (int i = 0; i <produtos.size() ; i++) {
                    Produtos produto = produtos.get(i);
                    if(produtos.get(i).getNome().equals(nome)){
                        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque()-qtdEstoque);;
                    }
                    System.out.println("Quantidade atualizada " + produtos.get(i));
                }
            }

            else {
                for (int i = 0; i <produtos.size() ; i++) {
                    Produtos produto = produtos.get(i);
                    if(produtos.get(i).getNome().equals(nome)){
                        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque()+qtdEstoque);;
                    }
                    System.out.println("Quantidade atualizada " + produtos.get(i));
                }
            }

        }
    else if(escolhaUser==5) {
            System.out.println("Digite o nome do produto");
            leitor01.nextLine();
            String nome = leitor01.nextLine();

            for (int i = 0; i <produtos.size() ; i++) {
                if(produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                    produtos.remove(i);
                    System.out.println("Produto excluido com sucesso!" + produtos.toString());
                }

                else {
                    System.out.println("Produto não existe");
                }
            }

        }

    else if(escolhaUser==6) {
        Double totalEstoque = 0.0;
            for (int i = 0; i <produtos.size() ; i++) {
                totalEstoque+=produtos.get(i).getQuantidadeEstoque();

            }
            System.out.println(totalEstoque);
        }
        else if(escolhaUser==0) {
            System.out.println("Saindo");
            break;
        }

        else {
            System.out.println("Opção errada");
        }

        }





    }
}
