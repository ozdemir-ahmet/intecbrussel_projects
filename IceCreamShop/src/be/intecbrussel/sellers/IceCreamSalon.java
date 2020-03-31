package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller{
    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon () {

    }

    public IceCreamSalon (PriceList priceList) {
        this.priceList = priceList;
    }
    
    @Override
    public double getProfit () {
        return this.totalProfit;
    }

    @Override
    public Cone orderCone (Flavor [] balls) {
        Cone cone = new Cone(balls);
        double profit = balls.length * this.priceList.getBallPrice();
        this.totalProfit += profit;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket () {
        IceRocket iceRocket = new IceRocket();
        double profit = this.priceList.getRocketPrice();
        this.totalProfit += profit;
        return  iceRocket;
    }

    @Override
    public Magnum orderMagnum (MagnumType type) {
        Magnum magnum = new Magnum(type);
        double profit = this.priceList.getMagnumPrice(type);
        this.totalProfit += profit;
        return magnum;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
