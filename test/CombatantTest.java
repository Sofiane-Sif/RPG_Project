import com.isep.rpg.Dragon;
import com.isep.rpg.Warrior;
import com.isep.rpg.Weapon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CombatantTest {

    @Test
    void fightTest() {
        Warrior w = new Warrior("Ron", 5);
        Weapon sword = new Weapon("sword", 1);
        w.use(sword);
        Dragon d = new Dragon("Dracofeu", 5, 2);
        d.fight(w);
        w.fight(d);
        assertTrue(d.getHealthPoint() == 4);
        assertEquals(3, w.getHealthPoint());
    }

}
