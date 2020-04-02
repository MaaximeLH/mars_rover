public class Rover extends Earth {

    private String name;
    private Position position;
    private int to; // 1 = en haut ; 2 = en bas ; 3 = à gauche ; 4 = à droite

    public Rover(String name, int to, Position position) {
        this.name = name;
        this.position = position;
        this.to = to;
    }

    public void goForward() {
        this.to = 1;
        move();
    }

    public void goBack() {
        this.to = 2;
        move();
    }

    public void goLeft() {
        this.to = 3;
        move();
    }

    public void goRight() {
        this.to = 4;
        move();
    }

    public void move() {
        // On monte, donc Y += 1, on vérifie le maxY de la planète
        if(this.to == 1 && this.position.y < this.maxY) {
            this.position.y += 1;
            System.out.println(this.name + " a avancé.");
        }

        // On descend, donc Y -= 1, on vérifie le minY de la planète
        else if(this.to == 2 && this.position.y > this.minY) {
            this.position.y -= 1;
            System.out.println(this.name + " a reculé.");
        }

        // On va à gauche, donc X -= 1, on vérifie le minX de la planète
        else if(this.to == 3 && this.position.x > this.minX) {
            this.position.x -= 1;
            System.out.println(this.name + " est allé à gauche.");
        }

        // On va à droite, donc X += 1, on vérifie le maxX de la planète
        else if(this.to == 4 && this.position.x < this.maxX) {
            this.position.x += 1;
            System.out.println(this.name + " est allé à droite.");
        }

        // Si on ne peut pas réaliser l'action
        else {
            System.out.println(this.name + " ne peut pas réaliser cette action.");
        }

        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.name + " : position X : " + this.position.x + " ; position Y : " + this.position.y;
    }
}