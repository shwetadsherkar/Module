class BMW 
{
    
    public void showDetails() 
	{
        System.out.println("This is a BMW vehicle.");
    }

   
    public void maxSpeed() 
	{
        System.out.println("Speed varies by model.");
    }
}


class BMWSeries3 extends BMW
{
   
    public void showDetails()
	{
        System.out.println("This is a BMW Series 3.");
    }

    public void maxSpeed()
	{
        System.out.println("Maximum Speed: 240 km/h.");
    }
}


class BMWSeries5 extends BMW 
{
    
    public void showDetails()
	{
        System.out.println("This is a BMW Series 5.");
    }

    public void maxSpeed()
	{
        System.out.println("Maximum Speed: 260 km/h.");
    }
}

class BMWSeries7 extends BMW 
{
    
    public void showDetails()
	{
        System.out.println("This is a BMW Series 7.");
    }

    
    public void maxSpeed()
                                                                        
    {
        System.out.println("Maximum Speed: 300 km/h.");
    }
}

class TestBMW 
{
    public static void main(String[] args) 
	{
        BMW[] vehicles = new BMW[3];

        vehicles[0] = new BMWSeries3();
        vehicles[1] = new BMWSeries5();
        vehicles[2] = new BMWSeries7();

        for (BMW vehicle : vehicles)
		{
            vehicle.showDetails();
            vehicle.maxSpeed();
            System.out.println(); 
        }
    }
}
