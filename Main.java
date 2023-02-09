import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.customers();
    }
}

class Customer {
    private int cNum;
    private int AcctNo;
    private String AcctName;
    private char type;
    private int amount;
    private int time;
    public int getCNum() {
        return cNum;
    }

    public void setCNum(String cNum) {
        int i = Integer.valueOf(cNum);
        this.cNum = i;
    }

    public int getAcctNo() {
        return AcctNo;
    }

    public void setAcctNo(String acctNo) {
        int i = Integer.valueOf(acctNo);
        AcctNo = i;
    }

    public String getAcctName() {
        return AcctName;
    }

    public void setAcctName(String acctName) {
        AcctName = acctName;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        int i = Integer.valueOf(amount);
        this.amount = i;
    }

    public int getTime() {
        return time;
    }

    public void setTime(String time) {
        int i = Integer.valueOf(time);
        this.time = i;
    }



    public void customers() throws FileNotFoundException {
        File file = new File("customer.txt");
        System.out.println("How many customers: ");
        Scanner input = new Scanner(file);
        String line = input.nextLine();
        String[] wiw = line.split(",");
        setCNum(wiw[0]);
        setAcctNo(wiw[1]);
        setAcctName(wiw[2]);
        setAmount(wiw[3]);
        setTime(wiw[4]);


    }

}