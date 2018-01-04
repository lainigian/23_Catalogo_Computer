
public class Catalogo 
{
	//	Attributi
	private Computer[] elencoComputer;
	private final int MAX_NUMERO_COMPUTER=1000;
	
	
	//	Costruttori
	public void Catalogo()
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
}

	

	public int 




