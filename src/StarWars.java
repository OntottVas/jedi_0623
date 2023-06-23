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
    }
}
