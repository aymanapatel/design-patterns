package structural.adapter.custom.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }


    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return "id='" + instance.getCn() + '\'' +
                        ", firstName='" + instance.getGivenName() + '\'' +
                        ", lastName='" + instance.getSurName() + '\'' +
                        ", email='" + instance.getMail() + '\'' ;
    }
}
