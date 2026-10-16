public class DivineWeapon extends Artifact {
    private String essenceType;

    DivineWeapon(String essenceType) {
        super("Celestial Bronze");
        this.essenceType = essenceType;
        System.out.println("It's essence is now glowing with " + this.essenceType + " energy.");
    }

    DivineWeapon() {
        this("Pure Sunlight");
    }
}
