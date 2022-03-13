public class Phraseomatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Powerful", "Overwhelming", "Crazy", "Functional"};
        String[] wordListTwo = {"Centred", "Quantum", "Smart", "3D"};
        String[] wordListThree = {"Contraption", "Computer", "Technology", "Algorithm"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}
