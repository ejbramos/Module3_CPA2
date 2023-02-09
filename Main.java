import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        try {
            customer.customers();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
    }
}

class Customer {
    private int cNum;
    private String AcctNo;
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

    public String getAcctNo() {
        return AcctNo;
    }

    public void setAcctNo(String acctNo) {
        AcctNo = acctNo;
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

    public void setType(String type) {

        this.type = type.charAt(0);
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
        File file = new File("src/customer.txt");
        System.out.println("How many customers: ");
        Scanner input = new Scanner(System.in);
        int intInput = input.nextInt();
        Scanner read = new Scanner(file);
        for(int i = 0; i<intInput; i++) {
            String line = read.nextLine();
            String[] wiw = line.split(",");
            setCNum(wiw[0]);
            setAcctNo(wiw[1]);
            setAcctName(wiw[2]);
            setType(wiw[3]);
            setAmount(wiw[4]);
            setTime(wiw[5]);
        }

    }

}