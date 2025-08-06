package org.example;

public class FinalKeyword {
    public static void main(String[] args) {
//        Test.CONSTANT = 10; <- not correct
        final int X = 10;
        System.out.println(X);

    }
}
class Test{
    public static final int CONSTANT = 0;

//    Test(int CONSTANT) { <- not correct if you put the value already in the definition
//        this.CONSTANT = CONSTANT;
//    }
//    public void setConstant(int CONSTANT){ <- not correct if you have constructor or if you put the value already in the definition
//        this.CONSTANT = CONSTANT;
//    }
}
