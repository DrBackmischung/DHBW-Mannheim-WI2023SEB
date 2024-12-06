import java.util.ArrayList;
import java.util.List;
class Store implements Subject {
private List<Observer> customers = new ArrayList<>();
private String productAvailability = "Not Available";

@Override
public void subscribe(Observer observer) {
customers.add(observer);
}

@Override
public void unsubscribe(Observer observer) {
customers.remove(observer);
}

@Override
public void notifySubscribers() {
for (Observer customer : customers) {
customer.update(productAvailability);
}
}

public void setProductAvailability(String availability) {
this.productAvailability = availability;
notifySubscribers();
}
}


