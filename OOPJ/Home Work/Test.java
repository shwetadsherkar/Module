abstract class Shape 
{
    protected String shapeName; 

  
    public Shape(String shapeName)
	{
        this.shapeName = shapeName;
    }

    public String getShapeName() 
	{
        return shapeName;
    }

    public abstract double calculateArea();
}

class Circle extends Shape 
{
    private double radius; 

    
    public Circle(String shapeName, double radius) 
	{
        super(shapeName);
        this.radius = radius;
    }

    public double calculateArea()
	{
        return Math.PI * radius * radius; 
    }
}


class Rectangle extends Shape
        {
    private double length; 
    private double width;  

   
    public Rectangle(String shapeName, double length, double width) 
	{
        super(shapeName);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() 
	{
        return length * width; 
    }
}

class TestShape 
{
    public static void main(String[] args)
	{
        Shape circle = new Circle("Circle", 5.0);
        System.out.println("Shape: " + circle.getShapeName());
        System.out.println("Area: " + circle.calculateArea());

        Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        System.out.println("Shape: " + rectangle.getShapeName());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
