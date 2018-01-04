
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
}	// end class

	
	




