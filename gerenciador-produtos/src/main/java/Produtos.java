public class Produtos {
    private String nome;
    private Double preco;
    private Integer quantidadeEstoque;

    public Produtos( Double preco, Integer quantidadeEstoque, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


    @Override  // Anotação para garantir que estamos sobrescrevendo corretamente o método da classe Object
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade em estoque=" + quantidadeEstoque +
                '}';
    }
}
