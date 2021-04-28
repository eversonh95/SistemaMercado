package SistemaMercado;

//Classe Abstrata, ou seja não difinida totalmente
//Herda a Super-Classe
public abstract class NaoConsumivel extends Produto {
	
	    //Metodo Abstrato
        //Metodos Abstratos não podem ter corpo	
	    //Quando uma criamos um metodo abstrato a classe também tem que ser abstrata
		public abstract void LerDetalhes();
		
		//Metodos abstratos só podem ser public ou protected
		protected abstract void Configurar();

}
