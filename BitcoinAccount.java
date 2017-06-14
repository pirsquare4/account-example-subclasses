class BitcoinAccount extends Account
{
  public BitcoinAccount(String name, long amount)
  {
     super(name, amount);
  }
   public void fluctuate(){
     amount = (long) (amount * (Math.random()*1.4 + 0.1));
   }
}
