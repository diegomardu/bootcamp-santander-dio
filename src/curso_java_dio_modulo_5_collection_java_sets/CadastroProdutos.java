package curso_java_dio_modulo_5_collection_java_sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	private Set<Produto> produtos;
	
	public CadastroProdutos() {
		this.produtos = new HashSet<Produto>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtos.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<Produto>(produtos);
		return produtosPorNome;
		
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtos);
		return produtosPorPreco;
	}

}
