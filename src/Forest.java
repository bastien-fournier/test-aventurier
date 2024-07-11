package src;

public class Forest {
    private char[][] map = {
        "###    ######    ###".toCharArray(),
        "###      ##      ###".toCharArray(),
        "##     ##  ##     ##".toCharArray(),
        "#      ##  ##      #".toCharArray(),
        "##                ##".toCharArray(),
        "#####          #####".toCharArray(),
        "###### ##  ##  #####".toCharArray(),
        " #     ######     # ".toCharArray(),
        "     ########       ".toCharArray(),
        "    ############    ".toCharArray(),
        "    ############    ".toCharArray(),
        "     ########      #".toCharArray(),
        " #     ######     ##".toCharArray(),
        "###### ##  ## ######".toCharArray(),
        "#####          #####".toCharArray(),
        "##                ##".toCharArray(),
        "#   ## #    # ##   #".toCharArray(),
        "##   ##      ##   ##".toCharArray(),
        "###    #    #    ###".toCharArray(),
        "###    ######    ###".toCharArray()
    };

    // Vérifie si l'aventurier peut se déplacer à une position donnée
    public boolean canMove(int x, int y) {
        if (x < 0 || y < 0 || y >= map.length || x >= map[y].length) {
            return false; // Hors des limites de la carte
        }
        return map[y][x] == ' '; 
    }

    // Affiche la carte avec la position de l'aventurier
    public void printMap(int adventurerX, int adventurerY) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == adventurerY && j == adventurerX) {
                    System.out.print('A'); // => A pour aventurier
                } else {
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
    }
}
