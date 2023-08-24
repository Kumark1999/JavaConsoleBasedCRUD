public class User {
    private Long id;
    private String name;
    private int age;
    private String education;
    private String state;
    private String gender;

    public User(){
        super();
    }
    public User(Long id, String name, int age, String education, String state, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.education = education;
        this.state = state;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", state='" + state + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
