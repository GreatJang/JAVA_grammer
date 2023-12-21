package C15AnonymousLambda;

import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공 : Comparable, Comparator
//        Comparable(매개변수 1개) 인터페이스에는 compareTo메서드가 선언, 그리고 java의 많은 클래스에서 구현하고 있음. => 일반적으로 클래스내에서 직접 구현해서 사용방식.
//        Comparator(매개변수 2개) 언터페이스에는 compare메서드가 선언. => 일반적으로 익명객체를 만들어서 활용

//        두 문자열의 각 문자를 앞에서부터 순차적으로 비교
//        문자열의 자릿수의 차이가 발생할때, 그 문자의 유니코드 값의 차이를 반환.
//        String a = "hello";
//        String b = "world";
//        System.out.println(a.compareTo(b)); // 정렬에 활용 숫자값을 중요하지 않고 음수인지 양수인지 0인지가 더 중요
//
//        Integer intA = 1;
//        Integer intB = 1;
//        System.out.println(intA.compareTo(intB));
//
//        List<String> myList = new ArrayList<>();
//        myList.add(a);
//        myList.add(b);
//        Collections.sort(myList); //오름차순 // Comparable의 compareTo메서드를 통해 정렬
//        // 컬렉션 프레임워크 클래스에 sort가 정의 되어 있음 // List<>에 정의 되어 있는 String에 compareTo메서드를 통해 정렬
//        Collections.sort(myList, Comparator.reverseOrder());
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());
//
////        Student객체 정렬
//        List<Student> studentList = new ArrayList<>();
//        Student student1 = new Student("jang", 28);
//        Student student2 = new Student("kim", 22);
//        Student student3 = new Student("yang", 29);
//        Student student4 = new Student("baek", 21);
//        Student student5 = new Student("sin", 25);
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//        studentList.add(new Student("sin", 25)); // 합쳐서 표현 가능

//        System.out.println(studentList);
//        for (Student student : studentList) { // 향상 for문
//            System.out.println("학생이름 : " + student.getName() + " 학생나이 : " + student.getAge());
//        }
//
////        ⭐⭐⭐⭐ 방법1 : Comparator를 익명객체 방식으로 활용하여 정렬, 매개변수 2개 // 정렬 사용시 Comparator 사용하기
////        나이로 정렬
//        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge());
//        System.out.println(studentList);
////        return o1.getAge() - o2.getAge(); // 오름차순
////        return o2.getAge() - o1.getAge(); // 내림차순
//
////        이름으로 정렬
////        compareTo 사용
//        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); // compareTo를 사용해야 숫자값으로 나온다. // 오름차순
//        System.out.println(studentList);
//
////        글자길이수로 정렬 // 배열정렬
//        String[] stArr = {"hello", "java", "C++", "world2"};
//        Arrays.sort(stArr, (o1, o2) -> o1.length() - o2.length());
//        System.out.println(Arrays.toString(stArr));
//
////        Priority Queue 글자길이 내림차순
//        Queue<String> myQue1 = new PriorityQueue<>(Comparator.reverseOrder());
//        Queue<String> myQue2 = new PriorityQueue<>((o1, o2) -> o2.length() - o1.length());
//        Queue<String> myQue3 = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));

//        프로그래머스 가장 큰 수
//        3, 30, 34, 5, 9 : 문자 o1 + o2, o2 + o1 비교 9534330
//        이 문자로 이루어진 가장 큰 숫자를 구하라
//        아래 방식은 시간초과.
//        int[] numbers = {3, 30, 34, 5, 9};
//        StringBuilder answer = new StringBuilder();
//        String[] num = new String[numbers.length];
//        for (int i = 0; i < num.length; i++) {
//            num[i] = Integer.toString(numbers[i]);
//        }
//        for(int i=0; i<num.length; i++){
//            for(int j=i+1; j<num.length; j++){
//                if((num[i] + num[j]).compareTo(num[j] + num[i])<0){
//                    String temp = num[i];
//                    num[i] = num[j];
//                    num[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(num));

//        int[] numbers = {3, 30, 34, 5, 9};
////        int[] numbers = {0, 0, 0, 0, 0};
//        String[] num = new String[numbers.length];
//        for (int i = 0; i < num.length; i++) {
//            num[i] = Integer.toString(numbers[i]);
//        }
//        Arrays.sort(num, (o1, o2) -> (o2+o1).compareTo(o1+o2));
//
//        String answer = String.join("", num);
//        if(answer.charAt(0) == '0'){
//            System.out.println("0");
//        }
//        System.out.println(answer);

////        방법2 : Comparable를 인터페이스에 implements 후 compareTo메서드 구현, 매개변수 1개
//        Collections.sort(studentList);
//        System.out.println(studentList);

//        쓰레드 구현방식 : 쓰레드상속, Runnable방식
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 만든 쓰레드 입니다.");
            }
        });
        t1.start();

        new Thread(() -> System.out.println("main의 쓰레드 입니다.")).start();
        System.out.println("main의 쓰레드입니다.");


    }
}

class Student implements Comparable<Student>{
    private String name; // Student 객체 클래스에서 변수 선언
    private int age; // Student 객체 클래스에서 변수 선언

    Student(String name, int age) { // 생성자 : 해당하는 값 초기화
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //    조상클래스인 Object클래스의 toString을 overriding하여 객체호출시 자동으로 toString메서드 호출
    @Override
    public String toString() {
        return "이름은 " + this.name + " 나이는 " + this.age;
    }
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
