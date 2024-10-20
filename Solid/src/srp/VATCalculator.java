package srp;

public class VATCalculator {
	private static final float VAT_RATE = 0.18f;  // VAT tasa orokorra

	public float calculateVAT(float billAmount, String code) {
        if (code.equals("0")) {
            return 0; // 0 kodea duten fakturei VAT-a ez aplikatu
        }
        return (float) (billAmount * VAT_RATE);
    }
}
