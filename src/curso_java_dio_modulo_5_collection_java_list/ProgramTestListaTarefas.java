package curso_java_dio_modulo_5_collection_java_list;

public class ProgramTestListaTarefas {

	public static void main(String[] args) {
		
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println("Numero total de tarefas é :" + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		System.out.println("Numero total de tarefas é :" + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		
		System.out.println("Numero total de tarefas é :" + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("Tarefa 2");
		System.out.println("Numero total de tarefas é :" + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricaoTarefas();
		listaTarefa.removerTarefa("Tarefa 2");
		listaTarefa.obterDescricaoTarefas();
	}

}
