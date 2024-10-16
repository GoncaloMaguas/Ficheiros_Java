package ficha3;


public class Condutor {
    private String nome;
    private int idade;   
    private int destreza;
    
    
    
    public Condutor(){

    }
    
    public void setNome(String n){
        
        this.nome=n;
    }
    
    
    public void setIdade(int i){
        this.idade=i;
    }
    
    
    public void setDestreza(int d){
        this.destreza=d;
    }
    
    
    public String getNome(){
        
    return this.nome;
    }
    
    
    public int getIdade(){
       return this.idade;
    }
    
    
    public int getDestreza(){
        return this.destreza;
    }
    
    
    
    
}
