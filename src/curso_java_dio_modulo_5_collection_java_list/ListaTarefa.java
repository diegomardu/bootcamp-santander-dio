package curso_java_dio_modulo_5_collection_java_list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	private List<Tarefa> tarefas;
	
	public ListaTarefa() {
		this.tarefas = new ArrayList<>();
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasRemover = new ArrayList<>();
		for(Tarefa t : tarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao));
			tarefasRemover.add(t);
		}
		tarefas.removeAll(tarefasRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefas.size();
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(tarefas);
	}

}
