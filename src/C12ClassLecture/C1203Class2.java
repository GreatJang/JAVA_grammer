package C12ClassLecture;

public class C1203Class2 {
    public static void main(String[] args) {

        //Person클래스를 만들고,
//객체변수는 name, email, password, age
//객체메서드 whoIs() : name, email, password, age 입니다. -> 출력
//객체 생성 후 whoIs메서드 호출.

//    - ⭐클래스 변수(static variable) 전체 데이터가 계속 쌓여갈때에 사용
//        - static이 붙어 있는 클래스 내의 변수
//    - ⭐인스턴스 변수(instance variable) 고유값을 가져야한다면 객체사용 복사본을 만들기 위한 목적
//        - static이 붙어있지 않은 클래스 내의 변수

        Person myPerson1 = new Person();
//        변수값에 직접 접근하여 값을 할당하는 방식
        myPerson1.setName("홍길동");
        myPerson1.setEmail("hong@naver.com");
        myPerson1.setAge(20);
        Person.person_total +=1;
        System.out.println("이름은 " + myPerson1.getName() + " 이메일은 " + myPerson1.getEmail() + " 나이는 " + myPerson1.getAge());

        Person myPerson2 = new Person();
//        변수값에 직접 접근하여 값을 할당하는 방식
        myPerson2.setName("김길동");
        myPerson2.setEmail("kim@naver.com");
        myPerson2.setAge(34);
        Person.person_total +=1;
        System.out.println("이름은 " + myPerson2.getName() + " 이메일은 " + myPerson2.getEmail() + " 나이는 " + myPerson2.getAge());

    }
}


class Person {
    private String name;
    private String email;
    private String password;
    private int age;

//    setter, getter 패턴
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>10){
            System.out.println("이름이 너무 깁니다.");
        } else {
            this.name = name;
            System.out.println("이름 정상 세팅 되었습니다.");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@")){
            System.out.println("이메일 형식이 잘못되었습니다.");
        } else{
            this.email = email;
            System.out.println("이메일 정상입니다.");
        }
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static int person_total; // 0.
}


// class신규파일 생성
//은행계좌 실습
//클래스명 : BankAccount
//0) 객체변수 : 계좌번호(account_number), balance(잔고)
//0-1)계좌번호 setter 필요
//1)메서드 : 예금(deposit), 인출(withdraw)
//1-1)deposit에 잔액이 충분해야 인출메서드
//1-2)잔액 얼마 남았는지 확인하는 메서드

