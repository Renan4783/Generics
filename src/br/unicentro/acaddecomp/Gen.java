package br.unicentro.acaddecomp;

public class Gen<T, V> {

	T ob1;
	V ob2;
	
	public Gen (T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}
	
	public T getob1(){
		return ob1;
	}
	
	public V getob2(){
		return ob2;
	}
	
	public void showType(){
		System.out.println("Tipo de T:" + ob1.getClass().getName());
		System.out.println("Tipo de V:" + ob2.getClass().getName());
	}
}
