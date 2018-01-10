
public class Computer 
{
	
	//	Attributi
	//private static int contatoreComputer=0;
	private  int codice;
	private String marca;
	private String modello;
	private float velocitaGhz;
	private float ramGb;
	private float discoGb;
	private float monitorPollici;
	private int anno;
	
	
	//	Costruttori
	public Computer (int codice,String marca,String modello, float velocitaGhz,float ramGb,float discoGb, float monitorPollici, int anno )
	{
		
		this.codice=codice;	//il codice si incrementa automaticamente per ogni nuovo computer
		setMarca(marca);
		setModello(modello);
		setVelocitaGhz(velocitaGhz);
		setRamGb(ramGb);
		setDiscoGb(discoGb);
		setMonitorPollici(monitorPollici);
		setAnno(anno);
	}
	
	//	Costruttore di copia
	public Computer (Computer computer)
	{
		
		codice=computer.getCodice();	//il codice si incrementa automaticamente per ogni nuovo computer		
		setMarca(computer.getMarca());
		setModello(computer.getModello());
		setVelocitaGhz(computer.getVelocitaGhz());
		setRamGb(computer.getRamGb());
		setDiscoGb(computer.getDiscoGb());
		setMonitorPollici(computer.getMonitorPollici());
		setAnno(computer.getAnno());
	}
	
	//	Costruttore di default
	public Computer(int codice)
	{
		this.codice=codice;	//il codice si incrementa automaticamente per ogni nuovo computer		
		setMarca("");
		setModello("");
		setVelocitaGhz(0);
		setRamGb(0);
		setDiscoGb(0);
		setMonitorPollici(0);
		setAnno(0);	
	}
	//	Setter e Getter
	public int getCodice()
	{
		return codice;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModello() {
		return modello;
	}


	public void setModello(String modello) {
		this.modello = modello;
	}


	public float getVelocitaGhz() {
		return velocitaGhz;
	}


	public void setVelocitaGhz(float velocitaGhz) {
		this.velocitaGhz = velocitaGhz;
	}


	public float getRamGb() {
		return ramGb;
	}


	public void setRamGb(float ramGb) {
		this.ramGb = ramGb;
	}


	public float getDiscoGb() {
		return discoGb;
	}


	public void setDiscoGb(float discoGb) {
		this.discoGb = discoGb;
	}


	public float getMonitorPollici() {
		return monitorPollici;
	}


	public void setMonitorPollici(float monitorPollici) {
		this.monitorPollici = monitorPollici;
	}


	public int getAnno() {
		return anno;
	}


	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String toString()
	{
		return ("Caratteristiche PC codice: "+getCodice()+"\nMarca: "+getMarca()+
				"\nModello: "+getModello()+"\nprocessore: "+getVelocitaGhz()+" GHz"+"\nRAM: "+getRamGb()+
				" Gb"+"\nHD: "+getDiscoGb()+" Gb"+"\nmonitor: "+getMonitorPollici()+" pollici"+"\nanno: "+getAnno());
	}
}
