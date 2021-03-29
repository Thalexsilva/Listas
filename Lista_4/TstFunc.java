//Aluno:Thales de oliveira Silva RA:1914855
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class TstFunc{
  
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Leitura lc = new Leitura(); 
    Funcionario f1=new Funcionario();
    lc.entDados("\nCadastro do Funcionário: ");
    f1.setCod(Integer.parseInt(lc.entDados("\nCodigo do Funcionario: ")));
    f1.setNome(lc.entDados("\nNome do Funcionário: "));
    f1.setDataContratacao(lc.entDados("\nData contratação: "));
    f1.setCasado(Boolean.parseBoolean(lc.entDados("\nCasado, true ou false: ")));
    lc.entDados("\nCadastro do Endereço: ");
    //ender
    f1.getEnder().setRua((lc.entDados("\nRua : ")));
    f1.getEnder().setNum(Integer.parseInt(lc.entDados("\nNumero : ")));
    f1.getEnder().setCidade((lc.entDados("\nCidade : ")));
    f1.getEnder().setEstado((lc.entDados("\nEstado : ")));
    
    lc.entDados("\nCadastro do CPU: ");
    //f1.setMarca(lc.entDados("\nMarca do processador: "));
    f1.getCpu().setQtdRam(Integer.parseInt(lc.entDados("\nNumero de memoria ram em GB: ")));
    f1.getCpu().setTipoProces(lc.entDados("\ntipo de processador: "));

    
    lc.entDados("\nCadastro do Teclado: ");
    //teclado
    f1.getCpu().getTecla().setMarca((lc.entDados("\nMarca do teclado : ")));
    f1.getCpu().getTecla().setQtdTeclas(Integer.parseInt(lc.entDados("\nNumero de teclas do teclado : ")));
    lc.entDados("\nCadastro do Mouse: ");
    //Mouse
    f1.getCpu().getMouse().setMarca((lc.entDados("\nMarca do mouse : ")));
    f1.getCpu().getMouse().setCompriCabo(Integer.parseInt(lc.entDados("\nComprimento cabo em metros : ")));
    f1.getCpu().getMouse().setQtdTeclas(Integer.parseInt(lc.entDados("\nNumero de teclas do mouse : ")));
    lc.entDados("\nCadastro do Monitor: ");
   //Monitor
    f1.getCpu().getMoni().setMarca((lc.entDados("\nMarca do monitor : ")));
    f1.getCpu().getMoni().setAltura(Integer.parseInt(lc.entDados("\nAltura do monitor: ")));
    f1.getCpu().getMoni().setLargura(Integer.parseInt(lc.entDados("\nLargura do monitor: ")));
    

    //Impressão dados recebidos
   
		System.out.println("\nCódigo Funcionario: "+f1.getCod());
		System.out.println("Nome do Funcionario: "+f1.getNome());
    System.out.println("Data de Contratacao: "+sdf.format(f1.getDataContratacao()));
    System.out.println("\nÉ casado: "+f1.getCasado());

    //ender
    System.out.println("\nEndereco do Funcionario:  "+f1.getEnder().getRua());
		System.out.println("Numero da casa: "+f1.getEnder().getNum());
    System.out.println("Cidade do Funcionario: "+f1.getEnder().getCidade());
    System.out.println("\nEstado do Funcionario: "+f1.getEnder().getEstado());

    //CPU
    System.out.println("\nQuantidade de RAM  "+f1.getCpu().getQtdRam());
		System.out.println("\nTipo de Processador: "+f1.getCpu().getTipoProces());
    //System.out.println("Marca do CPU: "+f1.getMarca());

    //Teclado
    System.out.println("\nQuantidade de teclas - teclado: "+f1.getCpu().getTecla().getQtdTeclas());
    System.out.println("\nMarca do teclado: "+f1.getCpu().getTecla().getMarca());

    //Mouse
    System.out.println("\nQuantidade de teclas - Mouse  "+f1.getCpu().getMouse().getQtdTeclas());
		System.out.println("\nTamanho do cabo: "+f1.getCpu().getMouse().getCompriCabo());
    System.out.println("\nMarca do mouse: "+f1.getCpu().getMouse().getMarca());

    //Monitor
    System.out.println("\nAltura do Monitor  "+f1.getCpu().getMoni().getAltura());
		System.out.println("\nLargura do Monitor: "+f1.getCpu().getMoni().getLargura());
    System.out.println("\nMarca do Monitor: "+f1.getCpu().getMoni().getMarca());
  }
}