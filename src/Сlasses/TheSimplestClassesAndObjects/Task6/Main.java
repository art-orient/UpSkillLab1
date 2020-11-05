package Сlasses.TheSimplestClassesAndObjects.Task6;
/* 6. Составьте описание класса для представления времени.
  Предусмотрите возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой
  допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
  Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class Main {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(2, 4, 15);
        System.out.println(myTime.getTime());
        MyTime myTime2 = new MyTime();
        System.out.println(myTime2.getTime());
        myTime.changeHours(30);
        System.out.println(myTime.getTime());
        myTime2.changeMinutes(-310);
        System.out.println(myTime2.getTime());
        myTime.changeSeconds(380);
        System.out.println(myTime.getTime());
        myTime2.changeSeconds(-380);
        System.out.println(myTime2.getTime());
    }
}
