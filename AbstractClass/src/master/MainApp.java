package master;

import childs.Item;
import parents.Product;

public class MainApp {
	//Product product1 = new Product(); Tidak bisa karena abstract
	Product product2 = new Item(); //Cara buat Objectnya adalah melalui childnya

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ini nyoba-nyoba aja buat git");
	}

}
