class Human
{
    private int age;
    private String name;
    private String gender;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    

    // public int getAge()
    // {
    //     return age;
    // }

    // public void setAge(int a)
    // {
    //     age = 29;
    // }

    // public String getName()
    // {
    //     return name;
    // }

    // public void setName(String n)
    // {
    //     name = n;
    // }

    // public String getGender()
    // {
    //     return gender;
    // }

    // public void setGender(String g)
    // {
    //     gender = g;
    // }

}

public class getset 
{
    
    public static void main(String[] args) 
    {
        Human human = new Human();
        human.setName("John");
        human.setAge(29);
        human.setGender("Male");

    }
}
