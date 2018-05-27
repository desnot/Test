import java.util.ArrayList;

/**
 * Created by Юра on 27.05.2018.
 */
public class Clinic {
    static ArrayList<Pet> pets = new ArrayList<>();
    static ArrayList<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);

    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    public String searchPet(String ownerName) {
        String result = "Pet is not found";
        for (Pet pet : pets) {
            if (pet.client.name == ownerName) {
                result = pet.name + " " + pet.age + " " + pet.type + " " + pet.client.name;
            }
        }
        return result;
    }

    public String searchClient(String petName) {
        String result = "Client is not found";
        for (Client client : clients) {
            if (client.pet.name == petName) {
                result = client.id + " " + client.name + " " + client.pet.name + " " + client.pet.type + " " + client.pet.age;
            }
        }
        return result;
    }

    public String changeNameClient(Client client, String newName) {
        String result = "Client is not found";
        for (Client isClient : clients) {
            if (isClient == client) {
                isClient.name = newName;
                result = "The new name is of client " + isClient.name;
            }
        }
        return result;
    }

    public String changeNamePet(Pet pet, String newName) {
        String result = "Pet is not found";
        for (Pet isPet : pets) {
            if (isPet == pet) {
                isPet.name = newName;
                result = "The new name is of pet " + isPet.name;
            }
        }
        return result;
    }


}
