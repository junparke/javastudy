package ex01_one_dim;

public class Ex03_advanced_for {
	
		public static void ex01() {
			
			int[]scores = {50, 90, 60, 100, 80};
			
			int  total =  0; 
			int  max = 0;
			int min = 100;
			for(int n : scores) {  				//향상 for 문 배열에서만 사용가능한것
				total += n;
				if(max < n) {
					max =n;
				}
				if(min >n) {
					min = n;
				}
				
			}
					System.out.println(total);
					System.out.println(max);
					System.out.println(min);
			
			
			
		}
		public static void ex02() {
			
			String[] files = {"hellp.txt", "hi.txt", "안녕.txt"};
			for(String file : files) {        //배열안에거 하나씩 보겠다는 뜻, file 로 저장
				System.out.println(file);
			}
			
		}
		
		public static void ex03() {
			
			int[] a = new int [5];
			for(int ai:a ) {
				System.out.println(ai);
			}
			
		}
		
		
		
	
	
	public static void main(String[] args) {
		ex03();

	}

}
