package java;

public class obishenii {
    public static void main(String[] args) {
        Accountable<String> acc1 = new Account("1235rwr", 5000);
        Account acc2 = new Account("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

interface Accountable<T> {
    T getId();

    int getSum();

    void setSum(int sum);
}

class Account implements Accountable<String> {
    private String id;
    private int sum;

    Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}