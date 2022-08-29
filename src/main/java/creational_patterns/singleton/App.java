package creational_patterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class App {

    public static void main(String[] args) throws Exception {

        Settings4 setting = Settings4.getInstance();
        Settings4 settingReflection;
        Settings4 settingSerializable;


        /**
         * 리플렉션으로 싱글톤 파훼
         * 리플랙션을 이용하여 Settings 클래스에 생성자를 가져와서 생성하여 새로운 Settings 클래스를 생성
         *
         * 해결방법
         * enum 클래스로 생성하면 방지가능 (Settings5)
         * enum 클래스에 경우 리플렉션에서 생성자로 생성불가하게 제한되어있어서 방지가능
         * 근데 이렇게까지 해서 싱글톤을 파훼할까 싶긴하다.. 그냥 Setting4 정도면 충분할듯
         */

        Constructor<Settings4> constructor = Settings4.class.getDeclaredConstructor();
        constructor.setAccessible(true); // true 일경우 private 한 생성자에도 접근이 가능
        settingReflection = constructor.newInstance();

        System.out.print("setting settingReflection : ");
        System.out.println(setting == settingReflection);

        /**
         * 직렬화 & 역직렬화를 사용하여 파훼
         * 직렬화하여 파일로 저장한 객체를 역직렬화를 하게될경우 반드시 생성자를 이용하여 만들어주기때문에 새로운 Settings4 클래스를 생성
         *
         * 해결방법
         * 역직렬화 하는 과정에서 해당 클래스에 readResolve 메소드를 호출하는데
         * 해당 클래스에 readResolve 메소드에 싱글톤 객체를 리턴시키면 방지가능
         */

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Settings4.obj"))) {
            out.writeObject(setting);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("Settings4.obj"))) {
            settingSerializable = (Settings4) in.readObject();
        }

        System.out.print("setting settingSerializable : ");
        System.out.println(setting == settingSerializable);

    }

}
