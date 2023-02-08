public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<String>(5);
        System.out.println(magicBox.add("Mother"));
        System.out.println(magicBox.add("Dad"));
        System.out.println(magicBox.add("GrandMother"));
        System.out.println(magicBox.add("GrandDad"));
        System.out.println(magicBox.add("Sister"));
        System.out.println(magicBox.add("Dog"));
        System.out.println(magicBox.pick());
        //System.out.println(magicBox.items.length);
    }
}