public class Complex{
	private int x,y;
	public Complex(int real,int img){
		x = real;
		y = img;
	}
	Complex addition(Complex C1)
    {
        
        int real = C1.x + this.x;
        int img = C1.y + this.y;
		return new Complex(real,img);
    }
	Complex subtraction(Complex C1)
    {
        
        int real = this.x - C1.x;
        int img = this.y - C1.y;
		return new Complex(real,img);
    }
	Complex multiplication(Complex C1){
		
		int real = (this.x * C1.x) - (this.y * C1.y);
        int img = (this.x * C1.y) + (this.y * C1.x); 
        return new Complex(real,img);
	}
	void display()
    {
        System.out.println("Complex number: "
                           + x + " + "
                           + "i("+ y +")");
    }
	
}