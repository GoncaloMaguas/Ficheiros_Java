package projeto_final_02;

public class Robo {
    
    
    int x, y;
    String imagem;

        public void setX(int x){  //implementa o X
            this.x = x;  
        }
    
        
        public void setY(int y){ //implementa o Y
            this.y = y;
        }
        
        public void setImagem(String imagem){ //implemennta o nome dado ao robo
            this.imagem=imagem;
        }
        
        public int getX(){ //mostra o X
            return this.x;
        }
        
        public int getY(){ //mostra o Y
            return this.y;
        }
                
        public String getImagem(){ //mostra o nome dado ao robo
            return imagem;
        }
    
}

    

