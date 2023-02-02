public class Main {
    public static void main(String[] args) {

            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
        }

            public static void task1(){
            System.out.println("Задача 1");
            int age1 = 18;
            int age2 = 17;
            if (age1 >= 18) {
                System.out.println("Если возраст человека равен " + age1 + " , то он совершеннолетний ");
            }
            if (age2 < 18) {
                System.out.println("Если возраст человека равен " + age2 + " , то он не достиг совершеннолетия," +
                        " нужно немного подождать");
            }
            System.out.println();
        }
            public static void task2(){
            System.out.println("Задача 2");
            int temp1 = 2;
            int temp2 = 10;
            if (temp1 < 5) {
                System.out.println("На улице " + temp1 + " градуса , нужно надеть шапку.");
            }
            if (temp2 >= 5) {
                System.out.println("Сегодня " + temp2 + " градусов, можно идти без шапки.");
            }
            System.out.println();
        }
            public static void task3(){
            System.out.println("Задача 3");
            int speed1 = 55;
            int speed2 = 70;
            if (speed1 <= 60) {
                System.out.println("Если скорость " + speed1 + " км/ч, можно ездить спокойно.");
            }
            if (speed2 >= 60) {
                System.out.println("Если скорость " + speed2 + " км/ч, то придется заплатить штраф.");
            }
            System.out.println();
        }
            public static void task4() {
            System.out.println("Задача 4");
            int child = 3;
            if (child >= 2 || child <= 6) {
                System.out.println("Если возраст человека равен " + child +
                        ", то ему нужно ходить детский сад.");
            }
            int teenager = 10;
            if (teenager >= 7 || teenager > -18) {
                System.out.println("Если возраст человека равен " + teenager +
                        " , то ему нужно ходить в школу");
            }
            int student = 20;
            if (student >= 18 && student <= 24) {
                System.out.println("Если возраст человека равен " + student +
                        ", то ему нужно ходить в униветситет");
                int worker = 30;
                if (worker >= 24)
                    System.out.println("Если возраст человека равен " + worker +
                            ", то ему нужно ходить на работу");
            }
            System.out.println();
        }
            public static void task5() {
            System.out.println("Задача 5");
            int child = 5;
            if (child < 5) {
                System.out.println("Если возраст ребенка меньше " + child +
                        " лет, то ему : можно кататься на аттракционе.");

            } else {
                System.out.println("Если возраст ребенка меньше " + child +
                        " лет, то ему : нельзя кататься на аттракционе.");
            }
            int child1 = 10;
            if (child1 > 5 || child1 < 14) {
                System.out.println("Если возраст ребенка равен " + child1 +
                        " лет , то ему : можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + child1 +
                        " лет, то ему : можно кататься на аттракционе.");
            }
            int child2 = 14;
            if (child2 < 14) {
                System.out.println("Если возраст ребенка меньше " + child2 +
                        " лет, то ему : нельзя кататься на аттракционе");
            } else {
                System.out.println("Если возраст ребенка равен " + child2 +
                        "лет, то ему : можно кататься на аттракционе.");
            }
            System.out.println();
        }
            public static void task6(){
            System.out.println("Задача 6");
            int total = 102;
            int sedentary = 60;
            int standing = total - sedentary;
            if (total > sedentary + standing);
            System.out.println("Свободкых мест нет");
            System.out.println();
        }
            public static void task7(){
            System.out.println("Задача 7");
            int one = 40;
            int two = 50;
            int three = 200;
            if (one > two)
                if (one > three){
                    System.out.println(one);}
                else {
                    System.out.println(three);}
            else if (two > one)
                if (two > three){
                    System.out.println(two);}
                else {
                    System.out.println(three);}
            else {
                if (one > three);{
                    System.out.println(one);}
                if (three > one){
                    System.out.println(three);}
                else {
                    System.out.println();
                }

            }



        }





        }


