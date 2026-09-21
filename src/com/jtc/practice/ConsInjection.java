package com.jtc.practice;


class Engine{
	
	public void Start() {
		System.out.println("Engine is Started!");
	}
}


class Cars{
	
	private  Engine engine;

	public Cars(Engine engine) {
		super();
		this.engine = engine;
	}
	
	
	public void Drive() {
		engine.Start();
		System.out.println("Car is Started");
	}
}



public class ConsInjection {

	public static void main(String[] args) {
		
		
		Engine Eng=new Engine();
		
		Cars C1=new Cars(Eng);
		C1.Drive();
		
	
	}
}
