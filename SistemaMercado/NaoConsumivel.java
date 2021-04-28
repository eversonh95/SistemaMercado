package SistemaMercado;

//Classe Abstrata, ou seja n�o difinida totalmente
//Herda a Super-Classe
public abstract class NaoConsumivel extends Produto {
	
	    //Metodo Abstrato
        //Metodos Abstratos n�o podem ter corpo	
	    //Quando uma criamos um metodo abstrato a classe tamb�m tem que ser abstrata
		public abstract void LerDetalhes();
		
		//Metodos abstratos s� podem ser public ou protected
		protected abstract void Configurar();

}
