import java.util.Arrays;
import java.util.Collections;
import java.lang.System;

interface interfaceAB {
    public String getInfo();
}

class A implements interfaceAB {
    public String getInfo() {
        return "this is a";
    }
}

class B extends A {
    public String getInfo() {
        return "this is b";
    }
    public String str;
}

class ModB {
    static void modb_str(B b){
        b.str = "after mod";
    }
}

public class Hello {
    Hello() {
        System.out.println("this is hello constructor");
    }

    static final String F = "asdf";

    static int[] numbers = {3,4};

    // 静态代码块
    // Java 虚拟机在加载类时执行静态代码块 多个静态代码块则在类中出现的顺序依次执行它们
    static {
        Hello.numbers[0] = 5;
        System.out.println(Arrays.toString(Hello.numbers));
    }

    // 语法越来越混乱了
    // 下面的代码在Hello实例化的时候执行 每次实例化都会执行
    // 早于构造执行 ！！！！
    {
        Hello.numbers[0] = 3;
        
        System.out.println("语法越来越混乱了");
        System.out.println(Arrays.toString(Hello.numbers));
    }


    public static void main(String[] args) {
        {
            for(int i = 0; i < Hello.numbers.length; ++i) {
                System.out.println(Hello.numbers[i]);
            }
    
            for(int it : Hello.numbers)
                System.out.println(it);
        }

        {
            char[][] a = {{'a', 'd'}, {'b'}, {'c'}};
            System.out.println(a);
        }

        // string
        {
            // String 不允许修改内部数据 StringBuffer允许修改内部
            // str -> int
            String str = "213";
            int n = Integer.parseInt(str);
            System.out.println(n);
            // int -> str
            String str2 = Integer.toString(n);
            System.out.println(str2);

            // begin, end
            String subStr = str.substring(1, 3);    // not include end. same as js
            System.out.println(subStr);

            // split
            System.out.println(Arrays.toString(str.split("1")));
            // for(String it : str.split("1"))     // param is regex not literally
            //     System.out.println(it);

            // replace not mod self
            // replaceAll param1 is regex not literally
            System.out.println(str.replace("21", "1234"));
            System.out.println(str.replaceAll("21", "1234"));
            System.out.println(str);
        }

        {
            interfaceAB a = new A();
            Object obj = a;
            A x = (A)obj;
            System.out.println(x.getInfo());

            A aa = new B();
            System.out.println(aa.getInfo());
        }

        // array
        // sort
        // array -> string
        {
            double[] scores = new double[]{4,3,2,1};
            Arrays.sort(scores);
            System.out.println(Arrays.toString(scores));
        }

        // class
        // [public] [abstract|final] class <class_name> [extends <class_name>]|[implements<interface_name>]
        {
            class Text {
                // [public|protected|private] [static] [final] <type> <variable_name>
                static final String inner = "this is Text class"; 
                public void modString(String a) {
                    a = "after mod";
                }
            }

            System.out.println(Text.inner);
            Text t = new Text();
            String str = "before Mod";
            t.modString(str);
            System.out.println(str);

            B b = new B();
            b.str = "before Mod";
            ModB.modb_str(b);
            System.out.println(b.str);
        }

        {
            Hello h = new Hello();
        }

        {
            System.out.println("asdf");
        }
    }
}