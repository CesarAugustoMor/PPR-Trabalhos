package MultiBanco.caixa_eletronico;

public class Cidade {

	private int id;

	private String nome;

	private Estado estado;

	private Pais pais;

	/**
	 *  
	 *  
	 */
	public Cidade(int id, String nome, Estado Estado) {
		this.id=id;
		this.nome=nome;
		this.estado=Estado;
	}

	public Cidade(int id, String nome, Pais pais) {
		this.id=id;
		this.nome=nome;
		this.pais=pais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	

}
