package exercise.interfaceClass;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("hhhh");
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu");
            }
        });
        hero.attack();

    }
}
