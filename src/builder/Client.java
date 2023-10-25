package builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new FormulaBuilder();
        Director director = new Director(builder);
        director.construct();

        builder = new SportsBuilder();
        director = new Director(builder);
        director.construct();

        builder =new TrucksBuilder();
        director = new Director(builder);
        director.construct();

    }
}
