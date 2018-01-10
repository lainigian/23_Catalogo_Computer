
public class Catalogo 
{
	//	Attributi
	private Computer[] elencoComputer;
	private static final int MAX_NUMERO_COMPUTER=1000;
	
	
	//	Costruttori
	public Catalogo()
	{
		elencoComputer=new Computer[MAX_NUMERO_COMPUTER];
	}
	
	
	
	//	Altri Metodi
	
	//	Aggiunge un computer in coda
	// 	0->ok
	//	-1--> elenco pieno
	public int setComputer(Computer computer)	
	{
		for (int i = 0; i < MAX_NUMERO_COMPUTER; i++) 
		{
			if (elencoComputer[i]==null)
			{
				elencoComputer[i]=new Computer (computer); 	//per evitare dipendenza
				return 0;		//ok
			}	
		}
		return -1;			//elenco pieno, aggiornamento fallito
	}
	
	
	//	Elimina computer dalla coda ponendo al posto del computer eliminato un puntatore a null
	// 	0-->ok
	//	-1--> Computer non trovato
	public int eliminaComputer (int codice)
	{
		for (int i = 0; i < MAX_NUMERO_COMPUTER; i++) 
		{
			if (elencoComputer[i]!=null)
			{
				if (elencoComputer[i].getCodice()==codice)
				{
					elencoComputer[i]=null;
					return 0;
				}
			}
		}
		return -1;
	}
	
	public int getNumeroComputer()
	{
		int contatore=0;
		for (int i = 0; i < MAX_NUMERO_COMPUTER; i++) 
		{
			if (elencoComputer[i]!=null)
				contatore++;
		}
		return contatore;
	}
	
	//	Ricerca un computer per codice
	//	null-->Computer non trovato
	public Computer ricercaComputer (int codice)
	{
		for (int i = 0; i < MAX_NUMERO_COMPUTER; i++) 
		{
			if (elencoComputer[i]!=null)
			{
				if (elencoComputer[i].getCodice()==codice)
					return new Computer(elencoComputer[i]);
			}
		}
		return null;
	}
	
	//	Ricerca e restituisce una array contenente 
	//	i computer (una copia) che hanno Ram superiore ad un
	// 	certo valore minimo
	public Computer[] ricercaComputerRam (float ramMinima)
	{
		int contatore=0;
		for (int i = 0; i < MAX_NUMERO_COMPUTER; i++) 
		{
			if (elencoComputer[i]!=null)
			{
				if (elencoComputer[i].getRamGb()>=ramMinima)
					contatore++;
			}
			
		}
		if (contatore==0)
			return null;
		
		Computer[] computerRam=new Computer[contatore];
		int j=0;
		for (int i = 0; i < MAX_NUMERO_COMPUTER; i++) 
		{
			if (elencoComputer[i]!=null)
			{
				if (elencoComputer[i].getRamGb()>=ramMinima)
				{
					computerRam[j]=new Computer(elencoComputer[i]);
					j++;
				}	
			}
		}			
		return computerRam;
	}
	
	//	Ricerca e restituisce una array contenente 
	//	i computer (una copia) che hanno dimensione del disco superiore ad un
	// 	certo valore minimo
	public Computer[] ricercaComputerDisco (float discoMinimo)
	{
		int contatore=0;
		for (int i = 0; i < MAX_NUMERO_COMPUTER; i++) 
		{
			if (elencoComputer[i]!=null)
			{
				if (elencoComputer[i].getDiscoGb()>=discoMinimo)
					contatore++;
			}
			
		}
		if (contatore==0)
			return null;
		
		Computer[] computerDisco=new Computer[contatore];
		int j=0;
		for (int i = 0; i < MAX_NUMERO_COMPUTER; i++) 
		{
			if (elencoComputer[i]!=null)
			{
				if (elencoComputer[i].getDiscoGb()>=discoMinimo)
				{
					computerDisco[j]=new Computer(elencoComputer[i]);
					j++;
				}	
			}
		}			
		return computerDisco;
	}
	
	//	Ricerca e restituisce una array contenente 
	//	i computer (una copia) che hanno velocità del processore superiore ad un
	// 	certo valore minimo
	public Computer[] ricercaComputerProcessore (float velocita)
	{
		int contatore=0;
		for (int i = 0; i < MAX_NUMERO_COMPUTER; i++) 
		{
			if (elencoComputer[i]!=null)
			{
				if (elencoComputer[i].getVelocitaGhz()>=velocita)
					contatore++;
			}
			
		}
		if (contatore==0)
			return null;
		
		Computer[] computerVelocita=new Computer[contatore];
		int j=0;
		for (int i = 0; i < MAX_NUMERO_COMPUTER; i++) 
		{
			if (elencoComputer[i]!=null)
			{
				if (elencoComputer[i].getVelocitaGhz()>=velocita)
				{
					computerVelocita[j]=new Computer(elencoComputer[i]);
					j++;
				}	
			}
		}			
		return computerVelocita;
	}
	
}	// end class

	
	




