public class Bank {

    public static void main (String[] args)
    {
       Bank a = new SBI();
       Bank b = new BOI();
       Bank c = new ICICI();

       //checking the working by just adding some sample data in the fields using the setters
        ((SBI)a).setName("State Bank of India");
        ((SBI)a).setHeadofficeAddress("Mumbai");
        ((SBI)a).setChairmanName("Dinesh Kumar Khara");
        ((SBI)a).setBranchCount(22000);
        ((SBI)a).setFdInterestRate(5.5);
        ((SBI)a).setPersonalLoanInterestRate(10.5);
        ((SBI)a).setHomeLoanInterestRate(8.5);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}

class SBI extends Bank{

   private  String Name;
   private String headofficeAddress;
   private  String chairmanName;
   private int branchCount;
   private  double fdInterestRate;
   private  double  personalLoanInterestRate;
   private  double  homeLoanInterestRate;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    @Override
    public String toString() {
        return "SBI{" +
                "Name='" + Name + '\'' +
                ", headofficeAddress='" + headofficeAddress + '\'' +
                ", chairmanName='" + chairmanName + '\'' +
                ", branchCount=" + branchCount +
                ", fdInterestRate=" + fdInterestRate +
                ", personalLoanInterestRate=" + personalLoanInterestRate +
                ", homeLoanInterestRate=" + homeLoanInterestRate +
                '}';
    }
}

class BOI extends Bank{

    private String Name;
    private String headofficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double  personalLoanInterestRate;
    private double  homeLoanInterestRate;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "BOI{" +
                "Name='" + Name + '\'' +
                ", headofficeAddress='" + headofficeAddress + '\'' +
                ", chairmanName='" + chairmanName + '\'' +
                ", branchCount=" + branchCount +
                ", fdInterestRate=" + fdInterestRate +
                ", personalLoanInterestRate=" + personalLoanInterestRate +
                ", homeLoanInterestRate=" + homeLoanInterestRate +
                '}';
    }
}

class ICICI extends Bank{

    private String Name;
    private String headofficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double  personalLoanInterestRate;
    private double  homeLoanInterestRate;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "ICICI{" +
                "Name='" + Name + '\'' +
                ", headofficeAddress='" + headofficeAddress + '\'' +
                ", chairmanName='" + chairmanName + '\'' +
                ", branchCount=" + branchCount +
                ", fdInterestRate=" + fdInterestRate +
                ", personalLoanInterestRate=" + personalLoanInterestRate +
                ", homeLoanInterestRate=" + homeLoanInterestRate +
                '}';
    }
}


