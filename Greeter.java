public class Greeter {
    private GreetingStrategy greetingStrategy;

    Greeter(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }

    public String greet() {
        return greetingStrategy.greet();
    }

    public void setGreetingStrategy(GreetingStrategy greetingStrategy) {
        this.greetingStrategy = greetingStrategy;
    }
}
