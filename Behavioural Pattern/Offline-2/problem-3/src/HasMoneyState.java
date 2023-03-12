public class HasMoneyState implements State{
    VendingMachine machine;

    HasMoneyState(VendingMachine vendingMachine){
        this.machine=vendingMachine;
    }

    @Override
    public String stateName() {
        return "Has Money State";
    }

    @Override
    public void insertMoney(Money money) {
        if(machine.getCurrentAmount()<machine.getCost()){
            System.out.println("You have inserted: "+money.getValue()+" bdt");
            machine.add(money.getValue());
            System.out.println("You have inserted till now: "+machine.getCurrentAmount()+" bdt");
        }
        else{
            System.out.println("You already have a request in process.");
        }

    }

    @Override
    public void collectProduct() {
        if(machine.getCurrentAmount()<machine.getCost()){
            System.out.println("Insufficient.");
        }
        else {
            machine.setState(machine.getSoldState());
        }
    }


    @Override
    public void dispense() {
        System.out.println("Your request is in progress.");
    }

    @Override
    public void collectChange() {
        System.out.println("Your money is already in process.");
    }
}
