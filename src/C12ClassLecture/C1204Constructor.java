package C12ClassLecture;

public class C1204Constructor {
//    내부클래스 생성
//    인스턴스 변수 : year, month, day -> String
//    1)생성자 1 : year, month, day를 초기화 하는
//    2)생성자 2 : year, month를 초기화
//    3)생성자 3 : 초기화 없음
//    4)객체생성
//    초기화 = 객체변수를 세팅
//    setter 대신에 생성자 사용 하지만 예외적으로 setter를 사용할 일이 있다.
//    생성자로 최대한 커버
    public static void main(String[] args) {
        calender myCal1 = new calender("2023", "12", "15");
        calender myCal2 = new calender("2023", "11");
        calender myCal3 = new calender("2023");
    }
}

class calender{
    private String year;
    private String month;
    private String day;

    calender(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    메서드 오버로딩을 통해 같은 이름의 생성자 생성가능
        calender(String year, String month){
        this.year = year;
        this.month = month;
    }
    calender(String year){
//        this() 키워드를 통해 클래스내 매개변수에 맞는 생성자 호출 가능
        this(year, null, null);
    }
}
