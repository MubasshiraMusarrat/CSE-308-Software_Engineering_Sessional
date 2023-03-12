public class SoldState implements State{
    VendingMachine machine;

    SoldState(VendingMachine vendingMachine){
        this.machine=vendingMachine;
    }

    @Override
    public String stateName() {
        return "Sold State";
    }

    @Override
    public void insertMoney(Money money) {
        System.out.println("You can't insert any money before the dispense finishes.");
    }

    @Override
    public void collectProduct() {
        System.out.println("You already have a request in process.");
    }


    @Override
    public void dispense() {
        machine.release();
        machine.add(-machine.getCost());
        System.out.println("You have in store: "+machine.getCurrentAmount()+" bdt");
        if(machine.getCount()>0){
            machine.setState(machine.getNoMoneyState());
        }
        else {
            machine.setState(machine.getSoldOutState());
        }
    }

    @Override
    public void collectChange() {
        System.out.println("Your money is already in process. Sold ");
    }
}
