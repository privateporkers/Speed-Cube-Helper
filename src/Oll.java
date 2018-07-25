//This is for all of the Oll case

public class Oll {

    //There several different cases of oll, 57 to be exact
    // any lower case move letter means double move
    //TO-DO: make a way to test all oll cases

    public void noEdgeOriented() {
        String one, two, three, four, seventeen, twenty, eighteen, nineteen;

        one = "R U2 [R2' F R F'] U2' [R' F R F'";
        two = "[F R U R' U' F'] [f R U R' Up f'"; //fp is front double prime
        three = "(f R U R' U' f') U' (F R U R' U' F'";
        four = "(f R U R' U' f') U (F R U R' U' F;)";
        seventeen = "(R U R' U) (R' F R F') U2 (R' F R F')";
        twenty = "M U R U R' U' M2 (U R U' r')";
        eighteen = "(F R U R' U) y' R' U2 (R' F R F')";
        nineteen = "(r' R) U (R U R' U') r (R2' F R F')";
    }

    public void cShapes() {
        String fortySix, thirtyFour;

        fortySix = "R' U' (R' F R F') U R";
        thirtyFour = "R U R2 U' R' F R U R U' F'";
    }

    //lower case "L"
    public void lShapes() {
        String fiftyFive, fiftyTwo, fiftyOne, fiftySix;

        fiftyFive = "R U2 R2 U' R U' R' U2 F R F'";
        fiftyTwo = "R U R' U R d' R U' R' F'";
        fiftyOne = "f (R U R' U') (R U R' U') f'";
        fiftySix = "(F R U R' U' R) F' (r U R' U') r'";
    }

    //upper case "L"
    public void LShapes() {
        String fortyEight, fortySeven, fiftyFour, fiftyThree, fortyNine, fifty;

        fortyEight = "F (R U R' U') (R U R' U') F'";
        fortySeven = "R' U' (R' F R F') (R' F R F') U R";
        fortyNine = "(R' F R' F') R2 U2 y (R' F R F')";
        fiftyFour = "(r U R' U) (R U' R' U) (R U2' r')";
        fiftyThree = "(l' U' L U') (L' U L U') (L' U2 l)";
        fifty = "R' F R2 B' R2 F' R2 B R'";
    }

    public void pShapes() {
        String fortyFour, fortyThree, thirtyTwo, thirtyOne;

        fortyFour = "f (R U R' U') f'";
        fortyThree = "f' (L' U' L U) f";
        thirtyTwo = "R U B' U' R' U R B R'";
        thirtyOne = "(R' U') F (U R U' R') F' R";
    }

    public void tShapes() {
        String fortyFive, thirtyThree;

        fortyFive = "F (R U R' U') F'";
        thirtyThree = "(R U R' U') (R' F R F')";
    }

    public void wShapes() {
        String thirtyEight, thirtySix;

        thirtyEight = "(R U R' U) (R U' R' U') (R' F R F')";
        thirtySix = "(L' U' L U') (L' U L U) (L F' L' F)";
    }

    public void awkwardShapes() {
        String thirty, twentyNine, fortyOne, fortyTwo;

        thirty = "R2 U R' B' R U' R2 U R B R'";
        twentyNine = "M U (R U R' U') (R' F R F') M'";
        fortyOne = "(R U' R' U2) R U y R U' R' U' F'";
        fortyTwo = "R' U2 (R U R' U) R y (F R U R' U' F'";
    }

    public void fishShapes() {
        String thirtySeven, thirtyFive, ten, nine;

        thirtySeven = "F R U' R' U' R U R' F'";
        thirtyFive = "R U2' (R2 F R F') (R U2 R')";
        ten = "(R U R' U) (R' F R F') (R U2 R')";
        nine = "(R U R' U') R2 U R' U' F'";
    }

    public void knightMoveShapes() {
        String thirteen, fourteen, sixteen, fifteen;

        thirteen = "r U' r' U' r U r' y' (R' U R)";
        fourteen = "R' F R U R' F' R y' (R U' R')";
        sixteen = "(r U r') (R U R' U') (r U' r)";
        fifteen = "(l' U' l) (L' U' L U) (l' U l)";
    }

    public void bigLightningBolt() {
       String forty, thirtyNine;

       forty = "(R' F R U R' U' F') U R";
       thirtyNine = "(L F' L' U' L U F) U' L'";
    }

    public void smallLightningBolt() {
        String eight, seven, twelve, eleven;

        eight = "R U2' R' U2 R' F R F'";
        seven = "(r U R' U) (R U2 R')";
        twelve = "(F R U R' U' F') U (F R U R' U' F')";
        eleven = "(F' L' U' L U F) y (F R U R' U' F')";
    }

    public void squareShapes() {
        String six, five;

        six = "r U2' R' U' R U' r'";
        five = "l' U2 L U L' U L";
    }

    public void a_And_H_Shapes() {
        //This is for the Arrow and H shape
        String twentyEight, fiftySeven;

        twentyEight = "M' U M U2 M' U M";
        fiftySeven = "(R U R' U') M' (U R U' r')";
    }
}
