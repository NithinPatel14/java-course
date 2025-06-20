public class ElectronicProduct extends Product{
    private int warenty;
    public int getWarenty() {
        return warenty;
    }
    public void setWarenty(int warenty) {
        this.warenty = warenty;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    private int rating;
    public String getManufacture() {
        return manufacture;
    }
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    private String manufacture;
    
}
