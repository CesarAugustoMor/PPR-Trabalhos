/**
 * 
 */
package MultiBanco.caixa_eletronico;

import java.util.Calendar;

/**
 * @author César Augusto Moro Fürst
 * @link https://github.com/CesarAugustoMor/
 */

public class Cartao {
	private long numero;
	private String proprietario;// questionaval
	private long numeroConta;
	private int codSeguranca;
	private Calendar validade;
	// gerar senha da conta

	public Cartao(long numero, String nomeProprietario, long numeroConta, int codSeguranca, Calendar validade) {
		this.numero = numero;
		this.proprietario = nomeProprietario;
		this.numeroConta = numeroConta;
		this.codSeguranca = codSeguranca;
		this.validade = validade;
	}

	public long getNumero() {
		return numero;
	}

	public String getNomeProprietario() {
		return proprietario;
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public int getCodSeguranca() {
		return codSeguranca;
	}

	public Calendar getValidade() {
		return validade;
	}

}
