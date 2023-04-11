// Abstract class concept

abstract class bank
  {
    abstract double intrestRate();
    abstract void AnnualProfit();
  }
class SBI extends bank
  {
    double intrestRate()
    {
      return 9.75;
    }
    void AnnualProfit()
    {
      System.out.println(" this year 30% profit ");
    }
  }

class ICICI extends bank
  {
    double intrestRate()
    {
      return 8.75;
    }
    void AnnualProfit()
    {
      System.out.println(" this year got 17% profit ");
    }
  }

class AbstractClassExample
  {
    public static void main(String a[])
    {
      SBI sbi=new SBI();
      System.out.println(sbi.intrestRate());
      sbi.AnnualProfit();
      ICICI icici = new ICICI();
      System.out.println(icici.intrestRate());
      icici.AnnualProfit();
    }
    
  }