package MultiBanco.caixa_eletronico;

/**
 * @author César Augusto Moro Fürst
 * @link https://github.com/CesarAugustoMor/
 */

import java.sql.Time;

public class Transacao {

	private long id;

	private long valor;

	private Conta contaOrigem;

	private Conta contaDestino;

	private Time dataHora;

	private Usuario responsavel;

	private TipoResponsavelEnum responsavelTipoEnum;

	private TipoOperacaoEnum operacao;

	/**
	 *  
	 */
	Transacao(long id, TipoOperacaoEnum Operacao, long valor) {
		this.id=id;
		this.operacao=Operacao;
		this.valor=valor;
		dataHora=new Time(System.currentTimeMillis());
	}

	public Conta getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(Conta contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public Conta getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}

	public Time getHora() {
		return dataHora;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public TipoResponsavelEnum getResponsavelTipoEnum() {
		return responsavelTipoEnum;
	}

	public void setResponsavelTipoEnum(TipoResponsavelEnum responsavelTipoEnum) {
		this.responsavelTipoEnum = responsavelTipoEnum;
	}

	public TipoOperacaoEnum getOperacao() {
		return operacao;
	}

	public void setOperacao(TipoOperacaoEnum operacao) {
		this.operacao = operacao;
	}

	public long getId() {
		return id;
	}

	public long getValor() {
		return valor;
	}
}
