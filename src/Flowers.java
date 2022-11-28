public class Flowers {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    Flowers(String flowerColor, String country, double cost, int lifeSpan) {
        this.country = country;
        this.flowerColor = flowerColor;
        this.cost = cost;
        this.lifeSpan=lifeSpan;


    }

    public String getFlowerColor() {
        return this.flowerColor;
    }

    public String getCountry() {
        return this.country;
    }

    public double getCost() {
        return this.cost;
    }
    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        }
   else {
       flowerColor="white";
        }
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
        this.country = country;
    }
        else {
        country="Russia";
        }
    }

    public void setCost(double cost) {
        if ((cost != 0) && (cost <0) ) {
        this.cost = cost;
    }
    else{
        cost=1;
        }
    }

    public String toString (){

        if ((lifeSpan<=0)&& (lifeSpan%1==0)){
            lifeSpan =3;
        } else this.lifeSpan = lifeSpan;
        return flowerColor+"   "+country+"   "+cost+"   "+lifeSpan;
    }

}

