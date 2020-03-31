package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList () {

    }

    public PriceList (double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public void setBallPrice (double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice (double rocketPrice){
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice (double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice () {
        return this.ballPrice;
    }

    public double getRocketPrice () {
        return this.rocketPrice;
    }

    public double getMagnumPrice (MagnumType type) {
        double magnumPrice = this.magnumStandardPrice;
        switch (type) {
            case MILKCHOCOLATE:
                magnumPrice = this.magnumStandardPrice;
            case WHITECHOCOLATE:
                magnumPrice = this.magnumStandardPrice * 1.25;
            case BLACKCHOCOLATE:
                magnumPrice = this.magnumStandardPrice * 1.25;
            case ALPINENUTS:
                magnumPrice = this.magnumStandardPrice * 1.5;
            case ROMANTICSTRAWBERRIES:
                magnumPrice = this.magnumStandardPrice * 1.5;
        }
        return magnumPrice;
    }
}
