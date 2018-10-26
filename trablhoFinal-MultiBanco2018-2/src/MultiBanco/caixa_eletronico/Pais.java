package MultiBanco.caixa_eletronico;

/**
 * @author César Augusto Moro Fürst
 * @link https://github.com/CesarAugustoMor/
 */

public class Pais {

	private long id;

	private String nome;

	public Pais(long id, String nome) {
		this.id=id;
		this.nome=nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}
}
