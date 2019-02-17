package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Caires");
		contato.setEmail("caires.kaires@gmail.com");
		contato.setEndereco("Rua Miguel Tunussi 562");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adciona(contato);
		
		System.out.println("Gravado!");
	}
}