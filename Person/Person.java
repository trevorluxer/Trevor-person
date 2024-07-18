class Person {
    // Fields
    private String name;
    private int age;
    private String address;
    
    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    
    // Method that accepts a Person object and calls displayDetails
    public void myDetails(Person person) {
        person.displayDetails();
    }
    
    // Method to pass the current instance to another method
    public void printCurrentInstance() {
        myDetails(this);
    }
    
    public static void main(String[] args) {
        // Create an object in the main class with your name
        Person person = new Person("Trevor", 25, "Kiambu Street, Naiobi City, Kenya");
        
        // Use the object to call the printCurrentInstance method
        person.printCurrentInstance();
    }
}
