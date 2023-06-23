import java.util.Random;

public class AnakinSkywalker extends Jedi implements Sith {
    public AnakinSkywalker() {
        super(150, true);
    }

    @Override
    public void engeddElAHaragod() {
        Random random = new Random();
        setEro(getEro() + random.nextDouble(0, 10));
    }

    @Override
    public boolean megteremtiAzEgyensulyt() {
        return getEro() > 1000;
    }

    @Override
    public String toString() {
        return "Anakin Skywalker[" + super.toString() + ']';
    }

}
