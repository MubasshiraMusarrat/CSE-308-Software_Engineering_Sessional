public class SoldOutState implements State{
    VendingMachine machine;

    SoldOutState(VendingMachine vendingMachine){
        this.machine=vendingMachine;
    }

    @Override
    public String stateName() {
        return "Sold Out State";
    }

    @Override
    public void insertMoney(Money money) {

        System.out.println("The machine has run out of products.");
    }

    @Override
    public void collectProduct() {
        System.out.println("The machine has run out of products.");
    }


    @Override
    public void dispense() {
        System.out.println("The machine has run out of products.");
    }

    @Override
    public void collectChange() {
        if(machine.getCurrentAmount()>0){
            System.out.println("Here is your change: "+machine.getCurrentAmount()+ " bdt");
            int temp = machine.getCurrentAmount();
            machine.add(-temp);
        }
        else {
            System.out.println("No Change.");
        }
    }
}
