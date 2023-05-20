public class Leaf extends Base{

    public Leaf(String name, String role, String currProject, Base parent) {
        super(name, role, currProject, parent);
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public void PrintDetails() {
        System.out.println("Name: "+getName());
        System.out.println("Role: "+getRole());
        System.out.println("Current Project: "+getCurrProject());
    }

    @Override
    public void PrintHierarchy(int depth) {
        for(int i=1; i<=depth; i++){
            System.out.print("\t");
        }
        System.out.print("- "+getName());
        System.out.println();
    }
}
