package test.java;

import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

import main.java.Pessoa;
import org.junit.Test;

public class TestePessoaTest {
	@Test
	public void testeClasseCliente() {
		Pessoa pessoa = new Pessoa();
		List<Pessoa> listaPessoas = pessoa.populaPessoas();
		
		Stream<Pessoa> listaComMulheres = listaPessoas.stream()
				.filter(p -> p.getSexo().equals("feminino"));
		
		listaComMulheres.forEach(p -> Assert.assertEquals("feminino", p.getSexo()));
	}
}
