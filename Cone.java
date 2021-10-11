package poo_comeco;

public class Cone {
	private float z = 0;
	private float r = 0;
	private int tipo_tinta = 0;
	
	public Cone() {
		setZ(z);
		setR(r);
		setTipo_tinta(tipo_tinta);
		g();
		area_base();
		area_lateral();
		area_total();
		litros();
		latas();
		preco_total();
	}
	
	public Cone(float z) {
		setZ(z);
		setR(r);
		setTipo_tinta(tipo_tinta);
		g();
		area_base();
		area_lateral();
		area_total();
		litros();
		latas();
		preco_total();
	}
	
	public Cone(float z, float r) {
		setZ(z);
		setR(r);
		setTipo_tinta(tipo_tinta);
		g();
		area_base();
		area_lateral();
		area_total();
		litros();
		latas();
		preco_total();
	}
	
	public Cone(float z, float r, int tipo_tinta) {
		setZ(z);
		setR(r);
		setTipo_tinta(tipo_tinta);
		g();
		area_base();
		area_lateral();
		area_total();
		litros();
		latas();
		preco_total();
	}
	
	public float getZ() {
		return z;
	}
	
	public void setZ(float z) {
		if (z > 0)	
			this.z = z;
	}
	
	public float getR() {
		return r;
	}
	
	public void setR(float r) {
		if (r > 0)
			this.r = r;
	}
	
	public int getTipo_tinta() {
		return tipo_tinta;
	}
	
	public void setTipo_tinta(int tipo_tinta) {
		if (tipo_tinta > 0 && tipo_tinta < 4)
			this.tipo_tinta = tipo_tinta;
	}
	
	public float g() {
		return (float)(Math.sqrt((z * z) + (r * r)));
	}
	
	public float area_base() {
		return (float)(3.14 * (r * r));
	}
	
	public float area_lateral() {
		return (float)(3.14 * r * g());
	}
	
	public float area_total() {
		return (float)(3.14 * r * (r + g()));
	}

	public float litros() {
		return (float)(3.45 * area_total());
	}
	
	public int latas() {
		return (int)((litros() / 18) + 1);
	}
	
	public float preco_total() {
		if (tipo_tinta == 1)
			return (float)(latas() * 238.90);
		else if (tipo_tinta == 2) 
			return (float)(latas() * 467.98); 
		else
			return (float)(latas() * 758.34);
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [Altura: ");
		builder.append(z);
		builder.append(", Raio: ");
		builder.append(r);
		builder.append(", Tinta: ");
		builder.append(tipo_tinta);
		builder.append(", Geratriz(): ");
		builder.append(g());
		builder.append(", Área do fundo(): ");
		builder.append(area_base());
		builder.append(", Área lateral(): ");
		builder.append(area_lateral());
		builder.append(", Área total(): ");
		builder.append(area_total());
		builder.append(", Litros(): ");
		builder.append(litros());
		builder.append(", Latas(): ");
		builder.append(latas());
		builder.append(", Preço total(): ");
		builder.append(preco_total());
		builder.append("]");
		return builder.toString();
	}
}