package junior.henrique.ExercicioProduto.Model;

/**
 * @author Henrique Júnior
 * @version 1.1
 * @since 14/06/2020 10:00
 * @category Model
 */
public class Produto {

    public String nome = "computador";
    public String descricao = "descrição";
    public String fornecedor = "Alice";
    public double preco = 4500.50;
    public int quantidade = 5;
    public double porcentagem = 10;

    /**
     * calcula o preço usando quantidade x preço
     */
    public double calcularPreco() {
        return quantidade * preco;
    }

    /**
     * adiciona 65 por cento no total
     */
    public double adicionar65PorCento() {
        return calcularPreco() * 1.65;
    }

    /**
     * adiciona 10 por cento no total
     */
    public double adicionarPorcentagemAoPreco(double porcentagem) {
        return this.preco + this.preco * (porcentagem/100);
    }

    @Override
    public String toString() {
        return "Nome do produto: " + this.nome
             + "Descrição do produto: " + this.descricao
             + "Fornecedor: " + this.fornecedor
             + "Preço: " + this.calcularPreco()
             + "65 por cento adicionado: " + this.adicionar65PorCento()
             + "Porcentagem escolhida somada ao preço: " + this.adicionarPorcentagemAoPreco(this.porcentagem);
    }

}
