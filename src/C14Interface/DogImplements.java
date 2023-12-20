package C14Interface;

public class DogImplements implements Animalinterface1 {


    @Override
    public void makesound() {
        System.out.println("멍뭉");
    }
}

class DogMultiImplements implements Animalinterface1, AnimalInterface2 {


    @Override
    public void makesound() {
        System.out.println("멍뭉");
    }

    @Override
    public String play(String a, String b) {
        return a + "와 " + b +"가 놉니다.";
    }
}