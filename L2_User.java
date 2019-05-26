public class L2_User {
    String name;
    short age;
    int height;

    public L2_User(String name, short age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public L2_User(String name, int height, short age){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public L2_User(int height, short age, String name){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public L2_User(int height, String name, short age){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public L2_User(short age, String name, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public L2_User(short age, int height, String name){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        L2_User user1 = new L2_User("Ivan", (short)252, 178);
        System.out.println(user1.age + " " +  user1.height + " " + user1.name);


    }
}
