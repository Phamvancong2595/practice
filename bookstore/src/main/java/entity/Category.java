package entity;

public class Category implements Cloneable{
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Category clone() {
        final Category category = new Category();
        category.name = name;
        return  category;
    }
}
