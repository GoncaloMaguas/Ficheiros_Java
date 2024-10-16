package arrays;

import java.lang.ArrayIndexOutOfBoundsException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


        
public class Arrays {


    public static void main(String[] args) {
        
        int a, y, d, count2, count;
        String b, x, e;
        d=3;
        count2=0;
        
        int [][] tabuleiro= new int [3][3];
        
        count=0;
          while (count<7){
              
                b= JOptionPane.showInputDialog(null,"valor de X", JOptionPane.QUESTION_MESSAGE);
                
                a = Integer.parseInt(b);
                
                x= JOptionPane.showInputDialog(null,"valor de Y", JOptionPane.QUESTION_MESSAGE);
                y = Integer.parseInt(x);
                

                
                tabuleiro[a][y]= d;
                System.out.print(tabuleiro[a][y]+"--");
                count++;
                
                if (count==2 || count==5){
                    System.out.println();
                }
                
                if(tabuleiro[0][0]==(tabuleiro[0][1])){
                    System.out.print("ganhaste");
                    count=10;
                    count2=10;
              
          } 
                
                
              
              
              
           count2=0;
          while(count2<1){
              

                b= JOptionPane.showInputDialog(null,"valor de X2", JOptionPane.QUESTION_MESSAGE);
                
                a = Integer.parseInt(b);
                
                x= JOptionPane.showInputDialog(null,"valor de Y2", JOptionPane.QUESTION_MESSAGE);
                y = Integer.parseInt(x);
                count2++;
                tabuleiro[a][y]= d;
                System.out.print(tabuleiro[a][y]);
        }
        System.out.print("");
        }
      
    }
}    
