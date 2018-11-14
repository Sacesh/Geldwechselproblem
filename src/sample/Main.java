package sample;

public class Main {

    public static void main(String[] args) {

        int change = 333; // insert number


        boolean EUR = true; // if false == USD
        int a, b, c, d, e, f;

        if (EUR){
            a = 50; b = 20; c = 10; d = 5; e = 2; f = 1;
        } else { a = 25; b = 10; c = 5; d = 1; e = 0; f = 0;
        }

        if (EUR){

            int
                    remainderA = change % a, divisionA = change/a,
                    remainderB = remainderA % b, divisionB = remainderA / b,
                    remainderC = remainderB % c, divisionC = remainderB / c,
                    remainderD = remainderC % d, divisionD = remainderC / d,
                    remainderE = remainderD % e, divisionE = remainderD / e,
                    divisionF = remainderE / f;


            System.out.println("Kleinstmögliches Wechselgeld in EUR:");
            if (divisionA != 0) {System.out.println(divisionA + " x 50 EURCent-Münze;");}
            if (divisionB != 0) {System.out.println(divisionB + " x 20 EURCent-Münze;");}
            if (divisionC != 0) {System.out.println(divisionC + " x 10 EURCent-Münze");}
            if (divisionD != 0) {System.out.println(divisionD + " x 5 EURCent-Münze;");}
            if (divisionE != 0) {System.out.println(divisionE + " x 2 EURCent-Münze;");}
            if (divisionF != 0) {System.out.println(divisionF + " x 1 EURCent-Münze;");}

        }
        else {

            int
                    remainderA = change % a, divisionA = change/a,
                    remainderB = remainderA % b, divisionB = remainderA / b,
                    remainderC = remainderB % c, divisionC = remainderB / c,
                    remainderD = remainderC % d, divisionD = remainderC / d;

            System.out.println("Kleinstmögliches Wechselgeld in USD:");
            if (divisionA != 0) {System.out.println(divisionA + " x 25 Cent-Münze;");}
            if (divisionB != 0) {System.out.println(divisionB + " x 10 Cent-Münze;");}
            if (divisionC != 0) {System.out.println(divisionC + " x 5 Cent-Münze;");}
            if (divisionD != 0) {System.out.println(divisionD + " x 1 Cent-Münze;");}
        }




    }
}