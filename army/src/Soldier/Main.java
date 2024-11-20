package Soldier;

public class Main {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier("John", 100);
        Soldier soldier2 = new Soldier("Alice", 90);

        Unit unit1 = new Unit("Alpha");
        unit1.addSoldier(soldier1);
        unit1.addSoldier(soldier2);

        Army army = new Army("Infatry");
        army.addUnit(unit1);

        System.out.println(army);

        //Simulate damage
        soldier1.takeDamage(10);
        System.out.println("After batlle: " + soldier1);
    }
}