package starbuzz_with_sizes.types;

public abstract class Beverage {
    public enum Size { LARGE, MEDIUM, SMALL };
    Size size = Size.LARGE;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return size;
    }
    public abstract double cost();

}
