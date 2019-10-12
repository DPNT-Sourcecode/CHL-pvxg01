package befaster.solutions.HLO;

public class HelloSolution {
    public String hello(String friendName) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, ").append(friendName).append("!");
        return stringBuilder.toString();
    }
}
