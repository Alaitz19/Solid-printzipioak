package dip;

import java.util.Date;

public class Bill {
    public String code;
    public Date billDate;
    public float billAmount;
    public float VATAmount;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;

    private InterfaceDeduction deduction;
    private InterfaceVAT vat;

    // Konstruktorrean, interfazeak jasotzen ditu (injezioa)
    public Bill(InterfaceDeduction deduction, InterfaceVAT vat) {
        this.deduction = deduction;
        this.vat = vat;
    }

    // Fakturaren totala kalkulatzen duen metodoa
    public void totalCalc() {
        // Dedukzioa kalkulatu
        billDeduction = deduction.calcDeduction(billAmount, deductionPercentage);
        
        // VAT kalkulatzen dugu
        VATAmount = vat.calcVAT(billAmount);
        
        // Totala kalkulatzen dugu
        billTotal = (billAmount - billDeduction) + VATAmount;
    }
}

