package creational.factoryabstract.custom.abstractfactory;

public class MastercardGoldValidator implements Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
