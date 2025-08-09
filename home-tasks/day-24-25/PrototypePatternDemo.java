interface Plant extends Cloneable {
    Plant grow();
    String getGrowthType();
    void setGrowthType(String type);
    Plant clone();
}
class Creeper implements Plant {
    private String growthType;
    public Creeper(String growthType) {
        this.growthType = growthType;
    }
    @Override
    public Plant grow() {
        System.out.println("Creeper is growing in " + growthType + " style.");
        return this;
    }
    @Override
    public String getGrowthType() {return growthType;}
    @Override
    public void setGrowthType(String type) {
        this.growthType = type;
    }
    @Override
    public Plant clone() {
        try {
            return (Plant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported");
        }
    }
}

class Shrub implements Plant {
    private String growthType;

    public Shrub(String growthType) {
        this.growthType = growthType;
    }
    @Override
    public Plant grow() {
        System.out.println("Shrub is growing in " + growthType + " style.");
        return this;
    }
    @Override
    public String getGrowthType() {
        return growthType;
    }
    @Override
    public void setGrowthType(String type) {
        this.growthType = type;
    }
    @Override
    public Plant clone() {
        try {
            return (Plant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported");
        }
    }
}

public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Original objects
        Creeper creeper1 = new Creeper("climbing");
        Shrub shrub1 = new Shrub("bushy");

        // Cloning
        Creeper creeper2 = (Creeper) creeper1.clone();
        Shrub shrub2 = (Shrub) shrub1.clone();

        // Testing growth
        creeper1.grow();
        shrub1.grow();

        creeper2.setGrowthType("spreading");
        shrub2.setGrowthType("compact");

        creeper2.grow();
        shrub2.grow();
    }
}









