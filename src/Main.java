public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Skypro!");

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух боксеров составляет " + totalWeight + " кг");
        var WeightDifference = boxerWeight1 - boxerWeight2;
        System.out.println("Разница в весе двух боксеров составляет " + WeightDifference + " кг");

        WeightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе двух боксеров составляет " + WeightDifference + " кг");
        WeightDifference = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе двух боксеров составляет " + WeightDifference + " кг");

        var TotalHours = 640;
        var EmployeeHours = 8;
        var NumberOfEmployees = TotalHours / EmployeeHours;
        System.out.println("Всего работников в компании – " + NumberOfEmployees + " человек");

        NumberOfEmployees = NumberOfEmployees + 94;
        TotalHours = NumberOfEmployees * EmployeeHours;
        System.out.println("Если в компании работает " + NumberOfEmployees + " человека, то всего " + TotalHours + " часов работы может быть поделено между сотрудниками");
            }
}