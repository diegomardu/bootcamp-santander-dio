package curso_java_dio_modulo_5_collection_java_list;

public class Item {
	
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Item() {
		
	}	

	public Item(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
}
