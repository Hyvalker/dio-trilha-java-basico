public class PetCleaningMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void showerPet() {
        if (this.pet == null) {
            System.out.println("Colocar o Pet na maquina.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O Pet: " + pet.getName() + " esta limpo.");

    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de agua da maquina esta no maximo.");
            return;
        }
        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da maquina esta no maximo.");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A maquina esta suja. Para colocar o Pet é necessário limpa-la.");
            return;
        }

        if (this.pet != null) {
            System.out.println("O Pet: " + this.pet.getName() + " esta na maquina nesse momento");
            return;
        }

        this.pet = pet;
    }
        public void removePet() {

        if (this.pet == null) {
            System.out.println("Nao ha pet na maquina para ser removido.");
            return;
        }

        this.clean = this.pet.isClean();

        System.out.println("O Pet: " + this.pet.getName() + " foi retirado da maquina");
        this.pet = null;

    }


    public void washMachine () {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina esta limpa.");
    }
}
