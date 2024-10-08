package projeto;

public class EstoquePreco {public class EstoquePreco {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    // Construtor
    public EstoquePreco(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Métodos Getters e Setters
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    // Método para calcular o valor total do estoque
    public double calcularValorTotal() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return "Produto: " + produto + ", Quantidade: " + quantidade + ", Preço Unitário: " + precoUnitario;
    }
}


}
