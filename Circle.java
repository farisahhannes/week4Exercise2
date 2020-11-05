package SemuaCircle.CircleKecil;	

public class Circle{
	//field or attribute
	private double jejari, x; //non-static field
	public static int bilObjekWujud = 0; //static field


	//default constructor
	public Circle(){
		//System.out.println("Call default constructor ");
		jejari = 1;
		x = 5;
		bilObjekWujud++;
	}


	// overloading constructor - 1 parameter
	public Circle(double jejari){
		// this();	//call default constructor 
		this.jejari = jejari;
		x = 5;
		// this.x = x;
		// this(jejari, 59); //call constructor 2 parameter
		bilObjekWujud++;
		// System.out.println("Jejari = " + jejari  );
	}

	//overloading constructor - 2 parameter
	public Circle(double jejari, double x){
		this.jejari = jejari;
		this.x = x;
		bilObjekWujud++;
		//System.out.println("Jejari = " + jejari + " String = " + n );
	}







	//overload method toString() //ni method
	public String toString(){
		String tentangCircle;
		tentangCircle = "Bil objek ialah " + bilObjekWujud;
		// tentangCircle =  "Jejari = " + jejari + "\nx=" + x + 
		// "\nLuas adalah " + KiraLuas();
		return tentangCircle;
	}

	//setter
	public void setJejari(double jejari){
		this.jejari = jejari;
		System.out.println(jejari);
	}

	//getter
	//takyah buat this.jejari cuz nnty lmbat(?)
	public double getJejari(){
		return jejari;
	}

	//method
	public double KiraLuas(){
		return getJejari() * getJejari() * Math.PI;
	}

	public static double UkurLilit (double j){
		return 2 * Math.PI *  j ;
	}

	
}