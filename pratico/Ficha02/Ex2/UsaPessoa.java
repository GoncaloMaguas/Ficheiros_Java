package ficha02ex2;


import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UsaPessoa 
{


    public UsaPessoa()
    {

    }

    public static void main(String[] args)throws IOException
    {
        Pessoa pessoa1;
        Pessoa pessoa2;
        
         Scanner B;
        B = new Scanner(System.in);

        System.out.println("Digite um nome de uma Pessoa: ");
        String Nome1;


        System.out.println("Que idade tem? ");
        int Idade1;

        char Genero1;
        System.out.println("Qual é o genero? ");


        B.close();
        
        
        String b, c;

       
                Nome1= JOptionPane.showInputDialog(null,"Nome da Pessoa:", JOptionPane.QUESTION_MESSAGE);
                b= JOptionPane.showInputDialog(null,"Genero da Pessoa:", JOptionPane.QUESTION_MESSAGE);
                c= JOptionPane.showInputDialog(null,"Idade da Pessoa", JOptionPane.QUESTION_MESSAGE);
                
               Genero1=b.charAt(0);
               Idade1=Integer.parseInt(c);
               
        pessoa1 = new Pessoa();
        pessoa1.setNome(Nome1);
        pessoa1.setGenero(Genero1);
        pessoa1.setIdade(Idade1);
        

        System.out.println ("Nome da PessoaA é " + pessoa1.getNome()
                            + ", é do sexo " + pessoa1.getGenero()
                            + ", tem " + pessoa1.getIdade() + "anos de idade.");


        Scanner A;
        A = new Scanner(System.in);

        System.out.println("Digite um nome de uma Pessoa: ");
        String Nome;


        System.out.println("Que idade tem? ");
        int Idade;


        char Genero;
        System.out.println("Qual é o genero? ");


        A.close();


                String g, h;
                
                
                Nome= JOptionPane.showInputDialog(null,"Nome da Pessoa:", JOptionPane.QUESTION_MESSAGE);
                g= JOptionPane.showInputDialog(null,"Genero da Pessoa:", JOptionPane.QUESTION_MESSAGE);
                h= JOptionPane.showInputDialog(null,"Idade da Pessoa", JOptionPane.QUESTION_MESSAGE);
                
               Genero=g.charAt(0);
               Idade =Integer.parseInt(h);
               
        pessoa2 = new Pessoa();
        pessoa2.setNome(Nome);
        pessoa2.setGenero(Genero);
        pessoa2.setIdade(Idade);

        System.out.println ("O nome da PessoaB é " + pessoa2.getNome()
                            + ", é do sexo " + pessoa2.getGenero()
                            + ", tem " + pessoa2.getIdade() + "  anos de idade.");

    }

}