package exercise3;

public abstract class Product {
    private  String producerName;
    private  String modelName;
    private int serialNumber;

    public Product(String producerName, String modelName, int serialNumber) {
        this.producerName = producerName;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
    }
}
