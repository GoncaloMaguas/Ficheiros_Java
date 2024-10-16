
package ficha02;

import javax.swing.JOptionPane;

public class FazCalculos {
    
    public static void main(String[] args)
    {
        double a, b, c;
        String d, e, f;
        
        d= JOptionPane.showInputDialog(null,"Jogador 1: valor de X", JOptionPane.QUESTION_MESSAGE);
        e= JOptionPane.showInputDialog(null,"Jogador 1: valor de X", JOptionPane.QUESTION_MESSAGE);
        f= JOptionPane.showInputDialog(null,"Jogador 1: valor de X", JOptionPane.QUESTION_MESSAGE);
        
        a = Double.parseDouble(d);
        b = Double.parseDouble(e);
        c = Double.parseDouble(f);
        
        Calculadora calculadora = new Calculadora(); 
        System.out.println("Sum = " + calculadora.sum(a, b, c));
        System.out.println("Minus = " + calculadora.minus(5.2, 2.7, 1.2));
        System.out.println("Multiply = " + calculadora.multiply(a, b, c));
        System.out.println("Divide = " + calculadora.divide(5.2, 2.7, 1.2));
    }
    
    
}
