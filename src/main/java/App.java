package main.java;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String adicionarPessoas = "S";
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		
		while (adicionarPessoas.equals("S")) {
	        System.out.println("Digite o nome da pessoa:");
	        String nome = scanner.nextLine();

	        System.out.println("Digite o sexo da pessoa: (Responda 'M' para masculino e 'F' para feminino)");
	        String sexo = scanner.nextLine();
	        
	        System.out.println("Digite a idade da pessoa:");
	        int idade = scanner.nextInt();
	        scanner.nextLine();
	        
	        Pessoa pessoa = new Pessoa(nome, sexo, idade);
	        lista.add(pessoa);
			
			System.out.println("Deseja continuar adicionando mais pessoas? Responda 'S' ou 'N'");
	        adicionarPessoas = scanner.nextLine();
		}
		
		scanner.close();
		
		Stream<Pessoa> listaComMulheres = lista.stream()
			.filter(pessoa -> pessoa.getSexo().equals("F"));
		
		System.out.println("****** Exibindo apenas as mulheres: ******");
		listaComMulheres.forEach(pessoa -> System.out.println(pessoa.getNome()));
	}
}
