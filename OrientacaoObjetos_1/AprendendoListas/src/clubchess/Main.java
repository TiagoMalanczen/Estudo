package clubchess;

public class Main {
    public static void main(String[] args) {
        //========Instantiating dates========
    Member James = new Member("James", 1500, 100.0);
    Member Mark = new Member("Mark", 1700, 0.0);

    MatchEngine engine = new MatchEngine();

    Product training = new Product("Intensive training", 50.0, 1400);

        //========Testing========
        System.out.println("================Testing================");

    James.buyProduct(training);
    Mark.buyProduct(training);

        System.out.println("============");
    engine.processClubMatch(James, Mark, 1);

        System.out.println(James.getRating());
        System.out.println(James.getWallet());
        System.out.println(James.getInventory().size());
        System.out.println("============");
        System.out.println(Mark.getRating());
        System.out.println(Mark.getWallet());
        System.out.println(Mark.getInventory().size());
    }
}

