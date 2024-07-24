class Main{
    public static void main(String[] args) {
        
      Account acc1 = new Account("Avaneesh", 54600);
      Account acc2 = new Account("Shounak", 68900);
      Bank bank1 = new Bank();
      Bank.collection.add(acc1);
      Bank.collection.add(acc2);
      bank1.hover();
      bank1.removeAccount();
      bank1.depositMoney();
      bank1.withDraw();
      

    }
}