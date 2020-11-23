package pac;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入a");
			Scanner sc = new Scanner(System.in);
			String user_str = sc.nextLine();
			if (!user_str.equals("a")) {
				System.out.println("您输入的不是a，请重新输入");
				continue;
			}
			int x = (int) (Math.random() * 100);
			int y = (int) (Math.random() * 100);
			System.out.println("生成的随机坐标是：" + "(" + x + "," + y + ")");
		}
	}
}
