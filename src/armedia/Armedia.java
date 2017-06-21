package armedia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Armedia {

   public static void main(String[] args) {
//
        int []a={2,3,-1,1,6,5,5,6,-1,-4,-2};
//        int[] a = {2, 3, 1, 6, 5, 4,7};
//        int []b={1 ,5 ,6 ,3 ,6 ,7};
//        
//        //retainPositiveNumbers(a);
//        //System.out.println(largest1(a));
//        //for(int i=10 ;i<999;i++)
//        //  if(func(i)==i)
//        //System.out.println(i);
//        
       int[] list = {3,4,6,7,3,9,15,17,17,7};
       int arr[] = new int[4];
       
        subsetSum(list, 0, 0, 20, 4, arr);
//        System.out.println("\n");
//        findMatch(list, 20,4);
//
//    }
//    static final double pi = 3.14;
//    static final double Psi = 6.39485;
//    static final double Zeta = 3.2;
//    public static void main(String[] args) throws FileNotFoundException {
//
//        File file = new File("data.txt");
//        Scanner scr = new Scanner(file);
//        int twosRecords = 0, threesRecords = 0;
//        boolean flag = true;
//        String record = null;
//        int num_samples = Integer.parseInt(scr.nextLine());
//        for (int i = 0; i < num_samples; i++) {
//
//            if (flag == true) {
//                record = scr.nextLine();
//            }
//            if (record.charAt(0) == '*') {
//                System.out.println( (i + 1) + " GROUP---------- ");
//                String sample[] = record.substring(1).split("\\s+");
//                if (sample.length == 2) {
//                    int num_rec = Integer.parseInt(sample[0]);
//                    int num_elements = Integer.parseInt(sample[1]);
//                    int count2 = 0, count3 = 0;
//                    double totRes2 = 0, totRes3 = 0;
//
//                    for (int j = 0; j < num_rec; j++) {
//                        String str = scr.nextLine();
//                        String rec[] = str.split("\\s+");
//                        if (rec[0].charAt(0) == '*') {
//                            flag = false;
//                            System.out.println("XXX---THIS GROUP IS CANCELLED---XXX");
//                            record = str;
//                            break;
//                        } 
//                        else if (rec.length == num_elements) {
//                            flag = true;
//                            if (num_elements == 2) {
//                                System.out.println("\nRECORD "+(j+1)+":");
//                                twosRecords++;
//                                count2++;
//                                System.out.println("AVG = " + avarage2(rec));
//                                double form = form2(rec);
//                                totRes2 += form;
//                                System.out.println("FORM = " + form);
//                            }
//                            if (num_elements == 3) {
//                                
//                                System.out.println("\nRecord "+(j+1)+" :-");
//                                System.out.println("AVG 3 = " + avarage3(rec));
//                                double form = form3(rec);
//                                totRes3 += form;
//                                System.out.println("FORM 3 = " + form);
//                                threesRecords++;
//                                count3++;
//                            }
//                        } 
//                        else {
//                            System.out.print("\nERROR IN GROUP:" + (i + 1) + " RECORD:"+(j+1));
//                            System.out.println(" Elements are more/less than the number of elements Record must have ");
//                        }
//                    }
//                    if (num_elements == 2 && flag==true) {
//                        
//                        System.out.println("\nAVERAGE RESULT OF ALL RECORDS= " + (double) Math.round((totRes2 / count2) * 1000.0) / 1000.0);
//                        System.out.println("");
//                    }
//                    if (num_elements == 3 && flag==true) {
//                        System.out.println("\nAVERAGE RESULT OF ALL RECORDS= " + (double) Math.round((totRes3 / count3) * 1000.0) / 1000.0);
//                        System.out.println("");
//                    }
//                } 
//                else {
//                    System.out.println("ERROR IN CONTROLL RECORD HEAD");
//                }
//            }
//        }
//        System.out.println("\nTOTAL RECORDS READ WITH 2 DATA VALUES : "+twosRecords);
//        System.out.println("TOTAL RECORDS READ WITH 3 DATA VALUES : "+threesRecords+"\n");
//
//    }
//
//    public static void conv(String[] rec) {
//        for (int i = 0; i < rec.length; i++) {
//            char c = rec[i].toCharArray()[0];
//            if (!Character.isDigit(c)) {
//                switch (c) {
//                    case 'b':
//                        rec[i] = "4";
//                        break;
//                    case 'c':
//                        rec[i] = "6";
//                        break;
//                    default:
//                        rec[i] = "3";
//                        break;
//                }
//            }
//        }
//    }
//    
//
//    public static double avarage2(String[] rec) {
//        double val=(Double.parseDouble(rec[0]) + Double.parseDouble(rec[1])) / 2;
//        return (double)Math.round(val * 1000.0) / 1000.0;
//    }
//
//    public static double avarage3(String[] rec) {
//        conv(rec);
//        double val=(Double.parseDouble(rec[0]) + Double.parseDouble(rec[1]) + Double.parseDouble(rec[0])) / 3;
//        return (double)Math.round(val * 1000.0) / 1000.0;
//    }
//
//    public static double form2(String[] rec) {
//
//        double val=(pi * (Double.parseDouble(rec[0])) + Psi * (1.44 + Math.pow(Double.parseDouble(rec[1]), 3)));
//        return (double)Math.round(val * 1000.0) / 1000.0;
//    }
//
//    public static double form3(String[] rec) {
//        conv(rec);
//        double val=(pi * (Double.parseDouble(rec[0])) + Psi * (1.44 + Math.pow(Double.parseDouble(rec[1]), 3))  + Math.pow(Zeta,Double.parseDouble(rec[2])));
//        return (double)Math.round(val * 1000.0) / 1000.0;
//    }
//
//    
//    
//    
//    
//    //-----------------------------8th--------------------------------------
//    
//    
   }
    
    public static void subsetSum(int a[], int start, int currentLevel, int remainingSum, int num, int[] arr) {

        if (remainingSum == 0) {
            System.out.print(arr[0]);
            for (int i = 1; i < currentLevel; i++) {
                System.out.print(" + "+(arr[i]));
            }
            System.out.println(" = 20");
            return;
        }
        if (currentLevel == num) {
            return;
        }
        for (int i = start; i < a.length; i++) {
            arr[currentLevel] = a[i];
            subsetSum(a, start + 1, currentLevel + 1, remainingSum - a[i], num, arr);
            start+=1;
        }
    }

    public static void findMatch(int list[], int total, int numToUse) {

        if (numToUse == 2 || numToUse == 3 || numToUse == 4) {
            for (int i = 0; i < list.length; i++) {
                for (int j = i + 1; j < list.length; j++) {
                    if ((list[i] + list[j]) == total) {
                        System.out.println("Element " + (i + 1) + " + Element " + (j + 1) + " = " + total);
                    }
                }
            }
        }
        if (numToUse == 3 || numToUse == 4) {
            for (int i = 0; i < list.length; i++) {
                for (int j = i + 1; j < list.length; j++) {
                    for (int k = j + 1; k < list.length; k++) {
                        if ((list[i] + list[j] + list[k]) == total) {
                            System.out.println("Element " + (i + 1) + " + Element " + (j + 1) + " + Element " + (k + 1) + " = " + total);
                        }
                    }
                }
            }
        }
        if (numToUse == 4) {
            for (int i = 0; i < list.length; i++) {
                for (int j = i + 1; j < list.length; j++) {
                    for (int k = j + 1; k < list.length; k++) {
                        for (int l = k + 1; l < list.length; l++) {
                            if ((list[i] + list[j] + list[k] + list[l]) == total) {
                                System.out.println("Element " + (i + 1) + " + Element " + (j + 1) + " + Element " + (k + 1) + " + Element " + (l + 1) + " = " + total);
                            }
                        }
                    }
                }
            }
        }
    }

    
    
    
    
    //----------------------------------7th-----------------------------------
    
    
    public static int func(int num) {
        int x = num, sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (x != 0) {
            al.add(x % 10);
            x /= 10;
        }
        int len = al.size();
        for (int i = 0; i < len; i++) {
            sum += Math.pow(al.get(i), len);
        }
        return sum;
    }

    //---------------------------------- 5TH -----------------------------------
    public static int[] retainPositiveNumbers(int[] a) {
        if (a == null) {
            return new int[0];
        }
        ArrayList<Integer> al = new ArrayList<>();
        int[] newArray;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                al.add(a[i]);
            }
        }
        Collections.sort(al);
        newArray = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            newArray[i] = al.get(i);
        }
        return newArray;
    }

    //---------------------------------- 4TH -----------------------------------
    public static int largest(int[] a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static int largest1(int[] a) {
        if (a == null) {
            return 0;
        }
        if (a.length == 1) {
            return a[0];
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
        }
        return max;
    }

}

//--------------------------------------9TH-----------------------------------

