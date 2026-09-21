package com.jtc.Hackerearth;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Shopping{
	
	String Product;
	int price;
	int quant;
	
	public Shopping(String product, int price, int quant) {
		super();
		Product = product;
		this.price = price;
		this.quant = quant;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	@Override
	public String toString() {
		return "Shopping [Product=" + Product + ", price=" + price + ", quant=" + quant + "]";
	}
}

public class FunctionalInterface {

	public static void main(String[] args) {
		
		
		ArrayList<Shopping>Data=new ArrayList<>();
		
		Data.add(new Shopping("Watches",2500,5));
		Data.add(new Shopping("Goggles",5500,15));
		Data.add(new Shopping("Mouse",1500,25));
		Data.add(new Shopping("Keyboard",3500,15));
		Data.add(new Shopping("AR Set",7500,35));
		
		
	System.out.println("Updating price of specific\n");
	
	BiConsumer<Shopping,Integer>Res=(prodname,price)->{
		if(prodname.getProduct().equals("Watches")) {
			prodname.setPrice(price);
		}
	};
	
	
	for(Shopping d:Data) {
		Res.accept(d,3500);
	}
	
	for(Shopping result:Data) {
		System.out.println(result.getProduct()+"-"+result.getPrice());
	}
	
	System.out.println("Updating specific prodname to another\n");
	
	BiConsumer<Shopping,String>Result=(prodname,newprod)->{
		
		if(prodname.getProduct().equals("Mouse")) {
			prodname.setProduct(newprod);
		}
	};
	
	for(Shopping d:Data) {
		Result.accept(d,"Shades");
	}
	
	
	for(Shopping result:Data) {
		System.out.println(result.getProduct()+"-"+result.getPrice());
	}
	
	
	
	
	

	}
}
