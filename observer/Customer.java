class Customer implements Observer {
private String name;

public Customer(String name) {
this.name = name;
}

@Override
public void update(String availability) {
System.out.println("Hello " + name + ", Product is now " + availability);
}
}

