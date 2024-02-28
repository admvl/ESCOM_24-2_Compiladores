public class Loan {
   private double annualInterestRate;
   private int numberOfYears;
   private double loanAmount;
   private java.util.Date loanDate;

   /** Constructor por default */

   public Loan() {
      this(2.5, 1, 1000);
   }

   /** Constructor Loan con taza de interés anual,
       número de años, y cantidad del préstamo especificados */
       
   public Loan(double annualInterestRate, int numberOfYears,
      double loanAmount) {
      this.annualInterestRate = annualInterestRate;
      this.numberOfYears = numberOfYears;
      this.loanAmount = loanAmount;
      loanDate = new java.util.Date();
   }

   /** Regresa el annualInterestRate */

   public double getAnnualInterestRate() {
      return annualInterestRate;
   }
   
   /** Asignar un nuevo annualInterestRate */
   
   public void setAnnualInterestRate(double annualInterestRate) {
      this.annualInterestRate = annualInterestRate;
   }

   /** Regresa el numberOfYears */
   
   public int getNumberOfYears() {
      return numberOfYears;
   }
   
   /** Asignar un nuevo numberOfYears */
   
   public void setNumberOfYears(int numberOfYears) {
      this.numberOfYears = numberOfYears;
   }
   
   /** Regresa la cantidad del préstamo */
   
   public double getLoanAmount() {
      return loanAmount;
   }

   /** Asigna una nueva cantidad del préstamo */
   
   public void setLoanAmount(double loanAmount) {
      this.loanAmount = loanAmount;
   }
   
   /** Encuentra el pago mensualmente */
   
   public double getMonthlyPayment() {
      double monthlyInterestRate = annualInterestRate / 1200;
      double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
(Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
      return monthlyPayment;
   }
   
   /** Encontrar el pago total */
   
   public double getTotalPayment() {
      double totalPayment = getMonthlyPayment() * numberOfYears * 12;
      return totalPayment;
   }
   
   /** Regresa la fecha del préstamo */
   
   public java.util.Date getLoanDate() {
      return loanDate;
   }
}
