
public class Customer {

    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String toString() {
        return this.id + " belongs to " + this.name;
    }
}
