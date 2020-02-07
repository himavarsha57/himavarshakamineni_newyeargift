public class Candies {
    double weight;
}
class Gems extends Candies{
    public void setweight(double w){
        weight=w;
    }
    public double getweight(){
        System.out.println("weight:"+weight);
        return weight;
    }

}
class Hersheys extends Candies{
    public void setweight(double w){
        weight=w;
    }
      public double getweight(){
        System.out.println("weight:"+weight);
        return weight;
      }

}
