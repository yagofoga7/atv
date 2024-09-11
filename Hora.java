package Atividades;

public class Hora implements Fun {
	int quanthoras = 150;
	int valorhora = 10;

		@Override
		public void nome() {
			System.out.println("Luiza");
		}

		@Override
		public long id() {
			System.out.println(867251);
			return 0;
		}

		@Override
		public void fone() {
			System.out.println("15996732861");
		}
		@Override
		public void endereco() {
			System.out.println("vila regina");
		}
		@Override
		public int matricula() {
			System.out.println(7363937);
			return 0;
		}
		@Override
		public void calcsalario() {
			System.out.println(quanthoras*valorhora);
		}
}


