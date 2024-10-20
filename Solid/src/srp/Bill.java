package srp;



public class Bill {
    public String code;
    public java.util.Date billDate;
    public float billAmount;
    public float VAT;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;

    private DeductionCalculator deductionCalculator;
    private VATCalculator vatCalculator;

    public Bill() {
        deductionCalculator = new DeductionCalculator();
        vatCalculator = new VATCalculator();
    }

    public void totalCalc() {
        billDeduction = deductionCalculator.calculateDeduction(billAmount, deductionPercentage);
        VAT = vatCalculator.calculateVAT(billAmount, code);
        billTotal = (billAmount - billDeduction) + VAT;
    }
}

