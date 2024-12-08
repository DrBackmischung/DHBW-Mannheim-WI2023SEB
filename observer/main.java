public class main {
public static void main(String[] args) {
Store store = new Store();

Customer customer1 = new Customer("Alice");
Customer customer2 = new Customer("Bob");

store.subscribe(customer1);
store.subscribe(customer2);

store.setProductAvailability("Available");
store.unsubscribe(customer2);

store.setProductAvailability("Not Available");

}
}