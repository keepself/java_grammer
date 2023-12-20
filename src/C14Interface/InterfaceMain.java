package C14Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements mycat = new CatImplements();
        mycat.makesound();

        DogImplements mydog = new DogImplements();
        mydog.makesound();

        CatMultiImplements myMultiCat = new CatMultiImplements();
        myMultiCat.makesound();
//        타입을 interface1으로 선언하면 interface2에 정의된 메서드는 사용불가
        System.out.println(myMultiCat.play("코리안숏헤어", "브리티시폴드"));
        AnimalInterface2 myMultiDog = new DogMultiImplements();
//        타입을 interface2로 선언하면 inface1에 정의된 메서드 사용불가
//        myMultiDog.makesound();
        System.out.println(myMultiDog.play("시바견", "진돗개"));


//      기본적으로 추상클래스, 인터페이스 객체 생성이 불가능하나, 익명내부클래스 방식으로 사용가능
        Animalinterface1 ai = new Animalinterface1() {
            @Override
            public void makesound() {

            }
        };
    }
}
