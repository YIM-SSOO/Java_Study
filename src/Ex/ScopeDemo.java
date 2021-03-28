package Ex;

public class ScopeDemo {
    static void a() {
        String title = "coding everyDay";
    }
    public static void main(String[] args) {
        a();
        System.out.println();
    }
}
