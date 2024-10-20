package dip;

public class VAT implements InterfaceVAT {
    @Override
    public float calcVAT(float amount) {
        return amount * 0.21f; // %21eko BEZa
    }
}
