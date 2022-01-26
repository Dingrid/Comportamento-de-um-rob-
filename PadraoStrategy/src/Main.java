
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Usando o padrão Strategy foi criado um Robo que se move normalmente, que ataca, que se defende e que foge
		
		//criacao dos comportamentos
		Comportamento defensivo = new ComportamentoOfensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento sobreviver = new ComportamentoSobrevivencia();
		
		Robo robo = new Robo();
		
		//o robo comeca andando normal
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		//ele  supreendido por um golpe e se defende
		robo.setComportamento(defensivo);
		robo.mover();
		
		//apos isso ele ataca repetidamente
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//ele percebe que seu oponente e forte demais, entao foge
		robo.setComportamento(sobreviver);
		robo.mover();

	}

}
