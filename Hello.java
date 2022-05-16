interface interfaceAB {
    public String getInfo();
}

class A implements interfaceAB {
    public String getInfo() {
        return "this is a";
    }
}

class B implements interfaceAB {
    public String getInfo() {
        return "this is b";
    }
}

public class Hello {
    static final String F = "asdf";

    static int[] numbers = {3,4};
    public static void main(String[] args) {
        {
            for(int i = 0; i < Hello.numbers.length; ++i) {
                System.out.println(Hello.numbers[i]);
            }
    
            for(int it : Hello.numbers)
                System.out.println(it);
        }

        {
            String str = "str";
            System.out.println(str);
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
            for(String it : str.split("1"))     // param is regex not literally
                System.out.println(it);

            // replace not mod self
            // replaceAll param1 is regex not literally
            System.out.println(str.replace("21", "1234"));
            System.out.println(str.replaceAll("21", "1234"));
            System.out.println(str);

            // 
        }

        {
            interfaceAB a = new A();
            Object obj = a;
            A x = (A)obj;
            System.out.println(x.getInfo());
        }
    }
}