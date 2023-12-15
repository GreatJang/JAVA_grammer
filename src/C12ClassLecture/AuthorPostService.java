package C12ClassLecture;

public class AuthorPostService {
    public static void main(String[] args) {
        Author myAuthor11 = new Author();
//        사용자가 많으면 new로 계속 생성될텐데
//        스프링에서는 코드 한줄만 짜놓으면 각각 스레드를 할당받은 사용자가 고유객체를 통하기 때문에
//        사용자가 들어올때마다 생성할 필요없음. 코드한줄을 동일하게 다른 사용자가 사용
//        실행
    }
}
//    엔티티 = 데이터베이스 테이블 레벨
class Author{

}
class Post{

}