public class Planet {

    protected int minX;
    protected int minY;

    protected int maxX;
    protected int maxY;

    public Planet() {
        this.minX = 0;
        this.minY = 0;

        this.maxX = 8;
        this.maxY = 8;
    }

    public Planet(int minX, int minY, int maxX, int maxY) {
        this.minX = minX;
        this.minY = minY;

        this.maxX = maxX;
        this.maxY = maxY;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "minX=" + minX +
                ", minY=" + minY +
                ", maxX=" + maxX +
                ", maxY=" + maxY +
                '}';
    }
}
