package day33_varargs_stringBuilder;

public class Go {

        public static void main(String[] args) {
            new Go().Go(3,"hello", "a","b","c");
            new Go().Go(1,"hello","hi","w");
        }
        public void Go(int x,String... y){
            System.out.print(y[y.length-x]+" ");
        }
    }

