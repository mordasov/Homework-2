public class Main {
    public static void main(String[] args) {

        //task-1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");

        //task-2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");

        //task-3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");

        //task-4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /=7;
        System.out.println(friend + "\n");

        //task-5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /=3.5;
        System.out.println(frog);
        frog +=4;
        System.out.println(frog + "\n");

        //task-6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println(totalWeight);
        var differenceWeight = boxerWeight1 - boxerWeight2;
        System.out.println(differenceWeight + "\n");

        //task-7
        var weight1 = 100;
        var weight2 = 95;
        var weight3 = weight1 % weight2;
        System.out.println(weight3 + "\n");

        //task-8
        var totalHours = 640;
        var time = 8;
        var numberOfWorkers = totalHours / time;
        System.out.println("Всего работников в компании - " + numberOfWorkers + " человек.\n");

        numberOfWorkers += 94;
        totalHours = numberOfWorkers * time;
        System.out.println("Если в компании работает " + numberOfWorkers + " человек, то всего " +
                totalHours + " часов работы может быть поделено между сотрудниками.");
    }
}