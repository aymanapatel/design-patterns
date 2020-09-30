package creational.factoryabstract.custom.abstractfactory;


// Concrete Factory
public class MastercardFactory extends CreditCardFactory{

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new MastercardGoldCreditCard();
            case PLATINUM:
                return new MastercardPlatinumCreditCard();
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new MastercardGoldValidator();
            case PLATINUM:
                return new MastercardPlatinumValidator();
        }

        return null;
    }
}
