package br.unicentro.acaddecomp;

public class TesteGen {
	public static void main (String args[]){
		Gen<Integer, Double> idob;
		idob = new Gen<Integer, Double>(88, 2.05);
		idob.showType();
		int t = idob.getob1();
		double v = idob.getob2();
		System.out.println("Valor:" + t);
		System.out.println("Valor:" + v);
	}
}
