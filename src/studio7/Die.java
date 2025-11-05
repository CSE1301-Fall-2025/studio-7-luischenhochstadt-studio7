package studio7;

public class Die {
    private int sides;

    public Die(int n) {
        sides = n;
    }

    public int roll() {
        return (int) (Math.random() * sides + 1);
    }

    public static void main(String[] args) {
        Die die1 = new Die(100);
        System.out.println(die1.roll());

    }
}
