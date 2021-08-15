package Lesson1;

public class Road extends Barrier {
    private int lenght;

    public Road(String name, int lenght) {
        super(name);
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("The road " + super.getName() + " lenght: " + this.lenght);

        actions.run();

        if (getLenght() <= actions.getRunDistance()) {
            System.out.println("run success");

            return true;
        } else {
            System.out.println("run unsuccessfully");
            return false;
        }
    }
}
