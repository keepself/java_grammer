package C12ClassLecture;

public class C1201Constructor {
    public static void main(String[] args) {
        Calender date = new Calender("2023", "December", "13");

    }


}


class Calender {

    private String year;

    private String month;

    private String day;


    Calender(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;


    }
//  메서드 오버로딩을 통해 같은이름의 생성자 생성가능


//    Calender(String year, String month) {
//        this(year, month);
//    }


    Calender(String year) {
//         this() 키워드를 통해 클래스내 매개변수에 맞는 생성자 호출 가능
        this(year, null, null);
    }

}
