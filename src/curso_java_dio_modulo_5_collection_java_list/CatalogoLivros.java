package curso_java_dio_modulo_5_collection_java_list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	List<Livro> livros = new ArrayList<Livro>();
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		Livro livro = new Livro(titulo, autor, anoPublicacao);
		livros.add(livro);
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosAutor = new ArrayList<Livro>();
		if(!livros.isEmpty()) {
			for(Livro l : livros) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosAutor.add(l);
				}
			}	
			return livrosAutor;	
		}else {
			throw new RuntimeException("A lista esta vazia!");
		}
			 
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorAno = new ArrayList<Livro>();
		if(!livros.isEmpty()) {
			for(Livro l : livros) {
				if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anoFinal) {
					livrosPorAno.add(l);
				}
			}
		return livrosPorAno;
		}else {
			throw new RuntimeException("A lista esta vazia!");
		}
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livro = new Livro();
		if(!livros.isEmpty()) {
			for(Livro l : livros) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livro = l;
					break;
				}
			}return livro;
		}else {
			throw new RuntimeException("A lista esta vazia!");
		}
	}
	
	

}
