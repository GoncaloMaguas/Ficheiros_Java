package ficha3;

public class Carro {

    
     private String matricula;
     private int velocidadeAtual=0;
     private final int VELOCIDADE_MAX=200;
     private int travar;
     private boolean ligado;
     private Condutor Condutor;
      
    
    
     
        public Carro(){

       }
     
    
       public void ligar(){
        if (this.ligado=true)
        System.out.println("VRRRUUUUmmmmmm");
        
       }
        
        
        public void desligar(){
           this.ligado=false;
           System.out.println("MMMmmmmm");
        }
        
           
        
        public void acelerar(){
            velocidadeAtual+=10;
            if (velocidadeAtual>VELOCIDADE_MAX) velocidadeAtual=VELOCIDADE_MAX;

        }
        
        public void travar(int intensidadeTravagem){
            if (intensidadeTravagem > VELOCIDADE_MAX)intensidadeTravagem = VELOCIDADE_MAX;
            else if (intensidadeTravagem < 0)intensidadeTravagem = 0;
            velocidadeAtual -= intensidadeTravagem;
            if (velocidadeAtual > VELOCIDADE_MAX)velocidadeAtual = VELOCIDADE_MAX;
            else if (velocidadeAtual < 0)velocidadeAtual = 0; 
       
        }
    
    
    
    public void setMatricula(String m){
        this.matricula=m;
    }
    
    public void setVelocidadeAtual(int va){
        this.velocidadeAtual=va;
    }
    
    public void setLigado(boolean on){
        this.ligado=on;
    }
    
    public int getVELOCIDADE_MAX(){
        return this.VELOCIDADE_MAX;
    }
    
    public int getTravar(){
        return this.travar;
    }

    
    
    
    public String getMatricula(){
        return this.matricula;
    }
        
    public int getVelocidadeAtual(){
            return this.velocidadeAtual;
    }
        
    public boolean getLigado(){
            return this.ligado;
    }
    
    public void setCondutor(Condutor Condutor){
        this.Condutor =Condutor;
    }
     
    
   public Condutor getCondutor(){
       return this.Condutor;
   }
}

    
    
   
    
