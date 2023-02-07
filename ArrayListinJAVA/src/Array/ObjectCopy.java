package Array;

public class ObjectCopy {
//객체 배열을 복사하기. student클래스 이용. 
	public static void main(String[] args) {
		Student[] arr1=new Student[3];
		Student[] arr2=new Student[3];
		Student[] arr3=new Student[3];
		
		arr1[0]=new Student("James ");
		arr1[1]=new Student("Tomas ");
		arr1[2]=new Student("Edward ");
		System.arraycopy(arr1,0,arr2,0,3); //얕은 복사. arr2에서 따로 인스턴스를 생성하지 않아도 정상적으로 작동->
		//arr1과 arr2가 같은 인스턴스 주소를 저장하고 있기 때문에 복사 후 arr1의 변경 내용이 arr2에도 적용됨
		System.out.println("얕은 복사 ");
		for(int i=0;i<arr2.length;i++) arr2[i].showInfo();
		
		arr3[0]=new Student(); //깊은 복사. 인스턴스를 미리 생성후 복사 
		arr3[1]=new Student();
		arr3[2]=new Student();
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i].setName(arr1[i].getName());
			arr3[i].setId(arr1[i].getId());
		}
		
		arr1[0].setName("Jenny"); //arr1 요소 일부 변경 
		System.out.println("깊은 복사 ");
		for(int i=0;i<arr1.length;i++) arr1[i].showInfo();
		for(int i=0;i<arr3.length;i++) arr3[i].showInfo();
		

	}

}