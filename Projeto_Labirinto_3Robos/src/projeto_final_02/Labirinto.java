
package projeto_final_02;


public class Labirinto {
    
    

        protected int x, y;
        protected String imagem, tab;
        protected String [][] tabuleiro= new String [10][10];
    
        
    
    public void setValor(int x, int y, String valor) //insere a String na posição X Y
    {
        this.tabuleiro[x][y] = valor;
    }
    
    //Getters
    public String getValor(int x, int y) //recebe o conteudo daposiçao X Y
    {
        return this.tabuleiro[x][y];
    }
    
    
        public void Tabuleiro(){ //Criação do labirinto
   
            
            for (int j =0; j<tabuleiro.length; j++) {
                for (int i = 0; i<tabuleiro.length; i++) {
                    this.tabuleiro[j][i]=("   ");
                   if(i<19){
                       
                        this.tabuleiro[j][0]=("|+|");

                    }
                   
                       if(i<19){
                        this.tabuleiro[0][i]=("|+|");

                       }
                       
                       
                      if(i<19){
                        this.tabuleiro[9][i]=("|+|");

                       }
                      
                      if(i<19){
                        this.tabuleiro[j][9]=("|+|");

                       }
                      
                     
                      
                      this.tabuleiro[9][7]=("   ");
                      this.tabuleiro[1][2]=("|+|");
                      this.tabuleiro[2][2]=("|+|");
                      this.tabuleiro[3][2]=("|+|");
                      this.tabuleiro[4][2]=("|+|");
                      this.tabuleiro[5][2]=("|+|");
                      this.tabuleiro[6][2]=("|+|");
                      this.tabuleiro[7][2]=("|+|");
                      this.tabuleiro[7][4]=("|+|");
                      this.tabuleiro[6][4]=("|+|");
                      this.tabuleiro[5][4]=("|+|");
                      this.tabuleiro[4][4]=("|+|");
                      this.tabuleiro[2][4]=("|+|");
                      this.tabuleiro[8][6]=("|+|");
                      this.tabuleiro[7][6]=("|+|");
                      this.tabuleiro[6][6]=("|+|");
                      this.tabuleiro[7][7]=("|+|");
                      this.tabuleiro[6][7]=("|+|");
                      this.tabuleiro[5][7]=("|+|");
                      this.tabuleiro[4][7]=("|+|");
                      this.tabuleiro[4][6]=("|+|");
                      this.tabuleiro[5][6]=("|+|");
                      this.tabuleiro[2][8]=("|+|");
                      this.tabuleiro[2][7]=("|+|");
                      this.tabuleiro[1][4]=("|+|");
                      this.tabuleiro[2][6]=("|+|");
                }
            }
        }
        
        public void mostra () //mostrar o labirinto ja criado
    {
        for (int j =0; j<tabuleiro.length; j++)
        {
            for (int i = 0; i<tabuleiro.length; i++)
            {
                if (i%20==0)
                {
                        System.out.print("");
                        
                }
                System.out.print(this.tabuleiro[j][i]);
            }
            System.out.println("");
        }
    }
}