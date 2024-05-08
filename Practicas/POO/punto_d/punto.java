package punto_d;

public class punto {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprimir() {
        System.out.println(x+" ,"+y);

    }
    public void setXY(int x, int y){
        this.x = x;
        this.y =y;
    }
    public void desplaça(int distx, int disty){
    x= distx+x;
    y= disty+y;
    }
    public double distancia (punto P){
        double potenciaX, potenciaY;


        potenciaX =  Math.pow(this.x - P.x , 2);
        potenciaY =  Math.pow(this.y - P.y, 2);


        double raiz =Math.sqrt(potenciaX + potenciaY);

        return raiz;
    }

    }






