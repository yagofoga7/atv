package Atividades;

public class Principal {

	public static void main(String[] args) {
		Jor jor = new Jor();
		System.out.println("Dados do Fun Jornada");
		jor.id();
		jor.nome();
		jor.fone();
		jor.matricula();
		jor.endereco();
		Hora hor = new Hora();

		System.out.println("Dados do Fun Horista");
		hor.id();
		hor.nome();
		hor.fone();
		hor.matricula();
		hor.endereco();
		Juridica pes = new Juridica();

		System.out.println("Dados Fun Pessoa Juridica");
		pes.id();
		pes.nome();
		pes.fone();
		pes.matricula();
		pes.endereco();

	}

}