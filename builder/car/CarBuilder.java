package builder.car;

public class CarBuilder {

    boolean hasSeatheater;
    boolean hasAC;
    boolean isConvertible;
    int doors;
    int seats;

    public CarBuilder setHasSeatheater(boolean hasSeatheater) {
        this.hasSeatheater = hasSeatheater;
        return this;
    }

    public CarBuilder setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    public CarBuilder setConvertible(boolean convertible) {
        isConvertible = convertible;
        return this;
    }

    public CarBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }
    public  Car build(){return new Car(this);}
}
