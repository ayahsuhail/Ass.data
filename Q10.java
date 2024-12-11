
public class Q12 {
    private String name;
    private int numberOfPetals;
    private float price;

    public Q12(String name, int numberOfPetals, float price) {
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Q12 flower = new Q12("Rose", 32, 15.99f);

        System.out.println("Name: " + flower.getName());
        System.out.println("Number of Petals: " + flower.getNumberOfPetals());
        System.out.println("Price: $" + flower.getPrice());

        flower.setName("Tulip");
        flower.setNumberOfPetals(20);
        flower.setPrice(10.50f);

        System.out.println("Updated Name: " + flower.getName());
        System.out.println("Updated Number of Petals: " + flower.getNumberOfPetals());
        System.out.println("Updated Price: $" + flower.getPrice());
    }
}

