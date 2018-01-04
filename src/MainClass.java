
public class MainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Catalogo catalogo=new Catalogo();
		Computer c1=new Computer(catalogo.getNumeroComputer()+1,  "Fujitsu", "Lifebook A series", 2, 4, 500, 15, 2017);
		catalogo.setComputer(c1);
		Computer c2=new Computer(catalogo.getNumeroComputer()+1,  "Fujitsu", "Lifebook B series", 1, 4, 500, 15, 2017);
		catalogo.setComputer(c2);
		
		Computer computer=null;
		int codice=2;
		if (catalogo.ricercaComputer(codice)!=null)
		{
			computer=catalogo.ricercaComputer(codice);
			System.out.println(computer.toString());
		}
		else
			System.out.println("computer con codice "+codice+ " non presente");
		
		
	}

}
