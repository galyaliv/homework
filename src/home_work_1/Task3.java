/* Изучить библиотеку (класс) Math из jdk. (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)
Отразить эксперименты в сданной домашней работе. Материалов в интернете очень много*/

package home_work_1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // решение квадратного уравнения
        Scanner in = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        double a = in.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = in.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = in.nextDouble();
        double[] result;

        if (Math.pow(b, 2) - 4 * a * c >= 0){
            result = roots(a, b, c);
            System.out.println("Решение квадратного уравнения: x1 = " + result[0] + ", x2 = " + result[1]);
        }
        else{
            System.out.println("Корней нет");
        }

        double x = 30;
        double result1 = equation1(x);
        System.out.println("result1 = " + result1);

        double y = 100;
        double result2 = equation2(y);
        System.out.println("result2 = " + result2);
    }

    public static double equation1(double x){
        return (Math.pow((Math.cos(x)),2) + 2*Math.pow((Math.sin(x-Math.PI)),2)) / (Math.pow(Math.cos(x-4*Math.PI),3));
    }
    public static double equation2(double y){
        return Math.log(Math.sqrt(Math.pow(y,2)-3)+3) * Math.log(Math.sqrt(Math.pow(y,2)-3)-1);
    }

    public static double[] roots(double a, double b, double c){
        double[] roots = new double[2];
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            roots[0] = (-b + Math.sqrt(D)) / (2 * a);
            roots[1] = (-b - Math.sqrt(D)) / (2 * a);
        }
        else if (D == 0) {
            roots[0] = -b / (2 * a);
            roots[1] = -b / (2 * a);
        }
        return roots;
    }
}