package Atividades;

public class Juridica implements Fun {

	int valorbruto = 150;
	int imposto = 5;

	@Override
	public void nome() {
		System.out.println("roberta");
	}

	@Override
	public long id() {
		System.out.println(898251);
		return 0;
	}

	@Override
	public void fone() {
		System.out.println("15976332861");
	}
	@Override
	public void endereco() {
		System.out.println("vila isaura");
	}
	@Override
	public int matricula() {
		System.out.println(7367937);
		return 0;
	}
	@Override
	public void calcsalario() {
		System.out.println(valorbruto-imposto);
	}
}

