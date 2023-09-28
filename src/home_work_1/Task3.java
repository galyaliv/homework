/* Изучить библиотеку (класс) Math из jdk. (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)
Отразить эксперименты в сданной домашней работе. Материалов в интернете очень много*/

package home_work_1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // решение квадратного уравнения
        double x1;
        double x2;
        double D;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        double a = in.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = in.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = in.nextDouble();

        //рассчет дискриминанта
        D = Math.pow(b, 2) - 4 * a * c;
        //вычисление корней уравнения при положительном дискриминанте
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Решение квадратного уравнения: x1 = " + x1+  ", x2 = " + x2); //печать результата
        }
        else if (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("Решение квадратного уравнения: x = " + x1); //печать результата
        }
        else {
            System.out.println("Корней нет"); //печать результата
        }

        //другие примеры
        //ссылка с примером (первая дробь): http://studzakaz.com/resheniealgebra28.htm
        int x = 30;
        //печать результата
        System.out.println((Math.pow((Math.cos(x)),2) + 2*Math.pow((Math.sin(x-Math.PI)),2)) / (Math.pow(Math.cos(x-4*Math.PI),3)));

        //ссылка с примером (первый) http://www.cleverstudents.ru/expressions/transformations_of_expressions_with_logarithms.html
        double y = 100;
        //печать результата
        System.out.println( Math.log(Math.sqrt(Math.pow(y,2)-3)+3) * Math.log(Math.sqrt(Math.pow(y,2)-3)-1) );
    }
}