package C13inheritance;

import java.sql.SQLOutput;

public class C1304ProtectedClasstest {
    public static void main(String[] args) {

        C1304ProtectedClass pt = new C1304ProtectedClass();
//        default 접근가능
        System.out.println(pt.st2);
//        private 접근 불가능
//        System.out.println(pt.st1);

        System.out.println(pt.st3);

        System.out.println(pt.st4);

        C1304ProtectedClasstest pc =new C1304ProtectedClasstest();
//        System.out.println(pc.st);
    }
}
