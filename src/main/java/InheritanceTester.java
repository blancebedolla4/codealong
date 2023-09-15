public class InheritanceTester {
    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Yola");

        System.out.println(mom.getClass() + "is a "+ mom.getGender());
    }
}
