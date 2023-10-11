package pkg;

public class Cuenta {
	
	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(double i) {
		this.setSaldo(this.getSaldo()+i);
	}

	public void retirar(double i) {
		if(this.getSaldo() - i <= this.getSaldo() && this.getSaldo() - i >= 0) //Comprobamos que el saldo que se retira es menor que el saldo existente y positivo
			this.setSaldo(this.getSaldo()-i);
	}

}
