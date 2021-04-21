public interface MapperOrder {
    public void addOrder(Order order);
    public void updateOrder(Order order);
    public void deleteOrder(Order order);
    public Order findOrder(String id);
}
