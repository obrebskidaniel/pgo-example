public class Main {

    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1);
        u1.setName("Daniel");
        u1.setEmail("daniel.obrebski@me.com");
        System.out.println(u1);
        System.out.println(u1.getName());

        User u2 = new User("Test", "test@test.com", 40);
        System.out.println(u2);
        System.out.println(u2.getAge());


        Point p = new Point();
        System.out.println(p);

        Point p2 = new Point(3);
        System.out.println(p2);

        Point p3 = new Point( 5, 8);
        System.out.println(p3);

        Point p4 = new Point(p3);
        System.out.println(p4);

        p4.setX(2);
        System.out.println(p4);

        u2.addPoint(p);
        u2.addPoint(p2);
        u2.addPoint(p3);
        u2.addPoint(p4);

        System.out.println(u2);
        System.out.println(u2.getPoints());

        u2.removePoint(p4);
        u2.removePoint(p);

        System.out.println(u2.getPoints());

        System.out.println(u2.getPoints().size());
    }
}
