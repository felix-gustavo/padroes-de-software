package questao03;

public abstract class Pizza {
    private String description = "Pizza";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
