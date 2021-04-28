package SistemaMercado;

//Classe Concreta
//Sub-classe, essa classe herdara atributos da Super-Classe.
public class Leite extends Produto implements Informacoes {

	// Os atributos a baixo serão herdados
	// public double valorTotal;
	// public String setor;

	// Esses atributos estão em private (Protegidos) ou seja só podem ser alterados
	// dentro dessa classe
	private int codigo = 1;
	private String nome = "Leite Integral";
	private double preco = 2.59;

	// Esse metodo serve para adicionar o valor do seu produto a compra
	public void Comprar() {
		System.out.println("Leite Integral 1L, 2.59 Und");
		valorTotal = preco + valorTotal;
	}

	// Esses metodos a baixo são implementados da interface Informacoes
	// Toda vez que ele implenta a classe ela é obrigada a ter todos seus metodos,
	// nem que sejam em branco
	@Override
	public void VerDetalhes() {
		System.out.println(" Leite Integral de 1 litro \n Marca: Paramalat \n Preço: 2.59\n");
		// Esse metodo serve para ler a descrição do produto
	}

	@Override
	public void VerPreco() {
		System.out.println("2.59");
		// Esse metodo olha o valor do produto
	}

	@Override
	public void OlharValidade() {
		System.out.println("V: 31/12/2021");
		// Esse metodo olha a validade do produto
	}
}