public class PythagoreanTheoremTest {
    public static void main(String[] args) {
        PythagoreanTheorem pT = new PythagoreanTheorem();
        // calculateHypotenuse requires two parameters
        Double hypotenuse = pT.calculateHypotenuse(2,2);
        System.out.println(hypotenuse);
    }
}