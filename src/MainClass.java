
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
		
		Computer c3=new Computer(catalogo.getNumeroComputer()+1,  "Dell", "ProDell A series", 1, 2, 1000, 15, 2015);
		catalogo.setComputer(c3);
		
		Computer computer=null;
		int codice=2;
		if (catalogo.ricercaComputer(codice)!=null)
		{
			computer=catalogo.ricercaComputer(codice);
			System.out.println(computer.toString());
		}
		else
			System.out.println("computer con codice "+codice+ " non presente");
		
		Computer[] computerRam=catalogo.ricercaComputerRam(4);
		if (computerRam==null)
		{
			System.out.println("Nessun computer soddisfa le specifiche richieste");
		}
		else
		{
			for (int i = 0; i < computerRam.length; i++) 
			{
				System.out.println(computerRam[i].getMarca()+" "+computerRam[i].getModello()+ " Ram: "+computerRam[i].getRamGb()+" Gbyte");
			}
		}
			
		
		
		Computer[] computerDisco=catalogo.ricercaComputerDisco(1000);
		if (computerDisco==null)
		{
			System.out.println("Nessun computer soddisfa le specifiche richieste");	
		}
		else
		{
			for (int i = 0; i < computerDisco.length; i++) 
			{
				System.out.println(computerDisco[i].getMarca()+" "+computerDisco[i].getModello()+ " HD: "+computerDisco[i].getDiscoGb()+" Gbyte");
			}
			
		}
			
		
		Computer[] computerProcessore=catalogo.ricercaComputerProcessore(1);
		if (computerProcessore==null)
		{
			System.out.println("Nessun computer soddisfa le specifiche richieste");	
		}
		else
		{
			for (int i = 0; i < computerProcessore.length; i++) 
			{
				System.out.println(computerProcessore[i].getMarca()+" "+computerProcessore[i].getModello()+ " Velocita processore (Ghz): "+computerProcessore[i].getVelocitaGhz()+" GHz");
			}
		}
		
	}
	
	
	

}
