package builder.car;

public class Car {

    boolean hasSeatheater;
    boolean hasAC;
    boolean isConvertible;
    int doors;
    int seats;

    protected Car(CarBuilder builder){
        this.hasSeatheater = builder.hasSeatheater;
        this.hasAC = builder.hasAC;
        this.isConvertible = builder.isConvertible;
        this.doors = builder.doors;
        this.seats = builder.seats;

    }
    @Override
    public String toString() {
        return "Car [seats=" + seats + ", doors=" + doors + ", hasSeatHeater=" + hasSeatheater +
                ", hasAC=" + hasAC + ", isConvertible=" + isConvertible +"]";
    }


}
