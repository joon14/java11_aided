package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Food {
	private String name;
	private int kcal;
	
	public Food() {}
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
}
public class Test6 {
	public static void main(String[] args) {
		boolean sw = true;
		List<Food> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(sw) {
			System.out.println("\n=== 음식 메뉴 리스트 ===");
			System.out.println("1. 음식 추가");
			System.out.println("2. 음식 정보");
			System.out.println("3. 음식 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.print("\n번호 선택 : ");
			
			int job = sc.nextInt();
			sc.nextLine();
			
			switch(job) {
				case 1:
					Food f = new Food();
					
					System.out.print("추가할 음식 입력 : ");
					f.setName(sc.nextLine());
					System.out.print("칼로리 입력 : ");
					f.setKcal(sc.nextInt());
					list.add(f);
					System.out.println("음식 정보가 추가 되었습니다.");
					break;
				case 2:
					for(int i = 0; i<list.size(); i++) {
						f = list.get(i);
						System.out.println(f.toString());
					}
					break;
				case 3:
					System.out.println("*** 입력된 음식 리스트 ***");
					for(int i = 0; i<list.size(); i++) {
						f = list.get(i);
						System.out.println(f.getName());
					}
					System.out.println("********************");
					
					System.out.print("삭제하고 싶은 음식 선택 : ");
					String name = sc.nextLine();
	
					for(int i = 0; i<list.size(); i++) {
						f = list.get(i);
						if(f.getName().equals(name)) {
							System.out.println(f.toString()+"가 삭제되었습니다.");
							list.remove(i);
						}
					}
					break;
				case 4:
					sw = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못된 선택입니다. 다시 입력해주세요.");	
			}
		}
	}
}
