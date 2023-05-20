import java.util.ArrayList;

public abstract class Base {
    private final String name;
    private final String role;
    private final String currProject;
    private final Base parent;

    public Base(String name, String role, String currProject, Base parent ){
        this.name = name;
        this.role = role;
        this.currProject = currProject;
        this.parent = parent;
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

    public String getCurrProject(){
        return currProject;
    }

    public Base getParent(){
        return parent;
    }

    public void addChild(Base child){
        throw new UnsupportedOperationException();
    }

    public void removeChild(Base child){
        throw new UnsupportedOperationException();
    }
    public void removeAll() { throw new UnsupportedOperationException(); }

    public ArrayList<Base> getChildList(){
        throw new UnsupportedOperationException();
    }

    public abstract int getChildCount();
    public abstract void PrintDetails();
    public abstract void PrintHierarchy(int depth);
}
