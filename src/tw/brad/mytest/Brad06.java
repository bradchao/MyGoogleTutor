package tw.brad.mytest;

public class Brad06 {
    public static void main(String[] args){
        int year = 2019;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    // 2000
                    // ok
                }else{
                    // 2100
                    // xx
                }
            }else{
                // 2016
                // ok
            }
        }else{
            // 2019
            // xx
        }
    }
}
