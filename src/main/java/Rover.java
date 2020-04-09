public class Rover {

    protected String name;
    protected Planet planet;
    protected Position position;
    protected int move_to; // [0 => top ; 1 => bottom ; 2 => left ; 3 => right]

    public Rover(String name, Planet planet, Position position) {
        this.name = name;
        this.planet = planet;
        this.position = position;

        // Si la position de départ en X n'est pas dans les dimensions X de la Terre
        if(this.position.x > this.planet.maxX || this.position.x < this.planet.minX) {
            this.position.x = this.planet.minX;
        }

        // Si la position de départ en Y n'est pas dans les dimensions Y de la Terre
        if(this.position.y > this.planet.maxY || this.position.y < this.planet.minY) {
            this.position.y = this.planet.maxY;
        }

        this.move_to = 0;
    }

    public void forward() {
        this.move_to = 0;

        // On monte, donc Y += 1, on vérifie le maxY de la planète
        if(this.position.y < this.planet.maxY) {
            this.position.y += 1;
        }
    }

    public void back() {
        this.move_to = 1;

        // On descend, donc Y -= 1, on vérifie le minY de la planète
        if(this.position.y > this.planet.minY) {
            this.position.y -= 1;
        }
    }

    public void left() {
        this.move_to = 2;

        // On va à gauche, donc X -= 1, on vérifie le minX de la planète
        if(this.position.x > this.planet.minX) {
            this.position.x -= 1;
        }
    }

    public void right() {
        this.move_to = 3;

        // On va à droite, donc X += 1, on vérifie le maxX de la planète
        if(this.position.x < this.planet.maxX) {
            this.position.x += 1;
        }
    }

    @Override
    public String toString() {
        return "Rover{" +
                "name='" + this.name + '\'' +
                ", planet=" + this.planet +
                ", position=" + this.position +
                ", move_to=" + this.move_to +
                '}';
    }
}
