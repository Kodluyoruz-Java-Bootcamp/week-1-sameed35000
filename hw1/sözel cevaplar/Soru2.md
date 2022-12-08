3. Java’nın platform bağımsızlığını nasıl sağladığını anlatınız.

 > Java, platform bağımsızlığını Java Virtual Machine (JVM) sayesinde sağlar. JVM, bir Java uygulamasını çalıştırmak için gereken tüm bilgiyi içerir ve bu sayede Java kodu herhangi bir platformda çalıştırılabilir. Bu, Java kodunun farklı işletim sistemlerinde ve farklı donanımlarda aynı şekilde çalışmasını sağlar. Böylece Java kodu yazıldığındaki gibi, hedeflediğiniz platformda çalışmaya devam eder.
---
4. Java’da heap ve stack kavramlarını örneklerle açıklayın.

 > Java'da heap ve stack kavramları, bellek yönetimi için kullanılan iki önemli kavramdır. Heap, programın çalışma sırasında dinamik olarak oluşan nesnelerin depolandığı bellek bölgesidir. Stack ise, programın çalışma sırasında kullanılan değişkenlerin ve metodların depolandığı bellek bölgesidir.

 Örnekler:
 - Bir Java uygulamasında, bir dizi nesnesi oluşturulur ve bu dizi heap bellek bölgesinde depolanır.
 - Bir Java metodu çağrılır ve bu metod içinde tanımlanan değişkenler stack bellek bölgesinde depolanır.
 - Bir Java nesnesi oluşturulur ve bu nesne heap bellek bölgesinde depolanır. Bu nesnenin metodları ise stack bellek bölgesinde depolanır.

---
5. String class’ı nasıl immutable olmayı sağlamaktadır örnek ve çizimlerle açıklayınız.

 > String sınıfı, bir dizi karakter dizisini temsil eden bir Java sınıfıdır. Stringler immutable olduğu için, bir kez oluşturulduktan sonra değiştirilemezler. Örneğin, bir String nesnesi oluşturduktan sonra onu değiştirmek istediğimizde, Java bu değişikliği yapamaz ve yerine yeni bir String nesnesi oluşturur. Bu, bellekte daha verimli bir kullanım sağlar ve kodumuzda istenmeyen hataları önler.
 İmmutable olma özelliği, String sınıfının birçok metodunu da etkiler. Örneğin, bir String nesnesine bir değer eklemek istediğinizde, Java bu değişikliği yapmaz ve yerine yeni bir String nesnesi oluşturur. Aşağıdaki örnek, bu konsepti açıklamak için yardımcı olacaktır:
 `String str = "Hello";
 // Bu değişiklik yapılmaz, Java yeni bir String nesnesi oluşturur
 str = str + " World";`
 Bu örnekte, "Hello" dizgisini temsil eden bir String nesnesi oluşturulur. Daha sonra, bu dizgiyi " World" dizgisiyle birleştirmeye çalışırız. Ancak, Java bu değişikliği yapamaz ve yerine yeni bir String nesnesi oluşturur. Bu nedenle, orijinal String nesnesi değişmez ve "Hello" dizgisi hala aynı kalır.
 
 Bu özellik, String sınıfının güvenli ve kullanışlı bir sınıf olmasını sağlar. Ancak aynı zamanda, bu özellik bazı durumlarda kodumuzda daha fazla işlem gerektirebilir. Örneğin, bir dizgiyi parçalara ayırmak istediğinizde, Java bu işlemi yapamaz ve yerine yeni bir String nesnesi oluşturur. Bu nedenle, dizgiyi parçalara ayırmak için başka bir yöntem kullanmak gerekir.

---
6. Java neden çoklu kalıtımı desteklemez açıklayın?

 > Çoklu kalıtım bir sınıfın birden fazla sınıftan miras almasını ifade eder. Bu bir alt sınıfın birden fazla ata sınıfa sahip olduğu anlamına gelir. Çok kullanılmaması ve yanlış sonuçlara yol açabilmesi, Java’yı geliştirenleri böyle bir duruma yöneltmiş. Java çoklu kalıtımı bir nebze de olsun interface sayesinde sağlayabiliyoruz.
---
7. Build Tool nedir? Java ekosistemindeki build toollar neler açıklayın?

 > Build Tool, bir uygulamanın derlenmesi, dağıtılması ve yönetilmesi için kullanılan bir yazılım araçları takımıdır. Build Tool, kodun kaynak dosyalarını derleyerek bir çalıştırılabilir uygulama haline getirir. Bu sayede, kodun çalıştırılabilir bir formata dönüştürülmesi ve dağıtılması kolaylaşır.
 Java ekosisteminde, çeşitli Build Tool araçları mevcuttur. Bunlar arasında en yaygın olarak kullanılanları şunlardır:
 - Apache Maven: Apache Maven, Java projelerinin derlenmesi, dağıtılması ve yönetilmesi için kullanılan bir Build Tool'dur. Maven, bir projenin bağımlılıklarını ve yapısını tanımlayan bir proje dosyası kullanarak projeyi derleyip dağıtır.
 - Apache Ant: Apache Ant, bir projenin derlenmesi ve dağıtılması için kullanılan bir Build Tool'dur. Ant, bir proje hakkında bilgi içeren bir XML dosyası kullanarak projeyi derleyip dağıtır.
 - Gradle: Gradle, Java ve diğer diller için kullanılan bir Build Tool'dur. Gradle, bir projenin bağımlılıklarını, yapısını ve işlemlerini tanımlayan bir proje dosyası kullanarak projeyi derleyip dağıtır.
 Bu sadece birkaç örnekten ibaret değildir. Java ekosisteminde, birçok farklı Build Tool araçları mevcuttur. Bu araçların seçimi, projenin büyüklüğüne, ihtiyaçlarına ve diğer faktörlere göre değişebilir.

---
8. Collection framework içerisindeki bütün yapıları önemli methodlarıyla örnekleyip açıklayınız.

 > Java Collection Framework, Java'da verilerin tutulması, saklanması ve işlenmesi için kullanılan bir kütüphanedir. Collection Framework içerisinde birçok farklı veri yapısı bulunmaktadır. Bu yapılar, farklı ihtiyaçlara göre seçilerek kullanılabilir. Aşağıda, Collection Framework içerisinde bulunan bazı önemli yapılar ve bu yapıların önemli methodları örneklendirilmiştir:
 - List: List, elemanları sıralı bir dizi şeklinde tutan bir veri yapısıdır. List yapısı, aşağıdaki önemli methodları içerir:

 |Metot|Açıklaması|
 |-----------|-----------|
 |add()|List yapısına yeni bir eleman ekler.|
 |get()|List yapısındaki belirtilen indeksteki elemanı döndürür.|
 |remove()|List yapısından belirtilen elemanı siler.|
 |size()|List yapısındaki eleman sayısını döndürür.|

 - Set: Set, elemanların tekrar edilmemesi garanti edilen bir veri yapısıdır. Set yapısı, aşağıdaki önemli methodları içerir:

 |Metot|Açıklaması|
 |-----------|-----------|
 |add()|Set yapısına yeni bir eleman ekler.|
 |contains()|Set yapısında belirtilen elemanın olup olmadığını kontrol eder.|
 |remove()|Set yapısından belirtilen elemanı siler.|
 |size()|Set yapısındaki eleman sayısını döndürür.|

 - Map: Map, anahtar-değer ikililerini tutan bir veri yapısıdır. Map yapısı, aşağıdaki önemli methodları içerir:

 |Metot|Açıklaması|
 |-----------|-----------|
 |put()|Map yapısına yeni bir anahtar-değer ikilisi ekler.|
 |get()|Map yapısındaki belirtilen anahtar için değeri döndürür.|
 |remove()|Map yapısından belirtilen anahtar-değer ikilisini siler.|
 |size()|Map yapısındaki anahtar-değer ikilisi sayısını döndürür.|

 Bu yapılar sadece birkaç örnektir. Collection Framework içerisinde birçok farklı veri yapısı bulunmaktadır. 



---