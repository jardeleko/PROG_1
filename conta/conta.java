public class conta{
	String nome;
	int numero;
	double saldo;

	boolean saca(double aux){
		if (aux > this.saldo){
			return false;
		}
			this.saldo -= aux;
			return true;
	}
	void deposito (double aux){
		this.saldo += aux;
		System.out.println ("Deposito realizado!!\nSaldo atual:" +this.saldo);
	}
}