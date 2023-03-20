package Pattern;

public class ReverseRigthTriangle {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int a=1;a<=n-i;a++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
