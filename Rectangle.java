class Rectangle{
//Instance Variables
private double[] bottomLeft;
private double length;
private double breadth;

//Constructors
public Rectangle(){
	//Null rectangle concept
	length = 1.0;
	breadth = 0.0;
	bottomLeft = new double[2];
	bottomLeft[0] = 0.0;
	bottomLeft[1] = 0.0;
}

public Rectangle(double length, double breadth,double bottomLeft[]){
	this.length = length;
	this.breadth = breadth;
	this.bottomLeft = new double[bottomLeft.length];
	for(int i = 0; i < bottomLeft.length; i++)
		this.bottomLeft[i] = bottomLeft[i];
}

public Rectangle(double length, double breadth){
	this.length = length;
	this.breadth = breadth;
	bottomLeft = new double[2];
	bottomLeft[0] = 0.0;
	bottomLeft[1] = 0.0;
}

//Methods
Rectangle intersectwith(Rectangle rect){
    if(this.bottomLeft[0] < rect.bottomLeft[0] + rect.length+rect.breadth  &&  this.bottomLeft[0]+this.length+this.breadth > rect.bottomLeft[0] && this.bottomLeft[1] < rect.bottomLeft[1] + rect.length +rect.breadth&& this.bottomLeft[1]+this.length+this.breadth > rect.bottomLeft[1]+rect.breadth){
			return new Rectangle(rect.length,rect.breadth,rect.bottomLeft);
	}else{
		double bottomLeft[] = new double[2];
		bottomLeft[0] = 0.0;
		bottomLeft[1] = 0.0;
		Rectangle obj = new Rectangle(0.0,0.0,bottomLeft);
		return obj;
	}
}

public double getPerimeter(){
	return 2*(length + breadth); 
}

public double getArea(){
	return length * breadth; 
}

public void setBreadth(double breadth){
	if (breadth>=0.0){
		this.breadth = breadth;
	}
}

public double getBreadth(){
	return breadth;
}



}