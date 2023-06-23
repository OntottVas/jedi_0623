public abstract class Jedi implements EroErzekeny {
    private double ero;
    private boolean atalhatE;

    public Jedi(double ero, boolean atalhatE) {
        this.ero = ero;
        this.atalhatE = atalhatE;
    }

    public abstract boolean megteremtiAzEgyensulyt();

    @Override
    public double mekkoraAzEreje() {
        return this.ero;
    }

    @Override
    public boolean legyoziE(EroErzekeny eroErzekeny) {
        if (eroErzekeny instanceof Jedi jedi) {
            return this.ero < jedi.ero && jedi.atalhatE;
        }
        if (eroErzekeny instanceof Uralkodo uralkodo) {
            return ero > uralkodo.mekkoraAzEreje() * 2;
        }
        return false;
    }

    public double getEro() {
        return ero;
    }

    public void setEro(double ero) {
        this.ero = ero;
    }

    public boolean isAtalhatE() {
        return atalhatE;
    }

    public void setAtalhatE(boolean atalhatE) {
        this.atalhatE = atalhatE;
    }

    @Override
    public String toString() {
        return "Jedi{" +
                "erő=" + ero +
                ", átalhat e=" + atalhatE +
                '}';
    }
}
