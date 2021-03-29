//Aluno:Thales de oliveira Silva RA:1914855
public class CPU{
  
  private int qtdRam;
  private String tipoProces;
  private String marca;
    private Teclado tecla = new Teclado();
    private Monitor Moni = new Monitor();
    private Mouse mouse = new Mouse();
  
  public Teclado getTecla(){
		return tecla;
	}

	public void setTecla(Teclado tecla){
		this.tecla = tecla;
	}
    
  
  public Monitor getMoni(){
		return Moni;
	}

	public void setMoni(Monitor Moni){
		this.Moni = Moni;
	}
  public Mouse getMouse(){
		return mouse;
	}

	public void setMouse(Mouse mouse){
		this.mouse = mouse;
	}
  

  public void setQtdRam(int qtdRam){
    this.qtdRam = qtdRam;
  }

  public int getQtdRam(){
    return qtdRam;
  }

  public void setTipoProces(String tipoProces){
    this.tipoProces = tipoProces;
  }

  public String getTipoProces(){
    return tipoProces;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public String getMarca(){
    return marca;
  }

}