import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ContaBancaria  c1 = new ContaBancaria(null);
		ContaBancaria c2 = new ContaBancaria(null);
		
		System.out.println("Qual o nome do correntista?");
		String nome = entrada.nextLine();
		
		c1.alterarNome(nome);
		int opcao = 0;
		
		while(opcao!=5) {
		
		System.out.println("Qual opção deseja fazer?");
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		System.out.println("3 - Consultar saldo");
		System.out.println("4 - Transferir");
		System.out.println("5 - Sair");
		
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Quanto deseja sacar?");
			double saque = entrada.nextDouble();
			System.out.println("Saldo: "+c1.sacar(saque));
			
			break;
		case 2:
			System.out.println("Quanto deseja depositar?");
			double deposito = entrada.nextDouble();
			System.out.println("Saldo: "+c1.depositar(deposito));
			System.out.println("Deposito realizado com sucesso!");
			break;
		case 3:
			System.out.println("Saldo atual: "+c1.consultarSaldo());
			break;
		case 4:
			System.out.println("Quanto deseja transferir?");
			double ValTransferencia = entrada.nextDouble();
			
			c1.transferir(c2, ValTransferencia);
			System.out.println("Saldo do recebedor: "+c2.saldo);
			
			break;			
		case 5:
			System.out.println("Atendimento finalizado!");
			break;
		default:
			System.out.println("Opção inválida!!"); 
			break;
		}
		}
		
	}

}
