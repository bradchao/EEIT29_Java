package tw.org.iii.java;

public class MyTest {

	public static void main(String[] args) {
		for(int k=0;k<2;k++) {
			for(int j=1;j<=9;j++) {
				for(int i=1;i<=5;i++) {
					int newi=i+k*4;
					int r=newi*j;
					System.out.println(String.format("%d*%d=%d\t", newi,j,r));
				}
				
			}		
		}
	}

}
