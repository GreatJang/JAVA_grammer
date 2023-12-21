package C15AnonymousLambda;

import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공 : Comparable, Comparator
//        Comparable(매개변수 1개) 인터페이스에는 compareTo메서드가 선언, 그리고 java의 많은 클래스에서 구현하고 있음. => 일반적으로 클래스내에서 직접 구현해서 사용방식.
//        Comparator(매개변수 2개) 언터페이스에는 compare메서드가 선언. => 일반적으로 익명객체를 만들어서 활용

//        두 문자열의 각 문자를 앞에서부터 순차적으로 비교
//        문자열의 자릿수의 차이가 발생할때, 그 문자의 유니코드 값의 차이를 반환.
        String a = "hello";
        String b = "world";
        System.out.println(a.compareTo(b)); // 정렬에 활용 숫자값을 중요하지 않고 음수인지 양수인지 0인지가 더 중요

        Integer intA = 1;
        Integer intB = 1;
        System.out.println(intA.compareTo(intB));

        List<String> myList = new ArrayList<>();
        myList.add(a);
        myList.add(b);
        Collections.sort(myList); //오름차순 // Comparable의 compareTo메서드를 통해 정렬
        // 컬렉션 프레임워크 클래스에 sort가 정의 되어 있음 // List<>에 정의 되어 있는 String에 compareTo메서드를 통해 정렬
        Collections.sort(myList, Comparator.reverseOrder());
        myList.sort(Comparator.naturalOrder());
        myList.sort(Comparator.reverseOrder());

//        Student객체 정렬
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("jang", 28);
        Student student2 = new Student("kim", 22);
        Student student3 = new Student("yang", 29);
        Student student4 = new Student("baek", 21);
        Student student5 = new Student("sin", 25);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(new Student("sin", 25)); // 합쳐서 표현 가능

//        System.out.println(studentList);
//        for (Student student : studentList) { // 향상 for문
//            System.out.println("학생이름 : " + student.getName() + " 학생나이 : " + student.getAge());
//        }

//        방법1 : Comparator를 익명객체 방식으로 활용하여 정렬, 매개변수 2개
//        나이로 정렬
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                기본은 오름차순 정렬하려고 시도
                return o1.getAge() - o2.getAge(); // 오름차순
//                return o2.getAge() - o1.getAge(); // 내림차순
            }
        });
        System.out.println(studentList);
//        이름으로 정렬
//        방법2 : Comparable인터페이스 implements 후 compareTo메서드 구현, 매개변수 1개
//        Collections.sort(studentList);

    }
}

class Student {
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
}
