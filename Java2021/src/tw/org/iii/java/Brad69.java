package tw.org.iii.java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.org.iii.myclass.Bike;

public class Brad69 {

	public static void main(String[] args) {
		// 物件解序列化
		try {
			FileInputStream fin = new FileInputStream("dir1/s1.brad");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Object obj = oin.readObject();
			fin.close();
			System.out.println("Read OK");
			
			if ( obj instanceof Bike) {
				System.out.println("Bike");
			}else if (obj instanceof Student) {
				System.out.println("Student");
			}else {
				System.out.println("....");
			}
			
			Student s1 = (Student)obj;
			System.out.println(s1.score());
			System.out.println(s1.avg());
			System.out.println("----");
			System.out.println(s1.getScooterSpeed());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
