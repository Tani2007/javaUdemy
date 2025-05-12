public class Car {
    private String make = "Tesla";
    private String model = "Baleno";
    public String color = "Blue";
    private int doors = 4;
    private  boolean isSuv;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setSuv(boolean suv) {
        isSuv = suv;
    }

    //! In the below line i have used the setter method.
    public  void setMake(String make){
        //this.make = make;//!this keyword wil change this object's make to my new make which i am getting from arguments.
        if(make == null) make = "unknown";
            String lowerCaseMake = make.toLowerCase();
            switch (lowerCaseMake) {
                case "tesla", "porsche", "bmw" -> this.make = make;
                default -> {
                    this.make = "unsupported";
                }
            }


    }
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isSuv() {
        return isSuv;
    }

    public String getMake(){
        return  make;//? i have made a getter mehtod
    }
    public  void describeCar(){
        //!here when we are directly makinng method in a class no need to write static keyword inside it.
        System.out.println(" door " + doors +" make " + make+ " model " + model + " color " + color);
    }
}
