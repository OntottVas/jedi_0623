import java.util.ArrayList;
import java.util.List;

public class StarWars {
    public static void main(String[] args) {
        AnakinSkywalker vader = new AnakinSkywalker();
        Uralkodo sidious = new Uralkodo();

        System.out.println(vader);
        vader.engeddElAHaragod();
        System.out.println(vader);
        System.out.println(vader.megteremtiAzEgyensulyt());

        System.out.println(sidious);
        System.out.println(vader.legyoziE(sidious));

        List<EroErzekeny> characters = new ArrayList<>();
        characters.add(vader);
        characters.add(sidious);

        Jedi jedi = new AnakinSkywalker();
        characters.add(jedi);

        EroErzekeny eroErzekeny = new Uralkodo();
        characters.add(eroErzekeny);

        for (var actual : characters) {
            System.out.println(actual.mekkoraAzEreje());
        }
    }
}
