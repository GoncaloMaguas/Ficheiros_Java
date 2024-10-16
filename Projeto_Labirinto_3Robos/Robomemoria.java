package projeto_sorin_gon;


import java.util.Random;


public class Robomemoria extends Robo{
    
    public void Movimentos(Labirinto T2) //metodo de movimentos para o robo de memoria
    {
        
        int [] memoriaX= new int[100];
        int [] memoriaY = new int[100];
        int contador=0, a=0,b, c=0;
        int [] numero= new int[100];
        
        
        
        while (contador ==0){
            Random movimento = new Random(); 

            b= movimento.nextInt(4);
            
            numero[a]+=b;
  
            
            
            if ((numero[a] ==0) && (T2.getValor(this.x+1, this.y)== ("   "))){ //Movimento para Baixo

                    
                    T2.setValor(this.x, this.y, "   ");
                    this.x=x+1;
                    T2.setValor(this.x, this.y, "R M");
                    contador++;
                      memoriaX[a]+=this.x;// acrescenta o valor de x ao array memoriaX
                      memoriaY[a]+=this.y;// acrescenta o valor de x ao array memoriaX
                 
                    
                }
            
                
            else if ((numero[a] ==1) && (T2.getValor(this.x-1, this.y)== ("   "))){ //Movimento para Cima    

                    
                    T2.setValor(this.x, this.y, "   ");
                    this.x--;
                    T2.setValor(this.x, this.y, "R M");
                    contador++; 
                    memoriaX[a]+=this.x;
                    memoriaY[a]+=this.y;

                    
                }
            

                  
            else if ((numero[a] ==2) && (T2.getValor(this.x, this.y-1) == ("   "))){ //Movimento para a Esquerda

                    
                        T2.setValor(this.x, this.y, "   ");
                        this.y--;
                        T2.setValor(this.x, this.y, "R M");
                        contador++;
                        memoriaX[a]+=this.x;
                        memoriaY[a]+=this.y;
                       
                    
                }    
            

            else if ((numero[a] ==3) && (T2.getValor(this.x, this.y+1)== ("   "))){ //Movimento para a Direita
                  
                    
                        T2.setValor(this.x, this.y, "   ");
                        this.y++;
                        T2.setValor(this.x, this.y, "R M");
                        contador++;
                        memoriaX[a]+=this.x;
                        memoriaY[a]+=this.y;
                        
                    
                }
            
            System.out.println("Posicao "+a+": X= "+memoriaX[c]+" , Y= "+memoriaY[c]);
            a++;
            
        }       
               
    }
}