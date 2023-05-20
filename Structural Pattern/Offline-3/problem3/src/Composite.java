import java.util.ArrayList;

public class Composite extends Base{

    private final ArrayList<Base>childList;

    public Composite(String name, String role, String currProject, Base parent) {
        super(name, role, currProject, parent);
        childList = new ArrayList<>();
    }

    @Override
    public void addChild(Base child){
        childList.add(child);
    }

    @Override
    public void removeChild(Base child){
        childList.remove(child);
    }

    @Override
    public void removeAll(){ childList.clear(); }

    @Override
    public ArrayList<Base> getChildList(){
        return childList;
    }

    @Override
    public int getChildCount() { return childList.size(); }

    @Override
    public void PrintDetails() {
        if(getRole().equalsIgnoreCase("Industry")){
            System.out.println("Not available");
        }
        else {
            System.out.println("Name: " + getName());
            System.out.println("Role: " + getRole());
            if (getRole().equalsIgnoreCase("Company")){
                System.out.println("Total number of running projects: "+getChildCount());
            }
            else {
                System.out.println("Current Project: "+getCurrProject());
                System.out.println("Number of Supervises: "+ getChildCount());
            }
        }
    }

    @Override
    public void PrintHierarchy(int depth) {
        if(!(getRole().equalsIgnoreCase("Industry"))){
            for (int i = 1; i <= depth; i++) {
                System.out.print("\t");
            }
            System.out.print("- " + getName());
            if (getRole().equalsIgnoreCase("Project Manager")) {
                System.out.print(" (" + getCurrProject() + ")");
            }
        }
        System.out.println();
        for (Base b : childList) {
            b.PrintHierarchy(depth + 1);
        }
    }
}
