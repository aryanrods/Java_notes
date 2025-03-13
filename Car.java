
public class Car {

    private String numplate;
    private String make;
    private String model;
    private float price;

    public Car(String numplate) {
        this.numplate = numplate;
    }

    public Car(String numplate, String make, String model, float price) {
        this.numplate = numplate;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public Car() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNumPlate() {
        return numplate;
    }

    public void setNumPlate(String numplate) {
        this.numplate = numplate;
    }
}
