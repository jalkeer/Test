package com.nttdata.csx.abstra.ex;


class Dog extends Animal {

//	@Override
	public void makeNoice() {
		// TODO Auto-generated method stub
		
	}




}


class Cat extends Animal {

	@Override
	public void makeNoice() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
}


public class AbstratEX {
	
	public static void main(String[] args) {
		
		Dog d= new Dog();
		//d.makeNoice();
	d.sleep(1);
		d.eat("DOG");
		
		//new Cat().makeNoice();
		
	}
}