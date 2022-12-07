package itmo.java.basics.lab2;


public class Smartphone {
    private String brand;
    private String model;
    private Integer memorySize;

    private Long price;
    private Color color;

//    public Smartphone() {
//    }


    public Smartphone(String brand, String model, Integer memorySize, Color color) {
        this.brand = brand;
        this.model = model;
        this.memorySize = memorySize;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", memorySize=" + memorySize +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
