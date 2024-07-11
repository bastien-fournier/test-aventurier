// Déclaration de la classe à partir du fichier src
package src; 

public class Index {
    public static void main(String[] args) {
        // Vérifie que 2 arguments soit passé coordonnées initiales et mouvements)
        if (args.length != 2) {
            System.out.println("Usage: java -cp bin src.Index <initialCoordinates> <movements>");
            System.out.println("Example: java -cp bin src.Index 3,0 SSSSEEEEEENN");
            System.out.println("Example: java -cp bin src.Index 6,9 OONOOOSSO");
            return;
        }
        // Premier argument
        String initialCoordinates = args[0];
        // Second argument
        String movements = args[1];
        // Séparation des coordonnées en x et y
        String[] coordinates = initialCoordinates.split(",");
        // Conertit x en nombre
        int startX = Integer.parseInt(coordinates[0]);
        // Convertit y en nombre
        int startY = Integer.parseInt(coordinates[1]);

        // Création d'un aventurier => coordonnées initiales
        Adventurer adventurer = new Adventurer(startX, startY);
        // Création de la forêt
        Forest forest = new Forest();

        // Chaque mouvement dans la chaîne de mouvements
        for (char move : movements.toCharArray()) {
            // Déplace l'aventurier
            adventurer.move(move, forest);
        }

        // Affichage de la position finale de l'aventurier
        System.out.println("Position finale : (" + adventurer.getX() + ", " + adventurer.getY() + ")");
    }
}
