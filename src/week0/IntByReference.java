package src.week0;

public class IntByReference  {
    private int value;

    public IntByReference (Integer value) {
        this.value = value;
    }

    public String toString() {
        return (String.format("%d", this.value));
    }

    public void swapToLowHighOrder(IntByReference  i) {
        if (this.value > i.value) {
            int tmp = this.value;
            this.value = i.value;
            i.value = tmp;
        }
    }

    public static void swapper(int n0, int n1) {
        IntByReference  a = new IntByReference (n0);
        IntByReference  b = new IntByReference (n1);
        System.out.print("\nBefore: " + a + " " + b);
        a.swapToLowHighOrder(b);  // conditionally build swap method to change values of a, b
        System.out.print("\nAfter: " + a + " " + b);
        System.out.println();
    }

    public static void main(String[] ags) {
        IntByReference.swapper(21, 16);
        IntByReference.swapper(16, 21);
        IntByReference.swapper(16, -1);
    }

}
