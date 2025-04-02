
interface Photosynthesis 
{
    void absorbSunlight(); 
}
interface Respiration
{
    void releaseOxygen(); 
}

class Plant implements Photosynthesis, Respiration 
{
    private String plantName; 

    public Plant(String plantName)
	{
        this.plantName = plantName;
    }

    public String getPlantName()
	{
        return plantName;
    }

    
    public void absorbSunlight()
	{
        System.out.println("Plant is absorbing sunlight for photosynthesis.");
    }

    
    public void releaseOxygen()
	{
        System.out.println("Plant is releasing oxygen through respiration.");
    }
}


class TestPlant
 {
    public static void main(String[] args) 
	{
        Plant mangoTree = new Plant("Mango Tree");
        Plant fern = new Plant("Fern");

        System.out.println("Plant Name: " + mangoTree.getPlantName());
        mangoTree.absorbSunlight();
        mangoTree.releaseOxygen();

        System.out.println("\nPlant Name: " + fern.getPlantName());
        fern.absorbSunlight();
        fern.releaseOxygen();
    }
}
