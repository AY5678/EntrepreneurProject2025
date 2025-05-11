import java.util.*;

public class GachaSystem {
    private List<Character> characterPool;
    private Random random;
    private final int DRAW_COST = 10;

    public GachaSystem() {
        characterPool = new ArrayList<>();
        random = new Random();

        // Character pool
        characterPool.add(new Character("Math Wizard", "Rare"));
        characterPool.add(new Character("Physics Genius", "Rare"));
        characterPool.add(new Character("Chemistry Prodigy", "Uncommon"));
        characterPool.add(new Character("Literature Expert", "Uncommon"));
        characterPool.add(new Character("History Buff", "Common"));
        characterPool.add(new Character("Geography Rookie", "Common"));
        characterPool.add(new Character("Biology Learner", "Common"));
    }

    public Character draw() {
        int chance = random.nextInt(100);

        String rarity;
        if (chance < 5) {
            rarity = "Rare";         // 5%
        } else if (chance < 30) {
            rarity = "Uncommon";     // 25%
        } else {
            rarity = "Common";       // 70%
        }

        List<Character> filtered = new ArrayList<>();
        for (Character c : characterPool) {
            if (c.getRarity().equalsIgnoreCase(rarity)) {
                filtered.add(c);
            }
        }

        return filtered.get(random.nextInt(filtered.size()));
    }

    public int getDrawCost() {
        return DRAW_COST;
    }
}
