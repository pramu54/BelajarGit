package childs;

import parents.Product;

public class Item extends Product{
	private int price;
	
	public Item() {
		
	}

	public Item(String name, int price) {
		super(name);
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	//Implementasi Method Abstract pada Child Class supaya menjadi bentuk konkret dan jelas.
	@Override
	public void printInformation() {
		// TODO Auto-generated method stub
		System.out.println("Product Name : " + getName());
		System.out.println("Product Price : " + getPrice());
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
