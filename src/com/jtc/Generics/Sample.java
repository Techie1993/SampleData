package com.jtc.Generics;


class SampData<T>{
	
	private T Info;

	public T getInfo() {
		return Info;
	}

	public void setInfo(T info) {
		Info = info;
	}

	@Override
	public String toString() {
		return "SampData [Info=" + Info + "]";
	}
	
	<T> int Display(int num) {
		return num * num;
	}
}

public class Sample {

	public static void main(String[] args) {
	
		SampData<Integer>Res=new SampData<Integer>();
		Res.setInfo(14);
		System.out.println(Res.getInfo());
		System.out.println(Res.Display(14));
			
	}
}
