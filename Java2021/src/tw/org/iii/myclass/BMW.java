package tw.org.iii.myclass;

public class BMW extends Car {
	// 1. Java中所有類別都有建構式
	// 2. 如果沒有定義建構式 => 編譯器 Compiler 將會以super class中沒有參數的建構式為唯一建構式
	// 3. 所有物件建構初始化之前, 祖宗八代都要先存在 => 有爸爸才有兒子
	// 4. 如果有定義任何建構式 => 此時不再有 2. 這件事情
	
	public BMW() {
		super(3);
		System.out.println("BMW()");
	}
}
