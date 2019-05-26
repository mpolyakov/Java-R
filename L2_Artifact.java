public class L2_Artifact {

    int id;
    int age;
    String nation;
    public L2_Artifact(){};
    public L2_Artifact(int id){
        this.id = id;
    }
    public L2_Artifact(int id, String nation){
        this.id = id;
        this.nation = nation;
    }
    public L2_Artifact(int id, String nation, int age){
        this.id = id;
        this.nation = nation;
        this.age = age;
    }

    public static void main(String[] args) {

        L2_Artifact art1 = new L2_Artifact(32124343);
        L2_Artifact art2 = new L2_Artifact(2412432, "Canada");
        L2_Artifact art3 = new L2_Artifact(342423424, "America", 12 );

    }
}
