package C12ClassLecture;

public class Practice {
    public static void main(String[] args) {
        // class신규파일 생성
//은행계좌 실습
//클래스명 : BankAccount
//0) 객체변수 : 계좌번호(account_number), balance(잔고)
//0-1)계좌번호 setter 필요
//1)메서드 : 예금(deposit), 인출(withdraw)
//1-1)deposit에 잔액이 충분해야 인출메서드
//1-2)잔액 얼마 남았는지 확인하는 메서드

        BankAccount1 bank = new BankAccount1();
//        변수값에 직접 접근하여 값을 할당하는 방식
        bank.setAccount_number("1122311-1212312");
        bank.setDeposit(10000);
        bank.setWithdraw(100);
        if(bank.getDeposit()>bank.getWithdraw()){
            System.out.println("계좌번호는 " + bank.getAccount_number() + " 현재잔액은 " + bank.getDeposit() + " 출금금액은 " + bank.getWithdraw());
        }else{
            return;
        }
    }
}
class BankAccount1{
    String account_number;
    int balance;
    int deposit;
    int withdraw;

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {

        this.account_number = account_number;
    }

    public int getDeposit() {
        return deposit;
    }
    //1)메서드 : 예금(deposit), 인출(withdraw)
//1-1)deposit에 잔액이 충분해야 인출메서드
//1-2)잔액 얼마 남았는지 확인하는 메서드
    public void setDeposit(int deposit) {
        this.deposit = deposit;
        System.out.println(deposit);
    }

    public int getWithdraw() {
        if (deposit<withdraw){
            System.out.println("출금이 불가합니다.");
        } else{
            this.withdraw = withdraw;
            System.out.println("정상 출금 되었습니다.");
        }
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
}
