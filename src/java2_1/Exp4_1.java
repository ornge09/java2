package java2_1;

public class Exp4_1 {

	public static void main(String[] args) {
		
		int month = 9;
		
		if(month <= 0 || month >= 13) {
			
			System.out.println("無効な月です");
			System.out.println("終了");
			return;
			
		}
		
		switch(month) {
		
		case 3,4,5 -> System.out.println("入力された" + month + "月は春です。桜の季節です。");
		
		case 6,7,8 -> System.out.println("入力された" + month + "月は夏です。桜の季節です。");
		
		case 9,10,11 -> System.out.println("入力された" + month + "月は秋です。桜の季節です。");
		
		case 12,1,2 -> System.out.println("入力された" + month + "月は冬です。桜の季節です。");
		
		default -> System.out.println("ハルキゲニア");
		
		}

	}

}
