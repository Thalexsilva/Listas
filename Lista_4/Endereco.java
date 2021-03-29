//Aluno:Thales de oliveira Silva RA:1914855
public class Endereco{
  
  private String rua;
  private int num;
  private String cidade;
  private String estado;

  public void setRua(String rua){
    this.rua = rua;
  }

  public String getRua(){
    return rua;
  }

  public void setNum(int num){
    this.num = num;
  }

  public int getNum(){
    return num;
  }

  public void setCidade(String cidade){
    this.cidade = cidade;
  }

  public String getCidade(){
    return cidade;
  }

  public void setEstado(String estado){
    this.estado = estado;
  }

  public String getEstado(){
    return estado;
  }
}