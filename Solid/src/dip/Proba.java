package dip;

public class Proba {
	public static void main(String[] args) {
        // Sortu Deduction eta VAT inplementazioak
        InterfaceDeduction deduction = new Deduction();
        InterfaceVAT vat = new VAT();

        // Pasatu hauek Bill klaseari
        Bill bill = new Bill(deduction, vat);

        bill.billAmount = 1000f;
        bill.deductionPercentage = 10;

        // Kalkulatu faktura
        bill.totalCalc();

        // Emaitzak erakutsi
        System.out.println("Fakturaren totala: " + bill.billTotal);
    }
}
