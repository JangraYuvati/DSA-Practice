package oops;

class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(int x, int y){
        if(y>=0){
            System.out.println(x + "+" + y + "i");
        }
        else{
            System.out.println(x + " - " +(-y) + "i");
        }
    }
    void add(ComplexNumber z){
        this.x += z.x;
        this.y += z.y;
    }
    void multiply(ComplexNumber z){
        int newX = this.x * z.x - this.y * z.y;
        int newY = this.x * z.y + this.y * z.x;
        this.x = newX;
        this.y = newY;
    }
    void divide(ComplexNumber z){
        int denominator = z.x * z.x + z.y * z.y;
        int newX = (this.x * z.x + this.y * z.y) / denominator;
        int newY = (this.y * z.x - this.x * z.y) / denominator;
        this.x = newX;
        this.y = newY;
    }

}
class Program56 {
public static void main(String args[]){
    ComplexNumber c1 = new ComplexNumber(10, 20);
    ComplexNumber c2 = new ComplexNumber(30, 40);
    c1.print(4,-5);
    c2.print(30,40);
    c1.add(c2);
    c1.print(c1.x, c1.y);

    c1.multiply(c2);
    c1.print(c1.x, c1.y);
    c1.divide(c2);
    c1.print(c1.x, c1.y);
}
}