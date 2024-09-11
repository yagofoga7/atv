package Atividades;

public class Jor implements Fun{

	int horatrabalho = 150;
	int valorhora = 10;

		@Override
		public void nome() {
			System.out.println("Maria");
		}

		@Override
		public long id() {
			System.out.println(657851);
			return 0;
		}

		@Override
		public void fone() {
			System.out.println("15998635681");
		}
		@Override
		public void endereco() {
			System.out.println("vila santana");
		}
		@Override
		public int matricula() {
			System.out.println(7363793);
			return 0;
		}
		@Override
		public void calcsalario() {
			System.out.println(horatrabalho*valorhora);
		}

}

