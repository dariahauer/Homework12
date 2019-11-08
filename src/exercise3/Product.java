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

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "producerName='" + producerName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
