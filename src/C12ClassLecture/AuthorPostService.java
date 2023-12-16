//package C12ClassLecture;
//
//import java.io.LineNumberInputStream;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class AuthorPostService {
//    public static void main(String[] args) {
//        List<Author> authors = new ArrayList<>();
//        List<Post> posts = new ArrayList<>();
//
////        해야할 작업
////        Post객체를 만들 때 author 객체를 넣어줘야함
////        Author객체에 post리스트를 만들려면, post생성 시 author객체의 postList에 add
////        ==> 별도의 add메서드 필요
//
//        while(true){
//            System.out.println("1번:회원가입, 2번:게시글작성, 3번:회원목록조회, 4번:회원상세조회, 5번:게시글상세조회 ");
//
//            Scanner sc = new Scanner(System.in);
//            int number = Integer.parseInt(sc.nextLine()); //Integer.parseInt() 메서드는 문자열을 정수로 변환합니다. 여기서는 사용자로부터 받은 문자열을 정수로 변환하고, 그 결과를 number 변수에 저장합니다.
//            switch (number){
//                case 1:
////                    회원가입
//                    System.out.println("회원가입하실 이름을 입력해주세요");
//                    String name = sc.nextLine();
//                    System.out.println("회원가입하실 이메일을 입력해주세요");
//                    String email = sc.nextLine();
//                    Author author1 = new Author(name, email);
//                    authors.add(author1);
//                    break;
//
//                case 2:
////                    게시글 작성
//                    System.out.println("작성자 email을 입력해주세요");
//                    String author_email = sc.nextLine(); // Long.parseLong() 메서드는 문자열을 long 형으로 변환합니다. 여기서는 사용자로부터 받은 문자열을 long 형으로 변환하고, 그 결과를 id 변수에 저장합니다.
//                    Author temp_author = null;
//                    for(Author a : authors){
//                        if(a.getEmail().equals(author_email)){
//                            temp_author = a;
//                            break;
//                        }
//                    }
//                    if (temp_author == null){
//                        System.out.println("없는 사용자 입니다.");
//                        continue;
//                    }
//                    System.out.println("게시글명을 입력해주세요");
//                    String title = sc.nextLine();
//                    System.out.println("게시글 내용을 입력해주세요");
//                    String contents = sc.nextLine();
//                    Post post1 = new Post(title, contents, temp_author);
//                    posts.add(post1);
//                    temp_author.getPosts();
//                    break;
//
//                case 3:
////                    회원목록 조회
//                    for(Author a : authors){
//                        System.out.println(a.getEmail());
//                    }
//                    break;
//
//                case 4:
////                    회원상세조회 : 이름, email, 작성글수
//                    System.out.println("author email를 입력해주세요");
//                    String author_email = sc.nextLine();
//                    Author temp_author = null;
//                    for(Author a : authors){
//                        if(a.getEmail().equals(author_email)){
//                            temp_author = a;
//                            break;
//                        }
//                    }
//                    int count = 0;
//                    for(Post p : posts){
//                        if(p.getAuthor_id() == temp_author.getId()){
//                            count++;
//                        }
//                    }
//                    System.out.println(temp_author.getName() + " " + temp_author.getEmail() + " " + count);
//                    break;
//
//                case 5:
////                    게시글상세조회
//                    System.out.println("post id를 입력해주세요");
//                    Long post_id = Long.parseLong(sc.nextLine());
//                    Post temp_post = null;
//                    for(int i=0; i<posts.size(); i++){
//                        if(posts.get(i).getId() == post_id){
//                            temp_post = posts.get(i);
//                            break;
//                        }
//                    }
//                    System.out.println(temp_post.getTitle() + " " + temp_post.getAuthor().getEmail());
//                    break;
//            }
//
//        }
//    }
//}
//
////엔티티
//class Author{
//    private Long id;
//    private String name;
//    private String email;
////    포스트 리스트 변수
//    private List<Post> posts;
//    static Long static_id = 0L;
//
//    Author(String name, String email){
//        static_id += 1;
//        this.id = static_id;
//        this.name = name;
//        this.email = email;
//        this.posts = new ArrayList<>();
//    }
//    void addPost(Post post){
//        this.posts.add(post);
//    }
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public List<Post> getPosts() {
//        return posts;
//    }
//
//}
//class Post{
//    private Long id;
//    private String title;
//    private String contents;
//    private Author author;
//    static Long static_id = 0L;
//    Post(String title, String contents, Author author){
//        static_id += 1;
//        this.id = static_id;
//        this.title = title;
//        this.contents = contents;
//        this.author = author;
//        this.author.addPost(this);
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContents() {
//        return contents;
//    }
//
//    public Author getAuthor() {
//        return this.author;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////public class AuthorPostService {
////    public static void main(String[] args) {
//////        사용자가 많으면 new로 계속 생성될텐데
//////        스프링에서는 코드 한줄만 짜놓으면 각각 스레드를 할당받은 사용자가 고유객체를 통하기 때문에
//////        사용자가 들어올때마다 생성할 필요없음. 코드한줄을 동일하게 다른 사용자가 사용
////
//////        인스턴스변수 생성
//////        생성자 : 모든 인스턴스 변수 초기화
//////        모든 클래스에 getter 생성
////
//////        1)회원가입
//////        2)게시글 작성
//////        3)회원목록조회 : 회원 email을 출력
//////        4)회원상세조회 : 회원명, 회원 email, 회원작성 글수
//////        5)게시글상세조회 : 제목, 작성자 email
////
////        List<Author> authors = new ArrayList<>();
////        List<Post> posts = new ArrayList<>();
////
////        while (true) {
////            Scanner sc1 = new Scanner(System.in);
////            int number = Integer.parseInt(sc1.nextLine());
////            System.out.println("이용하실 서비스를 선택해주세요 회원가입1, 게시글작성2, 회원목록조회3, 회원상세조회4, 게시글상세조회5");
////            Integer service = sc1.nextInt();
////            if (service == 1) {
//////                1) 회원가입
////                Scanner sc2 = new Scanner(System.in);
////                System.out.println("회원가입하실 이름을 입력해주세요");
////                String name = sc2.nextLine();
////                System.out.println("회원가입하실 이메일을 입력해주세요");
////                String email = sc2.nextLine();
////                System.out.println("회원가입하실 비밀번호를 입력해주세요");
////                String password = sc2.nextLine();
////                Author author1 = new Author(name, email, password); // 생성자 형식 따라감
////                System.out.println("가입사용자 id: " + author1.getId() + " 이름: " + author1.getName() + " 이메일: " + author1.getEmail() + " 비밀번호: " + author1.getPassword());
////                authors.add(author1);
////                System.out.println("현재까지 가입자는 " + authors.size());
////            }
//////            2)게시글 작성
////            if (service == 2) {
////                Scanner sc2 = new Scanner(System.in);
////                System.out.println("게시글 제목을 입력해주세요");
////                String title = sc2.nextLine();
////                System.out.println("게시글 내용을 입력해주세요");
////                String contents = sc2.nextLine();
////                Post post1 = new Post(title, contents); // 생성자 형식 따라감
////                System.out.println("게시글 id: " + post1.getId() + " 게시글 제목:  " + post1.getTitle() + " 게시글 내용: " + post1.getContents());
////                posts.add(post1);
////                System.out.println("현재까지 총 게시글 수는 " + posts.size());
////            }
//////            3)회원목록조회 : 회원 email을 출력
////            if (service == 3) {
////                //        for(int[] a : myList){ // ⭐Enhanced for문
//////            System.out.println(Arrays.toString(a));
////                for(Author a : authors){ // List 출력 // a에 authors 값을 입력
////                    System.out.println(a.getEmail()); // a 에 담은 Email정보를 출력
////                }
////            }
//////            4)회원상세조회 : 회원명, 회원 email, 회원작성 글수
////            if(service == 4){
////                Scanner sc2 = new Scanner(System.in);
////                System.out.println("조회하실 author email을 입력해주세요");
////                String author_email = sc2.nextLine();
////                Author temp_author = null;
////                for(Author a : authors){
////                    if(a.getId().equals(author_email)){
////                        temp_author =a;
////                        System.out.println("이름: " + a.getName() + " 이메일 " + a.getEmail());
////                    }
////                }
////                int count =0;
////                for(Post p : posts){
////                    if(p.getAuthor_id() == temp_author.getId()){
////                        count++;
////                    }
////                }
////            }
////            System.out.println("이름: " + a.getName() + " 이메일 " + a.getEmail());
////
////
////
////
//////            5)게시글상세조회 : 제목, 작성자 email
////            if(service == 5){
////                Scanner sc2 = new Scanner(System.in);
////                System.out.println("조회하실 게시글 id를 입력해주세요");
////                Long id = sc2.nextLong();
////                for(Post a : posts) {
////                    for(Author b : authors){
////                        if (id == a.getId()) {
////                            System.out.println("제목: " + a.getTitle() + " 이메일: " + b.getEmail());
////                        }
////                    }
////                }
////            }
////
////
////
////
////        }
////    }
////}
////
//////    엔티티 = 데이터베이스 테이블 레벨
////class Author{
////    private Long id;
////    private String name;
////    private String email;
////    private String password;
////    static Long static_id = 0L;
////    Author(String name, String email, String password){
////        static_id += 1;
////        this.id = static_id;
////        this.name = name;
////        this.email = email;
////        this.password = password;
////    }
////
////    public Long getId() {
////        return id;
////    }
////    public String getName() {
////        return name;
////    }
////    public String getEmail() {
////        return email;
////    }
////    public String getPassword() {
////        return password;
////    }
////}
////
////class Post{
////    private Long id = 0L;;
////    private String title;
////    private String contents;
////    private Long author_id;
////    static Long static_id = 0L;;
////    Post(String title, String contents){
////        static_id += 1;
////        this.id = static_id;
////        this.title = title;
////        this.contents = contents;
////        this.author_id = Author.static_id;
////    }
////
////    public Long getId() {
////        return id;
////    }
////    public String getTitle() {
////        return title;
////    }
////    public String getContents() {
////        return contents;
////    }
////    public Long getAuthor_id() {
////        return author_id;
////    }
////}