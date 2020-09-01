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
public class HomeworkKauliukai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ridentojas m = new Ridentojas();
        for (int i = 0; i < 5; i++) {
            Ridentojas2k metimas2k = new Ridentojas2k();
            metimas2k.ridenam2kauliukus();
            System.out.println(metimas2k.toString());
        }
        for (int i = 0; i < 5; i++) {
            Ridentojas4k metimas4k = new Ridentojas4k();
            metimas4k.ridenam4kauliukus();
            System.out.println(metimas4k.toString());
        }
        m.bubbleSort();
        System.out.println("Dižiausias -> " + Ridentojas.getRidenimai()[0]);
        System.out.println("Mažiausias -> " + Ridentojas.getRidenimai()[Ridentojas.getRidenimai().length - 1]);
        System.out.println(m.toString());
        int count = 1;
        for (int i = 0; i < Ridentojas.getRidenimai().length; i++) {
            try {
                if (Ridentojas.getRidenimai()[i] == Ridentojas.getRidenimai()[i + 1]) {
                    count += 1;
                } else {
                    System.out.println(Ridentojas.getRidenimai()[i] + " buvo išridenta kartų -> " + count);
                    count = 1;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(Ridentojas.getRidenimai()[i] + " buvo išridenta kartų -> " + count);
            }
        }
    }

}
