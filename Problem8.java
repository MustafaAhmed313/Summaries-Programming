/*
10.8:  (Financial: the Tax class) Programming Exercise 8.12 writes a program for
computing taxes using arrays. Design a class named Tax to contain the following instance data fields:
 ■ int filingStatus: One of the four tax-filing statuses:
0—single filer, 1—married filing jointly or qualifying widow(er), 2—married filing separately,and 3—head of household.
Use the public static constants SINGLE_FILER
(0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_
SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses.
 ■ int[][] brackets: Stores the tax brackets for each filing status.
 ■ double[] rates: Stores the tax rates for each bracket.
 ■ double taxableIncome: Stores the taxable income.
Provide the getter and setter methods for each data field and the getTax()
method that returns the tax. Also provide a no-arg constructor and the constructor
Tax(filingStatus, brackets, rates, taxableIncome).
Draw the UML diagram for the class and then implement the class. Write a test
program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
are shown in the following table:

         |                    |  Married filing jointly  |  Married filing   |
Tax rate |  Single filers     |  or qualifying widow(er) |  separately       |  Head of household
_________________________________________________________________________________________________
15%      |  Up to $27,050     |  Up to $45,200           |  Up to $22,600    |  Up to $36,250
27.5%    |  $27,051–$65,550   |  $45,201–$109,250        |  $22,601–$54,625  |  $36,251–$93,650
30.5%    |  $65,551–$136,750  |  $109,251–$166,500       |  $54,626–$83,250  |  $93,651–$151,650
35.5%    |  $136,751–$297,350 |  $166,501–$297,350       |  $83,251–$148,675 |  $151,651–$297,350
39.1%    |  $297,351 or more  |  $297,351 or more        |  $148,676 or more |  $297,351 or more
*/


public class Problem8 {
    public static void main(String[] args){
        int[][] bracketsFor2001 = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}};
        double[] ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
        int[][] bracketsFor2009 = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        double[] ratesFor2009 = {0.1, 0.15, 0.27, 0.30, 0.35, 0.386};
        Tax taxFor2001 = new Tax(0, bracketsFor2001, ratesFor2001, 50000);
        System.out.println("2001 Tax Table");
        System.out.println("taxable\tSingle\tMarried\tMarried   Head of");
        System.out.println("Income\tSingle\tJoint\tSeparate  a House");
        for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
            taxFor2001.setTaxableIncome(taxableIncome);
            taxFor2001.setFilingStatus(0);
            int taxForStatus0 = (int)taxFor2001.findTax();
            taxFor2001.setFilingStatus(1);
            int taxForStatus1 = (int)taxFor2001.findTax();
            taxFor2001.setFilingStatus(2);
            int taxForStatus2 = (int)taxFor2001.findTax();
            taxFor2001.setFilingStatus(3);
            int taxForStatus3 = (int)taxFor2001.findTax();
            System.out.println(taxableIncome + "\t" + taxForStatus0 + "\t" +
                    taxForStatus1 + "\t" + taxForStatus2 + "\t  " +
                    taxForStatus3);
        }
        Tax taxFor2002 = new Tax(0, bracketsFor2009, ratesFor2009, 50000);
        System.out.println("2009 Tax Table");
        System.out.println("taxable\tSingle\tMarried\tMarried   Head of");
        System.out.println("Income\tSingle\tJoint\tSeparate  a House");
        for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
            taxFor2002.setTaxableIncome(taxableIncome);
            taxFor2002.setFilingStatus(0);
            int taxForStatus0 = (int)taxFor2002.findTax();
            taxFor2002.setFilingStatus(1);
            int taxForStatus1 = (int)taxFor2002.findTax();
            taxFor2002.setFilingStatus(2);
            int taxForStatus2 = (int)taxFor2002.findTax();
            taxFor2002.setFilingStatus(3);
            int taxForStatus3 = (int)taxFor2002.findTax();
            System.out.println(taxableIncome + "\t" + taxForStatus0 + "\t" +
                    taxForStatus1 + "\t" + taxForStatus2 + "\t  " +
                    taxForStatus3);
        }
    }
}
class Tax{
    public static final int SINGLE_FILER =  0;
    public static final int MARRIED_FILING_JOINTLY_OR_QUALIFING_WIDOWER = 1;
    public static final int Married_FILING_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int[][] brackets = {
            {27050, 65550, 136750, 297350}, // Single filer
            {45200, 109250, 166500, 297350}, // married filing jointly
            {22600, 54625, 83250, 148675}, // married filing separately
            {36250, 93650, 151650, 297350} // head of household
    };
    private double[] rates = {0.15, 0.275, 0.305, 0.355, 0.391};
    private double taxableIncome = 100000;
    public Tax(){
    }
    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
        this.brackets = brackets;
        this.filingStatus = filingStatus;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }
    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }
    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }
    public void setRates(double[] rates) {
        this.rates = rates;
    }
    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    public double getTaxableIncome() {
        return taxableIncome;
    }
    public int[][] getBrackets() {
        return brackets;
    }
    public int getFilingStatus() {
        return filingStatus;
    }
    public double[] getRates() {
        return rates;
    }
    public double findTax(){
        double tax = 0;
        if (taxableIncome <= brackets[filingStatus][0])
            return tax = taxableIncome * rates[0];
        else
            tax = brackets[filingStatus][0] * rates[0];
        int i;
        for (i = 1; i < brackets[0].length; i++) {
            if (taxableIncome > brackets[filingStatus][i])
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) *
                        rates[i];
            else {
                tax += (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];
                break;
            }
        }
        if (i == brackets[0].length && taxableIncome > brackets[filingStatus][i - 1])
            tax += (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];

        return tax;
    }
}
