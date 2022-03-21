import java.util.Scanner;

public class product {
	int pcode,price;
	String pname=new String();
	product(int a,String b,int c){
		pcode=a;
		pname=b;
		price=c;
		
	}
	
	void display(){
			System.out.println("CODE: "+pcode);
			System.out.println("Name: "+pname);
			System.out.println("Price: "+price);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the product code ");
		int a1=s.nextInt();
		s.nextLine();
		System.out.println("Enter the product name ");
		String b1=s.nextLine();
		System.out.println("Enter the product price ");
		int c1=s.nextInt();
		product obj1=new product(a1,b1,c1);
		
		System.out.println("Enter the product code ");
		int a2=s.nextInt();
		s.nextLine();
		System.out.println("Enter the product name ");
		String b2=s.nextLine();
		System.out.println("Enter the product price ");
		int c2=s.nextInt();
		product obj2=new product(a2,b2,c2);
		
		System.out.println("Enter the product code ");
		int a3=s.nextInt();
		s.nextLine();
		System.out.println("Enter the product name ");
		String b3=s.nextLine();
		System.out.println("Enter the product price ");
		int c3=s.nextInt();
		product obj3=new product(a3,b3,c3);
		System.out.println("First Object");
		obj1.display();
		System.out.println("Second Object");
		obj2.display();
		System.out.println("Third Object");
		obj3.display();
		
		if(obj1.price > obj2.price && obj1.price > obj3.price){
				System.out.println("First obj has highest price");
		}
		
		if(obj2.price > obj1.price && obj2.price > obj3.price){
			System.out.println("Second obj has highest price");
	}
		
		if(obj3.price > obj1.price && obj3.price > obj2.price){
			System.out.println("Third obj has highest price");
	}
		
	}

}
