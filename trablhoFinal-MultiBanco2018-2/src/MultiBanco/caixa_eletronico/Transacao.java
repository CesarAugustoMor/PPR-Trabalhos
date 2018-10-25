package MultiBanco.caixa_eletronico;

import java.sql.Time;

public class Transacao {

	private long id;

	private long valor;

	private Conta contaOrigem;

	private Conta contaDestino;

	private Time dataHora;

	private Usuario responsavel;

	private ResponsavelTipoEnum responsavelTipoEnum;

	private OperacaoTipoEnum operacao;

	/**
	 *  
	 */
	Transacao(long id, OperacaoTipoEnum Operacao, long valor) {
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

	public ResponsavelTipoEnum getResponsavelTipoEnum() {
		return responsavelTipoEnum;
	}

	public void setResponsavelTipoEnum(ResponsavelTipoEnum responsavelTipoEnum) {
		this.responsavelTipoEnum = responsavelTipoEnum;
	}

	public OperacaoTipoEnum getOperacao() {
		return operacao;
	}

	public void setOperacao(OperacaoTipoEnum operacao) {
		this.operacao = operacao;
	}

	public long getId() {
		return id;
	}

	public long getValor() {
		return valor;
	}
}
