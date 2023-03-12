public class NoMoneyState implements State{

    private VendingMachine machine;

    public NoMoneyState(VendingMachine vendingMachine){
        this.machine=vendingMachine;
    }

    @Override
    public String stateName() {
        return "No Money State";
    }

    @Override
    public void insertMoney(Money money) {
        System.out.println("You have inserted: "+money.getValue()+" bdt");
        machine.add(money.getValue());
        if(machine.getCurrentAmount()<machine.getCost()){
            System.out.println("You still have to pay: "+ (machine.getCost()- machine.getCurrentAmount()) +" bdt");
        }
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void collectProduct() {
        System.out.println("You have to pay first.");
    }

    @Override
    public void collectChange() {
        if(machine.getCurrentAmount()>0)
        {
            System.out.println("Here is your change: "+machine.getCurrentAmount()+ " bdt");
            int temp = machine.getCurrentAmount();
            machine.add(-temp);
        }
        else {
            System.out.println("No Change.");
        }
    }

    @Override
    public void dispense() {
        System.out.println("You haven't payed yet.");
    }
}
