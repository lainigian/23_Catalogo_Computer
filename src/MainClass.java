
public class MainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Catalogo catalogo=new Catalogo();
		Computer c1=new Computer(catalogo.getNumeroComputer()+1,  "Fujitsu", "Lifebook A series", 2, 4, 500, 15, 2017);
		
		
		System.out.println(c1.toString());
	}

}
