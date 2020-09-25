import java.employee;

public interface nasled2 {
    public static void main(String[] args) {
        Person tom = new Person("tom");
        tom.display();
        Person sam = new employee("sam", "oracle");
        sam.display();
        Person bob = new Client("bob", "detuscheBank", 3000);
        bob.display();
        Object tom2 = new Person("Tom");
        Object sam2 = new employee("Sam", "Oracle");
        Object kate = new Client("Kate", "DeutscheBank", 2000);
        Person bob2 = new Client("Bob", "DeutscheBank", 3000);
        Person alice = new employee("Alice", "Google");
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }
}

class employee extends Person {
    private String company;

    public employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void display() {
        System.out.printf(super.getName(), company);
    }
}

class Client extends Person {
    private int sum;
    private String bank;

    public Client(String name, String bank, int sum) {
        super(name);
        this.bank = bank;
        this.sum = sum;
    }

    public void display() {
        System.out.printf(super.getName(), bank);
    }

    public String getBank() {
        return bank;
    }

    public int getSum() {
        return sum;
    }
}