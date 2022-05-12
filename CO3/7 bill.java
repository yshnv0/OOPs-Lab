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
		
		
	}
	public void prepareBill(){
		System.out.println("PRODUCT ID\t NAME\t\tQUANTITY\tUNIT PRIZE\tTOTAL");
		System.out.println(id+"\t\t "+name+"\t\t  "+quantity+"\t\t  "+unit+"\t\t"+(unit*quantity)+"\n");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch=1;
		int n=5,i=0;
		bill newbill[]=new bill[n];
		while(ch==1 && i<n ){
			System.out.println("Ttem 1");
			newbill[i]=new bill();
			i++;
			System.out.println("Enter 1 to add more items");
			ch=s.nextInt();
		}
		
		for(int j=0;j<i;j++){
			newbill[j].prepareBill();
		}
	}

}

interface outline{
	Scanner s=new Scanner(System.in);
	void prepareBill();
	
}
