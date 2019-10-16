package ExtraClass01;
public class Account {
    String name;
    private Long accountNumber;
    private String IFSCcode;

    public String getname() {
        return name;
    }
    public String getaccountNumber() {
        return accountNumber;
    }
    public String getIFSCcode(){
        return IFSCcode;
    }
    public void setname(String newname) {
        name=newname;
    }

    public void setAccountNumber(Long newaccountNumber) {
        accountNumber = newaccountNumber;
    }

    public void setIFSCcode(String newIFSCcode) {
        IFSCcode = newIFSCcode;
    }
    public String toString() {
        String s="";
        s = "name:" + getname() + "\naccount number:" + getaccountNumber() + "\n ifsc code" + getIFSCcode();

        return s;
    }
}
class SahasBank {
    public static void main(String[] args) {
        Account sa1 = new Account();
        System.out.println("sahas\'s name is:" + sa1.getname());
        sa1.setname("sahas");
        for (int i =0;i<10000;i++)
            Account ac =new Account();
            ac.setname("name" + (i+1));


    }
}