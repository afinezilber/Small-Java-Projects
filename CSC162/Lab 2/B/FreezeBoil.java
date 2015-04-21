/* Allon Finezilber
   CSC-162
   Lab 2B */


public class FreezeBoil
{
    private double tempature;
    private boolean ethylF, oxygenF, waterF;
    private boolean ethylB, oxygenB, waterB;

	// Default constructor
	// Postcondition sets tempature to 0
    public FreezeBoil()
    {
        setTempature(0);
    }

	// Overloaded constructor
	// Postcondition: sets tempature with a value
    public FreezeBoil(double tempature)
    {
        setTempature(tempature);
    }

	// Mutator method for tempature
    public void setTempature(double tempature)
    {
        this.tempature = tempature;
    }

	// Accessor method for tempature
    public double getTempature()
    {
        return tempature;
    }

	// Boolean methods determining if substances freeze or boil
	// at a certain tempature degree
    public boolean isEthylFreezing(double tempature)
    {
        if(tempature <= -173)
            ethylF = true;
        else
            ethylF = false;

        return ethylF;

    }

    public boolean isEthylBoiling(double tempature)
    {
        if(tempature >= 172)
            ethylB = true;
        else
            ethylB = false;

        return ethylB;

    }

    public boolean isOxygenFreezing(double tempature)
    {
        if(tempature <= -362)
            oxygenF = true;
        else
            oxygenF = false;

        return oxygenF;

    }

    public boolean isOxygenBoiling(double tempature)
    {
        if(tempature >= -306)
            oxygenB = true;
        else
            oxygenB = false;

        return oxygenB;

    }

    public boolean isWaterFreezing(double tempature)
    {
        if(tempature <= 32)
            waterF = true;
        else
            waterF = false;

        return waterF;

    }

    public boolean isWaterBoiling(double tempature)
    {
        if(tempature >= 212)
            waterB = true;
        else
            waterB = false;

        return waterB;

    }
}




