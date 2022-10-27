import com.isep.rpg.Dragon;
import com.isep.rpg.Game;
import com.isep.rpg.Warrior;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(null);
        game.start();
    }

    private static void showStatus(Warrior w, Dragon d) {
        System.out.println(w.getName() + ":" + w.getHealthPoint() + "\n"
            + d.getName() + ":" + d.getHealthPoint());
    }
}