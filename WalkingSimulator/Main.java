/// Automate map generation
/// Randomize rocks

// Import classes
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Create map array
    char[][] map = {
      {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'}};

    // Create player and enemy
    Random rand = new Random();
    Player player = new Player(); Enemy enemy = new Enemy();

    // Create variables
    boolean isInMenu = true; boolean isPlaying = false;
    Scanner input = new Scanner(System.in); int menuAnswer = 0; String playerAction; int enemyAction;

    // --- START MAIN LOOP ---
    do {
      // Print menu
      menuAnswer = displayMenu();

      // Play game or exit
      switch(menuAnswer) {
        // --- START GAME LOOP
        case 1: isPlaying = true; isInMenu = false;
            // Set object positions and start loop
            player.x = rand.nextInt(map.length);
            player.y = rand.nextInt(map[1].length);
            do {
              enemy.x = rand.nextInt(map.length);
              enemy.y = rand.nextInt(map[1].length);
            } while(enemy.x == player.x && enemy.y == player.y);
            
          do {
            // Show map, check for collisions, ask for player input, move player, display again
            displayMap(map, 10, player, enemy);
            if(player.x == enemy.x && player.y == enemy.y) {isPlaying = false; break;}
            System.out.print(">> "); playerAction = input.nextLine();
            switch(playerAction) {
              case "w": if(player.y - 1 >= 0) {player.y--;} break;
              case "a": if(player.x - 1 >= 0) {player.x--;} break;
              case "s": if(player.y + 1 < map.length) {player.y++;} break;
              case "d": if(player.x + 1 < map[1].length) {player.x++;} break;
              case "x": isPlaying = false; break;}

            // Move enemy
            enemyAction = rand.nextInt(4);
            switch(enemyAction) {
              case 0: if(enemy.y - 1 >= 0) {enemy.y--;} break;
              case 1: if(enemy.x - 1 >= 0) {enemy.x--;} break;
              case 2: if(enemy.y + 1 < map.length) {enemy.y++;} break;
              case 3: if(enemy.x + 1 < map[1].length) {enemy.x++;} break;
            }

          // --- END GAME LOOP ---
          } while(isPlaying);

          // Go back to menu
          menuAnswer = 0; isInMenu = true; break;

        // EXIT APP
        case 2: isInMenu = false; break;
      }
      // --- END MAIN LOOP ---
    } while(isInMenu);
  }

  // Custom method to display map
  public static void displayMap(char[][] map, int width, Player player, Enemy enemy) {
    // Create variables
    int counter = 0;

    // Loop through map array and display
    for(int i = 0; i < map.length; i++) {
      if(counter <= width) {
        counter = 0; System.out.print("\n\t" + i + "\t");
      } else {counter++;}
      for(int j = 0; j < map[1].length; j++) {
        // Place player in the middle, give coords
        System.out.print(" ");
        if(i == enemy.y && j == enemy.x) {
          System.out.print(enemy.image);
        } else if(i == player.y && j == player.x) {
          System.out.print(player.image);
        } else {System.out.print(map[i][j]);}
      }
    }
    System.out.print("\n\n\t\t");
    for(int j = 0; j < map[1].length; j++) {
      System.out.print(" " + j);
    }
    System.out.print("\n");
  }

  // Custom method to display menu
  public static int displayMenu() {
    Scanner input = new Scanner(System.in); int menuAnswer;
    System.out.println("\n----- MENU -----\n1. Play\n2. Exit");
    System.out.print(">> "); menuAnswer = input.nextInt();

    return menuAnswer;
  }
}