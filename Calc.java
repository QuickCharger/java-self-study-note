interface Calculable {
    int calculateInt(int a, int b);
}

class CalcLambda {
    public static Calculable calculate (char op) {
        Calculable ret;
        if(op == '+') {
            ret = (int a, int b) -> {
                return a + b;
            };
        } else {
            ret = (int a, int b) -> {
                return a - b;
            };
        }
        return ret;
    }
}

class CalcClass {
    public static Calculable calculate(char op) {
        Calculable ret;
        if(op == '+') {
            ret = new Calculable() {
                public int calculateInt(int a, int b) {
                    return a + b;
                }
            };
        } else {
            ret = new Calculable() {
                public int calculateInt(int a, int b) {
                    return a - b;
                }
            };
        }
        return ret;
    }
} 

public class Calc {
    public static Calculable calculate(char op) {
        Calculable ret;
        if(op == '+') {
            ret = new Calculable() {
                public int calculateInt(int a, int b) {
                    return a + b;
                }
            };
        } else {
            ret = new Calculable() {
                public int calculateInt(int a, int b) {
                    return a - b;
                }
            };
        }
        return ret;
    }

    // 如果一个接口中，有且只有一个抽象的方法（Object 类中的方法不包括在内） 可以按照下面的方式写
    public static Calculable calculate2(char op) {
        Calculable ret;
        if(op == '+') {
            ret = (int a, int b) -> {
                    return a + b;
                };
        } else {
            ret = (int a, int b) -> {
                    return a - b;
                };
        }
        return ret;
    }
    public static void main(String[] args) {
        Calculable opPlus = Calc.calculate('+');
        Calculable opMinus = Calc.calculate('-');
        System.out.println(opPlus.calculateInt(1,2));
        System.out.println(opMinus.calculateInt(1, 2));
    }
} 
