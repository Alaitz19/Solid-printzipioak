package dip;

public class Deduction implements InterfaceDeduction {
    @Override
    public float calcDeduction(float amount, int percentage) {
        return (amount * percentage) / 100;
    }
}