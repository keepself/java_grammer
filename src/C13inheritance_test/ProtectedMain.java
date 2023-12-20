package C13inheritance_test;

import C13inheritance.C1304ProtectedClass;
import C13inheritance.C1304ProtectedClasstest;

import java.sql.SQLOutput;

public class ProtectedMain  extends C1304ProtectedClass {
    public static void main(String[] args) {
//        C1304ProtectedClass pt = new C1304ProtectedClass();
//
//        System.out.println(pt.st3);


        ProtectedMain pm = new ProtectedMain();
//        상속객체에서 protected 변수 접그 가능
        System.out.println(pm.st3);
        System.out.println(pm.st2);
    }
}
