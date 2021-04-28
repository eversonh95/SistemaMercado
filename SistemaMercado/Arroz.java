package SistemaMercado;

//Classe Concreta
//Sub-classe, essa classe herdara atributos da Super-Classe.
public class Arroz extends Produto implements Informacoes{
	
	//Os atributos a baixo ser�o herdados da classe Produto
	//public double valorTotal;
	//public String setor;
	
	//Esses atributos est�o em private (Protegidos) ou seja s� podem ser alterados dentro dessa classe
	public int codigo = 2;
	public String nome = "Arroz Tipo 1";
	public double preco = 20.29;
	
	//Esse metodo serve para adicionar o valor do seu produto a compra
	public void Comprar() {
		System.out.println("Pacote de Arroz, 20.29 Und");
		valorTotal = preco + valorTotal;
	}
	
	//Esses metodos a baixo s�o implementados da interface Informacoes
	//Toda vez que ele implenta a classe ela � obrigada a ter todos seus metodos, nem que sejam em branco
	@Override
	public void VerDetalhes() {
		System.out.println(" Arroz Tipo 1 \n Marca: Solito \n Pre�o: 20.29\n");
		//Esse metodo serve para ler a descri��o do produto
	}
	@Override
	public void VerPreco() {
		System.out.println("20.29");
		//Esse metodo olha o valor do produto
	}
	@Override
	public void OlharValidade() {
		System.out.println("V: 12/12/2021");
		//Esse metodo olha a validade do produto
	}
}
