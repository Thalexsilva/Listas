//Aluno:Thales de oliveira Silva RA:1914855
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Funcionario{
  
  private int cod;
  private String nome;
  private Date dataContratacao;
  private boolean casado;
  private Endereco ender = new Endereco();
  private CPU cp = new CPU();
  
  public Endereco getEnder(){
		return ender;
	}

	public void setEnder(Endereco ender){
		this.ender = ender;
	}
     
  
  public CPU getCpu(){
		return cp;
	}

	public void setCpu(CPU cp){
		this.cp = cp;
	}

	
 
 
  public void setCod(int cod){
    this.cod = cod;
  }

  public int getCod(){
    return cod;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public void setDataContratacao(String dataContratacao){
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      try {  
        this.dataContratacao = sdf.parse(dataContratacao);   
    } catch (ParseException e) {e.printStackTrace();}
  }

  public Date getDataContratacao(){
    return dataContratacao;
  }
  
  public void setCasado(Boolean casado){

    this.casado = casado;
  }

  public Boolean getCasado(){
    return casado;
  }
}