import java.util.*;
public class Gift {
    public static void main(String[] args) {
        String Sweets[]= {"Jilebi","Gulabjam"};
        String Chocolate[]= {"Milkybar","Perk"};
        String Candies[]= {"Gems","Hersheys"};

        Random r=new Random();
        int x=r.nextInt(11);
        double totalweight1=0;
        double totalweight2=0;
        System.out.println("Gift1 Items...............");
        Jilebi obj1=new Jilebi();
        obj1.setweight(2*x);
        totalweight1+=obj1.getweight();
        Gulabjam obj2=new Gulabjam();
        obj2.setweight(3*x);
        totalweight1+=obj2.getweight();
        Milkybar obj3=new Milkybar();
        obj3.setweight(4*x);
        totalweight1+=obj3.getweight();
        Perk obj4=new Perk();
        obj4.setweight(5*x);
        totalweight1+=obj4.getweight();
        Milkybar obj5=new Milkybar();
        obj5.setweight(4*x);
        totalweight2+=obj5.getweight();
        Perk obj6=new Perk();
        obj6.setweight(5*x);
        totalweight2+=obj6.getweight();
        Gems obj7=new Gems();
        obj7.setweight(2*x);
        totalweight2+=obj7.getweight();
        Hersheys obj8=new Hersheys();
        obj8.setweight(2*x);
        totalweight2+=obj8.getweight();
        System.out.println("Jilebi\nGulabjam\nMilkybar\nPerk");
        System.out.println("Total weight of Gift1 is "+totalweight1+"\n");
        System.out.println("Gift2 Items...............");
        System.out.println("Milkybar\nPerk\nGems\nHersheys");
        System.out.println("Total weight of Gift1 is "+totalweight2+"\n");
        System.out.println("Gifts Based on Sorting");
        if(totalweight1<totalweight2) {
            System.out.println("Gift1  :  "+totalweight1);
            System.out.println("Gift2  :  "+totalweight2);
        }
        else {
            System.out.println("Gift2  :  "+totalweight2);
            System.out.println("Gift1  :  "+totalweight1);
        }

    }
}