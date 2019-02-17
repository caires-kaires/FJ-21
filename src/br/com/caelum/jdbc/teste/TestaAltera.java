package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Caires");
		contato.setEmail("caires.kaires@gmail.com");
		contato.setEndereco("Rua Miguel Tunussi 563");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId(1L);
		
		ContatoDao dao = new ContatoDao();
		dao.altera(contato);
		
		System.out.println("Alterado!");
	}
}