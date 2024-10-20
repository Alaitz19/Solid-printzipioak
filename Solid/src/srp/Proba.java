package srp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Proba {
    public static void main(String[] args) {
        // Formato de fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Faktura bat sortu
        Bill bill1 = new Bill();
        bill1.code = "123"; // Normala
        bill1.billDate = new Date(); // Data gaurkoa
        bill1.billAmount = 60000; // 60.000€ faktura
        bill1.deductionPercentage = 10; // 10% dedukzioa

        // Totala kalkulatu
        bill1.totalCalc();
        System.out.println("Bill Code: " + bill1.code);
        System.out.println("Bill Date: " + dateFormat.format(bill1.billDate)); // Formateatu data
        System.out.println("Bill Amount: " + bill1.billAmount);
        System.out.println("Deduction: " + bill1.billDeduction);
        System.out.println("VAT: " + bill1.VAT);
        System.out.println("Total: " + bill1.billTotal);

        // 0 kodea duen faktura
        Bill bill2 = new Bill();
        bill2.code = "0"; // 0 kodea
        bill2.billDate = new Date(); // Data gaurkoa
        bill2.billAmount = 30000; // 30.000€ faktura
        bill2.deductionPercentage = 5; // 5% dedukzioa

        // Totala kalkulatu
        bill2.totalCalc();
        System.out.println("\nBill Code: " + bill2.code);
        System.out.println("Bill Date: " + dateFormat.format(bill2.billDate)); // Formateatu data
        System.out.println("Bill Amount: " + bill2.billAmount);
        System.out.println("Deduction: " + bill2.billDeduction);
        System.out.println("VAT: " + bill2.VAT); // 0 kodea duen fakturak ez du VAT-a
        System.out.println("Total: " + bill2.billTotal);
    }
}
