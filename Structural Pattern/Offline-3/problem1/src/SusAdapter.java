public class SusAdapter implements Passenger{
    Imposter imposter;
    public SusAdapter(Imposter imp){
        this.imposter = imp;
    }

    @Override
    public void maintenance() {
        imposter.damage();
    }
}
