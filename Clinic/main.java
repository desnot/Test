/**
 * Created by Юра on 27.05.2018.
 */
public class main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        Client client1 = new Client(0, "Yurya");
        clinic.addClient(client1);
        Pet pet1 = new Pet(0, "Cat", 2, "Cat", client1);
        clinic.addPet(pet1);
        client1.addPetForClient(pet1);

        Client client2 = new Client(1, "Vasya");
        clinic.addClient(client2);
        Pet pet2 = new Pet(1, "Dog", 2, "Dog", client2);
        clinic.addPet(pet2);
        client2.addPetForClient(pet2);

        for (Client client : clinic.clients) {
            System.out.println(client.name + " his pet is " + client.pet.name);
        }

        for (Pet pet : clinic.pets) {
            System.out.println(pet.name + " owner is " +  pet.client.name);
        }

        System.out.println("-----------------------");

        clinic.removeClient(client1);
        clinic.removePet(pet2);

        for (Client client : clinic.clients) {
            System.out.println(client.name + " his pet is " + client.pet.name);
        }

        for (Pet pet : clinic.pets) {
            System.out.println(pet.name +" owner is "+ pet.client.name);
        }

        System.out.println("-----------------------");
        System.out.println(clinic.searchPet(client1.name));
        System.out.println(clinic.searchClient(pet2.name));
        System.out.println("-----------------------");
        System.out.println(clinic.changeNameClient(client2, "Vorobushek"));
        System.out.println(clinic.changeNamePet(pet1, "Molodec"));
    }
}
