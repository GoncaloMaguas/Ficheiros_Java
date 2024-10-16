
package projeto_final_02;

import java.util.Random;




public class RoboAleatorio extends Robo {
        
        
    public void Movimentos(Labirinto T2)  //criação dos movimentos do Robo aleatorio
    {
        int contador=0, a=0,b;
        int [] numero= new int[100];
        
        while (contador ==0){
            
            Random movimento = new Random();

            b= movimento.nextInt(4);
           
            numero[a]+=b;
  
            if ((numero[a] ==0) && (T2.getValor(this.x+1, this.y)== ("   "))){ //Movimento para Baixo
                
                    T2.setValor(this.x, this.y, "   ");
                    this.x++;
                    T2.setValor(this.x, this.y, "R A");
                    contador++;
                    
            }
                
            else if ((numero[a] ==1) && (T2.getValor(this.x-1, this.y)== ("   "))){ //Movimento para Cima    
            
                    T2.setValor(this.x, this.y, "   ");
                    this.x--;
                    T2.setValor(this.x, this.y, "R A");
                    contador++; 
            }

                  
            else if ((numero[a] ==2) && (T2.getValor(this.x, this.y-1) == ("   "))){ //Movimento para a Esquerda
           

                        T2.setValor(this.x, this.y, "   ");
                        this.y--;
                        T2.setValor(this.x, this.y, "R A");
                        contador++;
            }

            else if ((numero[a] ==3) && (T2.getValor(this.x, this.y+1)== ("   "))){ //Movimento para a Direita
                  
                    T2.setValor(this.x, this.y, "   ");
                    this.y++;
                    T2.setValor(this.x, this.y, "R A");
                    contador++;
                }
            a++;   
        }
    } 
}