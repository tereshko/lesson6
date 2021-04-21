public interface MapperProduct {
    public void addProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(Product product);
    public Product findProduct(String id);
}
