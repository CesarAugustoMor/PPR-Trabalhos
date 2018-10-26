package MultiBanco.caixa_eletronico;

/**
 * @author César Augusto Moro Fürst
 * @link https://github.com/CesarAugustoMor/
 */

public class Estado {

	private long id;

	private String nome;

	private Pais pais;

	Estado(long id, String nome, Pais pais) {
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public long getId() {
		return id;
	}



}
