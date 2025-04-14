package controller;
import model.circulo;
import model.retangulo;
public class main {

	public static void main(String[] args) {
		
		retangulo rt = new retangulo("preto", 1, 2, 10.5, 9.5);
		System.out.println("RETÂNGULO");
		rt.SouQuem();
		System.out.println(rt.area());
		System.out.println(rt.perimetro());
		
		System.out.println("");
		
		circulo cc = new circulo(10.5, "rosa", 1, 2);
		System.out.println("CIRCULO");
		cc.SouQuem();
		System.out.println(cc.area());
		System.out.println(cc.perimetro());
		
	}
}
