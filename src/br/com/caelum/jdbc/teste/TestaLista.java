package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	
	public static void main(String[] args) {
		
		SimpleDateFormat dtNascFormat = new SimpleDateFormat("dd/MM/yyyy");  
		ContatoDao dao = new ContatoDao();
		 
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos){
			System.out.println("id: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("e-mail: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
			
			// System.out.println("Data de nascimento: " + contato.getDataNascimento().getTime());
			// A data retornado não bate com a que está no banco de dados, verificar!
			String dtNasc = dtNascFormat.format(contato.getDataNascimento().getTime());
			System.out.println("Data de nascimento: " + dtNasc + "\n");
		}
	}
}