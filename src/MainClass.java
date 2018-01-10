import java.util.Scanner;

public class MainClass 
{
	static Scanner tastiera=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Catalogo catalogo=new Catalogo();
		// insrimento 3 PC per testing delle funzioni....................................................................
		Computer c1=new Computer(catalogo.getNumeroComputer()+1,  "Fujitsu", "Lifebook A series", 2, 4, 500, 15, 2017);
		catalogo.setComputer(c1);
		Computer c2=new Computer(catalogo.getNumeroComputer()+1,  "Fujitsu", "Lifebook B series", 1, 4, 500, 15, 2017);
		catalogo.setComputer(c2);
		Computer c3=new Computer(catalogo.getNumeroComputer()+1,  "Dell", "ProDell A series", 1, 2, 1000, 15, 2015);
		catalogo.setComputer(c3);
		//...............................................................................................................
		
		Menu menu=new Menu();
		int sceltaMenu=0;
		String sceltaSottomenu;
		do
		{
			menu.visualizza();
			sceltaMenu=menu.scelta();
			switch (sceltaMenu) 
			{
				case 0:
					break;
				case 1:	//	in manutenzione evolutiva sarebbe opportuno realizzare il sottomenu "InserimentoComputer" con una classe
				{
					Computer c=new Computer(catalogo.getNumeroComputer()+1);	//unico parametro il codice autoincrementale
					System.out.println("Inserisci Marca ");
					c.setMarca(tastiera.nextLine());
					System.out.println("Inserisci Modello ");
					c.setModello(tastiera.nextLine());
					System.out.println("Inserisci Velocità processore GHz ");
					c.setVelocitaGhz(tastiera.nextFloat());
					System.out.println("Inserisci quantità RAM Gbyte ");
					c.setRamGb(tastiera.nextFloat());
					System.out.println("Inserisci dimensione HD Gbyte ");
					c.setDiscoGb(tastiera.nextFloat());
					System.out.println("Inserisci dimensione monitor (pollici) ");
					c.setMonitorPollici(tastiera.nextFloat());
					System.out.println("Inserisci anno acquisto PC ");
					c.setAnno(tastiera.nextInt());
					if (catalogo.setComputer(c)==-1)
						System.out.println("Catalogo pieno. Impossibile inserire il computer");
					else
						System.out.println("Computer inserito correttamente");
				}
				break;
				case 2:
				{
					System.out.println("Inserisci codice PC da eliminare ");
					int codice=tastiera.nextInt();
					if (catalogo.eliminaComputer(codice)==-1)
						System.out.println("Computer non trovato");
					else
						System.out.println("Computer eliminato correttamente");	
				}
				break;
				case 3:
				{
					System.out.println("Inserisci codice PC da ricercare ");
					int codice=tastiera.nextInt();
					if (catalogo.ricercaComputer(codice)!=null)
						System.out.println(catalogo.ricercaComputer(codice).toString());
					else
						System.out.println("Computer non trovato");
				}
				break;
				case 4:
				{
					System.out.println("Inserisci quantità minima di RAM (in Gbyte)");
					float ram=tastiera.nextInt();
					Computer[] computerRam=catalogo.ricercaComputerRam(ram);
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
				}
				break;
				case 5:
				{
					System.out.println("Inserisci dimensione minima HD (in Gbyte)");
					float hd=tastiera.nextFloat();
					Computer[] computerDisco=catalogo.ricercaComputerDisco(hd);
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
				}
				break;
				
				case 6:
				{
					System.out.println("Inserisci velocità minima processore (in GHz)");
					float velocita=tastiera.nextFloat();
					Computer[] computerProcessore=catalogo.ricercaComputerProcessore(velocita);
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
				break;
				
				case 7:
				{
					System.out.println("Sono presenti nel catalogo "+catalogo.getNumeroComputer()+" computer");
				}
				break;
				default:
					System.out.println("Scelta non prevista");
				break;
			}
			System.out.println("Premi un tasto per continuare");
			tastiera.nextLine();
			tastiera.nextLine();
		}while (sceltaMenu!=0);
		
		Catalogo catalogoCopia=new Catalogo(catalogo);
		System.out.println("PC catalogo copia: ");

		
		//test creazione catalogo copia;
		int j=0;
		while(j<catalogoCopia.getNumeroComputer())
		{
			if (catalogoCopia.getComputer(j)!=null)
			{
				System.out.println(catalogoCopia.getComputer(j).toString()+"\n");
				j++;
			}
		}
		
	
	}
	
}
