public class Character {
    private String name;
    private String rarity;

    public Character(String name, String rarity) {
        this.name = name;
        this.rarity = rarity;

    }

    public String getName() {
        return name;

    }

    public String getRarity() {
        return rarity;

    }

    @Override
    public String toString() {
        return name + " [" + rarity + "]";
    }
}