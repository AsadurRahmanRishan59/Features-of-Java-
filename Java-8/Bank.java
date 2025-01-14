public class Bank {
    private String name;
    private int accNo;

    public Bank( String name,int accNo) {
        this.accNo = accNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAccNo() {
        return accNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bank{");
        sb.append("name=").append(name);
        sb.append(", accNo=").append(accNo);
        sb.append('}');
        return sb.toString();
    }

}
