package entities;

public class Manifestacao {

	Pessoa pessoa;
	private String texto;
	private String tipo;
	
	private static Manifestacao[] manifesto = new Manifestacao[5];

	static int x = 0;
	static int contador;

	public Manifestacao(String texto, Pessoa pessoa) {
		this.texto = texto;
		this.pessoa = pessoa;
	}

	public static void inserir(Manifestacao manifestar) {
		manifesto[x] = manifestar;
		x++;
	}

	public int getSize() {
		return manifesto.length;
	}

	public static void listar() {
		for (int i = 0; i < manifesto.length; i++) {
			if (contador == 0) {
				System.out.println("Não exite manifestação até o momento!");
				break;
			} else if (manifesto[i] != null) {
				System.out.println(i + 1 + "ª Manifestação " + manifesto[i]);

			}
		}

	}

	public static void incrementaContador() {
		contador++;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
