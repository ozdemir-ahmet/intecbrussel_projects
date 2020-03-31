package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {

	public static void main(String[] args) {
		try {
			PriceList priceList = new PriceList(1.5, 2.5, 3.0);
			Stock stock = new Stock(1, 1, 3, 1);
	        IceCreamSeller iceCreamCar = new IceCreamCar(priceList, stock);
	        
	        Flavor [] balls = {Flavor.BANANA , Flavor.CHOCOLATE, Flavor.LEMON};
	        Cone cone = iceCreamCar.orderCone(balls);
	        Magnum magnum = iceCreamCar.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES);
	        IceRocket iceRocket = iceCreamCar.orderIceRocket();
	        
	        Eatable [] icecreams = {cone, magnum, iceRocket};
	        
	        cone.eat();
	        magnum.eat();
	        iceRocket.eat();
	        
	        System.out.println("Total profit is: " + iceCreamCar.getProfit() + " Euros");
		} catch (NoMoreIceCreamException nmice) {
			System.out.println(nmice.getMessage());
		}
	}

}
