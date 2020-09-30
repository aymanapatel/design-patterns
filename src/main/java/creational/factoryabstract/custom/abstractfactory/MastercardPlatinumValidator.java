package creational.factoryabstract.custom.abstractfactory;

public class MastercardPlatinumValidator implements Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
