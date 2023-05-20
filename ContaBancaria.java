public class ContaBancaria {
	String nome;
	double saldo = 0;
	
	public ContaBancaria(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	public ContaBancaria(String nome) {
		this.nome = nome;
	}
	public double sacar(double valorRetirado) {
		if((saldo - valorRetirado)<0) {
			System.out.println("Saldo insuficiente!!!");
		}else {
			saldo = saldo - valorRetirado;
			System.out.println("Saque realizado com sucesso!");
		}
		return saldo;
	}

	public double depositar(double valorAdicionado) {
		saldo = saldo + valorAdicionado;
		return saldo;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	public String consultarNome() {
		return nome;
	}
	public void alterarNome(String novoNome) {
		nome = novoNome;
	}
	
	public void transferir(ContaBancaria clienteRecebebor, double valor) {
		if((saldo-valor)<0){
			System.out.println("Saldo insulficiente!");
		
		}else{
			clienteRecebebor.depositar(valor);
			saldo = saldo - valor;
			System.out.println("Transfência realizada com sucesso!");
			System.out.println("Seu saldo é"+saldo);
		}
		
	}
}