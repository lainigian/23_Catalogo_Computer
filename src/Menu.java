import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

//per ore scriviamo direttamente nel costruttore le voci
//poi vedremo come caricare le opzioni da file e aggiungeremo i metodi per gestire anche il menu
//setVoce, getVoce eccc..

public class Menu 
{

	private String[] elencoFunzioni;
	private int NUMERO_FUNZIONI=8;
	
	private Scanner tastiera=new Scanner(System.in);
	
	public Menu ()
	{
		elencoFunzioni=new String[NUMERO_FUNZIONI];
		
		elencoFunzioni[0]="0-->Esci";
		elencoFunzioni[1]="1-->Aggiungi computer";
		elencoFunzioni[2]="2-->Elimina computer (inserendo il codice)";
		elencoFunzioni[3]="3-->Ricerca computer (inserendo il codice)";
		elencoFunzioni[4]="4-->Ricerca computer con Ram maggiore o uguale ad un certo valore";
		elencoFunzioni[5]="5-->Ricerca computer con dimensione disco maggiore o uguale ad un certo valore";	
		elencoFunzioni[6]="6-->Ricerca computer con velocità processore maggiore o uguale ad un certo valore";
		elencoFunzioni[7]="7-->Visualizza numero computer inseriti";		
	}
	public void visualizza()
	{
		for (int i = 1; i < elencoFunzioni.length; i++) 
		{
			System.out.println(elencoFunzioni[i]);
		}
		System.out.println(elencoFunzioni[0]);  // mostro per ultima la voce "Esci"
		
	}
	
	public int scelta()
	{
		int voceScelta=0;
		do
		{
			System.out.println("\nScegli-->.. ");
			voceScelta=tastiera.nextInt();
		} while (voceScelta<0 || voceScelta>NUMERO_FUNZIONI);
		
		return voceScelta;
	}
	
	
	
}
