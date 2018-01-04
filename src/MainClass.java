
public class MainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Catalogo catalogo=new Catalogo();
		Computer c1=new Computer(catalogo.getNumeroComputer()+1,  "Fujitsu", "Lifebook A series", 2, 4, 500, 15, 2017);
		System.out.println("codice c1 "+c1.getCodice());
		
		
		catalogo.setComputer(c1);
		if (catalogo.eliminaComputer(1)==0)
			System.out.println("eliminato");
		else
			System.out.println("non trovato");
		System.out.println("codice c1 "+c1.getCodice());
	}

}
