// 12S24008 - Adryan Julianto Panjaitan
// 12S24013 - Rospika Sarah Yosefin Siregar

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judulbuku, penulis, kategori, formatbukuelektronik, penerbit, tub, kategoridiskon;
        int tahunterbit, stokbuku;
        double hargapembelian, minimummargin, rating, diskon;

        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judulbuku = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                if (penerbit.equals("---")) {
                    penerbit = "---";
                } else {
                    penerbit = penerbit;
                }
                formatbukuelektronik = input.nextLine();
                hargapembelian = Double.parseDouble(input.nextLine());
                minimummargin = Double.parseDouble(input.nextLine());
                if (minimummargin > 0) {
                    kategoridiskon = "---";
                } else {
                    if (minimummargin < -(hargapembelian * 0.4)) {
                        kategoridiskon = "Once in a lifetime";
                    } else {
                        if (minimummargin < -(hargapembelian * 0.2)) {
                            kategoridiskon = "Never come twice";
                        } else {
                            kategoridiskon = "No regret";
                        }
                    }
                }
                stokbuku = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7 && rating <= 5.0) {
                    kategori = "Best Pick";
                } else {
                    if (rating >= 4.5 && rating < 4.7) {
                        kategori = "Must Read";
                    } else {
                        if (rating >= 4.0 && rating < 4.5) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 3.0 && rating < 4.0) {
                                kategori = "Average";
                            } else {
                                if (rating < 3.0 && rating >= 0) {
                                    kategori = "Low";
                                }
                            }
                        }
                    }
                }
                if (rating >= 4.7 && minimummargin < -(hargapembelian * 0.4)) {
                    tub = "The ultimate best";
                } else {
                    tub = "---";
                }
                System.out.println(iSBN + "|" + judulbuku + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + hargapembelian + "|" + minimummargin + "|" + stokbuku + "|" + rating + "|" + kategori + "|" + kategoridiskon + "|" + tub);
            }
        } while (!iSBN.equals("---"));
    }
}
