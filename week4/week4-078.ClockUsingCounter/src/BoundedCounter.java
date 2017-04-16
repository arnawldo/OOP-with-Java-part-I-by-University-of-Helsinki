public class BoundedCounter {
    private int value;
    private int upperlimit;

    public BoundedCounter(int upperlimit) {
        this.upperlimit = upperlimit;
        this.value = 0;
    }

    public void next() {
        if (this.value == this.upperlimit) {
            this.value = 0;
        } else {
            this.value++;
        }

    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int amount) {
        if (amount >= 0 && amount <= this.upperlimit) {
            this.value = amount;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

}
