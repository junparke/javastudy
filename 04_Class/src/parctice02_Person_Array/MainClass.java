package parctice02_Person_Array;

public class MainClass {
	public static void ex01() {
		String[] nameLisst = {"정숙", "상철", "미희"};
		int[] ageList = {20, 30, 40};
		
		
		Person[] arr = new Person[3];
		
		for(int i = 0; i < arr.length; i++) {   //집을 만들었다
			arr[i] = new Person();   // 아무것도 없는 빈 집 사람
			arr[i].setName(nameLisst[i]);    //이름 넣어주기 배열에 순차적으로 하나씩
			arr[i].setAge(ageList[i]);
			System.out.println("이름 : " + arr[i].getName()  + ", 나이: " + arr[i].getAge());   //확인 할때 getname 바꾸고 싶을때 setnmae						
		}	
		
	}
	public static void ex02() {
		
		String[] nameList = {"정숙", "상철", "미희"};
		int[] ageList = {20, 30, 40};
		
		Person[] arr =new Person[3];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = new Person(nameList[i], ageList[i]);
			System.out.println("이름 : "+ arr[i].getName() + " 나이 : " + arr[i].getAge());
		}
		
		
	}
	public static void ex03() {
		
		String[] nameList = {"정숙", "상철", "미희"};
		int[] ageList = {20, 30, 40};
		Home home = new Home(3);
		
		for(int i = 1; i < home.getArr().length; i++) {
			home.getArr()[i] = new Person(nameList[i], ageList[i]);
			System.out.println("이름 :" + home.getArr()[i].getName() + "나이 : "+ home.getArr()[i].getAge());
		}
		
		
		
	}
	public static void main(String[] args) {
		ex03();
		
}
}
