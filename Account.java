class Account
{
   protected String name;

   protected long amount;

   Account(String name, long amount)
   {
      this.name = name;
      setAmount(amount);
   }

   void deposit(long amount)
   {
      this.amount += amount;
   }

   String getName()
   {
      return name;
   }

   long getAmount()
   {
      return amount;
   }

   void setAmount(long amount)
   {
      this.amount = amount;
   }
   public static void main(String[] argv){
     Account loanAccount = new Account("Student Loan", 10000);
     Account bankAccount = new Account("Wells Fargo", -35);
     BitcoinAccount unwiseInvestement = new BitcoinAccount("Coin Base", 200);

     System.out.println("loanAccount info:\n\t Name:" + loanAccount.getName()
     + "\n\t Amount: " + loanAccount.getAmount());

     System.out.println("bankAccount info:\n\t Name:" + bankAccount.getName()
     + "\n\t Amount: " + bankAccount.getAmount());

     bankAccount.deposit(50);

     System.out.println("bankAccount info after deposit:\n\t Name:" + bankAccount.getName()
     + "\n\t Amount: " + bankAccount.getAmount());

     System.out.println("unwiseInvestement info:\n\t Name:" + unwiseInvestement.getName()
     + "\n\t Amount: " + unwiseInvestement.getAmount());

     Account wiserInvestement = (Account)unwiseInvestement ;

     wiserInvestement.deposit(15);

     System.out.println("wiserInvestement after deposit info:\n\t Name:" + wiserInvestement.getName()
     + "\n\t Amount: " + wiserInvestement.getAmount());

     unwiseInvestement.fluctuate();

     System.out.println("unwiseInvestement after fluctuation info:\n\t Name:" + unwiseInvestement.getName()
     + "\n\t Amount: " + unwiseInvestement.getAmount());

   }

}
