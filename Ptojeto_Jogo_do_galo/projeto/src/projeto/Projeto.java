package projeto;

import java.lang.ArrayIndexOutOfBoundsException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


        
public class Projeto {


    public static void main(String[] args) {
        
        int a, y, count2, count;
        String b, x, d, e;
        d="O";
        e="X";
        String [][] tabuleiro= new String [3][3];
        
        count=0;
        
        tabuleiro[0][0]="-";
        tabuleiro[0][1]="-";
        tabuleiro[0][2]="-";
        tabuleiro[1][0]="-";
        tabuleiro[1][1]="-";
        tabuleiro[1][2]="-";
        tabuleiro[2][0]="-";
        tabuleiro[2][1]="-";
        tabuleiro[2][2]="-";
                                                                        

        
          while (count<5){
              
                b= JOptionPane.showInputDialog(null,"Jogador 1: valor de X", JOptionPane.QUESTION_MESSAGE);
                a = Integer.parseInt(b);
                
                x= JOptionPane.showInputDialog(null,"Jogador 1: valor de Y", JOptionPane.QUESTION_MESSAGE);
                y = Integer.parseInt(x);
               
                tabuleiro[a][y]= d;
                System.out.println(); //para espaçar as tabelas do jogo
                

            for (String[] tabuleiro1 : tabuleiro) {   //pesquisamos na net o erro que aparecia e apareceu nos esta sugestao
                for (int j = 0; j<tabuleiro.length; j++) {
                    System.out.print(tabuleiro1[j] + " ");
                    if (j==2){
                        System.out.println();
                    }
                }
            }
                count++;
                
                
                
                
                
                count2=0;
                
                if(tabuleiro[0][0]==d && tabuleiro[0][1]==d && (tabuleiro[0][2])==d )
                {
                    System.out.print("ganhaste Jogador1");
                    count=10;
                    count2=10;
                } 
                
                 if(tabuleiro[2][0]==d &&(tabuleiro[2][1])==d && (tabuleiro[2][2])==d )
                 {                   
                        System.out.print("ganhaste Jogador1");
                        count=10;
                        count2=10;
                 }
                 
                if(tabuleiro[1][0]==d && (tabuleiro[1][1])==d && (tabuleiro[1][2])==d )
                {
                    System.out.print("ganhaste Jogador1");
                    count=10;
                    count2=10;
                } 
                                 
                if(tabuleiro[0][0]==d && (tabuleiro[1][1])==d && (tabuleiro[2][2])==d )
                {
                    System.out.print("ganhaste Jogador1");
                    count=10;
                    count2=10;
                } 
                                                 
                if(tabuleiro[0][2]==d && tabuleiro[1][1]==d &&(tabuleiro[2][0])==d )
                {
                    System.out.print("ganhaste Jogador1");
                    count=10;
                    count2=10;
                } 
                                                                 
                if(tabuleiro[1][0]==d && (tabuleiro[0][0])==d && (tabuleiro[2][0])==d )
                {
                    System.out.print("ganhaste Jogador1");
                    count=10;
                    count2=10;
                } 
                
                if(tabuleiro[0][1]==d && (tabuleiro[1][1])==d && (tabuleiro[2][1])==d )
                {
                    System.out.print("ganhaste Jogador1");
                    count=10;
                    count2=10;
                } 
                                
                if(tabuleiro[0][2]==d && (tabuleiro[1][2])==d && (tabuleiro[2][2])==d )
                {
                    System.out.print("ganhaste Joador1");
                    count=10;
                    count2=10;
                } 
                
                
                 
              
              if (count==5)
              {
                  count2=10;
              }
                            System.out.println();
          while(count2<1){
              

                b= JOptionPane.showInputDialog(null,"Jogador 2: valor de X", JOptionPane.QUESTION_MESSAGE);
                
                a = Integer.parseInt(b);
                
                x= JOptionPane.showInputDialog(null,"Jogador 2: valor de Y", JOptionPane.QUESTION_MESSAGE);
                y = Integer.parseInt(x);
                
                count2++;
                tabuleiro[a][y]= e;
                
                  for (String[] tabuleiro1 : tabuleiro) {
                      for (int j = 0; j<tabuleiro.length; j++) {
                          System.out.print(tabuleiro1[j] + " ");
                          if (j==2){
                              System.out.println();
                          }
                      }
                  }
                
                
                if(tabuleiro[0][0]==e && (tabuleiro[0][1])==e && (tabuleiro[0][2])==e )
                {
                    System.out.print("ganhaste Jogador2");
                    count=10;
                    count2=10;
                } 
                
                 if(tabuleiro[2][0]== e && (tabuleiro[2][1])== e && (tabuleiro[2][2])==e )
                 {                   
                        System.out.print("ganhaste Jogador2");
                        count=10;
                        count2=10;
                 }
                 
                if(tabuleiro[1][0]==e && (tabuleiro[1][1])==e && (tabuleiro[1][2])==e )
                {
                    System.out.print("ganhaste Jogador2");
                    count=10;
                    count2=10;
                } 
                                 
                if(tabuleiro[0][0]== e && (tabuleiro[1][1])==e && (tabuleiro[2][2])==e )
                {
                    System.out.print("ganhaste Jogador2");
                    count=10;
                    count2=10;
                } 
                                                 
                if(tabuleiro[0][2]==e && (tabuleiro[1][1])==e && (tabuleiro[2][0])==e )
                {
                    System.out.print("ganhaste Jogador2");
                    count=10;
                    count2=10;
                } 
                                                                 
                if(tabuleiro[1][0]==e && (tabuleiro[0][0])==e && (tabuleiro[2][0])==e )
                {
                    System.out.print("ganhaste Jogador2");
                    count=10;
                    count2=10;
                } 
                
                if(tabuleiro[0][1]== e && (tabuleiro[1][1])==e && (tabuleiro[2][1])==e )
                {
                    System.out.print("ganhaste Jogador2");
                    count=10;
                    count2=10;
                } 
                                
                if(tabuleiro[0][2]==e && (tabuleiro[1][2])==e && (tabuleiro[2][2])==e )
                {
                    System.out.print("ganhaste Joador2");
                    count=10;
                    count2=10;
                } 
                
               
        }

        System.out.print("");
        }
          if (count==5){
              System.out.print("Empate");
                }
}
}