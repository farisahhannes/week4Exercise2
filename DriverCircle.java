import SemuaCircle.CircleKecil.Circle;	//import specific class from package

public class DriverCircle{

	public static void main(String[] args){
		Circle bulat = new Circle();	//instantiate object
		System.out.println("Print apa? " + bulat);

		Circle bulat1 = new Circle(76);	//instantiate object - 1 parameter
		System.out.println("Print apa? " + bulat1);

		Circle bulat2 = new Circle(8, 3);
		System.out.println("Print apa? " + bulat2);

		Circle bulat3 = new Circle(8, 3);
		System.out.println("Print apa? " + bulat3);

		System.out.println("Ukur lilit = " + UkurLilit(bulat3.getJejari()));
		
		System.out.println("Ukur lilit = " + Circle.UkurLilit(bulat3.getJejari()));

		System.out.println("Luas ialah " + KiraLuas(bulat2));

		//Method call
		System.out.println("Papar menunjukkan " + Papar());

		

	}


//method static tht return a reference(object)
	public static Circle Papar(){
		int j = 5;
		return new Circle(j); //create object
	}

	//call reference static method tht accept as its parameter
	public static double KiraLuas(Circle b){
		return b.getJejari() * b.getJejari() * Math.PI;
	}

	public static double UkurLilit (double jejari){
		return 2 * Math.PI *  jejari ;	//Math.pow(3);
	}

}