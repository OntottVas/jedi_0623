public class Uralkodo implements EroErzekeny, Sith {
    private double gonoszsag;

    public Uralkodo() {
        this.gonoszsag = 100;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.gonoszsag * 2;
    }

    @Override
    public boolean legyoziE(EroErzekeny eroErzekeny) {
        return gonoszsag > eroErzekeny.mekkoraAzEreje();
    }

    @Override
    public void engeddElAHaragod() {
        this.gonoszsag += 50;
    }

    @Override
    public String toString() {
        return "Uralkodo{" +
                "gonoszsag=" + gonoszsag +
                '}';
    }
}
