package poo_poo;

public class Ex4_Main {

	public static void main(String[] args) {

		Ex4 b = new Ex4();

		b.setGanhohora(15);
		b.setHoras(130);
		
		System.out.println(b.bruto());
		System.out.println(b.inss());
		System.out.println(b.sindicato());
		System.out.println(b.liquido());
		System.out.println(b.bruto());
		System.out.println(b.descontoir());
		System.out.println(b.salarioir());
		System.out.println(b.descontoinss());
		System.out.println(b.salarioinss());
		System.out.println(b.descontosindicato());
		System.out.println(b.salariosindicato());
		
	}

}
