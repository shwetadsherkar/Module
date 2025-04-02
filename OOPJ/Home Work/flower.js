
class Flower 
{
    String name;
    String color;
    boolean hasFragrance;

    
    Flower(String name, String color, boolean hasFragrance)
	{
        this.name = name;
        this.color = color;
        this.hasFragrance = hasFragrance;
    }

    void displayDetails()
	{
        System.out.println("Flower Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Has Fragrance: " + (hasFragrance ? "Yes" : "No"));
    }
}


class Rose extends Flower 
{
    boolean hasThorns;

    
    Rose(String color, boolean hasFragrance, boolean hasThorns)
	{
        super("Rose", color, hasFragrance);
        this.hasThorns = hasThorns;
    }

    void displayDetails() 
	{
        super.displayDetails();
        System.out.println("Has Thorns: " + (hasThorns ? "Yes" : "No"));
    }
}


class Lily extends Flower 
{
    boolean isWaterPlant;

    
    Lily(String color, boolean hasFragrance, boolean isWaterPlant) 
	{
        super("Lily", color, hasFragrance);
        this.isWaterPlant = isWaterPlant;
    }
    void displayDetails() 
	{
        super.displayDetails();
        System.out.println("Grows in Water: " + (isWaterPlant ? "Yes" : "No"));
    }
}

public class FlowerDetails 
{
    public static void main(String[] args)
	{
   
        Rose rose = new Rose("Red", true, true);
        Lily lily = new Lily("White", true, true);

        
        System.out.println("---- Rose Details ----");
        rose.displayDetails();

        
        System.out.println("\n---- Lily Details ----");
        lily.displayDetails();
    }
}
