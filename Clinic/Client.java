/**
 * Created by Юра on 27.05.2018.
 */
public class Client {
    public int id;
    public String name;
    public Pet pet;

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addPetForClient(Pet pet)
    {
        this.pet = pet;
    }
}
