import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math,physics,turkish,chemical,music;
        Scanner inp = new Scanner(System.in);

        //----------------------------------------------------------------------------

        System.out.print("Matematik Notunuz Kaçtır? :");
        math = inp.nextInt();

        System.out.print("Fizik Notunuz Kaçtır? :");
        physics = inp.nextInt();

        System.out.print("Türkçe Notunuz Kaçtır? :");
        turkish = inp.nextInt();

        System.out.print("Kimya Notunuz Kaçtır? :");
        chemical = inp.nextInt();

        System.out.print("Müzik Notunuz Kaçtır? :");
        music = inp.nextInt();

        //----------------------------------------------------------------------------

        if (math < 0 ||  math > 100)
            math = 0;

        if (physics < 0 ||  physics > 100)
            physics = 0;

        if (turkish < 0 ||  turkish > 100)
            turkish = 0;

        if (chemical < 0 ||  chemical > 100)
            chemical = 0;

        if (music < 0 ||  music > 100)
            music = 0;

        //----------------------------------------------------------------------------

        double average = ( (math + physics + turkish + chemical + music) / 5 );
        System.out.println("Ortalamanız : " + average);

        if (average >= 55) {
            System.out.println("Sınıfı Geçmeye Hak Kazandınız.");
        } else {
            System.out.println("Sınıfı Geçemediniz.");
            }
        }

    }
