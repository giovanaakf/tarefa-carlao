package projeto;

public class pedido {import java.time.LocalDate;

public class Pedido {
    private int quantidade;
    private LocalDate data;
    private double valor;

    // Construtor
    public Pedido(int quantidade, LocalDate data, double valor) {
        this.quantidade = quantidade;
        this.data = data;
        this.valor = valor;
    }

    // Métodos Getters e Setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para calcular o valor total do pedido
    public double calcularValorTotal() {
        return quantidade * valor;
    }

    @Override
    public String toString() {
        return "Pedido [quantidade=" + quantidade + ", data=" + data + ", valor=" + valor + "]";
    }
}


}
