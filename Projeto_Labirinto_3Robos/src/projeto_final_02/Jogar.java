
package projeto_final_02;

import java.util.concurrent.TimeUnit;

public class Jogar {
    
    
            public static void main(String[] args) throws InterruptedException {
            
                Labirinto t1= new Labirinto();
                RoboAleatorio R1 = new RoboAleatorio();
                RoboDireita R2 = new RoboDireita();
                Robomemoria R3 = new Robomemoria();
                
             
                R1.setX(1); // Posicao inicial do X do R1
                R1.setY(1); // Posicao inicial do Y do R1
                t1.Tabuleiro(); // Cria o labirinto
                int i, e, z, cont=1, counter = 1, contador=1;
                
                t1.setValor(R1.getX(), R1.getY(), "R A");//Implementa o valor no labirinto
                
                t1.mostra();//Mostra o labirinto
               
                for(i = 0; i < 1000; i++) //Inicio do Robo Aleatorio
                {
                   
                    System.out.println("\n Movimento numero: "+ contador );
                    R1.Movimentos(t1);
                    
                    System.out.println("");
                  
                    t1.mostra();
                      
                    if (t1.getValor(9,7)=="R A"){
                        System.out.println("O Robo Aleatorio chegou ao fim com sucesso com "+contador+" Movimentos");
                        i=20000; 
                        contador--;
                    }
                    contador++;
                    
                    
                    TimeUnit.SECONDS.sleep(0); 
                    
                    
                } //Fim do robo Aleatorio

                
                if (i==1000){
                    System.out.println("Não conseguiu terminar o labirinto com: " + i + " movimentos");
                    contador--;
                }
                
            
                t1.setValor(R1.getX(), R1.getY(), "   "); //Substitui a string "R A" por "   "
                
                
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("ROBO MAO DIREITA A COMECAR:");
                System.out.println("");
                

                R2.setX(1);// Posicao inicial do X do R2
                R2.setY(1);// Posicao inicial do Y do R2
              
                 t1.setValor(R2.getX(), R2.getY(), "R D");
                 t1.mostra();
                 
                for(i = 0; i < 30; i++) //Inicio do robo mao a direita
                {
                   
                    System.out.println("\n Movimento numero: "+ counter );
                    R2.Movimentos(t1);
                    
                    t1.mostra();
                    System.out.println("");
                  
                    
              
                    
                    
                    if (t1.getValor(9,7)=="R D"){
                        System.out.println("O Robo Mão a Direita chegou ao fim com sucesso com "+counter+" Movimentos");
                        i=20000;
                        counter--;
                        
                    }
                    counter++;
                    
                    
                    TimeUnit.SECONDS.sleep(0); 
                    
                    
                } //Fim do robo mao a direita
                
                
                t1.setValor(R2.getX(), R2.getY(), "   "); //Substitui a string "R D" por "   "

                
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("ROBO MEMORIA A COMECAR:");
                System.out.println("");
                
                

                cont=1;
                R3.setX(1); //Posicao inicial do X do R3
                R3.setY(1); //Posicao inicial do Y do R3 
                t1.Tabuleiro();
                t1.setValor(R3.getX(), R3.getY(), "R M");
                t1.mostra();
                for(i = 0; i < 1000; i++) //memoria
                {
                   
                    System.out.println("\n Movimento numero: "+ cont );
                    R3.Movimentos(t1);
                    
                    t1.mostra();
                    System.out.println("");
                  
                    
              
                    

                    if (t1.getValor(9,7)=="R M"){
                        System.out.println("O robo chegou ao fim com sucesso com "+cont+" Movimentos");
                        i=20000;
                        cont--;
                        
                    }
                    
                    
                    TimeUnit.SECONDS.sleep(0); 
                    cont++;
                }
                
                
                System.out.println("");
                
                                System.out.println("O Robo Aleatorio acabou com: "+ contador +" movimentos, o Robo Mao a Direita acabou com: "+ counter + " movimentos e o Robo da Memoria acabou com: "+ cont +" movimentos");
            }       
}