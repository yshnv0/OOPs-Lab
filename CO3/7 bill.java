import java.util.Scanner;



public class bill implements outline{
	int id,quantity,unit,total;
	String  name;
	
	bill(){
		System.out.println("\nEnter the item id");
		id=s.nextInt();
		s.nextLine();
		System.out.println("\nEnter the item name");
		name=s.nextLine();
		System.out.println("\nEnter the item quantity");
		quantity=s.nextInt();
		System.out.println("\nEnter the item unit price");
		unit=s.nextInt();
		s.nextLine();
		total=unit*quantity;
		
	}
	public void prepareBill(){
		
		System.out.format("%10d %10s %10d %10d %10d",id,name,quantity,unit,total);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch=1;
		int n=5,i=0,net=0;
		bill newbill[]=new bill[n];
		while(ch==1 && i<n ){
			System.out.println("Ttem "+(i+1));
			newbill[i]=new bill();
			i++;
			System.out.println("Enter 1 to add more items");
			ch=s.nextInt();
		}
		System.out.printf("%10s %10s %10s %10s %10s","PRODUCT ID", "NAME", "QUANTITY", "UNIT PRIZE", "TOTAL");
		System.out.println();
		for(int z=0;z<55;z++){
			System.out.print("-");
		}
		System.out.println();
		for(int j=0;j<i;j++){
			newbill[j].prepareBill();
			System.out.println();
		}
		for(int z=0;z<55;z++){
			System.out.print("-");
		}
		System.out.println();
		for(int j=0;j<i;j++){
			net+=newbill[j].total;
		}
		System.out.println("Net Amount :"+net);
	}

}

interface outline{
	Scanner s=new Scanner(System.in);
	void prepareBill();
	
}
