package TDA;

public class Rectangulo {
	private float base;
	private float altura;
	public Rectangulo() {}
	public Rectangulo(float base, float altura) {
		this.base=base;
		this.altura=altura;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura +", area = "+ AreaRectangulo() +", perimetro = "+PerimetroRectangulo()+"]";
	}
	public float AreaRectangulo() {
		return (base*altura);
	}
	public float PerimetroRectangulo() {
		return ((base*altura)*2);
	}
	public static String AreaCubierta(Rectangulo salon, Rectangulo alf1, Rectangulo alf2) {
		String a="";
		if ((alf1.AreaRectangulo()+alf2.AreaRectangulo())-salon.AreaRectangulo()==salon.AreaRectangulo()) 
			a="Toda el area esta cubierta";
		else 
			a="El area cubierta es= "+(alf1.AreaRectangulo()+alf2.AreaRectangulo())+
				"\nEl area descubierta es= "+(salon.AreaRectangulo()-(alf1.AreaRectangulo()+alf2.AreaRectangulo()));
		return a;
	}
}
