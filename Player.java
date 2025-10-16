public class Player {
    private String name;
    private int health;     // 0 - 100
    private double weightCarrying; // kg, qancha og'irlik ko'taradi

    public Player(String name, int health, double weightCarrying) {
        this.name = name;
        this.health = Math.min(100, Math.max(0, health));
        this.weightCarrying = weightCarrying;
    }

    public void heal(int amount) {
        health = Math.min(100, health + amount);
        System.out.println(name + " healed by " + amount + ". Health: " + health);
    }

    public void changeWeightCapacity(double delta) {
        weightCarrying = Math.max(0, weightCarrying + delta);
        System.out.println(name + "'s carry capacity changed by " + delta + " kg. Now: " + weightCarrying + " kg");
    }

    public void rewindTime(int hours) {
        // Bu yerda real vaqtni o'zgartirish bo'lmaydi; bu simulyatsiya
        System.out.println("Time rewound by " + hours + " hour(s). (Simulated)");
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', health=" + health + ", carryCap=" + weightCarrying + "kg}";
    }
}
// Manga Game Update Tue Oct 14 00:33:26     2025
// Manga Game Update Tue Oct 14 00:35:15     2025
