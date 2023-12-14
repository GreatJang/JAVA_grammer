package C12ClassLecture;

public class BankService {
    public static void main(String[] args) {
        BankAccount jongwon = new BankAccount("1234");
        jongwon.deposit(100000000);
        jongwon.withdraw(500000);
//        System.out.println(jongwon.getAccountNumber());

        BankAccount hun = new BankAccount("12345");
        hun.deposit(150000);
        hun.withdraw(200000);
//        System.out.println(hun.getAccountNumber());
    }
}
class BankAccount{
    private String accountNumber;
    private int balance;
//    생성자란 클래스 객체화 될때 자동으로 실행되는 메서드
//    클래스명(){} : 생성자의 형태
//    별도의 생성자를 만들지 않으면 매개변수 없는 기본생성자가 숨겨져있다.
    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        System.out.println("계좌번호는 " + accountNumber + " 입니다.");

    }
    public String getAccountNumber() {
        return accountNumber;
    }


//    예금
    public void deposit(int money){
        this.balance += money;
        System.out.println(money + "원 입금되었습니다.");
    }
//    출금
    public void withdraw(int money) {
        if (this.balance < money) {
            System.out.println("잔액이 부족합니다.");
        } else {
            this.balance -= money;
            System.out.println(money + "원 출금되었습니다.");
        }
    }
//    checkBalance
    public int checkBalance() {
        return this.balance;

    }
}