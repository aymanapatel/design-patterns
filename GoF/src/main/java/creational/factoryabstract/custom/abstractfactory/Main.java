package creational.factoryabstract.custom.abstractfactory;

public class Main {

    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

        CreditCard creditCard = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println("Elite: Card Get class" + creditCard.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(500);

        CreditCard creditCard2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println("Cheap: Card Get class" + creditCard2.getClass());

    }
}
