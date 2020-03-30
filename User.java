import java.util.ArrayList;

class User {
    private String name;
    private String email;
    private int age;
    private ArrayList<Point> points;
    //private int numberOfPoints;

    User() {
        this.name = null;
        this.email = null;
        this.age = 0;
        this.points = new ArrayList<>();
        //this.numberOfPoints = 0;
    }

    User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.points = new ArrayList<>();
        //this.numberOfPoints = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Imie: " + name + " Email: " + email + " Wiek: " + age
                +" List punktów użytkownika: " + points;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        //this.numberOfPoints = points.size();
        this.points = points;
    }

    public void addPoint(Point point) {
        //this.numberOfPoints++;
        this.points.add(point);
    }

    public void removePoint(Point point) {
        //this.numberOfPoints--;
        this.points.remove(point);
    }
}
