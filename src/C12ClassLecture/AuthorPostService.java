package C12ClassLecture;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AuthorPostService {
    public static void main(String[] args) {
//        사용자가 많으면 new로 계속 생성될텐데
//        스프링에서는 코드 한줄만 짜놓으면 각각 스레드를 할당받은 사용자가 고유객체를 통하기 때문에
//        사용자가 들어올때마다 생성할 필요없음. 코드한줄을 동일하게 다른 사용자가 사용

//        인스턴스변수 생성
//        생성자 : 모든 인스턴스 변수 초기화
//        모든 클래스에 getter 생성

//        1)회원가입
//        2)게시글 작성
//        3)회원목록조회 : 회원 email을 출력
//        4)회원상세조회 : 회원명, 회원 email, 회원작성 글수
//        5)게시글상세조회 : 제목, 작성자 email

        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("회원가입하실 이름을 입력해주세요");
            String name = sc.nextLine();
            System.out.println("회원가입하실 이메일을 입력해주세요");
            String email = sc.nextLine();
            System.out.println("회원가입하실 비밀번호를 입력해주세요");
            String password = sc.nextLine();
            Author author1 = new Author(name, email, password); // 생성자 형식 따라감
            System.out.println("가입사용자의 id는 " + author1.getId() + " 이름은 " + author1.getName());
            authors.add(author1);
            System.out.println("현재까지 가입자는 " + authors.size());
        }
//        실행
    }
}
//    엔티티 = 데이터베이스 테이블 레벨
class Author{
    private Long id;
    private String name;
    private String email;
    private String password;
    static Long static_id = 0L;
    Author(String name, String email, String password){
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}

class Post{
    private Long id = 0L;;
    private String title;
    private String contents;
    private Long author_id;
    static Long static_id = 0L;;
    Post(Long id, String title, String contents, Long author_id){
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author_id = author_id;
    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getContents() {
        return contents;
    }
    public Long getAuthor_id() {
        return author_id;
    }
}