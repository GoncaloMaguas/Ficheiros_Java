
package projeto_final_02;
 


public class RoboDireita extends Robo {
    int a=0;
        public void Movimentos(Labirinto T2)  //Movimentos para o robo da mao a direita
    {
        int contador=0;
        
        while (contador ==0){
  
            contador=0;

            a++;
            if (a<=19){
            if ((T2.getValor(this.x-1, this.y)==("   ") && (T2.getValor(this.x, this.y+2) ==("|+|") && (T2.getValor(this.x, this.y+1) ==("|+|"))))){ //movimento para baixo caso tenha duas paredes a direita
                    T2.setValor(this.x, this.y, "   ");
                    this.x--;
                    T2.setValor(this.x, this.y, "R D");
                    contador++;
                                       
        }
            else if ((T2.getValor(this.x, this.y-1)==("|+|") && (T2.getValor(this.x+1, this.y) ==("   ")))){ //moviment para cima
                    T2.setValor(this.x, this.y, "   ");
                    this.x++;
                    T2.setValor(this.x, this.y, "R D");
                    contador++;
                                  
            }
            
            
            else if ((T2.getValor(this.x+1, this.y)==("|+|") && (T2.getValor(this.x, this.y+1) ==("   ") ))){ //movimento para a direita
                    T2.setValor(this.x, this.y, "   ");
                    this.y++;
                    T2.setValor(this.x, this.y, "R D");
                    contador++;
                   
        
            }
            else if (((T2.getValor(this.x+1, this.y) ==("|+|") && (T2.getValor(this.x, this.y+1) ==("|+|"))))){ //movimento para baixo
                    T2.setValor(this.x, this.y, "   ");
                    this.x--;
                    T2.setValor(this.x, this.y, "R D");
                    contador++;
                                       
        }
            
            
            else if ((T2.getValor(this.x+1, this.y)==("   ") && (T2.getValor(this.x-1, this.y)==("   ") && (T2.getValor(this.x, this.y+1) ==("   "))))){ //movimento para a direita se o robo tiver o espaco em cima, baixo e direita livres.
                    T2.setValor(this.x, this.y, "   ");
                    this.y++;
                    T2.setValor(this.x, this.y, "R D");
                    contador++;
                                        
        }
                    }
            
            else if (a>19){ //criamos esta condiçao para que o robo executasse somente um movimento de cada vez
                
                    
                    if((T2.getValor(this.x+1, this.y)==("   "))){ //Robo vai para baixo
                        
                    T2.setValor(this.x, this.y, "   ");
                    this.x++;
                    T2.setValor(this.x, this.y, "R D");
                    contador++;
                    
            
                    }
                    
                    else if((T2.getValor(this.x+1, this.y)==("|+|"))){ //robo vai para a esquerda
                        
                    T2.setValor(this.x, this.y, "   ");
                    this.y--;
                    T2.setValor(this.x, this.y, "R D");
                    contador++;
                    }
            }
            
            
    }
    
        }
}
       
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

