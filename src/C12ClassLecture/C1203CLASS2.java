package C12ClassLecture;

public class C1203CLASS2 {
    public static void main(String[] args) {
        //Person클래스를 만들고
//객체변수는 name, email, password, age
//        객체머서드 whoIs() : name, email, password, age 입니다. ->출ㄹ력
//        객체 생성후 whoIs메서드 호출
        Person a = new Person();
//        변수값에 직접 접근하여 값을 할당하는 방식
        a.setName("dlckdtjs");
        System.out.println(a.getName());



    }
    }

class Person {

    private String name;
    private int age;
    private String eamil;
    private int password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 10) {
            System.out.println("이름이 너무깁니다");
        } else {
            this.name = name;
            System.out.println("정상 세팅 되었습니다.");
        }

    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        if (!eamil.contains("@")) {
        System.out.println("확인되지 않는 이메일입니다");
    }else
    {
        this.eamil = eamil;
    }
    }


    //setter ,getter
    public void whoIs(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("email : " + eamil);
        System.out.println("비밀번호 : " + password );
    }

    public String whoIs2(){
        return "이름 : " + name + "나이 : " + age + "email : " + eamil+ "비밀번호 : " + password ;

    }

}