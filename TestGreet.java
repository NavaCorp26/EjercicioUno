public class TestGreet {
    public static void main(String[] args) {
        Greeter gt = new Greeter(new FormalGreetingStrategy());
        gt.setGreetingStrategy(new IntimateGreetingStrategy());
        String greeting = gt.greet();
        System.out.println(greeting);
    }
}