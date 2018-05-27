/**
 * Created by Юра on 27.05.2018.
 */
public class Pet {
    public int id;
    public String name;
    public int age;
    public String type;
    Client client;

    public Pet(int id, String name, int age, String type, Client client) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.client = client;
    }
}
