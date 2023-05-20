public class Main {
    public static void main(String[] args) {
        Crewmate crewmate = new Crewmate();
        Imposter imposter = new Imposter();
        Passenger susAdapter = new SusAdapter(imposter);
        System.out.println("Maintenance in run.");
        System.out.print("Crew mates: ");
        crewmate.maintenance();
        System.out.print("Imposter: ");
        susAdapter.maintenance();
    }
}
