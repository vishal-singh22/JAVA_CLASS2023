/*Create a Java program that takes employee details (name, basic salary) and 
calculates the gross salary by adding HRA (30% of basic), DA (20% of basic), and
TA (fixed at 2000). Deduct income tax based on a tax rate.
Generate salary slips displaying employee 
information, gross salary, income tax, and net salary.

Gross = basic+hra+da+ta
Net = gross - tax.*/

// import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class SalaryMgmt {

    /* FUCNTION TO CALCLUATE HRA */
    static double HRA(double bs) {
        double valcopy = bs;
        return 0.3 * valcopy;
    }

    /* FUCNTION TO CALCLUATE DA */
    static double DA(double bs) {
        double valopy2 = bs;
        return 0.2 * valopy2;
    }

    /* FUCNTION TO CALCLUATE GROSSSALARY */
    static double GrossSalary(double bs, double hra, double da, double ta) {
        return bs + hra + da + ta;
    }

    /* FUCNTION TO CALCLUATE INCOMETAXCALCULATOR */
    static double IncomeTaxCalculator(double gs, double tr) {
        return (tr / 100) * gs;
    }

    /* FUCNTION TO CALCLUATE NETSALARY */
    static double NetSalary(double gs, double itc) {
        return gs - itc;
    }

    static void Display(String name, double bs, double hra, double da, double ta, double gs, double itc, double ns) {

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + bs);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("TA: " + ta);
        System.out.println("Gross Salary: " + gs);
        System.out.println("Income Tax: " + itc);
        System.out.println("Net Salary: " + ns);
    }

    /* MAIN FUNCTION */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name:");
        String name = sc.nextLine();
        System.out.println("Enter Basic Salary of Employee:");
        double bs = sc.nextInt();
        /* CALLING OF HRA FUNCTION */
        double hra = HRA(bs);
        /* CALLING OF DA FUNCTION */
        double da = DA(bs);
        /* CALLING OF TA FUNCTION */
        double ta = 2000;
        /* CALLING OF GROSSSALARY FUNCTION */
        double gs = GrossSalary(bs, hra, da, ta);
        /* TAKING INPUT OF TAX ACCORDING TO THE USER */
        System.out.println("Enter the Tax Rate %:");
        double tr = sc.nextDouble();
        /* CALLING OF TR FUNCTION */
        double itc = IncomeTaxCalculator(gs, tr);
        /* CALLING OF NETSALRAY FUNCTION */
        double ns = NetSalary(gs, itc);

        /* DISPLAYING OUTPUT AS A SALARY SLIP */
        System.out.println("\nSalary Slip");
        Display(name, bs, hra, da, ta, gs, itc, ns);

        sc.close();
    }

}