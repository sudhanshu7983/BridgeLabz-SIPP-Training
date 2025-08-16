package SmartWarehouseManegementSystem;

public class Supplier<T> {
    private T id;
    private String name;

    public Supplier(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Supplier [id=" + id + ", name=" + name + "]";
    }
}
