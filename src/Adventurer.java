package src;

public class Adventurer {
    // Coordonnée x et y de l'aventurier
    private int x;
    private int y;

    // Constructor, j'initialise l'aventurier avec les coordonées de départ
    public Adventurer(int startX, int startY) {
        // Coordonnées x et y de départ
        this.x = startX;
        this.y = startY;
        System.out.println("Aventurier initialisé à la position (" + x + ", " + y + ").");
    }

    // Méthode pour obtenir la coordonées x actuelle
    public int getX() {
        return x;
    }

    // Méthode pour obtenir la coordonées y actuelle
    public int getY() {
        return y;
    }

    // Méthode pour déplacer l'aventurier
    public void move(char direction, Forest forest) {
        int newX = x;
        int newY = y;

        // Change les coodonnées selon la direction du mouvements
        switch (direction) {
            case 'N': newY--; break; // => N, y décrémente
            case 'S': newY++; break; // => S, y incrémente
            case 'E': newX++; break; // => E, x incrémente
            case 'O': newX--; break; // => O, x décrémente
        }

        // Vérifie si déplacement possible
        if (forest.canMove(newX, newY)) {
            x = newX; // => Met à jour coordonées x
            y = newY; // => Met à jour coordonées y
            System.out.println("Déplacement vers " + direction + ". Nouvelle position : (" + x + ", " + y + ").");
        } else {
            System.out.println("Déplacement vers " + direction + " impossible. Position actuelle : (" + x + ", " + y + ").");
        }

        // Affiche carte avec nouvelle position
        forest.printMap(x, y);
        System.out.println();
    }
}
