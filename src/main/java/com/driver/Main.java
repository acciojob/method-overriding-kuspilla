package com.driver;

public class Main {

    public static class A{
        public String math(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        public  String math(){

            return "Method is overridden in Extendend class B" ;
        }
    }

    public static void main(String[] args){
        B obj = new B();
          obj.math();
          B obj1 = new B();
          obj1.math();

    }
}