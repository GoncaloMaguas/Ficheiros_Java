package ficha02ex2;


public class Pessoa {
    
    private String nome;
    private char genero;
    private int idade;
    
    public Pessoa(){
    }
    
    public Pessoa(String n, char g, int i){
        this.nome=n;
        this.genero=g;
        this.idade=1;
    }
        
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setGenero(char genero){
        this.genero=genero;
    }
    
    public void setIdade(int idade){
        this.idade=idade;
    }
        
    
    
    
    public String getNome(){
        return this.nome;
    }
        
        public char getGenero(){
            return this.genero;
        }
        
        public int getIdade(){
            return this.idade;
        }
        
      
    
    
    
    void falar(){
        System.out.println("Bom dia");
    }
}



















