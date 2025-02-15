# 🚀 Ulaşım Güzergah Planlama Sistemi

## Proje Açıklaması  
Bu proje, **Kırklareli'deki Karakaş, Bademlik ve Karahıdır mahalleleri** için en uygun ulaşım güzergahını belirlemeyi amaçlamaktadır.  
Proje, Softmax algoritması kullanarak mahallelerin maliyet-fayda analizini gerçekleştirir ve elde edilen skorlar doğrultusunda en avantajlı güzergahı seçer.

## Proje Yapısı  
Aşağıda, projenin temel modülleri ve her modülün işlevleri detaylandırılmıştır:

**com.guzergah.model**  
- **Mahalle.java**  
  - Mahalle verilerini tanımlar.  
  - Her mahalle için; nüfus yoğunluğu, ulaşım altyapısı, maliyet, çevresel etki ve sosyal fayda gibi kriterler saklanır.  
  - Ayrıca, Softmax algoritması ile hesaplanan skoru tutmak için `skor` özelliği mevcuttur.

**com.guzergah.algoritma**  
- **Softmax.java**  
  - Softmax algoritmasını uygular.  
  - Bu algoritma, her mahalleye ait ham kriter değerlerini normalize ederek 0 ile 1 arasında bir dağılım elde eder.  
  - Böylece, her mahalleye göreceli bir skor atanır.

**com.guzergah.analiz**  
- **MaliyetFaydaAnalizi.java**  
  - Tüm mahallelerin kriter değerlerini hesaplar.  
  - Avantajlı (nüfus yoğunluğu, ulaşım altyapısı, sosyal fayda) ve dezavantajlı (maliyet, çevresel etki) kriterler göz önünde bulundurularak toplam bir skor elde edilir.  
  - Hesaplanan skorlar önce normalize edilir, ardından Softmax algoritması uygulanır.  
  - En yüksek Softmax skoruna sahip mahalle, en uygun güzergah olarak belirlenir.

**com.guzergah**  
- **Main.java**  
  - Uygulamanın giriş noktasıdır.  
  - Mahalle verileri oluşturulur, analiz çalıştırılır ve skorlar ve en uygun güzergah ekrana yazdırılır.

## Kullanılan Algoritmalar

### 🔹 Softmax Algoritması  
- Softmax algoritması, her mahalleye ait ham skorları alır ve bu skorları normalize eder.  
- Bu işlem sonucunda her mahalleye 0 ile 1 arasında bir olasılık değeri atanır.  
- En yüksek değere sahip olan mahalle, diğerlerine göre daha avantajlı olarak değerlendirilir.

### 🔹 Maliyet-Fayda Analizi  
- Projede, aşağıdaki kriterler kullanılarak her mahalle için bir skor hesaplanır:
  - **Avantajlı Kriterler:**  
    - **Nüfus Yoğunluğu:** Yüksek nüfus, daha fazla potansiyel kullanıcı demektir.  
    - **Ulaşım Altyapısı:** İyi bir ulaşım altyapısı, erişilebilirliği artırır.  
    - **Sosyal Fayda:** Toplumsal fayda ve yaşam kalitesi göstergesidir.
  - **Dezavantajlı Kriterler:**  
    - **Maliyet:** Düşük maliyet, ekonomik açıdan daha avantajlıdır.  
    - **Çevresel Etki:** Düşük çevresel etki, sürdürülebilirlik açısından önemlidir.  
- Bu kriterlerin avantaj ve dezavantaj etkileri toplanır, normalize edilir ve Softmax algoritması uygulanarak nihai skorlar elde edilir.

## Örnek Ekran Çıktısı

![image](https://github.com/user-attachments/assets/b650bed3-8fda-44b1-a1ea-a2b844e59566)


## 💙 Teşekkürler  

Bu projeyi geliştirirken edindiğim bilgi ve deneyimleri paylaşmaktan büyük keyif aldım.  
Projeye katkı sağlayan, geri bildirimde bulunan veya destek olan herkese içtenlikle teşekkür ederim.  
İyi çalışmalar dilerim! 🚀 

**📌 Proje Geliştiricisi:**  

👨‍💻 **[Ayça Albayrak](https://github.com/aycaalbayrak)**  

 




