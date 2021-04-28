package SistemaMercado;

//Herda uma classe abstrata
public class Televisao extends NaoConsumivel implements Informacoes{
	
	private int codigo = 3;
	private String nome = "Samsung Smart TV 50";
	private double preco = 2499.99;
	
	//Aqui os metodos proprios da classe Televisa
	public void Comprar() {
		System.out.println("Samsung Smart TV 50, 2499.99 Und");
		valorTotal = preco + valorTotal;
	}
	//FIM DOS METODOS PROPRIOS//
		
	//Aqui foram herdados metodos de uma classe abstrata, que agora podem ter seu corpo alterado
	@Override
	public void LerDetalhes() {
		System.out.println("Este não é um produto consumivel");
		
	}
	@Override
	protected void Configurar() {
		System.out.println("Você não tem permissão...");
		
	}
	//FIM DOS METODOS ABSTRATOS
	
	//Metodos implementados da interface Informacoes
	@Override
	public void VerDetalhes() {
		System.out.println("Samsung Smart TV 50\nCrystal UHD 50TU8000 4K, Wi-fi,\nBorda Infinita, Alexa built in,\nControle Único, Visual Livre de Cabos, Modo Ambiente Foto e Processador Crystal 4K");
	}
	
	@Override
	public void VerPreco() {
		System.out.println(2499.99);
	}
	
	@Override
	public void OlharValidade() {
		System.out.println("Esse produto não tem data de validade");
	}
}