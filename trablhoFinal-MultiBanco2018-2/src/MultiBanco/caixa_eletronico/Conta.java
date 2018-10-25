package MultiBanco.caixa_eletronico;

public class Conta {

	private long numero;

	private long saldo;

	private Usuario titular;

	private TipoContaEnum tipo;

	private Usuario suplente;

	/**
	 *  
	 */
	public Conta(long numero, Usuario titular, TipoContaEnum tipo) {
		this.numero=numero;
	}

	public boolean addSaldo(long valor) {
		this.saldo+=valor;
		return true;
	}

	public boolean Saque(long valor) {
		this.saldo-=valor;
		return true;
	}

	public Usuario getTitular() {
		return titular;
	}

	public TipoContaEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoContaEnum tipo) {
		this.tipo = tipo;
	}

	public Usuario getSuplente() {
		return suplente;
	}

	public void setSuplente(Usuario suplente) {
		this.suplente = suplente;
	}

	public long getNumero() {
		return numero;
	}

	public long getSaldo() {
		return saldo;
	}
}
