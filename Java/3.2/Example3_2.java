public class Example3_2 {
    public static void main(String arg[]){
        int a = 9, b = 5, c = 7, t = 0;
        if(a > b){
            t = a;
            a = b;
            b = t;
        }
        if(a > c){
            t = a;
            a = c;
            c = t;
        }
        if(b > c){
            t = b;
            b = c;
            c = t;
        }
        System.out.println("从小到大："+a+" "+b+ " "+c);
    }
}
