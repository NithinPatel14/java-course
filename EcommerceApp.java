public class EcommerceApp {
    public static void main(String[] args) {
        ElectronicProduct product1 = new ElectronicProduct();
        ClothingProduct product2 = new ClothingProduct();

        product1.setName("Fridge");
        product1.setId(02343);
        product1.setPrice(34000);
        product1.setManufacture("LG");
        product1.setRating(4);
        product1.setWarenty(2);
        

         product2.setName("Shirt");
        product2.setId(023);
        product2.setPrice(3400);
        product2.setBrand("US polo");
        product2.setFabric("Cotton");
        product2.setSize(32);

        System.out.println(product1.getName() + " " + product1.getId()+ " " + product1.getPrice() + " " + product1.getManufacture() + " " + product1.getWarenty()+ " " + product1.getRating());
        System.out.println(product1.getName() + " " + product1.getId()+ " " + product1.getPrice() + " " + product2.getBrand() + " " + product2.getFabric()+ " " + product2.getSize());



    }
    
}
