package Entity;

public class Campaign implements Entity{
    private int id;
    private String name;
    private String description;
    private int discountRate;

    public Campaign() {
    }

    public Campaign(int id, String name, String description, int discount) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.discountRate = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}
