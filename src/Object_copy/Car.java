package Object_copy;

public class Car {
    private String model;
    private String make;
    private int year;

    // constructor
    Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    // copy constructor
    Car(Car x) {
        this.copyCar(x);
    }

    // getters
    public String getModel(){
        return this.model;
    }

    public String getMake(){
        return this.make;
    }

    public int getYear(){
        return this.year;
    }
    
    // setters
    public void setModel(String model){
        this.model = model;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setYear(int year){

        this.year = year;
    }

    // copy method
    public void copyCar(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }

    //toString method
    // public String toString(){
    //     return this.getMake() + " " + this.getModel() + " " + this.getYear();
    // }
}
