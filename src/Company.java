public class Company {
    private String companyName;
    private int companyID;

    public Company() {
    }

    public Company(String companyName, int companyID) {
        this.companyName = companyName;
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }
}
