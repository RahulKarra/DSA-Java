package Learn_Java.src.Java_practice;

/*
A  pseudocode from Accenture test from YouTube
onlinestudy4u

 */
public class Checking {
    public static void main(String[] args) {
    int a=9;
    int b=9;

        System.out.println(funn(a,b));
    }

    static int funn(int a, int b) {
        if (b>7 && (1+a) > (a^b))
        {
            a=3+a+b;
            b=(a+2)+b;
            return b+funn(b,a)-a+2;
        }
        a=b+2;
        return a;
    }
}
