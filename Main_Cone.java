package poo_comeco;
public class Main_Cone {
	public static void main(String[] args) {
		
		Cone cone1 = new Cone(8, 6, 1);
		System.out.println(cone1);
		
		Cone cone2  = new Cone(8,6);
		cone2.setTipo_tinta(1);
		System.out.println(cone2);
		
		Cone cone3  = new Cone(8);
		cone3.setR(6);
		cone3.setTipo_tinta(1);
		System.out.println(cone3);
		
		Cone cone4  = new Cone();
		cone4.setZ(8);
		cone4.setR(6);
		cone4.setTipo_tinta(1);
		System.out.println(cone4);
	}	
}