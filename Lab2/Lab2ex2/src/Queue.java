import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> values = new ArrayList<>();
    private int maxSize = 0;

    public Queue(){}

    public Queue(int maxSize){
        this.maxSize = maxSize;
    }


    void push(int value) {
        if (maxSize == 0 || values.size() < maxSize) {
            values.add(0, value);
            System.out.println(values);
        } else
            System.out.println("Queue is overflowded");
    }

    int pop() {
        int number = values.remove(values.size() - 1);;
        return number;
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public boolean isFull() {
        if (maxSize == 0) {
            System.out.println("Queue can never be full");
            return false;
        } else return values.size() >= maxSize;
    }
}
