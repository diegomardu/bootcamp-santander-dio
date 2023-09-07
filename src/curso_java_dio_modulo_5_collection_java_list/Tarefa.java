package curso_java_dio_modulo_5_collection_java_list;

public class Tarefa {
	
	private String descricao;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + "]";
	}
	
}
