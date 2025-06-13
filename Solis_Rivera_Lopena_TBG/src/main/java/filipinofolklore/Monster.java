package filipinofolklore;

public class Monster extends Character {

    private static final MonsterSkill monsterSkill = new MonsterSkill();

    public Monster(String name, int health, int minATK, int maxATK, double speed, int id) {
        super(name, health, minATK, maxATK, speed, id);
        this.name = super.name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getAtkSpeed() {
        return (int) super.getSpeed();
    }

    public int attack() {
        return getAttack();
    }

    public String getName() {
        return super.getName();
    }

    public void getSkill(Monster monster, Player player) {
        monsterSkill.identifySkill(id, monster, player);
    }

    private int maxHealth = super.getHealth();

    @Override
    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

}
