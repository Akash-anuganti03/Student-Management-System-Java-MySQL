public class studentclass {

    private int id;
    private String name;
    private String branch;
    private int age;

    public studentclass(int id, String name,
                   String branch, int age) {

        this.id = id;
        this.name = name;
        this.branch = branch;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return id + " " +
                name + " " +
                branch + " " +
                age;
    }
}
