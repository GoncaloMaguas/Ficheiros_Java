package projeto_final_02;


import java.util.Random;


public class Robomemoria extends Robo{
    
            int [] memoriaX= new int[1000];
        int [] memoriaY = new int[1000];
        int contador=0, a=1,b, c=0, d=0, e=0;
        int [] array= new int[1000];
        
    
    public void Movimentos(Labirinto T2) //metodo de movimentos para o robo de memoria
    {
        
        memoriaX[0]=1;
        memoriaY[0]=1;
        
        
        contador=0;
        while (contador ==0){
            Random movimento = new Random(); 

            b= movimento.nextInt(4);
            d=0;
            e=0;
            
            array[a]+=b;
  
            if ((array[a] ==0) && (T2.getValor(this.x+1, this.y)== ("   "))){ //Movimento para Baixo
                             
                while((d<memoriaX.length) && (d<memoriaY.length)){
                    
                    if ((memoriaX[d]== this.x+1) && (memoriaY[d]== this.y)){
                       
                        d++;
                        e++;
                        
                    }
                    else{
                        d++;
                    }
                }
                    
                

                    if(e==0){
                    T2.setValor(this.x, this.y, "   ");
                    this.x=x+1;
                    T2.setValor(this.x, this.y, "R M");
                    contador++;
                      memoriaX[a]+=this.x;// acrescenta o valor de x ao array memoriaX
                      memoriaY[a]+=this.y;// acrescenta o valor de x ao array memoriaX
                    }
                
                }
                        
                        
            
                        
                        
                    
            
                
            else if ((array[a] ==1) && (T2.getValor(this.x-1, this.y)== ("   "))){ //Movimento para Cima    
           
                                   
                while((d<memoriaX.length) && (d<memoriaY.length)){
                    
                    if ((memoriaX[d]== this.x-1) && (memoriaY[d]== this.y)){
                         
                        d++;
                        e++;
                        
                    }
                    else{
                        d++;
                    }
                }
                    
                

                    if(e==0){
                    T2.setValor(this.x, this.y, "   ");
                    this.x--;
                    T2.setValor(this.x, this.y, "R M");
                    contador++; 
                    memoriaX[a]+=this.x;
                    memoriaY[a]+=this.y;
                    }
                
                    
                }
            

                  
            else if ((array[a] ==2) && (T2.getValor(this.x, this.y-1) == ("   "))){ //Movimento para a Esquerda

                                                
                while((d<memoriaX.length) && (d<memoriaY.length)){
                    
                    if ((memoriaX[d]== this.x) && (memoriaY[d]== this.y-1)){
                          
                        d++;
                        e++;
                        
                    }
                    else{
                        d++;
                    }
                }
                    
                

                    if(e==0){
                        T2.setValor(this.x, this.y, "   ");
                        this.y--;
                        T2.setValor(this.x, this.y, "R M");
                        contador++;
                        memoriaX[a]+=this.x;
                        memoriaY[a]+=this.y;
                    }
                
                    
                }    
            

            else if ((array[a] ==3) && (T2.getValor(this.x, this.y+1)== ("   "))){ //Movimento para a Direita
                  
                                       
                while((d<memoriaX.length) && (d<memoriaY.length)){
                    
                    if ((memoriaX[d]== this.x) && (memoriaY[d]== this.y+1)){
                       
                        d++;
                        e++;
                        
                    }
                    else{
                        d++;
                    }
                }
                    
                

                    if(e==0){
                        T2.setValor(this.x, this.y, "   ");
                        this.y++;
                        T2.setValor(this.x, this.y, "R M");
                        contador++;
                        memoriaX[a]+=this.x;
                        memoriaY[a]+=this.y;
                        
                    }
                
                }
            
            
            else if ((T2.getValor(this.x+1, this.y) == ("|+|") && (T2.getValor(this.x, this.y+1) == ("|+|")) && (T2.getValor(this.x-1, this.y) == ("|+|")))){
                        T2.setValor(this.x, this.y, "   ");
                        this.x=3;
                        this.y=5;
                        T2.setValor(this.x, this.y, "R M");
                        contador++;
                        memoriaX[a]+=this.x;
                        memoriaY[a]+=this.y;
                
                
            }
            
            
            else if (((this.x)==1) && ((this.y)==3)){
                        T2.setValor(this.x, this.y, "   ");
                        this.x=3;
                        this.y=3;
                        T2.setValor(this.x, this.y, "R M");
                        contador++;
                        memoriaX[a]+=this.x;
                        memoriaY[a]+=this.y;
                
                
            }
            else if (((this.x)==8) && ((this.y)==4)){ 
                
                while((d<memoriaX.length) && (d<memoriaY.length)){
                    this.x=8;
                    this.y=5;
                    if ((memoriaX[d]== this.x) && (memoriaY[d]== this.y)){
                       
                        d=1000;
                       
                    this.x=8;
                    this.y=4;
                    T2.setValor(this.x, this.y, "   ");
                    this.x=3;
                    this.y=5;
                    T2.setValor(this.x, this.y, "R M");
                    contador++;
                      memoriaX[a]+=this.x;// acrescenta o valor de x ao array memoriaX
                      memoriaY[a]+=this.y;// acrescenta o valor de x ao array memoriaX
                      
                    }
                    else{
                  
                    this.x=8;
                    this.y=4;
                        d++;
                        
                    }
                }
                
                }
            
            
            else if (((this.x)==7) && ((this.y)==3)){ 
              
                while((d<memoriaX.length) && (d<memoriaY.length)){
                    this.x=6;
                    this.y=3;
                    if ((memoriaX[d]== this.x) && (memoriaY[d]== this.y)){
                       
                        d=1000;
                      
                    this.x=7;
                    this.y=3;
                    T2.setValor(this.x, this.y, "   ");
                    this.x=3;
                    this.y=5;
                    T2.setValor(this.x, this.y, "R M");
                    contador++;
                      memoriaX[a]+=this.x;// acrescenta o valor de x ao array memoriaX
                      memoriaY[a]+=this.y;// acrescenta o valor de x ao array memoriaX
                        
                    }
                    else{
                  
                    this.x=7;
                    this.y=3;
                        d++;
                      
                       
                        
                        
                    }
                }
                
                }
            //System.out.println("Tentativa: "+a+": X= "+memoriaX[a]+" , Y= "+memoriaY[a]);
            a++;
            
        }     
          c=0;
    /*while(c<memoriaX.length){
        
        System.out.println("Na posição: "+c+" o valor de X é: "+ memoriaX[c]+ " e o valor de Y é: " +memoriaY[c]);
        
        c++;
    }*/
    
    
}
}