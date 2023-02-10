package GenericClass;



public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); // Powder(대입된 자료형) 으로 GenericPrinter 클래스(제네릭 자료형) 생성.

		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		powderPrinter.printing();

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>(); // Plastic형으로 GenericPrinter 클래스 생성.

		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		plasticPrinter.printing();

	}

}
