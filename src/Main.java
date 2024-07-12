
package src; 

public class Main {
    public static void main(String[] args) {
        // Vérifie que 2 arguments soit passé coordonnées initiales et mouvements)
        if (args.length != 2) {
            System.out.println("Usage: javac -d bin src/*.java <initialCoordinates> <movements>");
            System.out.println("Example: java -cp bin src.Main 3,0 SSSSEEEEEENN");
            System.out.println("Example: java -cp bin src.Main 6,9 OONOOOSSO");
            return;
        }
        
        String initialCoordinates = args[0];
        
        String movements = args[1];
        
        String[] coordinates = initialCoordinates.split(",");
    
        int startX = Integer.parseInt(coordinates[0]);
   
        int startY = Integer.parseInt(coordinates[1]);

        // Création d'un aventurier => coordonnées initiales
        Adventurer adventurer = new Adventurer(startX, startY);
        
        // Création de la forêt
        Forest forest = new Forest();

   
        for (char move : movements.toCharArray()) {
            // Déplace l'aventurier
            adventurer.move(move, forest);
        }

        // Affichage de la position finale de l'aventurier
        System.out.println("Position finale : (" + adventurer.getX() + ", " + adventurer.getY() + ")");
    }
}
