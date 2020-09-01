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
public class Ridentojas {
    private static Object[] ridenimai = new Object[0];

    public static Object[] getRidenimai() {
        return ridenimai;
    }
    
    public static int ridenamStatic() {
        int isridentasSk = (int) (Math.random() * 21 + 1);
        Object[] newRidenimai = new Object[ridenimai.length + 1];
        System.arraycopy(ridenimai, 0, newRidenimai, 0, ridenimai.length);
        newRidenimai[newRidenimai.length - 1] = isridentasSk;
        ridenimai = newRidenimai;
        return isridentasSk;
    }
    
    public void bubbleSort() {
        for(int i=0; i<ridenimai.length-1; i++) {
            for(int j=i+1; j<ridenimai.length; j++) {
                if(((Integer)(ridenimai[i])) < ((Integer)(ridenimai[j]))) {
                    Object temp = ridenimai[i];
                    ridenimai[i] = ridenimai[j];
                    ridenimai[j] = temp;
                }
            }
        }
    }
    
    @Override
    public String toString() {
        String s = "";
        if (ridenimai.length == 0) {
            return "[]";
        } else if (ridenimai.length == 1) {
            return "["+ridenimai[0]+"]";
        } else {
            for (int i=0; i<ridenimai.length; i++) {
                if (i == 0) {
                    s+= "[" + ridenimai[i]+",";
                } else if (i<ridenimai.length - 1) {
                    s+= " " + ridenimai[i]+",";
                } else if (i == ridenimai.length - 1) {
                    s+= " " + ridenimai[i]+"]";
                }
            }
        }
        return s;
    }
}
