public class Lizard extends Pet
{

    private String species;

    public Lizard (String name, String species, int age, double weight)
    {
        super (name,age,weight);
        this.species = species;

    }

    public String toString()
    {
       String  output = super.toString() + "\nspecies: " + species;
        return output;
    }//end toString with call to Super

}//end class Lizard which is Pet
