import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Queue<String> teller1 = new LinkedList<String>();
        Customer customer = new Customer();
        String[] customers = new String[5];
        int ptr = 0;

        File file = new File("src/customer.txt");
        System.out.println("How many customers: ");
        Scanner input = new Scanner(System.in);
        int intInput = input.nextInt();

        Scanner read = null;
        try {
            read = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(int i = 0; i<intInput; i++) {
            String line = read.nextLine();

            customers[ptr] = line;
            String[] wiw = line.split(",");

            if

            ptr++;
        }

        try {
            customer.customers();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void teller(){
        Customer customer = new Customer();

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



    }
    public void teller(){
        customers()
    }
}