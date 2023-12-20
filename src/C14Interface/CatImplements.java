package C14Interface;

public class CatImplements  implements Animalinterface1 {

    @Override
    public void makesound() {
        System.out.println("냐옹");
    }
}


class CatMultiImplements  implements Animalinterface1, AnimalInterface2 {

    @Override
    public void makesound() {
        System.out.println("냐옹");


    }

    @Override
    public String play(String a, String b) {
        return a + "와 " + b +"가 놉니다.";
    }
}