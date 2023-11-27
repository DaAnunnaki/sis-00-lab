public class Vehicle {
    String owner;
    int wheels;

    public Vehicle(String owner, int wheels) {
        this.owner = owner;
        this.wheels = wheels;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Vehicle) {
            return (owner.equals(((Vehicle)obj).owner) && wheels == ((Vehicle)obj.getWheels());
        } else return false;
    }

    public String toString() {
        return 
    }
}
