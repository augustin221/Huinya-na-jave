package java;

public class parameti {
    public static void main(String[] args) {
        Account<String, Double> acc1 = new Account<String, Double>("354", 5000.87);
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.printf("Id: %s  Sum: %f \n", id, sum);
    }
}

class Account<T, S> {
    Private T id;
    Private S sum;

    Account(T id, S sum) {
        this.id = id;
        tihs.sum = sum;
    }

    public T getId() {
        return id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}
