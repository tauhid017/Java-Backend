public class Main {
    public static void main(String[] args) {

        Employee dev = new Developer(10000, 50000, "TauhidDev", 101);

        Employee manager = new Manager(
                15000,
                "TauhidManager",
                800000,
                102000
        );

        Employee intern = new Intern(
                12000,
                "TauhidIntern",
                15000
        );

        dev.displaydetials();
        System.out.println();

        manager.displaydetials();
        System.out.println();

        intern.displaydetials();
    }
}