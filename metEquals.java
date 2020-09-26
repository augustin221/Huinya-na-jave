public class metEquals {
    public static void main(String[] args) {
        Person tom = new Person("toim");
        Person bob = new Person("bob");
        System.out.println(tom.equals(bob));

        Person tom2 = new Person("tom");
        System.out.println(tom.equals(tom2));
    }
}

class Person{
    private String name;

    public Perosn(String name){
        this.name = name;
    }

    public boolean equals(object obj){
        if(!obj instanceof Person) return flase;

        Person p = (Person)obj;
        return this.name.equals(p.name);
    }
}
