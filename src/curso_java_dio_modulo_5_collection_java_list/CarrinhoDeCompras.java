package curso_java_dio_modulo_5_collection_java_list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	List<Item> listaDeItem = new ArrayList<Item>();
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		listaDeItem.add(item);
	}
	
	public void removerItem(String nome) {
		List<Item> listaParaRemover = new ArrayList<Item>();
		if(!listaDeItem.isEmpty()) {
			for(Item i: listaDeItem) {
				if(i.getNome().equals(nome)) {
					listaParaRemover.add(i);
				}
			}
		}
		
		listaDeItem.removeAll(listaParaRemover);
	}
	
	public void exibirItens() {
		if(!listaDeItem.isEmpty()) {
			System.out.println(listaDeItem);
		}else {
			System.out.println("A lista esta vazia.");
		}
	}
	
	public double calucarValorToral() {
		double valorTotal = 0;
		if(!listaDeItem.isEmpty()) {
			for(Item item: listaDeItem) {
				double valorItem = item.getPreco() * item.getQuantidade();
				valorTotal += valorItem;
			}
			return valorTotal;
		}else {
			throw new RuntimeException("A lista esta vazia.");
		}
	}

}
