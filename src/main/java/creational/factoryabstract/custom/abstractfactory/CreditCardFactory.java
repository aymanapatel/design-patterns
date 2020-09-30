package creational.factoryabstract.custom.abstractfactory;

// Abstract Factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if (creditScore > 650) {
            return new VisaFactory();
        }

        else {
            return new MastercardFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);
    public abstract Validator getValidator(CardType cardType);
}
