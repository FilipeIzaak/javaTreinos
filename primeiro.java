
public class primeiro {
	public static void main(String [] args) {
		String nome;
		String sobrenome;
		String idade;
		String cpf;
		
		nome = "filipe";
		sobrenome = "izaak";
		idade = "19";
		cpf = "476.468.218-45";
		
		String identidade = identidade(nome, sobrenome, idade, cpf);
		System.out.println(identidade);
	}
		public static String identidade(String nome, String sobrenome, String idade, String cpf){
			return nome.concat(" ").concat(sobrenome).concat(" ").concat(idade).concat(" ").concat(cpf);
		}
		
	
}
