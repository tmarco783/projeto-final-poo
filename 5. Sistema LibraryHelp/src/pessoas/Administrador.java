package pessoas;
import java.util.ArrayList;

public class Administrador extends Pessoa{
    private Acesso acesso;
    private ArrayList <Administrador> listaAdm = new ArrayList <Administrador>();
    
    /*Construtor com menos informações*/
    public Administrador(int id, String nome, int idade, Acesso acesso) {
        super(id, nome, idade);
        this.acesso = acesso;
    }
    
    /*Construtor com todas as informações*/
    public Administrador(int id, String nome, int idade, Endereco endereco, String email, Acesso acesso) {
        super(id, nome, idade, endereco, email);
        this.acesso = acesso;
    }

    public Acesso getAcesso() {
        return acesso;
    }
    
    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }
    
    public void cadastrarAdministrador(int id, String nome, int idade, Acesso acesso) {
        Administrador adm = new Administrador(id, nome, idade, acesso);
        listaAdm.add(adm);
    }
    
    public void cadastrarAdministrador(int id, String nome, int idade, Endereco endereco, String email, Acesso acesso) {
        Administrador adm = new Administrador(id, nome, idade, endereco, email, acesso);
        listaAdm.add(adm);
    }
    
    public void alterarCadastroAdministrador(int id) {
        if(!existe(id)){
           System.out.println("O ID informado não existe.");
           return;
        }else{
            int indice = 0;
            for(int i = 0; i < listaAdm.size(); i++){
                if(listaAdm.get(i).getId() == id){
                    indice = i;
                    break;
                }
            }
        }
        
        /*
        Executar a
        alteração de cadastro
        */
    }
    
    public void buscarAdministrador(int id) {
        
    }
    
    public void excluirAdministrador(int id) {
        
    }
    
    public boolean existe(int id){
        boolean existe = false;
        
        for(int i = 0; i < listaAdm.size(); i++){
            if(listaAdm.get(i).getId() == id){
                existe = true;
                break;
            }
        }
        
        if(existe){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "ID: " + this.getId() + " | Nome: " + this.getNome() + 
               " | Idade: " + this.getIdade() + "\n Endereço: " + this.getEndereco() +
               " | E-mail: " + this.getEmail();
    }
}