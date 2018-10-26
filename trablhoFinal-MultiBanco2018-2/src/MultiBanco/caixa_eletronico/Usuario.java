package MultiBanco.caixa_eletronico;

/**
 * @author César Augusto Moro Fürst
 * @link https://github.com/CesarAugustoMor/
 */

import java.util.Date;

public class Usuario {

	protected String nome;

	private static int cpf;

	private static String rg;

	private Endereco endereco;

	private int telefone;

	private Date dataNascimento;

	/**
	 *  
	 */
	public Usuario(String nome, int cpf, String rg, Date nascimento, Endereco endereco) {
		this.nome=nome;
		Usuario.cpf=cpf;
		Usuario.rg=rg;
		this.dataNascimento=nascimento;
		this.endereco=endereco;
	}

	/**
	 *  
	 */
	public Usuario(String nome, int cpf, Date nascimento, Endereco endereco) {
		this.nome=nome;
		Usuario.cpf=cpf;
		this.dataNascimento=nascimento;
		this.endereco=endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date data) {
		this.dataNascimento = data;
	}

	public static int getCPF() {
		return cpf;
	}

	public static String getRG() {
		return rg;
	}

	

}
