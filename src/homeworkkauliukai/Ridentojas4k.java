/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkkauliukai;

/**
 *
 * @author Edgaras
 */
public class Ridentojas4k extends Ridentojas {

    private final int[] metimas = new int[4];
    private int didziausias = 0;
    private int maziausias = 22;

    public void ridenam4kauliukus() {
        int sk1 = Ridentojas.ridenamStatic();
        metimas[0] = sk1;
        int sk2 = Ridentojas.ridenamStatic();
        metimas[1] = sk2;
        int sk3 = Ridentojas.ridenamStatic();
        metimas[2] = sk3;
        int sk4 = Ridentojas.ridenamStatic();
        metimas[3] = sk4;

        for (int i = 0; i < metimas.length - 1; i++) {
            if (metimas[i] > metimas[i + 1] && metimas[i] > didziausias) {
                didziausias = metimas[i];
            } else if (metimas[metimas.length - 1] > metimas[i] && metimas[metimas.length - 1] > didziausias) {
                didziausias = metimas[metimas.length - 1];
            }
            if (metimas[i] < metimas[i + 1] && metimas[i] < maziausias) {
                maziausias = metimas[i];
            } else if (metimas[metimas.length - 1] < metimas[i] && metimas[metimas.length - 1] < maziausias) {
                maziausias = metimas[metimas.length - 1];
            }
        }
//        System.out.println("didziausias" + didziausias);
//        System.out.println("maziausias" + maziausias);
    }

    @Override
    public String toString() {
        if (metimas[0] != 0 && metimas[1] != 0 && metimas[2] != 0 && metimas[3] != 0) {
            int skirtumas = didziausias - maziausias;
            if (skirtumas <= 4) {
                return "Laimėjai";
            } else {
                return "Pralaimėjai";
            }
        } else {
            return "Turi būti mesta 4 kartus";
        }
    }
}
