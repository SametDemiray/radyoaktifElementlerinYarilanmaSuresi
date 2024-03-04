package org.example;

import java.util.Scanner;
/*
 Tıp Alanında: Radyoaktif izotoplar, tıbbi görüntüleme (örneğin, PET taramaları), kanser tedavisi (örneğin, radyoterapi) ve
 tıbbi araştırmalar gibi birçok alanda kullanılır. Bu uygulamalarda, radyoaktif maddenin yarılanma süresi ve kalan aktivitesi,
 tedavi dozlarının ve tarama sonuçlarının belirlenmesinde kritik öneme sahiptir.

 Nükleer Enerji Santralleri: Nükleer enerji santrallerinde, nükleer yakıtların radyoaktif bozunması, enerji üretimi için kullanılır.
 Bu süreçte, yakıtın yarılanma süresi ve bozunma ürünlerinin kalan miktarı, santralin performansını ve yakıt değişim zamanlamasını
 belirlemeye yardımcı olur.

 Arkeoloji ve Jeoloji: Radyoaktif izotopların bozunma hızı, jeolojik zaman ölçümlerinde ve arkeolojik kalıntıların tarihlemesinde
 kullanılır. Karbon-14 gibi radyoaktif izotopların bozunma süreleri, arkeolojik buluntuların yaşı hakkında bilgi sağlar.

 Çevre Bilimi: Radyoaktif maddelerin çevresel dağılımı ve etkisi, çevre bilimciler tarafından incelenir. Radyoaktif atıkların
 depolanması ve etkilerinin izlenmesi, çevre koruma stratejilerinin geliştirilmesinde önemlidir.

 Bu hesaplamalar, radyoaktif maddelerin kullanıldığı çeşitli alanlarda, güvenlik, verimlilik ve çevresel etkilerin değerlendirilmesinde
 kritik bir rol oynar.

*/

public class Main {
    public static void main(String[] args) {
        double baslangicKutlesi;
        double yarilanmaSuresi;
        double belirliSureSonra;
        double yarilanmaSayisi;
        double kalanKutle;

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan başlangıç kütlesi, yarılanma süresi ve belirli bir süre sonra geçen zamanı girmesini istiyoruz.
        System.out.print("Başlangıç kütlesi (gram cinsinden): ");

        baslangicKutlesi = scanner.nextDouble();

        System.out.print("Yarılanma süresi (saat cinsinden): ");
        yarilanmaSuresi = scanner.nextDouble();

        System.out.print("Belirli bir süre sonra (saat cinsinden): ");
        belirliSureSonra = scanner.nextDouble();

        // Belirli bir süre sonra geçen zamanı yarılanma süresine böleriz ve bize kaç yarılanma geçtiğini verir.
        yarilanmaSayisi = belirliSureSonra / yarilanmaSuresi;

        // Kalan kütleyi hesaplamak için formülü kullanırız: kalan_kütle = başlangıç_kütlesi * (0.5 ^ yarilanma_sayisi)
        kalanKutle = baslangicKutlesi * Math.pow((1.0 / 2.0), (belirliSureSonra / yarilanmaSuresi));

        // Kullanıcıya sonuçları gösteririz.
        System.out.println("Belirli süre sonunda " + (int)yarilanmaSayisi + " yarılanma geçirecek.");
        System.out.println("Kalan kütlesi: " + kalanKutle + " gram.");
    }

}