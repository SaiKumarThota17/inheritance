
class Plant {
    protected String name;
    protected String species;

    public Plant(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void photosynthesize() {
        System.out.println(name + " is photosynthesizing.");
    }

    public void absorbNutrients() {
        System.out.println(name + " is absorbing nutrients.");
    }

    public void grow() {
        System.out.println(name + " is growing.");
    }
}

class FloweringPlant extends Plant {
    public FloweringPlant(String name, String species) {
        super(name, species);
    }

    @Override
    public void grow() {
        System.out.println(name + " is growing and flowering."+species);
    }
}

class NonFloweringPlant extends Plant {
    public NonFloweringPlant(String name, String species) {
        super(name, species);
    }

    @Override
    public void grow() {
        System.out.println(name + " is growing but not flowering."+species);
    }
}

class FruitBearingPlant extends Plant {
    public FruitBearingPlant(String name, String species) {
        super(name, species);
    }

    @Override
    public void grow() {
        System.out.println(name + " is growing and bearing fruits."+species);
    }
}
public class Question09 {

	public static void main(String[] args) {
		FloweringPlant fp=new FloweringPlant("rose", "red");
					   fp.photosynthesize();
					   fp.absorbNutrients();
					   fp.grow();
					   System.out.println("-------------------------------------");
	  NonFloweringPlant fp1=new NonFloweringPlant("liverWorts", "red");
					   fp1.photosynthesize();
					   fp1.absorbNutrients();
					   fp1.grow();
					   System.out.println("-------------------------------------");
	 FruitBearingPlant fbp=new FruitBearingPlant("apple", "red");
					   fbp.photosynthesize();
					   fbp.absorbNutrients();
					   fbp.grow();
						
		

	}

}
