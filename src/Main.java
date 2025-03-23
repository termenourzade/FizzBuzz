import java.util.ArrayList;

class Rule {
    private int divisor;
    private String output;

    public Rule(int divisor, String output) {
        this.divisor = divisor;
        this.output = output;
    }

    public int getDivisor() {
        return divisor;
    }

    public String getOutput() {
        return output;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Rule> rules = new ArrayList<>();
        rules.add(new Rule(3, "Fizz"));
        rules.add(new Rule(5, "Buzz"));

        int start = 1;
        int end = 100;

        for (int i = start; i < end; i++) {
            String result = "";
            for (Rule rule : rules) {
                if (i % rule.getDivisor() == 0) {
                    result += rule.getOutput();
                }
            }
            System.out.println(result.isEmpty() ? i : result);
        }
    }
}
