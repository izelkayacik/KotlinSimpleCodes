package com.izelkayacik.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.AnyRes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("merhaba kotlin")
        println(5 * 10)

        //Değişkenler && Sabitler

        //Integer

        println("-----Int-----")

        var a = 5
        var b = 10

        println(a * b)

        var yas = 50
        println(yas / 5 * 8)

        yas = 60
        println(yas / 5 * 8)

        val x = 5
        val y = 20

        println(x + y)

        //camelCase
        //snake_case

        val yasSonucu = yas * x
        println(yasSonucu)

        //Tanımlama(Defining)
        val benimIntegerim : Int

        //Başlatma, Değerini Atama
        benimIntegerim = 5

        var yeniInteger : Int = 20

        println(benimIntegerim / 2)

        //Long Kullanımı
        println("-----Long-----")

        var benimLong : Long = 100
        benimLong = 30000000000
        println(benimLong)

        //Double & Float Kullanımı
        println("-----Double & Float-----")

        val pi = 3.14
        println(pi * 2)

        val floatPi : Float = 3.14f
        println(floatPi * 2)

        val yeniDouble = 5.0
        println(yeniDouble / 2)

        //String Kullanımı
        println("------------String---------")

        val benimStringim = "Benim Yeni Metnim"
        println(benimStringim.length)

        val isim = "İzel"
        val soyisim = "Kayacık"

        val tamisim = isim + " " + soyisim
        println(tamisim)

        val yeniBirString : String
        yeniBirString = "10"

        val baskabirString = "20"
        println(yeniBirString+baskabirString)

        //Boolean Kullanımı
        println("-----Boolean-----")

        var benimBoolean = true
        benimBoolean = false

        println(3>5)

        //Veri Dönüştürme İşlemleri
        println("-----Veri Dönüştürme-----")

        val benimInt = 10
        val benimLongaCevirilenInt = benimInt.toLong()
        println(benimLongaCevirilenInt)

        val kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)

        //Koleksiyonlar (Array - Dizi Kullanımı)
        println("-----Diziler-----")

        val stringOrnegi = "İzel Kayacık"
        val benimDizim = arrayOf(stringOrnegi,"İzel","Kayacık","Beyza","Remziye","İbrahim")

        //Diziler index mantığıyla çalışır ve 0. indexten başlar

        println(benimDizim[0])
        println(benimDizim.get(1))
        println(benimDizim.get(2))
        benimDizim[2] = "Gizem"
        println(benimDizim.get(2))

        //Dizilerde farklı veriler
        println("-----Dizilerde Farklı Veriler-----")

        benimDizim.set(3,"Arya")
        println(benimDizim[3])

        val numaraDizisi = doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Tutku",24,2,13,6,true,false)
        println(karisikDizi.get(3))

        //Array List Kullanımı
        println("-----Array List-----")

        val isimListesi = arrayListOf("Jensen","Ackles","Supernatural")
        println(isimListesi[0])
        println(isimListesi.get(1))

        isimListesi.add("Uzay")
        isimListesi.add("Mars")
        println(isimListesi.get(4))

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add("Venüs")
        karisikArrayList.add(3)
        karisikArrayList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(10)
        println(intArrayList.get(1))


        //SET Kullanımı
        println("-----Set-----")

        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${ornekDizi[2]}")
        println("index 2: ${ornekDizi[3]}")

        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)
        println(benimSet.size)

        val digerSet = HashSet<String>()
        digerSet.add("İzel")
        digerSet.add("İzel")
        digerSet.add("İzel")
        digerSet.add("Kayacık")

        digerSet.forEach{
        println(it)
        }

        //MAP Kullanımı
        println("-----Map-----")

        //Key - Value Pairing

        val yemekDizisi = arrayOf("Elma", "Et", "Tavuk")
        val kaloriDizisi = arrayOf(50,300,200)

        println("${yemekDizisi[0]}'nın kalorisi: ${kaloriDizisi[0]}")

        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap.put("Elma",50)
        yemekKaloriMap.put("Et",300)
        yemekKaloriMap.put("Tavuk",200)

        println(yemekKaloriMap.get("Et"))

        val benimMapim = HashMap<String, String>()
        benimMapim.put("Örnek", "Değer")

        val yeniMap = hashMapOf<String, Int>("İzel" to 40,"Örnek" to 50)
        println(yeniMap.get("Örnek"))

        //Matematiksel işlemler
        println("-----Matematiksel İşlemler-----")

        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi--)

        var digerSayi = 10
        println(digerSayi > sayi)

        // && --> VE (HER İKİ DURUMUN DA DOĞRU OLMASI GEREKİR)
        // || --> VEYA (TEK BİR DOĞRULUK YETERLİDİR)

        println(digerSayi > sayi && 2 > 3)

        //IF KONTROLLERİ
        println("-----If Statements (Eğer Kontrolleri)-----")

        val skor = 80

        if (skor < 10)
        {
            println("Oyunu Kaybettiniz!")
        }
        else if (skor >= 10 && skor < 20)
        {
            println("Skorun 10 ve 20 arasında, Çok İyi Skor Aldın!")
        }
        else if (skor >= 20 && skor < 30)
        {
            println("Skorun 20 ve 30 arasında, Rekorları Kırıyorsun!")
        }
        else
        {
            println("Skorun 30'un üstünde, Efsane Oynadın")
        }

        //WHEN Kullanımı
        println("-----WHEN-----")

        var notRakami = 3
        var notStringi =""

        when(notRakami)
        {
            0 -> notStringi = "Geçersiz Not"
            1 -> notStringi = "Zayıf"
            2 -> notStringi = "Kötü"
            3 -> notStringi = "Orta"
            4 -> notStringi = "İyi"
            else -> notStringi = "Pek İyi"
        }
        println(notStringi)

        /*if(notRakami == 0)
        {
            notStringi = "Geçersiz Not"
        } else if (notRakami == 2) {
            notStringi = "Zayıf"
        } else if (notRakami == 3){
            notStringi = "Orta"
        } else if (notRakami == 4){
            notStringi = "İyi"
        } else {
            notStringi = "Pek İyi"
        }*/

        //FOR
        println("-----FOR-----")

        val baskaBirDizi = arrayOf(5,10,15,20,25,30)
        val q = baskaBirDizi[0] / 5 + 3
        println(q)

        println("Döngü Başladı")
        for (num in baskaBirDizi)
        {
            println(num / 5 + 3)
        }
        println("Döngü Bitti")

        for(indeks in baskaBirDizi.indices)
        {
            println(baskaBirDizi[indeks] / 5 + 3)
        }

        for(b in 0..9)
        {
            println(b)
        }

        val benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Gizem")
        benimDigerStringDizim.add("Yasin")

        for(str in benimDigerStringDizim)
        {
            println(str)
        }
        
        //While Kullanımı

        println("-----While Döngüsü-----")

        var j = 0
        while (j < 10)
        {
            println(j)
            j = j + 1
        }

    }

}