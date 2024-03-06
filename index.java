class Circle{
	int radius;
	int calculateArea(){
		return Math.PI*radius*radius;
	}
	int calculatePerimeter(){
		return 2*Math.PI*radius;
	}
}
class Rectangle{
	int length;
	int width;
	int calculateArea(){
		return length*width;
	}
	int calculatePerimeter{
		return 2*(length+width);
	}
}
class BankAccount{
	double balance = 0;
	String name;
	void deposit(double amount){
		balance = amount + balance;
	}
	void withdraw(double amount){
		balance = balance - amount;
	}
	void showBalance(){
		System.out.println("Your current balance = " +balance;
	}
}
class RectAngle{
	String color
	private int length;
	private int width;
	void setLength(int length){
		if(length>0){
		this.length = length;
		}
		else{
			this.length = 0;
		}
	}
	void setWidth(int width){
		if(width>0){
		this.width = width
		}
		else{
			this.width = 0;
		}
	}
	int getLength(){
		return length;
	}
	int getWidth(){
		return width;
	}
	int calculateArea(){
		return getLength()*getWidth();
	}
	int calculatePerimeter{
		return 2*(getLength()+getWidth());
	}	
}

		