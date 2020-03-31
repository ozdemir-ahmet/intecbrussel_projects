package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller{
	private PriceList priceList;
	private Stock stock;
	private double profit;
	
	public IceCreamCar () {
		
	}
	
	public IceCreamCar (PriceList priceList, Stock stock) {
		this.priceList = priceList;
		this.stock = stock;
	}

	@Override
	public double getProfit() {
		return this.profit;
	}

	@Override
	public Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException{
		//if not enough stock we have to throw an exception
		if (this.stock.getBalls() >= balls.length ) {
			if (this.stock.getCones() > 0) {
				return prepareCone(balls);
			} else {
				throw new NoMoreIceCreamException("No more Cones");
			}
		} else {
			throw new NoMoreIceCreamException ("Not enough balls");
		}
	}
	
	private Cone prepareCone (Flavor[] balls) {
		Cone cone = new Cone(balls);
        double profit = balls.length * this.priceList.getBallPrice();
        this.profit += profit;
        return cone;
	}

	@Override
	public IceRocket orderIceRocket() {
		if (this.stock.getIceRockets() > 0) {
			return prepareRocket ();
		}else {
			throw new NoMoreIceCreamException("No more IceRocket");
		}
	}
	
	private IceRocket prepareRocket () {
		IceRocket iceRocket = new IceRocket();
		double profit = this.priceList.getRocketPrice();
	    this.profit += profit;
	    return iceRocket;
	}

	@Override
	public Magnum orderMagnum(MagnumType type) {
		if (this.stock.getMagni() > 0) {
			return prepareMagnum (type);
		} else {
			throw new NoMoreIceCreamException("No more Magnum");
		}
	}
	
	private Magnum prepareMagnum (MagnumType type) {
		Magnum magnum = new Magnum();
		double profit = this.priceList.getMagnumPrice(type);
	    this.profit += profit;
	    return magnum;
	}
	
}
