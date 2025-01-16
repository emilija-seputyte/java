
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
//        int decrement = 0;
        for (int i = value; i >= 0; i--) {
            this.value = i - 1;
            printValue();
        }
    }

    // the other methods go here
    public void reset() {

    }
}
