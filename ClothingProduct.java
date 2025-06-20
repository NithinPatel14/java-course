public class ClothingProduct extends Product {
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    private int size;
    private String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getFabric() {
        return fabric;
    }
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    private String fabric; 
}
