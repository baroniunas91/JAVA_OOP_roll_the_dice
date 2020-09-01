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
public class Ridentojas2k extends Ridentojas {

    private final int[] metimas = new int[2];

    public void ridenam2kauliukus() {
        int sk1 = Ridentojas.ridenamStatic();
        metimas[0] = sk1;
        int sk2 = Ridentojas.ridenamStatic();
        metimas[1] = sk2;
    }

    @Override
    public String toString() {
        if (metimas[0] != 0 && metimas[1] != 0) {
            int skirtumas = metimas[0] - metimas[1];
            if (skirtumas >= -3 && skirtumas <= 3) {
                return "Laimėjai";
            } else {
                return "Pralaimėjai";
            }
        } else {
            return "Turi būti mesta 2 kartus";
        }
    }
}
