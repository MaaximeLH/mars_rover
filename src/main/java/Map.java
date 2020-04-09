public class Map {

    private Rover rover;

    public Map(Rover rover) {
        this.rover = rover;
    }

    private String getOrientation() {
        switch (this.rover.move_to) {
            case 1:
                return "V";
            case 2:
                return "<";
            case 3:
                return ">";
            default:
                return "∧";
        }
    }

    public final void show() {
        System.out.println(this.rover);

        for(int y = this.rover.planet.maxY; y >= this.rover.planet.minY; y--) {
            for(int x = this.rover.planet.minX; x <= this.rover.planet.maxX; x++) {
                if(this.rover.position.x == x && this.rover.position.y == y) {
                    System.out.print(this.getOrientation());
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
