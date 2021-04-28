package SistemaMercado;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Programa Principal
//Classe executavel, esta classe sera responsavel para executar o sistema
public class CaixaMercado {
	public static void main(String args[]) {

		// Aqui instanciamos a classe Scanner para receber valores
		Scanner input = new Scanner(System.in);
		// Aqui instanciamos a classe Cliente
		Cliente cliente = new Cliente();
		// DecimalFormat escolhe como você quer deixar numeros decimais
		DecimalFormat df = new DecimalFormat("##.##");

		// Encapsulamento dinamico, ou seja o usuario digita os seus atributos
		// Get and Setters;
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Qual seu nome?",
				JOptionPane.INFORMATION_MESSAGE);
		cliente.setNome(nome);

		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade:", "Qual sua idade?",
				JOptionPane.INFORMATION_MESSAGE));
		cliente.setIdade(idade);

		double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu saldo:", "Qual seu saldo? ",
				JOptionPane.INFORMATION_MESSAGE));
		cliente.setSaldo(saldo);

		JOptionPane.showMessageDialog(null,
				"Seu nome " + cliente.getNome() + " e seu saldo é: " + df.format(cliente.getSaldo()) + " Reais");
		// Fim do Encapsulamento

		// Aqui instanciamos as classes
		Leite l = new Leite();
		Arroz a = new Arroz();
		Produto p = new Produto();
		Televisao tv = new Televisao();

		// Aqui executamos metodos da classes Leite(l) e Arroz(a)
		Object[] itens = { "Não Consultar", "Leite", "Arroz", "Televisão" };
		Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um item", "Ver detalhes de algum item? ",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		// Polimorfismo
		if (selectedValue == "Leite") {
			l.VerDetalhes();
			l.VerPreco();
		} else if (selectedValue == "Arroz") {
			a.VerDetalhes();
			a.VerPreco();
		} else if (selectedValue == "Televisão") {
			tv.VerDetalhes();
			tv.VerPreco();
		} else if (selectedValue == "Não Consultar") {

		}

		// Aqui você pode digitar o codigo do produto, ele pode ser visto direto na
		// classe do produto.

		System.out.println("Digite o codigo do Produto: ");
		System.out.println("Digite 0 (ZERO) caso para cancelar a operação");
		int cod = input.nextInt();

		// Switch Case
		switch (cod) { // Digite o codigo do produto

		case 0:
			JOptionPane.showMessageDialog(null, "Cancelando Compra");
			System.exit(0);
			break;
		case 1:// Aqui o Usuario escolhe a quantidade de itens que ele quer
			l.Comprar();
			System.out.println("Digite a Quantidade: ");// Aqui o Usuario escolhe a quantidade de itens que ele quer
			int qtd = input.nextInt();
			System.out.println(qtd + " Unidades custam: " + df.format(qtd * 2.59));
			for (int i = 1; i <= qtd; ++i) {
				p.valorTotal = p.valorTotal + l.valorTotal;
			}
			break;
		case 2:// Aqui o Usuario escolhe a quantidade de itens que ele quer
			a.Comprar();
			System.out.println("Digite a Quantidade: ");// Aqui o Usuario escolhe a quantidade de itens que ele quer
			qtd = input.nextInt();
			System.out.println(qtd + " Unidades custam: " + df.format(qtd * 20.29));
			for (int i = 1; i <= qtd; ++i) {
				p.valorTotal = p.valorTotal + a.valorTotal;
			}
			break;
		case 3:// Aqui o Usuario escolhe a quantidade de itens que ele quer
			tv.Comprar();
			System.out.println("Digite a Quantidade: ");// Aqui o Usuario escolhe a quantidade de itens que ele quer
			qtd = input.nextInt();
			System.out.println(qtd + " Unidades custam: " + df.format(qtd * 2499.99));
			for (int i = 1; i <= qtd; ++i) {
				p.valorTotal = p.valorTotal + tv.valorTotal;
			}
			break;
		default:
			System.out.println("Nenhum produto selecionado");
			break;
		}
		// Fim do Switch Case

		// Aqui o programa verifica se a compra pode ser efetuada ou não
		if (cliente.getSaldo() < p.valorTotal) {
			cliente.setSaldo(saldo - p.valorTotal);// Aqui fazemos subtração do valor total da compra com o saldo do
													// cliente
			JOptionPane.showMessageDialog(null, "Impossivel efetuar compra");
			System.out.println("Seu saldo atual é: " + df.format(cliente.getSaldo()));
		} else if (cliente.getSaldo() >= p.valorTotal) {
			cliente.setSaldo(saldo - p.valorTotal);// Aqui fazemos subtração do valor total da compra com o saldo do
													// cliente
			JOptionPane.showMessageDialog(null, "Compra realizada...");
			System.out.println("Seu saldo atual é: " + df.format(cliente.getSaldo()));
		} else {
			System.out.println("ERRO");
			JOptionPane.showConfirmDialog(null, "ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, "MUITO OBRIGADO POR COMPRAR CONOSCO");
	}
}