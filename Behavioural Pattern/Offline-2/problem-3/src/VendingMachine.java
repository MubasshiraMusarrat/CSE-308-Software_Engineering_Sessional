import java.util.Random;

public class VendingMachine {
    private State NoMoney;
    private State HasMoney;
    private State Sold;
    private State SoldOut;
    private State currentState;
    private int count;
    private int cost;
    private int currentAmount;

    public VendingMachine(){
        NoMoney = new NoMoneyState(this);
        HasMoney = new HasMoneyState(this);
        Sold = new SoldState(this);
        SoldOut=new SoldOutState(this);
        Random random = new Random();
        count = random.nextInt(10-1)+1;
        //System.out.println(count);
        if(count>0){
            currentState = NoMoney;
        }
        else {
            currentState = SoldOut;
        }
        cost = 40;
        currentAmount = 0;
    }

    public void insert(Money m){
        currentState.insertMoney(m);
    }

    public void collectChange(){
        currentState.collectChange();
    }

    public void collectProduct(){
        currentState.collectProduct();
        if(currentState.stateName().equalsIgnoreCase("Sold State")) {
            currentState.dispense();
        }
    }

    void setState(State state){
        this.currentState=state;
    }
    void add(int m) { currentAmount+=m; }

    int getCount(){ return count;}
    int getCost() { return cost;}
    State getCurrentState() { return currentState; }
    int getCurrentAmount() { return currentAmount;}


    State getNoMoneyState() {return NoMoney;}
    State getHasMoneyState() {return HasMoney;}
    State getSoldState() {return Sold;}
    State getSoldOutState() { return SoldOut;}

    public void release(){
        if(count > 0){
            System.out.println("Here is your product.");
            count--;
        }
    }

    public void refill(){
        if(count==0 && currentState==SoldOut){
            System.out.println("Vending machine has refilled.");
            Random random = new Random();
            count = random.nextInt(10-1)+1;
            if(count>0){
                currentState = NoMoney;
            }
        }
        else{
            System.out.println("There are still items in the vending machine.");
        }
    }
}
