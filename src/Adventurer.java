package src;

public class Adventurer {

    private int x;
    private int y;

    // Constructor, j'initialise l'aventurier avec les coordonées de départ
    public Adventurer(int startX, int startY) {
    
        this.x = startX;
        this.y = startY;
        System.out.println("Aventurier initialisé à la position (" + x + ", " + y + ").");
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Méthode pour déplacer l'aventurier
    public void move(char direction, Forest forest) {
        int newX = x;
        int newY = y;

  
        switch (direction) {
            case 'N': newY--; break;
            case 'S': newY++; break; 
            case 'E': newX++; break; 
            case 'O': newX--; break; 
        }

        // Vérifie si déplacement possible
        if (forest.canMove(newX, newY)) {
            x = newX; 
            y = newY; 
            System.out.println("Déplacement vers " + direction + ". Nouvelle position : (" + x + ", " + y + ").");
        } else {
            System.out.println("Déplacement vers " + direction + " impossible. Position actuelle : (" + x + ", " + y + ").");
        }

        // Affiche carte avec nouvelle position
        forest.printMap(x, y);
        System.out.println();
    }
}
