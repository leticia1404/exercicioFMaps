package pucrs.java.maven.AgendaTelefonica;

import java.util.HashMap;

public class AgendaTelefonica {
	
	HashMap<String, String> colecao = new HashMap<String, String>();
	
	public void inserir(String nome, String telefone){
		colecao.put(nome, telefone);
	}
	
	public String buscarNumero(String nome){
		if(colecao.containsKey(nome)) {
			return colecao.get(nome);
		}else {
			return "Nome não encontrado na agenda telefonica";
		}
	}
	
	public void remover(String nome){
		if(colecao.containsKey(nome)) {
			colecao.remove(nome);
			System.out.println("Contato removido com sucesso!");
		}else {
			System.out.println("Nome não encontrado na agenda telefonica");
		}
	}
	
	public int tamanho(){
		return colecao.size();
	}
}
