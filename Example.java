/*----------------------------------------------------------------------------------------------------------------------
										Java ile Nesne Yönelimli Programlama

											   Eğitmen: Oğuz KARAN

										C ve Sistem Programcıları Derneği




										Blue --> Ders Başlangıçları..
										Aqua --> Konuya ilişkin kendimin eklediği detaylar..
										Eflatun --> Kendimce önemli gördüğüm noktalar..
										Violance --> Tekrar bakabileceğimi düşündüğüm konu başlıkları..

----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	26.11.2022
	Blue
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Java Ortamının Temel Özellikleri:
	Arakodlu Çalışma Sistemi: C ve C++ gibi programlama dillerinde çalıştırılabilen bir dosya (executable file) elde 
	edildiğinde bu dosyanın içerisinde, çalıştırılacak sisteme özgü (genel olarak işletim sistem, donanım vs.) 
	doğrudan çalışltırılabilecek makine kodları bulunur. Java programlama dili ile yazılmış bir program derlendiğinde 
	olulşan dosyanın içerisinde hiç bir sistemin dili olmayan yapay bir arakod bulunur. Bu arakoda "byte code" denir. 
	"Byte code" doğrudan çalıştırılamaz. Bu byte code başka bir uygulama tarafından çalıştırılır. Çalıştıran program
	byte code'u makine koduna dönüştürür. Bu işleme "JIT (Just In Time Compilation) denir. Geliştirme ve çalıştırılama
	anlamında şu temel kavramlar söz konusudur:
		- JVM (Java Virtual Machine): Byte kodu derleyerek (JIT) sisteme ilişkin aşağı seviye (makine kodf denebilir)
		koda dönüştürür. JVM aslında "byte code"'un nasıl yorumlanacağına (interpret) yönelik soyutlanmış bir kavramdır.

		- JRE (Java Runtime Environment): Genel olarak Java ile yazılmış bir uygulamayı çalıştırmak (run) için gereken araçları ve 
		uygulamaları içeren bir pakettir. Yani bir program Java ile yazıldığında bu programın çalıştırılabilmesi için JRE'ye
		ihtiyaç vardır. JRE içerisinde bir çok araç (tool) da bulunmaktadır. Bu anlamda JVM de JRE'nin bir parçasıdır.

		- JDK (Java Development Kit): Geliştirme (development) araçlarını ve çalıştırma araçlarını barındıran bir pakettir.
		Çalıştırma araçları genel olarak yalnızca geliştirme aşamasında kullanılabilir.
	
	Ticari kullanımda özellikle Java 11 ile birlikte Oracle firmasına ilişkin bir takım değişiklikler yapılmıştır. Genel olarak
	şu şekilde özetlenebilir. Java'da geliştirme ortamı ücretsiz, çalıştırma araçlarına kullanılan araca ve firmaya göre ücretlendirilebilir.
	Tamamen ücretsiz olan OpenJRE denilen ayrı bir ürün de vardır. Bu kavramlar zamanla daha da anlaşılacaktır. Burada sadece genel
	olarak anlatılmıştır

	Arakodlu çalışmanın en önemli avantajlarından biri, geliştirilen uygulamalar genel olarak sistemden (platformdan) bağımsız
	olarak çalıştırılabilmesidir. Dolayısıyla platformdan bağımsız olarak yazılır. Bu kavrama "Write Once Run Anywhere (WORA)" 
	denir. Byte code herhangi bir sisteme bağımlı (dependency) değildir.

	Ayrıca unutulmamalıdır ki, ara kodlu çalışma sistemi ufak da olsa bir performans kaybına yol açar. Ancak Java'nın hedefi 
	doğrultusunda bu kaybın gözardı edilmesi bir çok aracında kolay bir biçimde kullanılmasını sağlar.

	Geniş bir Sınıf Kütüphanesi: Java'da geniş bir sınıf kütüphanesi bulunur. Veritabanı, web programlama vs. gibi 
	işlemler için hazır sınıflar.

	Hızlı Uygulama Geliştirme Ortamı: Java hızlı uygulama geliştirme ortamı (rapid application deveopment) sunar. Bu anlamda
	hem öğrenmesi kolaydır. Hem de ürün daha çabuk elde edilir.

	Güvenli Çalışma Ortamı: Java'da yazılmış olan programlaruın sisteme yanlışlıkla zarar verme olasılıkları çok daha 
	azdır.

	
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	27.11.2022
	Blue
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Programlama Dillerinin Sınıflandırılması:
	Programlama dilleri 3 biçimde sınıflandırılabilir
	1. Seviyelerine (level) göre sınıflandırma: Seviye programlama dilinin insan algısına yakınlığının bir öçüsüdür.
	Yüksek seviyeli (high level) diller hem dil özellikleri hem de uygulama geliştirme olarak kolay öğrenilebilen, insan
	algısına yakın dillerdir. Aşağı seviyeli (low level) diller makinenin doğal çalışmasına daha yakındır. Olabilecek
	en aşağı seviyeli dil saf makine dilidir

	2. Kullanım alanlarına göre sınıflandırma: Dilin hangi alanlarda kullanılabileceğinin sınıflandırılmasıdır. Bazı diller
	birden fazla alanda da kullanılabilmektedir. Bu anlamda genel amaçlı diller, bilimsel ve mühendislik diller, oyun ve animasyon 
	dilleri veritabanı dilleri örnek olarak söylenebilir.

	3. Programlama modeline göre sınıflandırma: Bir programı yazarken kullanılan genel model (paradigm) önemlidir. Bazı
	dillerde sınıflar yoktur ve program çeşitli alt programların (function) birbirini çağırması yoluyla yazılır. Bu tekniğe
	"procedurel model" denir. Bazı dillerde sınıf vardır. Program sınıflar kullanılarak yazılır. Başka kavramlarla 
	beraber sınıfların da kullanıldığı bu modele "object oriented" model denir. Bazı dillerde programlar sanki matematiksel
	formül yazıyormuş gibi yazılır. Bu programlama modeline "functional" model denir. Bazı diller birden fazla modeli
	destekler. Bu tip dillere "multi paradigm" diller denir.

	Buna göre Java, genel amaçlı, web programlama, yapay zeka, bilimsel ve mühendislik alanlarında vs. kullanılabilen, 
	nesne yönelimli, özellikle Java 8 birlikte fonksiyonel programlamaya ilişkin özelliklerinin de geliştirilmiş olduğu
	yüksek seviyeli bir programlama dilidir
-----------------------------------------------------------------------------------------------------------------------*/


/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Buradaki kavramlardan genel olarak bahsedilmiştir. Şüphesiz her birinin detayları vardır. Bu 
	detaylar kurs içerisinde zamanla anlaşılacaktır
-----------------------------------------------------------------------------------------------------------------------*/


/*----------------------------------------------------------------------------------------------------------------------
	Temel Kavramlar: 
	Çevirici program, derleyici, yorumlayıcı: Bir programlama dilinde yazılmış olan programı eşdeğer başka bir dile
	dönüştüren programlamşlara "çevirici programlar (translator)" Çevirici programlarda kaynak dil (source language) ve
	hedef dil (target language) söz konusudur. Örneğin Java'dan C#'a dönüştürme yapan program bir çevirici programdır.
	Bir çevirici programdsa hedef dil aşağı seviyeli bir dil (saf makine dili, sembolik makine dili, arakod vs.) ise
	bu durumda çevirici programa özel olarak "derleyici (compiler)" JVM'in  byte kodu makine koduna dönüştürme 
	faaliyeti de bir derleme işlemidir. Bu işlem çalıştırma ortamı içerisinde bulunan JIT derleyici (Just In Time Compiler)
	tarafından yapılmaktadır.

	Bazı programlar hiç kod üretmeden doğrudan çalıştırılırlar. Bunları çalıştıran programlara "yorumlayıcı (interpreter)"
	denir. Bazı diller yalnızca yorumlayıcı ile, bazı diller yalnızca derleyiciler ile, bazı diller de her ikisi ile de 
	çalışırlar. 

	Java 11 ile birlikte "java" programı yorumlayıcı olarak da çalışabilmektedir. Ancak pratikte Java programları daha çok
	derleyici ile kullanılır. 

	Anahtar Notlar: Bir uygulama tek bir java dosyasından oluşmak zorunda değildir. İleride de anlatılacağı gibi 
	her java dosyası (hatta her sınıf) ayrı derlenir. Bir ürün aslında tüm birimlerinin uygun şekilde derlenmesi ile 
	elde edilir. Bu işleme genel olarak "build" işlemi denir. Build işlemi sadece derleme işlemi değildir. Yani bir
	uygulamanın ürün olarak elde edilmesi sürecine "build" denir. 
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	İşletim Sistemi (Operating System): İşletim sistemi makinenin donanımını yöneten, bilgisayar ile kullanıcı arasında
	köprü görevi göre bir sistem yazılımıdır. Bir işletim sisteminin pek çok görevi vardır. Örneğin, programları çalıştırmak,
	dosya organizasyonu, çeşitli donanım aygıtlarını yönetmek vs. İşletim genel olarak "masaüstü (desktop)" ve "mobil (mobile)"
	olmak üzere iki gruba ayrılır. 

	Mobil Sistemlerde Kullanılan Programlama Dilleri ve Ortamları: Genel olarak her mobil sistemin kendine özgü bir
	dili ve ortamı vardır. Java programlama dili özellikle Android sistemleri için uygulama geliştirmede kullanılmaktadır.

	Açık Kaynak Yazılım, özgür yazılım mülkiyete sahip yazılım: Özgür yazılım (free software) ve açık kaynak (open source)
	yazılımım aralarında farklar olsa da genel olarak aşağıdaki özelliklere sahiptir:

		- Bedavadır. Kullanılabilmesi için bir lisans ücreti gerekmez
		- Kaynak kod sahiplenilemez yani herkezindir. Kayan kod üzerinde değişiklik ya da ekleme yapıldığında kodlar
		kapatılamaz. Onların da açılması gerekir
		- Çoğaltılabilirler, izin almadan kullanılabilir

	Bunun tam tersi mülkiyete sahip (propriatery) yazılmımlardır. Bu yazılımlar para verilerek kullanılırlar. Çoğaltılamazlar
	ya da çoğaltılmaları için belirli koşulları olabilir. 


	IDE (Integrated Development Environment): Derleyiciler komut satırından çalışabilen basit bir arayüze sahip programlardır. 
	Aslında teorik olarak Java ile geliştirilecek bir uygulama içerisinde tüm java dosyaları "notepad" gibi basit bir 
	editör program ile yazılıp derlenebilirler. Fakat pratikte bu şekilde program yazmak fazlaca zaman kaybettirir. Yazılım
	geliştirmeyi kolaylaştırmak için IDE denilen programlar kullanılır. IDE'ler içerisinde editörler, test araçları, 
	çeşitli kodlar üretebilen araçlar vs. bulunur. IDE bir derleyici değildir. IDE, derleme işlemi için derleyiciyi de 
	çalıştırabilir. Uygulamayı çalıştırmak için de yine JRE içerisindeki araçları kullanabilir. Java ile uygulama
	geliştirilirken kullanılabilecek çeşitli IDE'ler bulunmaktadır. Bunlardan en yaygın kullanılanları "Eclipse" ve "IntelliJ IDEA"
	IDE'leridir
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	03.12.2022	
	Blue
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Dil Kavramı: Dil iletişimde kullanılan semboller topluluğuna denir. Bir dilin kurallarına gramer denir. Gramerin birçok 
	alanı vardır. Bunlardan en önemlileri "syntax" ve "semantic" alanlarıdır. Bir olgunun dil olabilmesi için en azından sentaks 
	ve semantiğe sahip olması gerekir. 

	Sentaks doğru yazma ve doğru dizilime ilişkin kurallardır. Örneğin:
		"I going to will school"
	cümlesinde sentaks hatası yapılmılmıştır. 
		System.out.println("Hello";
	kodunda Java anlamında sentaks hatası yapılmıştır. 

	Dildeki doğru dizilmiş öğelerinin ne anlam ifade ettiklerine yönelik kurallara "semantic" denir.		

	Bilgisayar Dilleri ve Programlama Dilleri: Bilgisayar bilimlerinde kullanılmak üzere tasarlanmış dillere 
	bilgisayar dilleri (computer languages) denir. Bir bilgisayar dilinde akış da varsa bu durumda 
	programlama dili (programming language) denir. Örneğin XML, HTML bilgisayar dilleri programlama dili değildir. C, C++,
	Java C#, Kotlin, Swift, Javascript gibi dillerde akış da olduğundan programlama dilleridir
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Hello World programı
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		System.out.println("Hello, World");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Atom (Token): Bir programlama dilinde kendi başına anlamlı en küçük birime atom denir. Atomlar 6 gruba ayrılır:
	1. Anahtar Sözcükler (keywords, reserved words): Dil için özel bir anlamı olan yani dil tarafından bilinen ve bir çoğu
	tek başına değişken ismi olarak kullanılamayan atomlardır. Örneğin: package, class, void gibi

	2. Değişkenler (identifiers, variables): İsmini programcının belirlediği ve çeşitli kurallara isiminin belirlenebildiği
	atomlardır. Örneğin: csd, App, String gibi

	3. Operatörler (operators): Bir işleme yol açan ve bu işlem sonucunda değer üreten atomlardır. Örneğin: a + b 
	ifadesinde + bir operatördür

	4. Sabitler (literals, constants): Program içerisinbde doğrudan yazılan sayılara denir. Örneğin  a - 3 ifadesinde
	3 bir sabittir

	5. String'ler (strings, string literals): İki tırnak (double quote) içerisinde bulunan yazılar tırnaklarıyla birlikte
	string atomudur. Bu atoma string sabiti anlamında "string literal" da denir. Örneğin "Hello, World".

	6. Ayraçlar (delimiters, punctuators): Yukarıdaki grup dışında kalan atomlara denir. Örneğin: [], () gibi
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Boşluk karakterleri (whitespaces): Klavyeden basılığında boşluk algısı yaratan karakterlerdir. Klavyden basılan boşluk
	karakterleri tipik olarak: space, tabi enter
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Java programlama dilindeki kod yazım kuralları şunlardır:
	1. Atomlar arasında istenildiği kadar boşluk (whitespace) bırakılabilir.
	2. Anahtar sözcükler ve değişkenler dışında kalan atomlar istenildiği kadar bitişik yazılablir. Anahtar sözcükler ve
	değişken atomlar arasında en az bir boşluk (whitespace) karakteri olmalıdır
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Atomlar arasında istenildiği kadar boşluk (whitespace) bırakılabilir.
-----------------------------------------------------------------------------------------------------------------------*/

package 




csd;

class 






App {
	public static void main(String [] args)
	{	
		System				.out.






println("Hello, World");
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Atomlar istenildiği kadar bitişik yazılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;class App{public static void main(String[]args){System.out.println("Hello, World");}}

/*----------------------------------------------------------------------------------------------------------------------
	Anahtar sözcükler ve değişken atomlar arasında en az bir boşluk (whitespace) karakteri olmalıdır. Aşağıdaki örnekte
	bu durumdan dolayı sentaks hatası olduğundan kod derlenemez
-----------------------------------------------------------------------------------------------------------------------*/
packagecsd;class App{public static void main(String[]args){System.out.println("Hello, World");}}

/*----------------------------------------------------------------------------------------------------------------------
	Java'da yorum satırları (comment lines)
	Anahtar Notlar: Yorum satırları kodun okunabilirliğini/algılanabilirliğini bozacak şekilde koda eklenmemelidir.
	Yorum satırı eklemenin da bir "convention"'ı olmalıdır ve mutlaka olur.  
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		//Burası derleyici tarafından dikkate alınmaz
		System.out.println("Hello, World"); //Burası da derleyici tarafından dikkate alındır

		/*
			Burası da 
			dikkate 
			alınmaz
		*/
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	04.12.2022
	Blue
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notları: Java'da derleme zamanı (compile time) ve çalışma zamanı (run time) denilen birbiriyle dolaylı
	olarak ilişkili ancak ayrı olan iki kavram vardır. Derleme zamanı, derleme sürecine ilişkin işlemlerdir. Çalışma 
	zamanı program çalışması sürecine ilişkin işlemlerdir
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Derleyicilerin hata mesajları (diagnostics):	
	1. Gerçek Hata (errors): Dilin sentaks veya semantik kurallarına uyulmamasından dolayı verilen mesajlardır. Bu durumda
	byte code üretilmez. Programcının bu hataları düzeltip derlemesi gerekir.

	2. Uyarılar (warnings): Byte kodun üretilmesine engel olmayan, olası programlama ve mantık hatalarının programcıya
	bildirilmesi için verilen mesajlardır. Programcı bu uyarıları dikkate almalıdır. Özel bir durum yoksa uyarı mesajlarının
	oluşumuna yol açacak kodlar düzenlenmelidir. Bazı durumlarda derleyicinin uyarı mesajı vermediği ancak IDE'nin kullandığı
	"static kod analizi araçları", konfigürasyonları gereği uyarı verebilirler. Şüphesiz bunlar da dikkate alınmalıdır. Duruma
	göre hepsinin düzeltilmesi gerekmeyebilir. Pratikte bir ürünün "build" aşamasında derleyiciler tarafından verilen uyarı
	mesajlarının hepsinin kaldırılmış olması gerekir.

	3. Ölümcül hatalar (fatal error): Derleme işleminin bile tamamlanmasını engelleyebilecek hatalardır. Bu durumda programcının 
	yazdığı kod açısından yapğacak bir şeyi yoktur. Çünkü kod henüz derlenmemiştir. Programcının ölümcül hataya yol açan
	durumu ortadan kaldırması gerekir. Örneğin diskte yer kalmaması, derlenecek dosyanın bulunamaması gibi durumlar 
	ölümcül hatalara örnek olarak verilebilir

	Programın çalışma zamanında oluşan hatalara genel olarak "exception" denir. Exception oluştuğunda program sonlanır. 
	Bu durumun detayları ileride ele alınacaktır. "Exception" yerine "run time error" da kullanılabilmektedir. "error"
	denildiğinde "compile time error" anlaşılır
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Bildirim (declaration): Bir ismin derleyiciye tanıtılmasıdır. Derleyici bildirim ile o ismin ne anlama geldiğinianlara
	ve derleme işlemini ona göre göre yapar 
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Bir Java programı genel olarak paketlerden, paketler sınıflardan, sınıflar da metotlardan oluşur. 
	
	Paket bildiriminin genel biçimi:
	package <isim>;
	
	Örneğin:
	package csd;
	
	Paketler konusu ileride detaylı olarak ele alınacaktır
	
	Sınıf bildiriminin detayları gözardı edilmiş genel biçimi:
	
	class <isim> {
		//...
	}	
	
	Örneğin:
	
	class Sample {
		//...
	}
	
	Sınıflar konusu kurs sürecinde detaylandırılacaktır.
	
	Java'da alt programlara metot (method) denir. Alt programın ne yapacağının yazılmasına "metot bildirimi (method declaration)"
	denir. Alt programın çalıştırılmasına ise "method çağırma (method call)" Metot bildiriminin genel biçimi:
	
	[erişim belirleyici] [static] <geri dönüş değeri bilgisi> <metot ismi>([parametreler])
	{
		//...
	}
	
	Açıklamalar: 
	- Erişim belirleyici şunlardan biri olabilir: public, protected, no-modifier (hiç bir şey yazılmaması), private.
	İlgili konuya gelinceye kadar tüm metotları public olarak bildireceğiz
	
	- Bir metot static veya non-static olabilir. static anahtar sözcüğü yazılmazsa metot non-static olur. static ve non-static
	kavramı ileride ele alınacaktır
	
	- Erişim belirleyici anahtar sözcük ve static anahtar sözcüğü aynı sentaks seviyesinde olduğundan yerleri değiştirilebilir.
	Biz okunabilirlik/algılanabilirlik açısında erişim berirleyiciyi static anahtar sözcüğünden önce yazacağız
	
	- Metodun geri dönüş değeri bilgisi metot isminden önce yazılmalıdır. Metodun geri dönüş değerinin olmaması durumu
	buraya void anahtar sözcüğünün yazılması demektir. Geri dönüş değeri kavramı ileride ele alınacaktır
	
	- Metodun ismi bir değişken atomdur. TÜm değişken atomlarda olduğu gibi "değişken isimlendirme kuralları"'na 
	uygun olarak isimlendirilmelidir
	
	- Metot bildiriminde metot isminden sonra parantezler içerisinde ismine "parametre değişkeni ya da kısaca parametre (parameter)"
	bildirimi yapılabilir. İleride ele alınacaktır
	
	- Metot bildiriminde küme parantezleri arasında kalan bölüme "metodun gövdesi (method body)" denir ve burada metodun
	kodları yazılır
	
	static bir metodun çağrılmasının genel biçimi:
	[paket ismi].[sınıf ismi].<metot ismi>([argümanlar]);
	
	
	Bir program main metodunun çağrılmasıyla çalışmaya başlar. Programcının main metodu içerisinde çağırdığı metotlar
	ve o metodun içerisinde çağrılan metotlarla akış devam eder. main metodu JVM tarafından çağrılır. Bu anlamda Java
	programına verilen "byte code"'a ilişkin sınıfın main metoduna "giriş noktası (entry point)" denir. Özel bazı 
	durumlar dışında main sonlandığında program sonlanır. Bir metot çağrıldığında akış metodun kodlarına dallanır (call)
	ve metodun kodları çalıştırılır. Şüphesiz metot içerisinde başka bir metot da çağrılıyor olabilir. Yine bu çağırma
	noktasında akış çağrılan metoda gider. Metot çağrısı sonlandığında akış metodun çağrıldığı noktaya geri döner ve bir sonraki
	koddan akış devam eder. 
	
	Anahtar Notlar: System.out.println("Hello, World"); çağrısında System bir sınıf, out bir referans ve println de non-static
	bir metottur. Bu kavramlar ileride ele alınacaktır	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("Hello, World");
		csd.Sample.foo();
		csd.Sample.bar();
		csd.Mample.tar();
		System.out.println("Goodbye, World");
	}
}

class Sample {
	public static void foo()
	{
		System.out.println("Sample.foo");
	}
	
	public static void bar()
	{
		System.out.println("Sample.bar");
		csd.Mample.tar();
	}
}

class Mample {
	public static void tar()
	{
		System.out.println("Mample.tar");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	println metodu aldığı yazıya ilişkin son karakteri yazdıktan sonra imleci bir alt satırın başına çeker. Aşağıdaki
	örneği inceleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("Merhaba");
		System.out.print("Nasılsın, ");
		System.out.print("iyi misin?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Çağıran metodun (caller) ile ait olduğu sınıf ile çağrılan metodun (callee) at olduğu sınıf aynı paket içerisindeyse 
	çağırma sırasında paket ismi yazılmayabilir. Çağıran metot ile çağrılan metot aynı sınıfta ise çağırma sırasında 
	paket ismi yazılmamışsa sınıf ismi de yazılmayabilir.   
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("Hello, World");
		Sample.foo();
		Sample.bar();
		Mample.tar();
		System.out.println("Goodbye, World");
	}
}

class Sample {
	public static void foo()
	{
		System.out.println("Sample.foo");
		bar();
	}
	
	public static void bar()
	{
		System.out.println("Sample.bar");
		Mample.tar();
	}
}

class Mample {
	public static void tar()
	{
		System.out.println("Mample.tar");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Tür (type): Bir değişken için bellekte ne kadar yer ayrılacağını ve içerisindeki değerin hangi yöntemle tutulacağını
	belirten kavramdır
	
	Java'da türler genel olarak iki gruba ayrılabilir:
	Temel türler (primitive/built-in/predefined types), programcının tanımladığı türler (user defined types)
	
	Java'da türler birer anahtar sözcük ile temsil edilir:
	
	Temel türler:
	
	Tür ismi				Uzunluğu (byte)
	short						2
 	*int						4
	long						8
	byte						1
	
	float						4
	*double						8
	
	char						2
	boolean						-	
	
	
	Açıklamalar:
	- Tüm tamsayı türleri (integer/integral type) işaretlidir (signed). İkiye tümleme yöntemi kullanır. Java'da işaretsiz
	tamsayı türü yoktur. Ancak Java 8 ile birlikte belirli koşullar altında işaretsiz tamsayı işlemleri yapılabilmektedir
	
	- long türü en uzun tamsayı türüdür
	
	- Gerçek sayı türleri (real/floating point types) için "IEEE 754 standardı" kullanılır. float ve double türleri
	sırasıyla tek hassasiyetli (single precision) ve çift hassasiyetli (double precision) olarak değerleri tutmaktadır.
	Bu türlerde bazı sayılar tam olarak ifade edilemezler. O sayıya en yakın bir sayı ile ifade edilebilirler. Bir noktalı
	sayının ifade edilemeyip en yakın sayı olarak alınmasına "yuvarlama hatası (rounding error)" denir. Yuvarlama hataları
	değer ilk kez yerleştirilirken de oluşabilir, bir işlemin sonucunda da oluşabilir. 
	
	- Gerçek sayı türleri işaretli türlerdir.
	
	- float türünün yuvarlama hatalarına karşı direnci zayıftır. Yani yuvarlama hatası daha çok olmaktadır
	
	- Yuvarlama hataları parasal ve finansal uygulamalarda hatalı değerlerin oluşmasına sebep olabilir. Sırf parasal ve
	finansal uygulamalar tasarlanmış özel türler (sınıflar) bulunur. Programcı böylesi uygulamalar için bu özel türleri
	tercih eder. Ancak bu sınıflar yuvarlama hatası oluşmaması için yüzlerce makine komutu kullanarak işlem yaparlar. Bu
	durumda programcı için parasal ve finansal uygulamalar gibi yuvarlama hatalarının olmaması gereken durumlar dışında 
	double veya duruma göre float türü tercih edilmelidir.	
	
	- boolean türünün alabileceği iki tane değer vardır: true, false. boolean türünün "Java Language Specification"'da 
	belirtilmemiştir. Sistemden sisteme değişebilir. Ancak bu değişim programcı açısından problem oluşturmaz.
	
	- Yazılar içerisindeki her bir karakter sayı ile temsil edilir. Hangi karakterin hangi sayı ile ifade edildiği
	kullanılan karakter tablosna bağlıdır. ASCII 1 byte'lık yani 256 tane satırdan oluşur. UNICODE tablo 2 bytelık
	yani 65536 tane satırdan oluşan bir tablodur. Karakter tabloları bunlarla sınırlı değildir. Detaylar ileride
	ele alınacaktır. char türü de UNICODE uyumlu olarak iki byte uzunluğundadır	
	
	Anahtar Notlar: Java'da en çok kullanılan tamsayı türü int'tir, en çok kullanılan gerçek sayı türü de double'dır.
	Programcı öncelikle bu türleri tercih etmelidir. Eğer geçerli bir nedeni varsa diğer türleri kullanmalıdır
	
	Anahtar Notlar: int türüne "integer" demek yanlış bir terim kullanmak demektir. integer terimi tamsayılar için kullanılan
	genel bir terimdir. Ayrıca "Integer" isimli ileride göreceğimiz bir sınıf da bulunmaktadır
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	10.12.2022
	Blue
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Aşağı örneği çalıştırıp yuvarlama hatasını gözlemleyiniz. Örneğin detaylarını şu an önemsemeyiniz. İleri hepsi
	ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		double a = 0.1, b = 0.2;
		double c;
		
		c = a + b;
		
		System.out.printf("a = %.20f%n", a);
		System.out.printf("b = %.20f%n", b);
		System.out.printf("c = %.20f%n", c);
		
		if (c == 0.3)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağı örneği çalıştırıp yuvarlama hatasını gözlemleyiniz. Örneğin detaylarını şu an önemsemeyiniz. İleride hepsi
	ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		double a = 0.1, b = 0.2;
		double c;
		
		c = a + b;
		
		System.out.printf("a = %.20f%n", a);
		System.out.printf("b = %.20f%n", b);
		System.out.printf("c = %.20f%n", c);
		
		if (c == 0.3)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği çalıştırıp yuvarlama hatasını gözlemleyiniz. Örneğin detaylarını şu an önemsemeyiniz. İleride hepsi
	ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		float a = 0.1F, b = 0.2F;
		float c;
		
		c = a + b;
		
		System.out.printf("a = %.20f%n", a);
		System.out.printf("b = %.20f%n", b);
		System.out.printf("c = %.20f%n", c);
		
		if (c == 0.3)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Bir değişken kullanılmadan önce bildirilmelidir:
	Değişken bildiriminin genel biçimi:
	<tür> <değişken ismi>;
	
	Örneğin:
	int a;
	double b;
	boolean c;
-----------------------------------------------------------------------------------------------------------------------*/


/*----------------------------------------------------------------------------------------------------------------------
	Java'da 3 çeşit değişken vardır:
	1. Yerel değişkenler (local variables)
	2. Parametre değişkenleri (parameter variables)
	3. Sınıf veri elemanları (class member variables)
	
	Değişkenler için temel kavramlar:
	- İsim (name): Belli kurallara göre yazılan karakterler topluluğudur
	
	- Tür (type): Bir değişken için bellekte ne kadar yer ayrılacağını ve içerisindeki değerin hangi yöntemle tutulacağını
	belirten kavramdır
	
	- Faaliyet Alanı (scope): Bir değişken isminin derleyici tarafından görülebildiği kod aralığıdır. Derleme zamanına
	ilişkindir
	
	- Ömür (storage duration): Bir değişkenin bellekte kalma süresidir. Çalışma zamanına ilişkindir
	
	Temel Kavramlar:
	- Blok (block): Bir metot içeriinde { ile } arasında kalan bölümdür. Metodun gövdesi de bir bloktur
	
	- İlkdeğer verme (initialization): Bir değişkene bildirim noktasında verilen değere denir 
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Bir metot içerisinde istenildiği kadar ayrık veya içiçe bloklar olabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		{
			//...
			{
				//...
			}	
			
			{
				//...
			}
		}
		
		{
			//...
		}
			
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Bir blok içerisinde herhangi bir yerde bildirilen değişkenlere yerel değişkenler (local variables) denir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		int a;
		
		{
			//...
			
			int b;
			
			{
				//...
				double c;
			}
		}
		
		{
			float d;
		}
	}
}

class Sample {
	public static void foo()
	{
		int x;
		//...
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Aynı türden yerel değişkenler aralarına virgül konarak bildirilebilirler
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		int a, b, c;
		
		{
			double d, e, f;
			
			//...
		}
	}
}

class Sample {
	public static void foo()
	{
		int x, y, z;
		//...
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Yerel bir değişkenin faaliyet alanı bildirildiği yerden bildirildiği bloğun sonuna kadardır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		{
			int x;
			
			{
				x = 10;
				//...
			}			
		}
		
		x = 34; //error		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aynı faaliyet alanı içerisinde aynı isimde yerel değişken bildirimi yapılamaz 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class Sample {
	public static void foo()
	{
		int a;
		double a; //error
		
		//...
	}
	
	public static void bar()
	{
		int x;
		
		{
			double x; //error
		}
	}	
}

/*----------------------------------------------------------------------------------------------------------------------
	Farklı faaliyet alanları içerisinde aynı isimde yerel değişken bildirimleri geçerlidir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class Sample {
	public static void foo()
	{
		int c;
		
		{
			int a;
			
			//...
		}
		
		{
			int a;
			
			//...
		}
		
		
		
		//...
	}
	
	public static void bar()
	{		
		int c;
		
		{
			double x;
			//...
		}
		
		int x;
	}	
}

/*----------------------------------------------------------------------------------------------------------------------
	Java'da değer verilmemiş hiç bir değişken kullanılamaz. Yani içerisinde değer varmış gibi işleme sokulamaz. Yerel
	değişkenlere değer verilmesi programcının sorumluluğundadır 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		int a;
		int b;

		b = a * 2; //error
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	print ve println metotları değişkenlerin içerisindeki değerleri ekrana basarlar 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		int a;
		
		a = 20;
		
		System.out.println(a);
		System.out.print(a);		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Programlamada "artık kullanılması tavsiye edilmeyen" durumlar için "deprecated" terimi kullanılır. Bu
	durumun gerekçeleri farklı farklı olabilir. Programcı açısından "deprecated" olan bir durum, özel bir takım nedenler
	yoksa kullanılması tercih edilmemesi gereken bir durumdur	
-----------------------------------------------------------------------------------------------------------------------*/


/*----------------------------------------------------------------------------------------------------------------------
	Değişken İsimlendirme Kuralları:
	- Değişken isimleri sayısal bir karakter ile başlatılamaz
	
	- Değişken isimleri herhangi bir uygun karakter ile başlatılıp istenildiği kadar sayısal karakter ile devam ettirilebilir
	Örneğin: a1234, _1234;
	
	- Değişken isimleri UNICODE karakterlerden oluşabilir. Örneğin Türkçe karakterler geçerlidir
	
		Anahtar Notlar: Her ne kadar değişken isimlendirmede UNICODE karakterler kullanılabilse de programlamada 
		yalnızca İngilizce alfabedeki 26 karakterin kullanılması iyi bir tekniktir. Biz de bu "convention"'a uygun
		kodlar yazacağız
		
	- Değişken isimlendirmede boşluk (whitespce) karakterler geçersizdir
	
	- Değişken isimleri büyük-küçük harf duyarlıdır (case sensitive). Aslında Java programlama dili büyük küçük harf
	duyarlı bir dildir
	
	- Java 9 ile birlikte alttire karakterinin tek başına değişken ismi olarak kullaılmnası geçersizdir. Java 8 ile birlikte
	"deprecated" olmuştur
	
	- Java'da değişken isimlendirmede $ karakteri kullanılabilir. Hatta isimler $ karakteri ile başlatılabilir. $ karakteri
	tek başlına değişken ismi olabilir. Ancak programcı değişken isimlendirmede $ karakteriniş kullanmamalıdır. Derleyici
	ismini kendisinin belirlediği durumlarda isimlendirmede bu karakteri kullanır. $ karakterini programcı da kullanırsa
	isim çakışmaları olabilir. Zaten $ karakterinin değişken isimlendirmede geçerli olmasının nedeni bu tip durumlardan
	kaynaklanır
	
	- Anahtar sözcükler tek başına değişken ismi olarak kullanılamaz. Ancak Java'ya daha sonra eklenmiş yerine göre 
	anahtar sözcük gibi de ele alınan bazı atomlar vardır. Bu tarz eklenen atomlar tam anlamıyla anahtar sözcük 
	tanımına uymazlar. Kullanıldığı yere göre değişken ismi olup olmadığı derleyici tarafından tespit edilir (inference, deduction).
	Bu tarz sözcüklere programlamada genel olarak "contextual keywords" de denir
	
	Anahtar Notlar: Java'nın kuralları dışında (ki bunlara zaten uymalıyız) programcının değişken isimlenlerini
	okunabilirlik/algılanabilirlik açısından uygun şekilde vermesi gerekir. Bunun için bir çok teknik vardır. Ancak genel
	olarak kabul gören teknik şudur: Değişken isimlerinin "kolay telaffuz edilebilir, anlamlı ve yeterince uzunlukta"
	olması tavsiye edilir
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Aşağıda klavyeden temel türden değerleri okuma yöntemlerinin tam anlamı zaman içerisinde anlaşılacaktır.
	Bu sebeple bunları bir kalıp olarak görüp yalnızca klavyeden okuma kısımları ile ilgileniniz
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden int türden değer okuma kalıbı
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());		
		int result;
		
		result = val * val;
		
		System.out.println(result);				
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden int türden değer okuma kalıbı.
	Bu kalıpta birinci değeri girdikten sonra ikinci bir değerin girilebilmesi için "enter" basılmalıdır. Örneğin sayılar
	arasında boşluk karakteri kullanımı bu kalıpta exception oluşumuna yol açar
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());
		
		int result;
		
		result = a + b;
		
		System.out.println(result);				
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden int türden değer okuma kalıbı.
	Bu kalıpta sayılar aralarında herhangi bir "whitespace" konarak girilebilir. Ancak bu kullanımın bazı durumlarda
	tercih edilmemesi gerekir. İleride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();		
		int b = kb.nextInt();
		
		int result;
		
		result = a + b;
		
		System.out.println(result);				
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden double türden değer okuma kalıbı.
	Bu kalıpta birinci değeri girdikten sonra ikinci bir değerin girilebilmesi için "enter" basılmalıdır. Örneğin sayılar
	arasında boşluk karakteri kullanımı bu kalıpta exception oluşumuna yol açar
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		double a = Double.parseDouble(kb.nextLine());		
		System.out.print("İkinci sayıyı giriniz:");
		double b = Double.parseDouble(kb.nextLine());		
		double result;
		
		result = a + b;
		
		System.out.println(result);				
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden double türden değer okuma kalıbı.
	Bu kalıpta sayılar aralarında herhangi bir "whitespace" konarak girilebilir. Ancak bu kullanımın bazı durumlarda
	tercih edilmemesi gerekir. İleride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();		
		double b = kb.nextDouble();		
		double result;
		
		result = a + b;
		
		System.out.println(result);				
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden long türden değer okuma kalıbı.
	Bu kalıpta sayılar aralarında herhangi bir "whitespace" konarak girilebilir. Ancak bu kullanımın bazı durumlarda
	tercih edilmemesi gerekir. İleride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		long a = kb.nextLong();		
		long b = kb.nextLong();		
		long result;
		
		result = a + b;
		
		System.out.println(result);				
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden long türden değer okuma kalıbı.
	Bu kalıpta birinci değeri girdikten sonra ikinci bir değerin girilebilmesi için "enter" basılmalıdır. Örneğin sayılar
	arasında boşluk karakteri kullanımı bu kalıpta exception oluşumuna yol açar
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		long a = Long.parseLong(kb.nextLine());		
		System.out.print("İkinci sayıyı giriniz:");
		long b = Long.parseLong(kb.nextLine());		
		long result;
		
		result = a + b;
		
		System.out.println(result);				
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	İfade (expression): Sabitlerden, opratörlerden ve değişkenlerden oluşan herhangi bir dizilime ifade denir. Değişkenler
	ve sabitler tek başına ifade belirtebilirken, operatörler tek başına ifade olamazlar. İstisna bir durum dışında ifadeler
	hesaplandığında bir değer elde edilir (değer üretilir).
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değeri bilgisi yerine bir tür ismi yazılırsa bu metodun "geri dönüş değeri vardır" denir.
	Tersine bir metodun geri dönüş değeri varsa geri dönüş değeri bilgisi yerine bir tür ismi yazılır. Bir metodun
	geri dönüş değeri varsa metot çağrısı bittikten sonra çağrıldığı noktaya bir değer ile geri döner. Bir metodun 
	geri dönüş değeri yoksa bu bilgi yerine void yazılır. Bir metodun geri dönüş değeri metot içerisinde metot içerisinde
	return deyimi ile oluşturulur. return deyiminin genel biçimi şu şekildedir:
		return [ifade];
	return deyiminin en temel görevi metodu sonlandırmaktır. Yani metot içerisinde akış bu deyime geldiğinde metot sonlanır
	ve akış çağrılan noktaya geri döner. return deyimine ilişkin ifadenin değeri çağıran metoda aktarılır. Aşağıdaki örnekte 
	add metodunun geri dönüş değeri 2 ile çarpılmış ve sonuç result değişkenine atanmıştır	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		int result;
		
		result = NumberUtil.add() * 2;
		
		System.out.println(result);
	}
}


class NumberUtil {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		
		return total;		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Java derleyicisi genel olarak akışın bir deyime hiç bir zaman gelmeyeceğini anlarsa o yazılan deyim
	için error oluşturur (unreachable code)
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	return deyiminin en temel görevi metot sonlandırmak olduğunda Aşağıdaki örnek return deyiminden sonra yazılan kod
	error oluşturur. Çünkü akış hiç bir zaman return deyiminden sonra metot içerisinde kalmaz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class NumberUtil {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		
		return total;
		System.out.println("Merhaba"); //error
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	11.12.2022	
	Blue
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Geri dönüş değeri olan metotlarda (void olmayan metotlarda) return tek kullanılamaz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class NumberUtil {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		
		return; //error		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Geri dönüş değeri olan metotlar akışın her noktasında bir değere geri dönmelidir. Aksi durumda error oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class NumberUtil {
	public static int add() //error
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;	
				
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Geri dönüş değeri olan metotlar akışın her noktasında bir değere geri dönmelidir. Aksi durumda error oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class NumberUtil {
	public static int add() //error
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		
		if (total > 0)
			return total * 2;					
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Geri dönüş değeri olan metotlarda return deyimine ilişkin ifade önce hesaplanır, elde edilen değere geri dönülür
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		int result;
		
		result = NumberUtil.add() * 2;
		
		System.out.println(result);
	}
}


class NumberUtil {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();	
		
		return a + b;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Derleyici geri dönüş değerinin çağıran metoda aktarımı için geçici değişken yaratan bir kod üretir. Aşağıdaki 
	** ile belirtilen kod parçası için derleyicinin ürettiği temsili kod aşağıdaki gibidir:	
		 int temp = a + b;
		 
		 result = temp * 2;
	Yani aslında geri dönüş değeri geçici değişkene yapılan bir atama işlemidir. Geçici değişkenin türü geri dönüş değerinin
	türü ile aynıdır.

	Eflatun
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		int result;
		
		result = NumberUtil.add() * 2; //**
		
		System.out.println(result);
	}
}


class NumberUtil {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();	
		
		return a + b;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Derleyici geri dönüş değerinin çağıran metoda aktarımı için geçici değişken yaratan bir kod üretir. Aşağıdaki 
	** ile belirtilen kod parçası için derleyicinin ürettiği temsili kod aşağıdaki gibidir:	
		 int temp = a + b;
		 
		 result = temp;
	Yani aslında geri dönüş değeri geçici değişkene yapılan bir atama işlemidir. Geçici değişkenin türü geri dönüş değerinin
	türü ile aynıdır
	Eflatun
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{			
		int result;
		
		result = NumberUtil.add(); //**
		
		System.out.println(result);
	}
}


class NumberUtil {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();	
		
		return a + b;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Geri dönüş değeri olan metotlar geri dönüş değri işleme sokulmayacak şekilde çağrılabilirler. Şüphesiz metodun da 
	tasarımı bu kullanım için anlamlı olmalıdır. Aşağıdaki örnekte add metodu klavyeden alınan değerlerin toplamını
	ekrana basıp bu değeri de geri dönmektedir. Programcı kodda metodun sadece ekrana basması ile ilgilenmiş ve geri
	dönüş değerini kullanmamıştır. Şüphesiz başka bir çağrıda kullanabilir.

	Aqua

	Burada programcı metodu çağırıp bir işlem yapmıyor. Mesela bir result değişkenine geri dönüş değerini  atamıyor.
	MEtodda ekrana basan kodu bize verir. Geri dönüş değerini kullanmadı.Sadece metodu çağırdı.
	
	Metot ekrana toplam değerini basmasaydı bu şekilde çağırma işimize yarar mıydı?
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{		
		NumberUtil.add();		
	}
}

class NumberUtil {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total = a + b;
		
		System.out.println(total);
		
		return total;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değeri başka bir metodun geri dönüş değeri olarak verilebilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{		
		int result;
		
		result = Util.getAdd();
		
		System.out.println(result);
	}
}

class Util {
	public static int getAdd()
	{
		System.out.println("Toplama işlemi yapılıyor");
		
		return NumberUtil.add();
	}
}

class NumberUtil {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		
		return a + b;
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte yine add metodunun geri dönüş değeri return deyimine ilişkin ifadede işleme sokuluştur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{		
		int result;
		
		result = Util.getResult();
		
		System.out.println(result);
	}
}

class Util {
	public static int getResult()
	{
		System.out.println("İşlemi yapılıyor");
		
		return NumberUtil.add() * 2;
	}
}

class NumberUtil {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		
		return a + b;
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	void metotlarda return deyimi zorunlu değildir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{		
		NumberUtil.printTotal();
	}
}


class NumberUtil {
	public static void printTotal()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;
		
		System.out.println(total);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	void metotlarda return istenirse metodu sonlandırmak için tek başına kullanılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{		
		NumberUtil.printPositiveTotal();
	}
}


class NumberUtil {
	public static void printPositiveTotal()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;
		
		if (total < 0)
			return;
		
		System.out.println(total);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	void metotlarda return ifade ile kullanılamaz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{		
		NumberUtil.printPositiveTotal();
	}
}


class NumberUtil {
	public static void printPositiveTotal()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;
		
		if (total < 0)
			return total; //error
		
		System.out.println(total);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	void metotlar geri dönüş değeri varmış gibi çağrılamaz. Yani void bir metot çağrısı geri dönüş değeri vermış gibi işleme
	sokulamaz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		int result;
		
		result = NumberUtil.printPositiveTotal(); //error
	}
}


class NumberUtil {
	public static void printPositiveTotal()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;
		
		if (total < 0)
			return total; //error
		
		System.out.println(total);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Metot bildiriminde metot isminden sonra parantezler arasında bildirilen değişkenlere "metot paramtere değişkenleri"
	ya da kısaca "paramtre değişkenleri" denir. Bir metodun parametre değişkenleri olmayabilir ya da istenildiği kadar 
	olabilir. Parametre değişkenleri virgül ile ayrılarak bildirilirler 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class NumberUtil {
	public static void printTotal(int a, int b)
	{
		//...
	}
	
	public static void printSquare(int a)
	{
		//...
	}
	
	//..
}

/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun parametre değişkenleri aynı türden olsa bile tür bilgisi yazılmalıdır. Aksi durumda error oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;


class NumberUtil {
	public static void printTotal(int a, b) //error
	{
		//...
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Metodun parametre değişkenleri faaliyet alanı (scope) bakımından metot başında bildirilen yerel değişkenler gibidir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;


class NumberUtil {
	public static void printTotal(int a, int b) 
	{
		int total;
		
		total = a + b;
		
		System.out.println(total);
	}
	
	public static void printSquare(int a)
	{
		int result = a * a;
		
		System.out.println(a);
	}
	
	//..
}

/*----------------------------------------------------------------------------------------------------------------------
	 Metodun parametre değişkenlerine değer metot çağrılırken verilir. Metot çağrılırken bir parametreye verilen 
	 ifadeye "argüman" denir. Bir metodun kaç tane parametresi varsa o kadar sayıda argüman ile çağrılmalıdır.
	 Argümanlardan parametrelere aktarım da bir atama işlemidir.
    
     Aqua
	 Metod çağırılırken parametrelere verilen ifadeler. ARGÜMAN...
	 Argümanlardan parametrelere aktarım da bir atama işlemidir
	 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int x = kb.nextInt();
		int y = kb.nextInt();
		
		NumberUtil.printTotal(x, y); // Argumanlar.. bu metodun geri dönüş değeri yok : "void"
		int result = NumberUtil.multiply(x, y); // Argumanlar..
		
		System.out.println(result);
		result = NumberUtil.square(y); // Argumanlar..
		System.out.println(result);
	}
}


class NumberUtil {
	public static void printTotal(int a, int b) 
	{
		int total;
		
		total = a + b;
		
		System.out.println(total);
	}
	
	public static int multiply(int a, int b)
	{
		return a * b;
	}
	
	public static int square(int a)
	{
		return a * a;
	}
	
	//..
}

/*----------------------------------------------------------------------------------------------------------------------
	Metot çağrısında bir argümana ilişkin ifade önce hesaplanır, elde edilen değer ile metot çağrılır. Birden fazla
	parametresi olan bir metot çağrısında tüm argümanlara ilişkin ifadeler hesaplanır, elde edilen değerler ile 
	metot çağrılır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result;
		
		result = NumberUtil.multiply(a * 2, b - 4);
		
		System.out.println(result);
	}
}


class NumberUtil {
	
	public static int multiply(int a, int b)
	{
		return a * b;
	}

	//..
}

/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değeri başka bir metoda argüman olarak geçilebilir. Bu tarz "compact" çözümler kodun
	okunabilirliğini/algılanabilirliğini" etkilememelidir. Gerekirse ayrı ayrı hesaplanacak şekilde yazılmalıdır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt(); // 4
		int b = kb.nextInt(); // 4
		
		System.out.println(NumberUtil.multiply(a * 2, b - 4)); // a ve b değerleri hesaplanır.
		                                                           // a = 8, b = 0
	}
}


class NumberUtil {
	                          //int 8, int 0
	public static int multiply(int a, int b) // a ve b değerleri bu parametreye argüman olarak geçer..

	{
		return a * b; // geri dönüş değeri hesapanır.. (8 * 0 = 0)
	}

	//..
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte iki multiply çağrısı arasında argümanlarda bir değişiklik olmamasına karşın programcı iki kere multiply
	metodunu çağırmıştır. Bu durumda kod hem iki defa çağırmanın gereksizliğiğ hem de okunabilirlik algılanabilirlik
	açısından kötü yazılmıştır. Yani aslında kodu okuyan bir programcı için bu metotların iki defa çağrıldığını gördüğünde
	akış içerisinde a veya b'nin değiştiği algısı oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.println(NumberUtil.multiply(a, b));
		
		//... (Burada a veya b değişkenlerinin değişmiyor)
		
		System.out.println(NumberUtil.multiply(a, b));
	}
}


class NumberUtil {
	
	public static int multiply(int a, int b)
	{
		return a * b;
	}

	//..
}

/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki kod aşağıdaki gibi bir çözümle iyi hale getirilebilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result = NumberUtil.multiply(a, b);
		
		System.out.println(result);
		
		//... (Burada a veya b değişkenlerinin değişmiyor)
		
		System.out.println(result);
	}
}


class NumberUtil {
	
	public static int multiply(int a, int b)
	{
		return a * b;
	}

	//..
}

/*----------------------------------------------------------------------------------------------------------------------
	17.12.2022	
	Blue
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Metot ne işe yarar? Ya da başka bir deyişle bir problemin çözümünde neden metotlar yazalım? Bu sorular genel 
	olarak aşağıdaki durumlar ile özetlenebilir:
	
	- Bir işi çok fazla yerde yapmak kod tekrarına yol açar. Yazılım geliştirmede temel prensip "zorunlu olmadıkça 
	kod tekrarı yapılmamalıdır (do not repeat yourself)" şeklindedir. Bu durumda programcı önreğin bir metot yazar
	ve ilgili yerlerde çağırır.
	
	- Bir problemin çözümü metot çağırma yerine her yerde kodun yazılması biçiminde gerçekleştirilmişse (implementation),
	bu durumda programcı problem için algoritmasında bir değişiklik yapmak isterse veya bir hata olduğunu anlayıp düzeltmek
	isterse her yerde bu değişiklikleri yapmak zorunda kalır. Bu da çoğu zaman zor olabilir. Halbuki programcı bu problemin
	çözümü için bir metot yazarsa değişikliği daha kolay yapabilir.
	
	- Bir problemin çözümü metot çağırma yerine her yerde kodun yazılması biçiminde gerçekleştirilmişse (implementation),
	bu durumda kodun okunabilirliği/algılanabilirliği de azalabilir. Yani bu durumda metot çağırarak kodun okunabilirliği/algılanabilirliği
	artırılmış olur.
	
	- Metot yazıldığında başka projelere taşınarak da kullanılabilir (code re-usability).
	
	- Metodu çağıran programcı metodun nasıl yazıldığına ilişkin detayları bilmek zorunda değildir. Çünkü metodun
	çağrıldığı noktada metodun nasıl yazıldığının doğrudan önemi yoktur.
	
	Anahtar Notlar: İleride ele alacağımız "nesne yönelimli programlama tekniği"'ne ilişkin 
	kavramlar ile kodun yönetilmesi anlamında örneğin parçalara ayırma kavramı metotlar
	ile birlikte daha yüksek seviyede başka elemanlar ile de yapılabilecektir. Yani kabaca 
	programlamanın temelinde metotlar vardır  

	Violanca (Metodlar)
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	System.out.printf metodunun ilk argümanı String olmalıdır. Metot bu argüman dışında istenilen sayıda ve istenilen
	türde argüman ile çağrılabilir. Metodun birinci parametresine ilişkin argümanda % karakteri ile birlikte geçerli
	bazı karakterler kullanıldığında "yer tutucu (place holder)" belirtilmiş olur. % ile birlikte kullanıma 
	"format belirleyici (format specifier)" de denir. % ile birlikte kullanılan özel karakterlere ise 
	"format karakterleri (format characters)" denir. Metot yer tutucular yerine diğer geçilen argümanlara ilişkin
	değerleri yerleştirir ve ekrana bu yazıyı basar. Bazı format karakterleri bir argümana karşılık gelmez. Özel anlamları 
	vardır.
	
	Anahtar Notlar: printf gibi değişken sayıda argüman alabilen metotlara "vararg methods" denir. Burada bu tarz metotların
	nasıl yazılabileceği ele alınmayacaktır
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Tamsayı türlerinin (short, int, long, byte) decimal olarak formatlanması için d format karakteri kullanılır 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Derece bilgisini giriniz:");
		int degree = kb.nextInt();
		
		System.out.printf("Bugün hava %d derece", degree);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Tamsayı türlerinin (short, int, long, byte) decimal olarak formatlanması için d format karakteri kullanılır 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bugün ve yarın için derece bilgisini giriniz:");
		int degree = kb.nextInt();
		int nextDegree = kb.nextInt();
		
		System.out.printf("Bugün hava %d derece, yarın %d derece olacağı tahmin ediliyor", degree, nextDegree);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda imleci bir sonraki satırın başına geçirmek için %n kullanılabilir. %n bu anlamda bir argümana 
	karşılık gelmez 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bugün ve yarın için derece bilgisini giriniz:");
		int degree = kb.nextInt();
		int nextDegree = kb.nextInt();
		
		System.out.printf("Bugün hava %d derece, yarın %d derece olacağı tahmin ediliyor%n", degree, nextDegree);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda imleci bir sonraki satırın başına geçirmek için %n kullanılabilir. %n bu anlamda bir argümana 
	karşılık gelmez 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Arasınav ve final notlarını giriniz:");
		int midTermGrade= kb.nextInt();
		int finalGrade = kb.nextInt();
		
		System.out.printf("Arasınav notu:%d%nFinal Notu:%d%n", midTermGrade, finalGrade); 
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda x, X, h, H format karakterleri ile tamsayı türlerine ilişkin değerler hexadecimal olarak 
	formatlanabilir. Ayrıca o (küçük O) format karakteri ile tamsayı türlerine ilişkin değerlere octal olarak formatlanabilir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		System.out.printf("val = %d%n", val);		
		System.out.printf("val = %X%n", val);
		System.out.printf("val = %x%n", val);
		System.out.printf("val = %H%n", val);
		System.out.printf("val = %h%n", val);
		System.out.printf("val = %o%n", val);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda tamsayılar için hizalama (alignment) yapılabilir. Aşağıdaki örnekte %08X yer tutucusu için yazılan
	karakter sayısı 8'den azsa geri kalanlar sıfır ile beslenir 

	Aqua
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		System.out.printf("val = %d%n", val);		
		System.out.printf("val = %08X%n", val);				
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda tamsayılar için hizalama (alignment) yapılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Gün, ay ve yıl bilgisini giriniz:");
		int day = kb.nextInt();
		int month = kb.nextInt();
		int year = kb.nextInt();
		
		//...
		
		System.out.printf("%02d/%02d/%04d%n", day, month, year);						
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Tamsayılar için formatlamanın diğer ayrıntıları ileride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda gerçek sayılar için (float ve double) f format karakteri kullanılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();
		
		//...
		
		System.out.printf("a = %f%n", a);						
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda f format karakteri ile ondalık kısmın kaç basamak olarak formatlanacağı aşağıdaki gibi % ve f
	arasında . ve sayı yazılarak yapılabilir. Geri kalan basamaklar bilimsel olarak yuvarlanır

	Aqua
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();	
		
		System.out.printf("a = %.3f%n", a);						
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Gerçek sayılar için formatlamanın diğer ayrıntıları ileride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda char türü için c format karakteri kullanılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		char ch = 67;
		
		System.out.printf("ch = %c%n", ch);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda boolean türü için b format karakteri kullanılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		boolean flag = true;
		
		System.out.printf("flag = %b%n", flag);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda uygun format karakteri kullanılmazsa genel olarak exception oluşur. Bu durumun istisnaları vardır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		int a = 10;
		
		System.out.printf("a = %f%n", a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda s format karakteri ile tür ne olusa olsun formatlanabilir. Şüphesiz bu durumda türe özgü biçimler
	(hizalama, noktadan sonra kaç basamak alınacağı vb) kullanılamaz. Bu format karakterinin ayrıntıları ileride ele
	alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		int a = 10;
		double b = 3.4;
		boolean c = true;
		char ch = 68;
		
		System.out.printf("a = %s, b = %s, c = %s, ch = %s%n", a, b, c, ch);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda % karakterinden sonra uygun bir format karakteri getirilmezse exception oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İndirim oranını giriniz:");
		double ratio = kb.nextDouble();
		
		System.out.printf("Oran: % %f%n", ratio);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda % karakterinin basılması için iki tane % karakteri kullanılmalıdır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İndirim oranını giriniz:");
		double ratio = kb.nextDouble();
		
		System.out.printf("Oran: %% %f%n", ratio);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda % karakterinin basılması için iki tane % karakteri kullanılmalıdır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İndirim oranını giriniz:");
		double ratio = kb.nextDouble();
		
		System.out.printf("Oran: %%%f%n", ratio);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: printf metodunun format karakterleri ve kullanım biçimleri oldukça geniştir. Burada sadece temel
	olanlar ele alınmıştır. Diğer format karakterleri ve kullanım detayları konular içerisinde ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden girilen arasınav ve final notlarına ilişkin double türden değerlerin geçme notunu hesaplayan
	programı aşağıdaki açıklamalara göre yazınız.
	Açıklamalar:
	- Geçme notu arasınavın % 40'ı ile final notunun %60'ının toplamından elde edilecektir
	- Geçti veya kaldı bilgisi yazdırılmayacaktır
	- Ekran çıktısı aşağıdaki biçimde tek bir printf kullanılarak yapılmalıdır:
	 	Arasınav: 50
		Final: 50
		Geçme Notu: 50
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		FindGradeApp.run();		
	}
}

class FindGradeApp {
	public static double calculateGrade(double midTermGrade, double finalGrade)
	{
		return 0.4 * midTermGrade + 0.6 * finalGrade;
	}
	
	public static void printResult(double midTermGrade, double finalGrade)
	{
		double grade = calculateGrade(midTermGrade, finalGrade);
		
		System.out.printf("Arasınav: %.1f%nFinal:%.1f%nGeçme Notu:%.1f%n", midTermGrade, finalGrade, grade);		
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Arasınav ve final notlarını giriniz:");
		double midTermGrade = kb.nextDouble();
		double finalGrade = kb.nextDouble();
		
		printResult(midTermGrade, finalGrade);		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Bölme işlemi tamsayılar ile yapıldığında sonuç her zaman tamsayı çıkar. İşlem sonucunda elde edilen değerin noktadan
	sonraki kısmı yuvarlanmadan atılır. 
	
	Tamsayılar ile bölme işleminde paydanın sıfır olması durumunda exception oluşur.
	
	Bu durumların ayrıntıları ileride ele alınacaktır.
	
	Aşağıdaki örneği çeşitli değer ile çalıştırıp sonuçları gözlemleyiniz

	Aqua
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		double c;
		
		c = a / b;
		
		System.out.printf("%d / %d = %f%n", a, b, c);		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Gerçek sayılar ile bölme işleminde payda sıfır olsa bile işlem yapılır. Yani exception oluşmaz. Gerçek sayılar
	içerisinde genel olarak Matematikteki "belirsizlik" için kullanılan "Not a Number (NaN)" değeri vardır. Ayrıca genel 
	olarak sonsuzluk (Matematik'teki tanımsız) için kullanılan -Infinity ve +Infinity değerleri de vardır. Bu değerler
	dışında da başka özel değerler vardır. Bu durumda gerçek sayılar ile bölme işleminde pay sıfırdan farklı, payda sıfır
	ise payın işaretine göre + veya - Infinity, pay ve paydanın her ikisi birden sıfır ise NaN sonucu elde edilir.
	
	Aşağıdaki örneği çeşitli değer ile çalıştırıp sonuçları gözlemleyiniz

	Aqua
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c;
		
		c = a / b;
		
		System.out.printf("%f / %f = %f%n", a, b, c);		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Neden standart metotları kullanmalıyız? Yani standart olarak var olan bir metodu programcı yazmalı mıdır?
	Java'da standart olarak (JavaSE) bulunan metotların kullanılmasının bazı avantajları şunlardır:
	- Okunabilir kodlar yazılır
	- Testleri yapılmıştır ve yeterince olarak yazılmıştır
	- Taşınabilirdir
	- Bazı metotlar başka detay konuları da bilmeyi gerektirir
	- Programcının projede sadece kendi konusuna odaklanmasını sağlar
	
	Bu durumda bir Java programcısı çözmesi gereken bir problem için JavaSE'de problemin çözümüne ilişkin metotlar
	varsa onları kullanmalıdır. Yoksa yazmayı düşünmeye başlamalıdır. Ancak bu durum programcının standart olarak kullandığı
	metotların nasıl yazıldığını gözardı etmesi anlamına gelmez. Programcı programlama yalamı boyunca hepsini olmasa da
	hazır olarak kullandıklarının nasıl yazılacağını da öğrenmelidir. 
	
	Anahtar Notlar: Bazı durumlarda programcı JavaSE'de bulunmayan bir metot, kendisini kanıtlamış ve Java uygulamalarında da 
	kullanılan kütüphanelerde bulunuyorsa onu da kullanabilir. Şüphesiz bu durum senaryoya ve kullanılan kütüphaneye de
	bağlıdır
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının abs metotları
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		System.out.printf("|%d| = %d%n", a, Math.abs(a));		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının sqrt metodu
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();
		
		System.out.printf("sqrt(%f) = %f%n", a, Math.sqrt(a));		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının pow metodu
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		
		System.out.printf("pow(%f, %f) = %f%n", a, b, Math.pow(a, b));		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı double türden x1, y1, x2, y2 koordinat bilgilerine göre iki nokta arasındaki
	((x1, y1) ve (x2, y2) noktaları) Euclid uzaklığına geri dönen distance isimli metodu PointUtil isimli sınıf 
	içerisinde yazını ve aşağıdaki kod ile test ediniz 
	
	Not: İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		DistanceTest.run();
	}
}

class DistanceTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Koordinatları giriniz:");	
		double x1 = kb.nextDouble();
		double y1 = kb.nextDouble();
		double x2 = kb.nextDouble();
		double y2 = kb.nextDouble();
		
		System.out.printf("Distance:%f%n", PointUtil.distance(x1, y1, x2, y2));		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class PointUtil {
	public static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı double türden x1, y1, x2, y2 koordinat bilgilerine göre iki nokta arasındaki
	((x1, y1) ve (x2, y2) noktaları) Euclid uzaklığına geri dönen distance isimli metodu PointUtil isimli sınıf 
	içerisinde yazınız ve aşağıdaki kod ile test ediniz 
	
	Not: İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		DistanceTest.run();
	}
}

class DistanceTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Koordinatları giriniz:");	
		double x1 = kb.nextDouble();
		double y1 = kb.nextDouble();
		double x2 = kb.nextDouble();
		double y2 = kb.nextDouble();
		
		System.out.printf("Distance:%f%n", PointUtil.distance(x1, y1, x2, y2));		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class PointUtil {
	public static double distance(double x1, double y1, double x2, double y2)
	{		
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}



/*----------------------------------------------------------------------------------------------------------------------
	18.12.2022
	Blue
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının PI ve E elemanları
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının trigonometrik işlem yapan metotlar radyan ölçü birimi ile çalışır. Radyan ve derece arasındaki
	dönüşümler için toRadians ve toDegrees metotları kullanılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Derece bilgisini giriniz:");
		double val = kb.nextDouble();
		
		System.out.printf("sin(%f) = %f%n", val, Math.sin(Math.toRadians(val)));
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının min ve max metotları
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("max(%d, %d) = %d%n", a, b, Math.max(a, b));
		System.out.printf("min(%d, %d) = %d%n", a, b, Math.min(a, b));
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının min ve max metotları ile 3 tane sayının en büyüğünün ve en küçüğünün bulunması
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Üç sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		System.out.printf("max(%d, %d, %d) = %d%n", a, b, c, Math.max(Math.max(a, b), c));
		System.out.printf("min(%d, %d, %d) = %d%n", a, b, c, Math.min(Math.min(a, b), c));
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte Math sınıfının min ve max metotları kullanılarak 3 tane sayının en büyüğünü ve en küçüğünü
	bulan max ve min metotları yazılmıştır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Üç sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		System.out.printf("max(%d, %d, %d) = %d%n", a, b, c, MathUtil.max(a, b, c));
		System.out.printf("min(%d, %d, %d) = %d%n", a, b, c, MathUtil.min(a, b, c));
	}
}

class MathUtil {
	public static int min(int a, int b, int c)
	{
		return Math.min(Math.min(a, b), c);
	}
	
	public static int max(int a, int b, int c)
	{
		return Math.max(Math.max(a, b), c);
	}
	
	//...
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının logXXX metotları(log için 3 tane method vardır.)

	Aqua

	log(double a) : e tabanına göre alınan log
	log10(double a) : 10 tabanına göre log
	log1p(double x) : log x + 1 dir. bunun sebebi de log0= tanımsızdır. ama sıfır girildiğinde +1 yaparak tanımsız olması
	nı engeller.log1 = 0.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();
		
		System.out.printf("log(%f) = %f%n", a, Math.log(a));
		System.out.printf("log10(%f) = %f%n", a, Math.log10(a));
		System.out.printf("log1p(%f) = %f%n", a, Math.log1p(a));
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte Math sınıfında olmayan bir metot Math sınıfının metotları kullanılarak yazılmıştır

	Aqua

	  logb(b, a) = b : taban a: o tabanda istenilen ifade/değer
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();
		
		System.out.printf("log2(%f) = %f%n", a, MathUtil.log(2, a));		
	}
}

class MathUtil {
	public static double log(double a, double b)
	{
		return Math.log(b) / Math.log(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının yuvarlama işlemi yapan bazı önemli metotları

	Aqua

	round : girilen double ifadenin yuvarlanmadan tam kısmını basar.
	ceil :  girilen double ifadeyi bir üst sayıya yuvarlar.
	floor : ceil in aksine girilen ifadeyi bir alt sayıya yuvarlar.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();
		
		System.out.printf("round(%f) = %d%n", a, Math.round(a));
		System.out.printf("ceil(%f) = %f%n", a, Math.ceil(a));
		System.out.printf("floor(%f) = %f%n", a, Math.floor(a));
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sabitler (literals, constants):
	Program içerisinde doğrudan yazılan sayılara denir. Sabitlerin de türleri vardır. Derleyici sabitlerin türlerini
	tespit ederek işlem yapar:
	
	Sabitlerin türlerinin tespitine ilişkin detaylar:
	- Sayı nokta içermiyorsa, sonuna herhangi bir ek almamışsa ve int türü sınırları içerisindeyse int türdendir. Sayı 
	int türü sınırları içerisinde değilse error oluşur.
	Örneğin: 100, 300, 2456
	
	- Sayı nokta içermiyorsa ve sonuna L (küçük ya da büyük) ekini almışsa long türdendir. Sayı long türü sınırları
	dışındaysa error oluşur.
	Örneğin: 10L, 4000000000L
	
	Anahtar Notlar: Küçük harf L kullanımı 1(bir) rakamına benzemesinden dolayı programlamada tercih edilmez.
	
	- Java'da byte ve short türden sabitler yoktur.
	
	- Sayı nokta içeriyorsa ve sonuna bir ek almamışsa double türdendir. Sayı double olarak ifade edilemiyor ise error
	oluşur.
	Örneğin: 3.4, 5.6
	
	- Sayı nokta içersin ya da içermesin sonunda D (küçük veya büyük) eki varsa double türdendir.
	Örneğin: 10D, 3.4D
	
	- Sayı nokta içersin ya da içermesin sonunda F (küçük veya büyük) eki varsa float türdendir. Değer float ile temsil
	edilemiyorsa en yakın temsil edilebilen sayıya yuvarlanır.
	Örneğin: 10F, 3.4F
	
	- boolean türden iki tane sabit vardır: true, false
	
	- char türden sabitler: İki tane tek tırnak arasında yazılan bir karakter, karakter tablosunda sıra numarası belirtir.
	Bu şekilde yazılan sabitlere "karakter sabitleri (character literals)" denir ve bu sabitler char türdendir. İki tek
	tırnak arasına özel durumlar dışında birden fazla karakter yazımı gerçersizdir. 
	
	Bazı karakterlerin klavyeden basılması doğrudan derleyici tarafından karakter olarak algılanmaz. Hatta bazı karakterler
	"non-printable"'dır. Örneğin bir sonraki satıra geçme karakterinin karakter sabiti doğrudan yazılamaz. Bu tarz 
	karakterlerin karakter sabitleri iki tane tek tırnak içerisinde ters bölü karakteri ile onu takip eden özel karakterler
	biçiminde yazılır. Bu şekilde yazılan karakterlere "escape sequence" karakterler denir. Hatta bazı karakterler
	hem normal hem de ters bölü ile yazılabilirler:
	Java'da desteklenen escape sequence karakterler şunlardır:
	'\n' -> line feed (LF)
	'\r' -> carriage return (CR)
	'\t' -> horizontal tab
	'\b' -> backspace
	'\f' -> form feed
	'\0' -> null karakter
	'\"' -> double quote (optional)
	'\'' -> single quote
	'\\' -> back slash

	Violance (Sabitler) 
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	char türden sabitler	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		char c = 'D';
		
		System.out.printf("c = %c%n", c);
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte iki tane karakter yazımı dolayısıyla error oluşur	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		char c = 'De'; //error
		
		
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Line feed karakter sabiti	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		char c = '\n';
		
		System.out.print("Hello");
		System.out.print(c);
		System.out.println("World");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Carriage Return karakter sabiti: Aşağıdaki kodu işletim sisteminin komut yorumlayıcı/terminal programında 
	çalıştırarak sonucu gözlemleyiniz. Eclipse IDE'sinin console'unda beklenen sonucu elde edemeyebilirsiniz 	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		char c = '\r';
		
		System.out.print("Hello");
		System.out.print(c);
		System.out.println("Hi");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Horizontal tab karakter sabiti 	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		char c = '\t';
		
		System.out.print("Hello");
		System.out.print(c);
		System.out.println("Hi");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Escape sequence karakterler "String literal" içerisinde kendi anlamındadır 	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("Hello,\nHow are you?\nAre you ok?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Escape sequence karakterler "String literal" içerisinde kendi anlamındadır 	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("Hello, How are you?\rAre you ok?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Tek tırnak karakter sabiti String literal içerisinde doğrudan ya da ters bölü ile kullanılabilir  	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("'C ve Sistem Programcıları Derneği\'");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Tek tırnak karakter sabiti ters bölü ile yazılmalıdır  	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		char c = '\'';
		System.out.printf("c = %c%n", c);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	İki tırnak karakter sabiti iki şekilde de yazılabilir  	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		char c1 = '\"';
		char c2 = '"';
		
		System.out.printf("c1 = %c%n", c1);
		System.out.printf("c2 = %c%n", c2);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	İki tırnak karakter sabiti String literal içerisinde ters bölü ile yazılmalıdır  	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("\"C ve Sistem Programcıları Derneği\"");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Ters bölü karakter sabiti ters bölü ile yazılmalıdır  	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		char c = '\\';
		System.out.printf("c = %c%n", c);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte escape sequence karakterlerden dolayı istenilen sonuç elde edilemez. 	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("C:\todo\numbers.txt");
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problem aşağıdaki gibi çözülebilir  	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("C:\\todo\\numbers.txt");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Ters bölü karakterinde sonra özel karakterler dışında yazılan bir karakter error oluşturur  	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("C:\company\staff.dat"); //error
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	\\192.168.1.111\todo\numbers.txt yol ifadesinin string literal içerisinde yazılması
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("\\\\192.168.1.111\\todo\\numbers.txt");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki karakter tek tırnak karakteri değildir (backtick)  	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		char c = '`';
		
		System.out.printf("c = %c%n", c);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki karakter tek tırnak karakteri değildir (backtick)  	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		System.out.println("`C ve Sistem Programcıları Derneği`");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Ters bölü ve u karakteri ile bir karakterin sıra numarası hexadecimal olarak tek tırnak içerisinde yazıldığında 
 	o karaktere ilişkin karakter sabiti basılmış olur. Burada hexadecimal sayı kesinlikle iki byte yani 4 tane hex digit 
 	olarak yazılmaldır

 	Aqua

 	4 hex digit = 1 nibble

-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		char c = '\u00D8';
		
		System.out.printf("c = %c%n", c);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Ters bölü u ile yazılan karakter sabitleri string literal içerisinde de kullanılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		System.out.println("Latin Capital Letter O with stroke:\u00D8");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Ters bölü u ile yazılan karakterler değişken isimlendirmede xe kullanılabilir. Şüphesiz hem pratik değildir hem de
 	pratikte anlamlı değil. Çünkü zaten biz İngilizce alfabedeki karakterler dışındaki alfabetik karakterleri değişken
 	isimlendirmede tercih etmeyiz. Örnek durumu göstermek için yazılmıştır.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int \u0041\u0042\u00CB = 20;
		
		System.out.println(AB\u00CB);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Bir tamsayı sabitinin öneki yoksa bu durumda sabit "decimal" olarak ele alınır.

 	Aqua

 	decimal: 10 luk sayı sistemi.
 	10'luk sistemden 2'lik sisteme geçişte her digit 1 bit.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a = 10;
		
		System.out.println(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Bir tamsayı önüne bitişik olarak sıfır ve x (büyük veya küçük) yazıldığında bu ekten sonra gelen basamaklar 
 	"hexadecimal" olarak ele alınır.

 	Aqua

 	0x__ --> hexedecimal!!!!
 	hexe (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)
 	16'lık sistemden 2'lik sisteme dönüşte her digit 4 bittir. = 1 nibble
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a = 0xA;
		
		System.out.println(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Bir tamsayı önüne bitişik olarak sıfır ve x (büyük veya küçük) yazıldığında bu ekten sonra gelen basamaklar 
 	"hexadecimal" olarak ele alınır.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a = 0x1FC0;
	
		System.out.println(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Bir tamsayı önüne bitişik olarak sıfır yazıldığında bu ekten sonra gelen basamaklar "octal" olarak ele alınır.

 	Aqua

 	octal: 8 lik sayı sistemi.(0,1,2,3,4,5,6,7)
 	0__ --> octal
 	8’lik sayı sisteminin her bir digiti 2’lik sistemde 3 bit ile ifade edilir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a = 012;
	
		System.out.println(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Bir tamsayı önüne bitişik olarak sıfır ve b (küçük veya büyük) yazıldığında bu ekten sonra gelen basamaklar
 	"binary" olarak ele alınır. İkilik sistemde sabit yazımı Java 7 ile birlikte eklenmiştir.

 	Aqua

 	0b__ --> sonraki basamaklar binary (0,1)
    her digit 1 bit
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a = 0b1010;
	
		System.out.println(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Gerçek sayıların üstel (bilimsel) gösterilişi. Bu gösterişte sabitler double türdendir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		double avogadroNumber = 6.02E23;
		
		System.out.println(avogadroNumber);
		System.out.printf("%f%n", avogadroNumber);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Java 7 ile birlikte tamsayı ve gerçek sayı sabitlerinin basamakları arasında alttire karakteri kullanılabilmektedir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a;
		
		a = 0xAB_BC_DE;
		
		System.out.println(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Java 7 ile birlikte tamsayı ve gerçek sayı sabitlerinin basamakları arasında alttire karakteri kullanılabilmektedir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		long a;
		
		a = 5_000_000_000L;
		
		System.out.println(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Alttire karakteri kullanılabildiği her yerde istenildiği kadar yazılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a;
		
		a = 1____________________________________________0;
		
		System.out.println(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Alttire karakteri kullanılabildiği her yerde istenildiği kadar yazılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a;
		
		a = 0b10000101_00001010__00001010_11111011;
		
		System.out.println(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Alttire karakteri bir tane istisna dışında yalnızca basamaklar arasında kullanılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a = 123_; //error
		int b = _123; //error
		double c = 345_.45; //error
		
		//...
	}
}


/*----------------------------------------------------------------------------------------------------------------------
 	Alttire karakteri octal sabitler için örnek (sıfır) ile ilk basamak arasında geçerlidir. Bu durum yalnızca octal
 	sabitler için vardır. Geri kalan tüm sabitlerde alttire karakteri basamaklar arasında olmalıdır.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a = 0_12;
		
		System.out.println(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Bir gerçek sayı sabitinin tamsayı kısmının değeri sıfır ise noktadan önce sıfır yazılmayabilir. Benzer şekilde
 	sayının noktadan sonraki kısmının değeri sıfır ise yine noktadan sonra sıfır yazılmayabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		double a, b;
		
		a = .3;
		b = 3.;
		
		System.out.printf("a = %f%n", a);
		System.out.printf("b = %f%n", b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Yalnızca sabitlerden ve operatörlerden oluşan yani içerisinde değişken olmayan ifadelere "sabit ifadesi (constant expression)"
 	denir. Bu anlamda tek başına bir sabit de sabit ifadesidir.
 	
 	Anahtar Notlar: İleride aslında sabit ifadesi olarak kullanılabilen değişkenler de göreceğiz. Bu tarz değişkenler de 
 	bir ifade içerisinde sabit olarak ele alınırlar.
 	
 	Derleyiciler sabit ifadelerinin değerlerini hesaplayarak sonucu "byte code"'a yazarlar. Bu optimizasyona 
 	"constant folding optimization" denir. Bu sebeple aşağıdaki örnekte çarpmanın sonucu arakoda yazılır. Örnekteki
 	bazı detaylar ileride ele alınacaktır.

 	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		long divider = 1000L * 60 * 60 * 24 * 365; //byte code -> 31536000000
		
		System.out.println(divider);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Yalnızca sabitlerden ve operatörlerden oluşan yani içerisinde değişken olmayan ifadelere "sabit ifadesi (constant expression)"
 	denir. Bu anlamda tek başına bir sabit de sabit ifadesidir.
 	
 	Anahtar Notlar: İleride aslında sabit ifadesi olarak kullanılabilen değişkenler de göreceğiz. Bu tarz değişkenler de 
 	bir ifade içerisinde sabit olarak ele alınırlar
 	
 	Derleyiciler sabit ifadelerinin değerlerini hesaplayarak sonucu "byte code"'a yazarlar. Bu optimizasyona 
 	"constant folding optimization" denir. Bu sebeple aşağıdaki örnekteki çarpma sonucu arakoda yazılır. Örnekteki
 	bazı detaylar ileride ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		long divider = 1000L * 60 * 60 * 24 * 365; //byte code -> 31536000000
		
		System.out.println(divider);
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	24.12.2022
	Blue
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
 	Operatörler: Bir işleme yol açan ve işlem sonucunda bir değer üreten atomlara denir. Operatör ile birlikte işleme
 	giren ifadelere "operand" denir.
 	
 	Operatörler 3 biçimde sınıflandırılabilir:
 	1. İşlevlerine göre sınıflandırma
 		- Aritmetik (arithmetic) operatörler
 		- Karşılaştırma (comparison) operatörleri
 		- Mantıksal (logical) operatörler
 		- Bitsel (bitwise) operatörler
 		- Özel amaçlı (special purpose) operatörler
 	2. Operand sayılarına göre sınıflandırma
 		- Tek operandlı (unary)
 		- İki operandlı (binary)
 		- Üç operandlı (ternary) 
 	3. Operatörün konumuna göre sınıflandırma
 		- önek (prefix)
 		- araek (infix)
 		- sonek (postfix)
 		
 	Operatörlerin kısıtı (constraint)
 	Operatörün ürettiği değer (product value)
 	Operatörün yan etkisi (side effect) var mı? (*** atama işlemi değeri değiştirir. yan etkisi vardır denir.)
 	Operatörün önceliği (precedence):
 	
	 	a = b + c * d ifadesinin derleyici tarafından üretilen kodda yapılış sırası:
	 	
	 	i1: c * d
	 	i2: b + i1
	 	i3: a = i2
	 	
	 	a = (b + c) * d ifadesinin derleyici tarafından üretilen kodda yapılış sırası:
	 	
	 	i1: b + c
	 	i2: i1 * d
	 	i3: a = i2
	 	
	 	a = b + c - d ifadesinin derleyici tarafından üretilen kodda yapılış sırası:
	 	
	 	i1: b + c
	 	i2: i1 - d
	 	i3: a = i2
	 	
 	Anahtar Notlar: Java programcısı bir operatör için yukarıdaki durumları bilmelidir. Yani bir operatörün öğrenilmesi
 	o operatör için yukarıdaki durumların bilinmesi anlamına gelir
 	
 	Anahtar Notlar: Bazı operatörler öncelik kuralına uymazlar. Yani işlem önce yapılması gerekirken, yapılmayabilir. Bu 
 	tarz operatörlerin de uymadıkları durum için nasıl çalıştığının bilinmesi gerekir. Şüphesiz bu operatörlerin neden
 	öncelik kurallarına uymadıklarının da gerekçeleri (rationale) vardır.
 	
 	Anahtar Notlar: Notlardaki operatör öncelik tablosu gruplandırma olarak düşünülmelidir. Yani operatör öncelik
 	tablosundaki öncelik durumlarının işlemin yapılışına göre değişiklik gösterdiği durumlar vardır. Şüphesiz bunların da
 	bilinmesi gerekir. Operatör öncelik tablosu algısal bakımdan kolaylaştırmak için vardır ve önemlidir.

 	Violance (Operatörler)
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
 	Aritmetik 4 işlem ve mod operatörleri iki operandlı (binary) ve araek (infix) durumunda operatörlerdir. Bu operatörlerin
 	ürettikleri değer işlemin sonnucunda elde edilen değerdir. Bu operatörlerin yan etkisi (side effect) yoktur. Bu
 	operatörlerin kısıtı operandların türlerine göre işlem yapılıp yapılamacağı ile ilgilidir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d %% %d = %d%n", a, b, a % b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Aritmetik 4 işlem ve mod operatörleri iki operandlı (binary) ve araek (infix) durumunda operatörlerdir. Bu operatörlerin
 	ürettikleri değer işlemin sonnucunda elde edilen değerdir. Bu operatörlerin yan etkisi (side effect) yoktur. Bu
 	operatörlerin kısıtı operandların türlerine göre işlem yapılıp yapılamacağı ile ilgilidir 

 	***
 	a + b = c olsun. + burada bir operatördür. a ve b nin değerini değiştirmez,yani bir yan etkisi yoktur. Ama operatör bir
 	değer üretir.
 	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		
		System.out.printf("%f + %f = %f%n", a, b, a + b);
		System.out.printf("%f - %f = %f%n", a, b, a - b);
		System.out.printf("%f * %f = %f%n", a, b, a * b);
		System.out.printf("%f / %f = %f%n", a, b, a / b);
		System.out.printf("%f %% %f = %f%n", a, b, a % b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	% operatörünün birinci operandı negatif ise sonuç negatif çıkar. İkinci operandının negatif olmasının bir önemi yoktur.
 	Başka bir deyişle mod operatörünün sonucunun işareti birinci operandının işareti ile aynıdır. Adeta birinci operandının
 	ve ikinci operandının mutlak değerleri ile işlem yapılır, eğer birinci operandının işareti sonucun işareti olur  
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("%d %% %d = %d%n", a, b, a % b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Parametresi ile aldığı en fazla 3 basamaklı int türden bir sayının basamakları toplamına geri 
 	dönen sumDigits metodunu  NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz. 
 	Açıklamalar:
 	 - Metot aldığı argümana ilişkin sayının en fazla 3 basamaklı olup olmadığı kontrolünü yapmayacaktır
 	 - Basamaklar toplamı sayı negatif bile olsa pozitif olmalıdır 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		SumDigitsTest.run(); 
	}
}

class SumDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		System.out.printf("%d sayısının basamakları toplamı:%d%n", val, NumberUtil.sumDigits(val));
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int sumDigits(int val)
	{
		int a = val / 100;
		int b =  val % 100 / 10; //val / 10 % 10;
		int c = val % 10;
		
		return Math.abs(a + b + c);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
 	İşaret - operatörü tek operandlı (unary) ve önek (prefix) durumunda bir operatördür. Operatörün yan etkisi yoktur.
 	Operatör operandına ilişkin ifadenin değerinin ters işaretlisini üretir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt(); // a' nın değeri değişmedi. yani sayı girildi. ekranda a yine a. sadece işareti değişti
		int b;
		
		b = -a; // işaret değişti.
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	İşaret + operatörü tek operandlı (unary) ve önek (prefix) durumunda bir operatördür. Operatörün yan etkisi yoktur.
 	Operatör operandına ilişkin ifadenin değerini üretir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		int b;
		
		b = +a;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
 	Aşağıdaki örnekte ifade, işaret - operatörünün seviyesinde bulunan operatörlerin sağdan sola (right associative) 
 	ele alınmasından dolayı geçerlidir.

 	Aqua
 	Negatif sabit diye bir şey yoktur. Pozitif bir sabite eksi işaret operatörü eklendiğinde oluşan sabit değer vardır 
 	derleyici açısından.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		int b;
		
		b = a - - - - - - - - - - - - 2; // işaret tablosuna bakıldığında eksi işareti sağdan soladır..işlem en sağdan yapıır.

		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	++ operatörü tek operandlı ve hem prefix hem de postfix olarak kullanılabilen ve yan etkisi olan bir operatördür. Bu 
	operatörün prefix ya da postfix kullanımında değişken içerisindeki değer 1 artılır 
	++ operatörünün operandının değişken olması gerekir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a;
		
		a = 10;
		
		++a; //a = a + 1;
		System.out.printf("a = %d%n", a);
		
		a++; //a = a + 1;
		System.out.printf("a = %d%n", a);
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	++ operatörünün prefix kullanımında ürettiği değer yani işleme giren değer artırılmış değerdir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a, b;
		
		a = 10;
		b = ++a;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	++ operatörünün postfix kullanımında ürettiği yani işleme giren değer artırılmamış değerdir 

	++ -> increment operatörü
	-- -> decremant operatörü.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a, b;
		
		a = 10;
		b = a++;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	-- operatörü tek operandlı ve hem prefix hem de postfix olarak kullanılabilen ve yan etkisi olan bir operatördür. Bu 
	operatörün prefix ya da postfix kullanımında değişken içersisindeki değer 1 azaltır 
	
	-- operatörünün operandının değişken olması gerekir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a;
		
		a = 10;
		
		--a; //a = a - 1;
		System.out.printf("a = %d%n", a);
		
		a--; //a = a - 1;
		System.out.printf("a = %d%n", a);
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	-- operatörünün prefix kullanımında ürettiği değer yani işleme giren değer azaltılmış değerdir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a, b;
		
		a = 10;
		b = --a;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	-- operatörünün postfix kullanımında ürettiği değer yani işleme giren değer azaltılmamış değerdir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a, b;
		
		a = 10;
		b = a--;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ++ ve -- operatörleri ve operandları aynı ifadede kullanılmıştır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a, b;
		
		a = 10;
		b = a-- + ++a;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ++ ve -- operatörleri ve operandları aynı ifadede kullanılmıştır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a, b;
		
		a = 10;
		b = a-- + a++;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ++ ve -- operatörleri ve operandları aynı ifadede kullanılmıştır

	***
	Sabitlere bu operatörler uygulanamaz.
	a = --2; gibi. böyle bir şey yazılamaz..
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a, b;
		
		a = 2;
		b = a-- + ++a * a; // önce --,++ operatörlerinden kurutulacağız.
		//  2 + 2 * 2; haline gelecek. sonra çarpma sonrada toplama yapılıp sonuc 6 olcak.
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Derleyici yukarıdan aşağıya ve soldan sağa olmak üzere anlamlı en uzun ifadeyi alacak şekilde atomlarına ayırma (tokenizing)
	işlemini yapar. Bu yönteme "maximal/maximum munch" denir. Aşağıdaki örnek bu kuraldır dolayısıyla geçerlidir.


 Anahtar Notlar: Okunabilirlik/algılanabilirlik açısından tek operandlı operatörleri genel olarak operandına bitişik 
 olarak yazıcaz. İki operandlı operatörleri de özel ama önemli bazı operatörler dışında operandları arasına "bir ve yalnız bir tane"
 space karakteri olacak şekilde yazacağız.
 a = 2; gibi. bunu a=2; şeklinde yazmayız
 c = a * b + 2; şeklinde. c=a*b+2; değil..
 Eflatun
-------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a, b, c;
		
		a = 2;
		b = 3;
		
		c = a+++b; //c = a++ + b;
			
		System.out.printf("a = %d%n", a); //a = 3
		System.out.printf("b = %d%n", b); //b = 3
		System.out.printf("c = %d%n", c); //c = 5
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Java'da void bir metot çağrısı "void expression" olarak ele alınır. Yani void bir ifadenin değeri yoktur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
	
		Util.printSum(a, b);
	}
}

class Util {
	public static void printSum(int a, int b)
	{
		System.out.printf("%d + %d = %d%n", a, b, a + b);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Mantıksal Operatörler 3 tanedir: && (Logical AND), || (Logical OR), ! (Logical NOT)
	 && ve || operatörleri iki operandlı araek durumunda operatörlerdir. ! operatörü tek operandlı önek durumunda bir 
	 operatördür. Bu 3 operatörün de yan etkisi yoktur. Bu operatörlerin operandları boolean türden bir ifade olmalıdır. 
	 Bu operatörlerin ürettiği değer de boolean türdendir. Bu operatörler Matematik'teki mantıksal operatörlere karşılık
	 gelir 
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	 && ve || operatörlerinin doğruluk tablosu aşağıdaki gibidir:
	 
	 op1		op2			op1 && op2		op1 || op2
	 T			T				T				T
	 T			F				F				T
	 F			T				F				T
	 F			F				F				F
	 
	 Yukarıdaki tabloya göre veya && ve || işlemine göre şu cümleler yazılabilir:
	 "Mantıksal AND işlemi için, en az biri yanlışsa sonuç yanlıştır"
	 "Mantıksal OR işlemi için, en az biri doğruysa sonuç doğrudur"
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	 && ve || operatörlerine ilişkin aşağıdaki örneklerde yazılan metotlar tamamen durumu göstermek için yazılmıştır.
	 Yani metotların geri dönüş değerinin sabit olmasına değil operatörlerin davranışlarına odaklanınız
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	 && operatörü
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		boolean result;
		
		result = Sample.foo() && Sample.bar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
}

/*----------------------------------------------------------------------------------------------------------------------
	 || operatörü
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		boolean result;
		
		result = Sample.bar() || Sample.foo();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
}


/*----------------------------------------------------------------------------------------------------------------------
	 && operatörünün kısa devre davranışı (short circuit behavior). Kısa devre davranışı doğru sonuca en çabuk biçimde
	 ulaşacak şekilde çalışmaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		boolean result;
		
		result = Sample.bar() && Sample.foo();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 || operatörünün kısa devre davranışı (short circuit behavior). Kısa devre davranışı doğru sonuca en çabuk biçimde
	 ulaşacak şekilde çalışmaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		boolean result;
		
		result = Sample.foo() || Sample.bar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}	
}

/*----------------------------------------------------------------------------------------------------------------------
	 && ve || operatörlerinde doğru sonuca en kısa yoldan ulaşabilmek için ifadenin önce sol tarafı yapılır. Yani bu
	 operatörler işlem sırasında operatör önceliğine uymazlar. Ancak operatör önceliğine uyulursa, yani matematiksel
	 olarak ya da kabaca kağıt üzerinde elde edilen sonucu üretirler.  Yani derleyici bu operatörler için buna yönelik
	 kodlar üretir.
	 
	 Aşağıdaki örnekte && operatörü || operatöründen yüksek öncelikli olmasına rağman önce || işlemi yapılır. Ancak &&
	 operatörünün önceliğine göre işlem yapıldığında elde edilen sonucun aynısı elde edilir

     sadece foo ya bakar. foo true ise diğerlerine gerek kalmaz sonuc direkt true.
     Eflatun
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		boolean result;
		
		result = Sample.foo() || Sample.bar() && Sample.tar(); //T or F and F -> True.
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte işlem sırası ile operatörlerin öncelik sırası aynıdır. Yine en soldaki önce yapılır. Yani yine
	 Matematiksel olarak doğru sonuca en kısa yoldan ulaşılır

	 Aqua
	 burada da önce bar a bakar. ve operatörü var. bar'ın sonucu false tur. foo'ya bakmasına gerek yok. ama tar'a bakması gerekıyor.
	 Çünkü tar eğer true ise sonuc True çıkar. Değilse False sonucunu üretir....
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		boolean result;
		
		result = Sample.bar() && Sample.foo() || Sample.tar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	25.12.2022	
	Blue
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	 & ve | operatörleri tamsayılar ile kullanıldığında karşılıklı bit değerlerini işleme sokarlar. Aşağıdaki örnek
	 durumu anlatmak için yazılmıştır. Bitsel operatörlerin ayrıntıları burada ele alınmayacaktır.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		int a = 10; //00000000000000000000000000001010
		int b = 11; //00000000000000000000000000001011
		int c;
		
		c = a & b; //00000000000000000000000000001010
		
		System.out.printf("c = %d%n", c);
		
		c = a | b; //00000000000000000000000000001011
		
		System.out.printf("c = %d%n", c);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	 & ve | operatörleri boolean ifadeler ile kullanıldıklarında kısa devre davranışı olmayan AND ve OR operatörleri
	 olarak düşünülmelidir. Yine bu operatörler için de en soldaki ifade önce yapılır. 
	 
	 Aşağıdaki örnekte && ve || operatörleri kullanıldığında elde edilen sonucun  aynısı üretilir. Ancak tüm metotlar
	 çağrılır  
	 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		boolean result;
		
		result = Sample.foo() | Sample.bar() & Sample.tar();
		
		System.out.printf("result = %b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Logical NOT (!) operatörünün doğruluk tablosu:
	 
	 op			!op
	 T			F
	 F			T
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	 ! operatörü flag değişkenlerle aşağıdaki gibi kullanılabilir. Kod sadece durumu göstermek için yazılmıştır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		boolean flag = true;
		
		//...
		
		flag = !flag;
		
		System.out.printf("flag = %b%n", flag);
			
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Atama (=) operatörü iki operandlı araek durumunda bir operatördür. Bu operatörün birinci operandı değişken olmalıdır.
	 Operatörün şüphesiz yan etkisi vardır. Bu operatör sağdan sola öncelikli (right assocaitive) gruptadır. Bu 
	 operatörün ürettiği değer ikinci operandına ilişkin değer yani atanan değerdir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a, b, c;
		
		a = b = c = 10;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		System.out.printf("c = %d%n", c);		
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte atama operatörünün birinci operandının değişken olmamasından dolayı error oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a = 45, b = 20, c = 10;
		
		(a = b) = c = 10; //error: sol taraf değişken olmalı!!!
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		System.out.printf("c = %d%n", c);		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte atama operatörünün birinci operandının değişken olmamasından dolayı error oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a = 45, b = 20, c = 10;
		
		a = (b = c) = 10; //error: atamanın sol tarafı değişken olmalı!!!
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		System.out.printf("c = %d%n", c);		
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte parantezin konması ve konmaması aynı anlamdadır. Çünkü atama operatörü sağdan sola önceliklidir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a = 45, b = 20, c = 10;
		
		a = b = (c = 10);
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		System.out.printf("c = %d%n", c);		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 İşlemli atama operatörlerinin (compound assignment operator) genel biçimi:
	 	<ifade1> <op>= <ifade2>
	 	
	 	<ifade1> = <ifade1> <op> <ifade2>
	 	
	 	a += b; => a = a + b;
	 	a -= b; => a = a - b;
	 	a *= b; => a = a * b;
	 	a /= b; => a = a / b;
	 	a %= b; => a = a % b;
	 	
	 İşlemli atama operatörlerinin ürettiği değer yine birinci operandına atanan değerdir
	 
	 Anahtar Notlar: Aslında işlemli atama operatörlerinin genel biçimi tam olarak yukarıdaki gibi değildir. Bu konu ileride
	 ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a = 10, b = 20;
		
		a += b;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 İşlemli atama operatörleri bazı ifadeleri daha basit yazmak için tercih edilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a = 2, b = 3, c = 5;
		
		a *= b + c; //a = a * (b + c); // önce b + c yapılacak.sonra a ile çarpılıp a ya tekrar atanacak..
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		System.out.printf("c = %d%n", c);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte aynı seviye de olan *= ve += operatörleri "right associative" olduğundan işlem sağdan sola
	 yapılır

	 Eflatun
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a = 2, b = 3, c = 5;
		
		a *= b += c; // a = a * (b = b + c) // işlem sağdan sol doğru yapılıyor!!!!
		
		System.out.printf("a = %d%n", a); //16
		System.out.printf("b = %d%n", b); //8
		System.out.printf("c = %d%n", c); //5
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Java'da etkisiz ifadeler genel olarak error oluşturur..
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a = 10;
		
		a + 2; //error: code has no effect
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte error oluşmaz 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		Sample.foo();
	}
}

class Sample {
	public static void foo()
	{
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Noktalı virgül (;) sonlandırıcıdır (terminator). Genel olarak ifadeleri ayırmak için kullanılır.
	  Java'da noktalı virgülden başka sonlandırıcı karakter yoktur!!

	  Eflatun
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a = 10;
		
		++a;System.out.printf("a = %d%n", a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ++ operatörünün ürettiği değer artırılmamış değer olduğundan a sonuçta 10 olur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a = 10;
		
		a = a++;
		System.out.printf("a = %d%n", a);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ++ operatörünün ürettiği değer artırılmış değer olduğundan a sonuçta 11 olur. Doğrudan ++ uygulandığındaki
	durumla aynı sonuç elde edilir. Bu anlamda aşağıdaki atama işleminin etkisi yoktur..
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		int a = 10;
		
		a = ++a;
		System.out.printf("a = %d%n", a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Deyimler (statements):
	Bir programın çalıştırılan bir parçasına deyim denir. Bir program deyimlerin çalıştırılmasıyla çalışır. Java'da 
	deyimler 5 gruba ayrılır:
	
	1. Basit deyimler (simple statements): Bir ifadenin sonuna noktalı virgül konduğunda basit deyim olur. Basit deyim
	çalışırıldığında deyime ilişkin ifade hesaplanır
	
	2. Bileşik deyimler (compound statements): Bir bloğun tamamı bileşik deyimdir. Bileşik deyim çalıştırıldığında
	blok içerisinde deyimler sırasıyla çalıştırılır
	  
	3. Bildirim deyimleri (declaration statements): Bir değişkenin bildirildiği deyimlerdir. Bildirim deyimi çalıştırıldığında
	bellekte yer ayrılır
	
	4. Kontrol deyimleri (control statements): Akışa yön veren deyimlerdir. Her bir kontrol deyiminin kendine özgü çalışma
	biçimi vardır.
	
	5. Boş deyim (null/empty statement): Noktalı virgülün tek başına kullanımına denir. Boş deyim çalıştırıldığında hiç bir
	şey olmaz

	Violance (Deyimler -Statements)
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	if deyiminin genel biçimi:
	
	if (<boolean türden ifade>)
		<deyim> -> koşul doğru olduğunda çalıştırılır
	[
	else
		<deyim> -> koşul yanlış olduğunda varsa çalıştırılır
	]
	
	if deyimi, varsa else kısmı ile birlikte tek bir deyimdir

	Violance
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val % 2 == 0)
			System.out.println("Çift sayı girdiniz");
		else
			System.out.println("Tek sayı girdiniz");
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	if deyiminde bileşik deyim kullanımı
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val % 2 == 0) {
			System.out.println("Çift sayı girdiniz");
			val /= 2;
		}
		else {
			System.out.println("Tek sayı girdiniz");
			val *= 2;
		}	
		
		System.out.printf("val = %d%n", val);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	else kısmı olmayan if deyimi
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val % 2 == 0)
			val /= 2;
			
		System.out.printf("val = %d%n", val);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}



/*----------------------------------------------------------------------------------------------------------------------
	if deyiminin parantezinden sonra yanlışlıkla noktalı virgül konması durumu
	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val % 2 == 0);
			val /= 2;
			
		System.out.printf("val = %d%n", val);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte else bir if deyimine ait olmadığından error oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val % 2 == 0);
			val /= 2;
		else //error
			val *= 2;
			
		System.out.printf("val = %d%n", val);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte else kısmı içteki if'e ilişkindir (dangling else) 

	Aqua
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val > 0)
			if (val % 2 == 0)
				System.out.println("Pozitif ve çift sayı girdiniz");
		else
			System.out.println("Pozitif sayı girmelisiniz");
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki "dangling else" durumu bileşik deyim kullanılarak çözülebilir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val > 0) {
			if (val % 2 == 0)
				System.out.println("Pozitif ve çift sayı girdiniz");
		}
		else
			System.out.println("Pozitif sayı girmelisiniz");
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	if deyiminin koşul ifadesine ilişkin parantezde boolean türden ifadelerin değeri karşılaştırılıyorsa == veya != 
	operatörlerinin kullanılması iyi bir teknik değildir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		Util.printStatus(val % 2 == 0); // Argüman methodun parametresine gider...
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Util {
	public static void printStatus(boolean even)  // (int even) olmaz...
	{
		if (even) //if (even == true)
			System.out.println("Çift sayı");
		else
			System.out.println("Tek sayı");
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	if deyiminin koşul ifadesine ilişkin parantezde boolean türden ifadelerin değeri karşılaştırılıyorsa == veya != 
	operatörlerinin kullanılması iyi bir teknik değildir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		Util.printStatus(val % 2 == 0);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Util {
	public static void printStatus(boolean even)
	{
		if (!even) //if (even != true)
			System.out.println("Tek sayı");
		else
			System.out.println("Çift sayı");
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte isEven metodunda if deyiminin else kısmına gerek yoktur. Çünkü akış return deyimine geldiğinde
	metot sonlanır yani isEven içerisinde bir sonraki deyime geçmez. Bu durumda else yazılması gereksiz olduğundan 
	iyi bir teknik değildir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		Util.printStatus(NumberUtil.isEven(val)); // argüman (int a' ya gider.)
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Util {
	public static void printStatus(boolean even) //return değeri buranın argumanı
	{
		if (!even) //if (even != true)
			System.out.println("Tek sayı");
		else
			System.out.println("Çift sayı");
	}
}


class NumberUtil {
	public static boolean isEven(int a)  // parametre (val'i alır)
	{
		if (a % 2 == 0)
			return true;
		else
			return false;
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki isEven metodunun if deyimi ile aşağıdaki gibi yapılması yukarıdakine göre daha iyi bir tekniktir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		Util.printStatus(NumberUtil.isEven(val));
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Util {
	public static void printStatus(boolean even)
	{
		if (!even) //if (even != true)
			System.out.println("Tek sayı");
		else
			System.out.println("Çift sayı");
	}
}


class NumberUtil {
	public static boolean isEven(int a)
	{
		if (a % 2 == 0)
			return true;
		
		return false;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki isEven metodunun en iyi yazılışı aşağıdaki gibidir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		Util.printStatus(NumberUtil.isEven(val));
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Util {
	public static void printStatus(boolean even) // return değeri 0 ya da 1 gelir.
	{
		if (!even) //if (even != true)
			System.out.println("Tek sayı");
		else
			System.out.println("Çift sayı");
	}
}


class NumberUtil {
	public static boolean isEven(int a)
	{
		return a % 2 == 0; // çift ya da tek çıkar. parametre olarak boolean even' a gider.
	}
}

/*----------------------------------------------------------------------------------------------------------------------
  Aşağıdaki örneği inceleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (NumberUtil.isEven(val))
			System.out.println("Çift sayı");
		else
			System.out.println("Tek sayı");
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isEven(int a)
	{
		return a % 2 == 0;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (!NumberUtil.isEven(val))
			System.out.println("Tek sayı");
		else
			System.out.println("Çift sayı");
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isEven(int a)
	{
		return a % 2 == 0;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte isOdd metodu için kod tekrarı yapılmadığına yani işi yapan başka bir metodun çağrılarak işlemin
	yapıldığına dikkat ediniz. Yazılım geliştirmede "ZORUNLU OLMADIKÇA" kod tekrarı yapılmaması gerekir. Bu kavrama
	"DO NOT REPEAT YOURSELF (DRY)" de denir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (NumberUtil.isOdd(val))
			System.out.println("Tek sayı");
		else
			System.out.println("Çift sayı");
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isEven(int a)
	{
		return a % 2 == 0;
	}
	
	public static boolean isOdd(int a)
	{
		return !isEven(a);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki *** ile belirtilen if deyimi else kısmı ile birlikte tek bir deyimdir. Bu if deyiminin else kısmında 
	başka bir if deyimi vardır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val > 0) //***
			System.out.printf("%d sayısı pozitiftir%n", val);
		else 
			if (val == 0)
				System.out.println("Sıfır sayısını girdiniz");
			else 
				System.out.printf("%d sayısı negatiftir%n", val);
				
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}



/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki örnek daha okunabilir/algılanabilir olarak aşağıdaki gibi yazılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val > 0)
			System.out.printf("%d sayısı pozitiftir%n", val);
		else if (val == 0)
			System.out.println("Sıfır sayısını girdiniz");
		else 
			System.out.printf("%d sayısı negatiftir%n", val);
				
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki koşullar ayrık koşullardır. Yani biri sağlandığında diğerleri sağlanmaz. Bu durumda kod çalışsa bile
	aşağıdaki gibi yazılmamalıdır. else-if biçiminde yazılmaası (yukarıdaki gibi) hem okunabilir olur hem de gereksiz
	kontorllerin yapılması gibi duruma yol açmaz. Aşağıdaki örnek şüphesiz kolay anlaşılabilir bir örnektir. Ancak büyük
	projelerde koşulların ayrık olup olmaması kolay anlaşılamayabilir. Bu da geliştirme zamanının göreceleri etkileyebilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val > 0)
			System.out.printf("%d sayısı pozitiftir%n", val);
		if (val == 0)
			System.out.println("Sıfır sayısını girdiniz");
		if (val < 0) 
			System.out.printf("%d sayısı negatiftir%n", val);
					
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki koşullar ayrık olmadığından örnek özelinde else-if biçiminde yazılması yanlış olur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		if (val > 6)
			System.out.printf("%d > 6%n", val);
		if (val > 10)
			System.out.printf("%d > 10%n", val);
		if (val > 15) 
			System.out.printf("%d > 15%n", val);
					
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Katsayıları klavyeden alınan ikinci dereceden bir denklemin köklerini bulup ekrana yazdıran
	programı yazınz.
	Not: İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		QuadraticEquationSolverApp.run();
	}
}


class QuadraticEquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Katsayıları giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();

		QuadraticEquationSolver.printRoots(a, b, c);
	}
}

class QuadraticEquationSolver {
	public static void doWorkForDifferentRoots(double delta, double a, double b)
	{
		double x1, x2;
		double sqrtDelta;
		
		sqrtDelta = Math.sqrt(delta);
		x1 = (-b + sqrtDelta) / (2 * a);
		x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f, x2 = %f%n", x1, x2);
	}
	
	public static void doWorkForSameRoots(double a, double b)
	{
		double x;
		
		x = -b / (2 * a);
		
		System.out.printf("x1 = x2 = %f%n", x);
	}
	
	public static double getDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void printRoots(double a, double b, double c)
	{
		double delta = getDelta(a, b, c);
		
		if (delta > 0)
			doWorkForDifferentRoots(delta, a, b);
		else if (delta == 0)
			doWorkForSameRoots(a, b);
		else
			System.out.println("Gerçek kök yok");
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Katsayıları klavyeden alınan ikinci dereceden bir denklemin köklerini bulup ekrana yazdıran
	programı yazınz.
	Not: İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		QuadraticEquationSolverApp.run();
	}
}


class QuadraticEquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Katsayıları giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();

		QuadraticEquationSolver.printRoots(a, b, c);
	}
}

class QuadraticEquationSolver {
	public static void doWorkForRoots(double delta, double a, double b)
	{
		double x1, x2;
		double sqrtDelta;
		
		sqrtDelta = Math.sqrt(delta);
		x1 = (-b + sqrtDelta) / (2 * a);
		x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f, x2 = %f%n", x1, x2);
	}
	

	public static double getDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void printRoots(double a, double b, double c)
	{
		double delta = getDelta(a, b, c);
		
		if (delta >= 0)
			doWorkForRoots(delta, a, b);
		else
			System.out.println("Gerçek kök yok");
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	07.01.2023

	Blue
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Döngü Deyimleri (Loop Statements):
	Bir işin yinelemeli olarak yapılması için kullanılan kontrol deyimlerine denir. Java'da döngü deyimleri şunlardır:
	1. while döngü deyimleri
		- Kontrolün başta yapıldığı while döngü deyimi (while döngüsü)
		- Kontrolün sonda yapıldığı while döngü deyimi (do-while döngüsü)
	2. for deyimi
	3. for-each döngü deyimi (enhanced for loop, range based loop) 
	
	Anahtar Notlar: Bu aşamadan itibaren tüm konular içerisinde "while döngü deyimi" veya "while döngüsü" dendiğinde
	"kontrolün başta yapıldığı while döngü deyimi" anlaşılmalıdır. "Kontrolün sonda yapıldığı while döngü deyimi" için
	kısaca "do-while döngü deyimi" yada "do-while döngüsü" diyeceğiz.

	Violance
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Kontrolün başta yapıldığı while döngü deyiminin genel biçimi:
	
		while (<koşul ifadesi>)
		 	<deyim>
		 	
	Koşul ifadesi boolean türden olmalıdır. Bu döngü koşul ifadesi doğru olduğu sürece yinelenir. Yani döngü içerisindeki deyim
	çalıştırılır. Akış while döngü deyimine geldiğinde koşul kontrolü yapılır ve koşul gerçekleşmezse (yani true değeri 
	üretilmezse) döngüye girilmez
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i = 0;
		
		while (i < n) {
			System.out.printf("%d ", i);
			++i;
		}
		
		System.out.printf("%ni = %d%n", i);

	}
}
/*----------------------------------------------------------------------------------------------------------------------
	while döngü deyimi ile n-kez dönen döngü deyimi
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i = 0;
		
		while (i < n) {
			System.out.printf("%d ", i);
			++i;
		}
		
		System.out.printf("%ni = %d%n", i);

	}
}
/*----------------------------------------------------------------------------------------------------------------------
	while döngü deyimi ile n-kez dönen döngü deyimi
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i = n - 1;
		
		while (i >= 0) {
			System.out.printf("%d ", i);
			--i;
		}
		
		System.out.printf("%ni = %d%n", i);

	}
}


/*----------------------------------------------------------------------------------------------------------------------
	while döngü deyimi ile n-kez dönen döngü deyimi:
	n = 3 olsun
	Döngünün içerisindeyken her adımda basılan n değeri	: 2, 1, 0
	Sayaç												: 1 -> 2 -> 3
	Döngü sonrası n										: -1
	
	Bu kalıpta n-nin döngüden sonra değerinin değişmiş olduğuna ve dolayısıyla öncesindeki değeri kaybettiğimize dikkat 
	ediniz. Bu kalıp kullanılacaksa ve döngüden sonra n-nin eski değeri gerekirse döngü öncesinde n değeri saklanmalıdır.
	Bu kalıbın zorunlu olarak kullanıldığı bir durum yoktur. Ancak bazı programcılar bu kalıbı kullanabilirler. Böyle
	bir kodun anlaşılması açısından bu döngü kalıbı bilinmelidir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		while (n-- > 0)
			System.out.printf("n = %d%n", n);
		
		System.out.printf("Döngü sonrası n = %d%n", n);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	while döngü deyiminde yanlışlıkla noktalı virgül konması durumu
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i = 0;
		
		while (i < n); {
			System.out.printf("%d ", i);
			++i;
		}
		
		System.out.printf("%ni = %d%n", i);

	}
}
/*----------------------------------------------------------------------------------------------------------------------
	while döngüsünün parantezi içerisinde bir değişkene bir metodun geri dönüş değerinin atanıp atanan değerin kontrolüne
	ilişkin algoritmalar yazılabilmektedir. Okunabilirliği/algılanabilirliği etkilemediği sürece aşağıdaki gibi bir 
	kod yazılabilir.
	
	Örnekte klavyeden sıfır girilene kadar alınan sayıların toplamı bulunmuştur. while döngüsünün parantezi içerisindeki
	atama işleminin önceliklendirildiğine dikkat ediniz

	Eflatun
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Sayıları girmeye başlayınız:");
		
		int sum = 0;
		int val;
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0) // atama işlemi parantezler sayesinde önceliklendirilmiştir!!
			sum += val;
		
		System.out.printf("Toplam:%d%n", sum);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
Aşağıdaki örnekte klavyeden sıfır girilene kadar alınan sayıların toplamı bulunmuştur. while döngüsünün parantezi içerisindeki
atama işleminin önceliklendirildiğine dikkat ediniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
public static void main(String [] args)	
{	
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	System.out.println("Sayıları girmeye başlayınız:");
	
	int sum = 0;
	int val;
	
	while ((val = kb.nextInt()) != 0)
		sum += val;
	
	System.out.printf("Toplam:%d%n", sum);
}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte klavyeden sıfır girilene kadar veya tek sayı girilene kadar alınan sayların toplamı bulunmaktadır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Sayıları girmeye başlayınız:");
		
		int sum = 0;
		int val;
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0 && val % 2 == 0)
			sum += val;
		
		System.out.printf("Toplam:%d%n", sum);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayıların pozitif ve negatif olanlarının ayrı ayrı toplamlarını
	bulan proğremı yazınız. Programda hiç negatif veya pozitif sayı girilmemişse uygun mesajlar verilmelidir:
	"Hiç pozitif sayı girmediniz" veya "Hiç negatif sayı girmediniz"
-----------------------------------------------------------------------------------------------------------------------*/
package csd;
class App {
	public static void main(String [] args)	
	{	
		FindPosNegSumApp.run();
	}
}
class FindPosNegSumApp {
	public static void printPosResult(int posSum)
	{
		if (posSum != 0)
			System.out.printf("Pozitif Sayıların Toplamı: %d%n",  posSum);
		else
			System.out.println("Hiç Pozitif Sayı Girmediniz..");
	}
	public static void printNegResult(int negSum) 
	{
		if (negSum != 0)
			System.out.printf("Negatif Sayıların Toplamı: %d%n",  negSum);
		else
			System.out.printf("Hiç Negatif Sayı Girmediniz..");
	}
	public static void printResult (int posSum, int negSum)
	{
		printPosResult(posSum);
		printNegResult(negSum);
	}
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları Girmeye Başlayınız: ");
		int posSum = 0, negSum = 0;
		int val;
		
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0) 
			if (val > 0)
				posSum += val;
			else
				negSum += val;
		printResult(posSum, negSum);
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayıların pozitif ve negatif olanlarının ayrı ayrı toplamlarını
	bulan proğremı yazınız. Programda hiç negatif veya pozitif sayı girilmemişse uygun mesajlar verilmelidir:
	"Hiç pozitif sayı girmediniz" veya "Hiç negatif sayı girmediniz"

	(Benim Çözümüm)
-----------------------------------------------------------------------------------------------------------------------*/

package csd;
class App {
	public static void main(String [] args)	
	{	
		FindPosNegSumApp.run();
	}
}
class FindPosNegSumApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları Giriniz: ");
		int sumPos = 0, sumNeg = 0;
		int val;
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0)
			if (val < 0)
				sumNeg += val;
			else
				sumPos += val;
		
			printResult(sumPos, sumNeg); //  printResult'ı çağırır. Argümanları yollar..
	
	}
	public static void PrintSumPos(int sumPos) // 1 geldi..
	{
		if (sumPos != 0)
			System.out.printf("Pozitif Sayıların Toplamı: %d%n", sumPos); // 1 basar
		else
			System.out.printf("Pozitif Sayı Girmediniz..");	
	}
	public static void PrintSumNeg(int sumNeg)// 0 geldi..
	{
		if (sumNeg != 0)
			System.out.printf("Negatif Sayıların Toplamı: %d%n", sumNeg);
		else
			System.out.println("Negatif Sayı Girmediniz.."); // bu stırı basar..
	}
	public static void printResult (int sumPos, int sumNeg)
	{
		PrintSumPos(sumPos); //1 (PrintSumPos çağrıldı)
		PrintSumNeg(sumNeg); //0 (PrintSumNeg çağrıldı)
		
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren countDigits isimli metodu
	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz
	Not: İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		CountDigitsTest.run();
	}
}

class CountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int a;
		
		while ((a = Integer.parseInt(kb.nextLine())) != 0) {
			System.out.printf("%d sayısının basamak sayısı:%d%n", a, NumberUtil.countDigits(a));
			System.out.print("Bir sayı giriniz:");
		}
		
		System.out.printf("0 sayısının basamak sayısı:%d%n", NumberUtil.countDigits(0));
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int countDigits(int a)
	{
		if (a == 0)
			return 1;
		
		int count = 0;
		
		while (a != 0) {
			++count;
			a /= 10;
		}
		
		return count;
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamkaları toplamına geri dönen sumDigits isimli metodu
	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz. Metot negatif sayılar için basamakları 
	toplamını pozitif olarak döndürecektir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		SumDigitsTest.run();
	}
}

class SumDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int a;
		
		while ((a = Integer.parseInt(kb.nextLine())) != 0) {
			System.out.printf("%d sayısının basamakları toplamı:%d%n", a, NumberUtil.sumDigits(a));
			System.out.print("Bir sayı giriniz:");
		}
		
		System.out.printf("0 sayısının basamakları toplamı:%d%n", NumberUtil.sumDigits(0));
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int countDigits (int a) 
	{
		int sum = 0;
		while (a != 0) {   // (321 -> 32 --> 3)
		sum += a % 10;    //(321 % 10 = 1 kaldı, 32 % 10 = 2, 3 % 10 = 3)
		a /= 10;         // (321/10 =32, 32/ 10 = 3, 3/10 = 0)
		
		}
		
		return Math.abs(sum);

	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren reversed isimli metodu NumberUtil
	sınıfı içerisinde yazınız ve test ediniz
	
	123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
	-123 -> -3 -> 3 * 10 - 2 = -32 -> -32 * 10 - 1 = -321
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		ReversedTest.run();
	}
}

class ReversedTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int a;
		
		while ((a = Integer.parseInt(kb.nextLine())) != 0) {
			System.out.printf("%d sayısının tersi:%d%n", a, NumberUtil.reversed(a));
			System.out.print("Bir sayı giriniz:");
		}
	
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int reversed (int a)  // 123
	{
		int result = 0; // 3 --> 32 -->321
		
		while (a != 0) {
			 result = result * 10 + a % 10; // 0 + 3;  = 3 * 10 + 2; 32 * 10 + 1;
			 a /= 10; // a = 12; a = 1;
		}

		
		return result;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Kontrolün sonda yapıldığı while döngü deyiminin (do-while) genel biçimi:
		
		do
			<deyim>
		while (<koşul ifadesi>);
	
	Akış do-while döngü deyimine geldiğinde koşul kontrolü yapılmaz. İlk adım çalıştırıldıktan sonra kontrol yapılmaya 
	başlar. Yani döngü deyiminin en az bir kez çalıştırılacağı garanti altındadır. while döngü deyimi kadar sık kullanılmasa da 
	okunabilirliği/algılanabilirliği artırmak ve algoritmayı sadeleştirmek için tercih edilebilir. Ancak bu döngü deyimi
	gereksiz kullanıldığında okunabilirliği/algınabilirliği azaltır. Buna dikkat edilmelidir.

	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		int i = 0;
		
		do  {
			System.out.printf("%d ", i);
			++i;
		} while (i < n);
		
		System.out.printf("Döngü sonrası i = %d%n", i);
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren countDigits isimli metodu
	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz
	Not: İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		CountDigitsTest.run();
	}
}

class CountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int a;
		
		while ((a = Integer.parseInt(kb.nextLine())) != 0) {
			System.out.printf("%d sayısının basamak sayısı:%d%n", a, NumberUtil.countDigits(a));
			System.out.print("Bir sayı giriniz:");
		}
		
		System.out.printf("0 sayısının basamak sayısı:%d%n", NumberUtil.countDigits(0));
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int countDigits(int a)
	{
		int count = 0;
		
		do {
			++count;
			a /= 10;
		} while (a != 0); 
		
		return count;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	do-while döngü deyimi içerisinde bildirilen bir değişken faaliyet alanı (scope) kuralları gereği koşul ifadesi
	içerisinde kullanılamaz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		do  {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d * %d = %d%n", a, a, a * a);
		} while (a != 0); //error
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problem aşağıdaki gibi çözülebilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int a;
		
		do  {
			System.out.print("Bir sayı giriniz:");
			a = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d * %d = %d%n", a, a, a * a);
		} while (a != 0);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sonsuz Döngü (inifinite loop): Koşul ifadesinden dolayı sonlanmayan döngülere denir. Bu durumda hiç sonlanmayan bir 
	döngü de sonsuz döngüdür. Tersine sonsuz döngü olarak tasarlanmış bir döngü sonlanabilecek şekilde yazılabilir
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	while döngüsü ile sonsuz döngü aşağıdaki gibi oluşturulabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		while (true) { // Sonsuz Döngü..
			//...
		}
	}
}

package csd;

class App {
	public static void main(String [] args)	
	{	
		CountDigitsTest.run();
	}
}

class CountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			System.out.printf("%d sayısının basamak sayısı:%d%n", a, NumberUtil.countDigits(a));
			
			if (a == 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return; // metodu sonlandırıyor...Döngüde sonlanır.
			}		
		}
	}
}

class NumberUtil {
	public static int countDigits(int a)
	{
		int count = 0;
		
		do {
			++count;
			a /= 10;
		} while (a != 0); 
		
		return count;
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyiminin deyiminin genel biçimi:
	
	for ([1. kısım]; [2.kısım]; [3.kısım])
		<deyim>
		
	1.kısım: Akış for döngü deyimine geldiğinde yalnızca bir kez yapılacak kısımdır.
	
	2.kısım: Koşul ifadesine ilişkin kısımdır. Burada yazılacak ifasdenin boolean türden olması gerekir. Akış for döngü
	deyimine geldiğinde 1.kısım yapıldıktan sonra kontrol yapılır
	
	3.kısım: Döngünün bir adımı tamamlandığında bir sonraki adıma geçmek için yapılacak kontrolden hemen önce yapılır.

	Violance
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		int i;
		
		for (i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.printf("%ni = %d%n", i);
		
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki döngüde ++ kullanımının prefix ve postfix olmasının bir farkı yoktur. Çünkü ++ operatörü her iki kullanımda da
	operandının değerini değiştirir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		int i;
		
		for (i = 0; i < n; i++)
			System.out.printf("%d ", i);
		
		System.out.printf("%ni = %d%n", i);
		
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyimi
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		int i;
		
		for (i = 0; i < n; i += 2)
			System.out.printf("%d ", i);
		
		System.out.printf("%ni = %d%n", i);
		
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyimi
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		int i;
		
		for (i = n - 1; i >= 0; --i)
			System.out.printf("%d ", i);
		
		System.out.printf("%ni = %d%n", i);
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyiminin birinci kısmında değişken bildirimi yapılabilir. Buna genel olarak döngü değişkeni de denir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		
		for (int i = 0; i < n; ++i)
			System.out.printf("%d ", i);
	
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyiminin birinci kısmında bildirilen değişken for döngü deyimi boyunca görülebilirdir (scope)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		
		for (int i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		
		System.out.printf("%ni = %d%n", i); //error
	
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki for döngüsünde "aynı faaliyet alanı içerisinde aynı isimde yerel değişken bildirimi geçersizdir" kuralı
	dolayısıyla error oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		int i; //ERROR
		
		for (int i = 0; i < n; ++i) //ERROR
			System.out.printf("%d ", i);
	
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki for döngüsü "farklı faaliyet alanları içerisinde aynı isimde yerel değişken bildirimi geçerlidir" kuralı
	dolayısıyla geçerlidir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		
		
		for (int i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.println();
		
		for (int i = 0; i < n; ++i)
			System.out.printf("%d ", i);
	
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Döngü değişkeninin döngüden çıktıktan sonraki değeri kullanılmayacaksa değişken bildiriminin döngü içerisinde (yani 1.kısımda)
	yapılması daha iyi bir tekniktir. Bu durumda döngü değişkeninin döngüden önce bildirilmesi döngüden sonra değişkenin 
	değerinin kullanıldığı algısını yaratır. Yani okunabilirlik/algınabilirlik artırılmış olur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		int i;
		
		for (i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.printf("%ni = %d%n", i);
		
		for (i = n - 1; i >= 0; --i)
			System.out.printf("%d ", i);
	
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyiminde yanlışlıkla noktalı virgülün konması durumu. Aşağıdaki örnekte error oluşmaz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		int i;
		
		for (i = 0; i < n; ++i);
			System.out.printf("%d ", i);
	
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyiminde yanlışlıkla noktalı virgülün konması durumu. Aşağıdaki örnekte neden error oluşur?
	for boyunca geçerli olan isi for dışında kullanılmış olundu. Boş deyimle birlikte i nin ismi artık görülemez durumu gelmiştir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		
		for (int i = 0; i < n; ++i);
			System.out.printf("%d ", i); //error
	
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyimi ile n-kez dönen döngü 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		
		for (int i = 0; i < n; ++i)
			System.out.printf("%d ", i);
	
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	for döngü deyimi ile n-kez dönen döngü 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		
		int n = kb.nextInt();
		
		for (int i = n - 1; i >= 0; --i)
			System.out.printf("%d ", i);
	
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	08.01.2023
	Blue
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	for döngüsünün birinci ve üçüncü kısmında virgül ayracı ile birden fazla ifade yazılabilir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		for (int i = 0, k = 10; i <= 5 && k >= 2; ++i, --k)
			System.out.printf("(%02d, %02d)%n", i, k);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	for döngüsünün birinci kısmında değişken bildirimi yapılmışsa başka bir ifade yazılamaz  
	 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		for (System.out.println("Birinci kısım"), int i = 0, k = 10; i <= 5 && k >= 2; ++i, --k) //error
			System.out.printf("(%02d, %02d)%n", i, k);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz

	for içerisinde değişken bildirildiğinde birden fazla değişken olacaksa bunların türleri aynı olmak zorunda. Eğer farklı 
	olacaksa for dışında aşağıdaki gibi tanımlanmalıdır..
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		int i;
		double k;
		
		
		for (i = 0, k = 3.456; i <= 5 && k >= 2; ++i, --k) // i ve k sınırlarına dikkat. ve arada && operatörü vardır.

			System.out.printf("(%02d, %f)%n", i, k);
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte klavyeden sıfır girilene kadar alınan sayıların toplamı bulunmuştur. Aslında for döngü deyimi
	güçlü bir deyimdir

	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int sum = 0;
		int a;
		
		for (System.out.println("Sayıları girmeye başlayınız:"), System.out.print("Bir sayı giriniz:"); 
				(a = Integer.parseInt(kb.nextLine())) != 0; sum += a, System.out.print("Bir sayı giriniz:"))
			;
			
		System.out.printf("Toplam:%d%n", sum);
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Hiç sonlanmayacak sanılan ancak öyle olmayan bir döngü örneği. Örnekte i değeri azalarak -2147483648 değerine
	yani int türünün en küçük değerine geldiğinde artık bir azaltıldığında 2147483647 değeri yani int türünün en büyük
	değeri elde edilir ve döngüden çıkılmış olur

	int in en küçük sınırına geldiğinde bunu 1 azaltırsa int in en büyük sınırına gelir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		int i;
		
		for (i = 0; i < 10; --i)
			; //System.out.println(i);
		
		System.out.printf("i = %d%n", i);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte i değeri döngü dışında kaç olur?

 int in en küçük sınırı görülür.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		int i;
		
		for (i = 10; i >= 0; ++i)
			; //System.out.println(i);
		
		System.out.printf("i = %d%n", i);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	for döngüsünde birinci kısmın boş bırakılması durumu
	
	Akış for deyimine geldiğinde 1. kısımda hiçbir şey yapmamış olur. n-kez döner..
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
		
		int i = 0;
		
		
		for (; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.println();
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	for döngüsünde üçüncü kısmın boş bırakılması durumu

-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
				
		
		for (int i = 0; i < n;) {
			System.out.printf("%d ", i);
			++i;
		}
		
		System.out.println();
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	for döngüsünde birinci ve üçüncü kısmın boş bırakılması durumu while döngüsüne benzetilebilir

	kontrolün başta yapıldığı while döngüsü anlaşılır...
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
			
		int i = 0;
		
		for (; i < n;) {
			System.out.printf("%d ", i);
			++i;
		}
		
		System.out.println();
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	for döngüsünde ikinci kısmın boş bırakılması durumunda sonsuz döngü oluşur. Yani koşul her zaman geçerli olur
	Sonsuz döngünün hiç sonlanmayanı..return deyimiyle sonlandırılabılir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		for (int i = 0; ; ++i)
			System.out.printf("%d%n", i);		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	for döngüsü ile sonsuz döngü oluşturmak için genelde programcılar 3 kısmı da boş bırakmayı tercih ederler. Bu aslında 
	iyi bir tekniktir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		for (;;) {    //While(true)' dan hiç farkı yoktur. ikisinden birisi kullanılabilir.
			//...
		}		
	}
}

package csd;

class App {
	public static void main(String [] args)	
	{	
		CountDigitsTest.run();
	}
}

class CountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			System.out.printf("%d sayısının basamak sayısı:%d%n", a, NumberUtil.countDigits(a));
			
			if (a == 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}		
		}
	}
}

class NumberUtil {
	public static int countDigits(int a)
	{
		int count = 0;
		
		do {
			++count;
			a /= 10;
		} while (a != 0); 
		
		return count;
	}
}
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden a ve b değerleri için a'nın b-inci kuvvetini döndüren pow isimli
	metodu NumberUtil sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz:
	
	Açıklamalar:
	- Math sınıfının pow metodu kullanılmayacaktır
	- Metot negatif b değerleri için 1 değerine dönecektir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		PowTest.run();
	}
}

class PowTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		for (;;) {
			System.out.print("Tabanı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("Üssü giriniz:");
			int b = Integer.parseInt(kb.nextLine());
			System.out.printf("pow(%d, %d) = %d%n", a, b, NumberUtil.pow(a, b));
			
			if (a == 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}		
		}
	}
}

class NumberUtil {
	public static int pow(int a, int b)
	{
		int result = 1;
		
		for (int i = 0; i < b; ++i) //i yi tekrar kullanmayacağız. o yüzden for içinde bildirdik.
			result *= a; // a'yı b kez çarpıcaz.
		
		return result;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden a ve b değerleri için a'nın b-inci kuvvetini döndüren pow isimli
	metodu NumberUtil sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz:
	
	Açıklamalar:
	- Math sınıfının pow metodu kullanılmayacaktır
	- Metot negatif b değerleri için 1 değerine dönecektir
-----------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {
	public static void main(String [] args)	
	{	
		PowTest.run();
	}
}

class PowTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		for (;;) {
			System.out.print("Tabanı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("Üssü giriniz:");
			int b = Integer.parseInt(kb.nextLine());
			System.out.printf("pow(%d, %d) = %d%n", a, b, NumberUtil.pow(a, b));
			
			if (a == 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}		
		}
	}
}

class NumberUtil {
	public static int pow(int a, int b)
	{
		int result = 1;
		
		while (b-- > 0) // Özel Kalıptır. b-- : azaltılmamış değerdir.
			result *= a;
		
		return result;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının Armstrong sayısı olup olmadığını test eden isArmstrong
	isimli metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	
	Bu tarz metodlar boolean a geri döner. predicket metodlarda denir..

	Açıklamalar:
		- Bir sayının her basamağının basamak sayıncı kuvvetleri toplandığında sayının kendisine eşitse bu sayıya 
		Armstrong sayısı denir. Örneğin:
			153 -> 1  * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153
			
		- Kuvvet alma işlemi için yazılmış pow metodunu kullanınız
		
		- Sayı negatif ise Armstrong sayıaı kabul etmeyiniz

		Eflatun
-----------------------------------------------------------------------------------------------------------------------*/


package csd;

class App {
	public static void main(String [] args)	
	{	
		IsArmstrongTest.run();
	}
}

class IsArmstrongTest {
	public static void run()
	{
		for (int a = -10; a <= 99999; ++a) // -10 dan 6 basamağa kadar ilerliyoruz.
			if (NumberUtil.isArmstrong(a))
				System.out.println(a);
	}
}

class NumberUtil {
	public static boolean isArmstrong(int a) // sadece bu kısmı yazdık...
	{
		return a >= 0 && calculateDigitsPowSum(a) == a; // a sıfırdan büyük ya da eşit ve basamak toplamı a ya eşitse return yap.
	}
	
	public static int calculateDigitsPowSum(int a)
	{
		int n = countDigits(a);
		int total = 0;
		
		while (a != 0) {
			total += pow(a % 10, n);
			a /= 10;
		}
		
		return total;
	}
	
	public static int countDigits(int a) //burayı önceden yazıp test ettik o yüzden burayı tekrar yazmadık.
	{
		int count = 0;
		
		do {
			++count;
			a /= 10;
		} while (a != 0); 
		
		return count;
	}
	public static int pow(int a, int b)
	{
		int result = 1;
		
		while (b-- > 0)
			result *= a;
		
		return result;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının asal olup olmadığını test eden isPrime isimli metodu
	NumberUtil sınıfı içerisinde yazınız ve aşağıdakş kod ile test ediniz
	(Yavaş versiyon)
-----------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {
	public static void main(String [] args)	
	{	
		IsPrimeTest.run();
	}
}

class IsPrimeTest {
	public static void run()
	{
		for (int i = 0; i <= 100; ++i)
			if (NumberUtil.isPrime(i))
				System.out.printf("%d ", i);
		
		System.out.println();
		
		System.out.println( NumberUtil.isPrime(1_000_003)); // bu sayının asal olup olmadığı test edilsin..
	}
}

class NumberUtil {
	public static boolean isPrime(long a)
	{
		if (a <= 1) // asal olmayan kısım
			return false;
		
		for (long i = 2; i <= a / 2; ++i) // girilen sayının yarısına gidiyoruz ve en az bir tane bile bölen varsa asaldır.
			if (a % i == 0) // asal değil
				return false;
		
		return true; // 1_000_003 sayısı için true döner..
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının asal olup olmadığını test eden isPrime isimli metodu
	NumberUtil sınıfı içerisinde yazınız ve aşağıdakş kod ile test ediniz
	
	Kural: Bir sayı karekökünden daha küçük olan asal sayıların hiç bir tanesine bölünmüyorsa asaldır
	(Hızlı versiyon)

	9 Sayısının karekörü = 3 tür. kök 9 = 3 veya 3 * 3 = 9.
	1000003 sayısı için karekökünden (karekökü yaklaşık 1000 dir.) daha küçük olan asallarda en fazla 500 tanedir.

	Eratosthenes Algoritması

	Eflatun
-----------------------------------------------------------------------------------------------------------------------*/


package csd;

class App {
	public static void main(String [] args)	
	{	
		IsPrimeTest.run();
	}
}

class IsPrimeTest {
	public static void run()
	{
		for (int i = 0; i <= 100; ++i)
			if (NumberUtil.isPrime(i))
				System.out.printf("%d ", i);
		
		System.out.println();
		
		System.out.println( NumberUtil.isPrime(1_000_003));
	}
}

class NumberUtil {
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2; // 2 ise true. 2 dışındaki çift sayılardurumundada false
		
		if (a % 3 == 0)
			return a == 3; // 3 e bölünenleri de attık
		
		if (a % 5 == 0)
			return a == 5; // 5 e bölünenleri de attık
		
		if (a % 7 == 0)
			return a == 7; // 7 ye bölünenleri de attık. Sonra ara açılıyor. 11, 19, 23....
		
		for (long i = 11; i * i <= a; i += 2) // 7 den sonraki ilk asal sayı 11 dir.
												// karekökünden daha küçüklere bakıyoruz..
			if (a % i == 0) // tekleri alıyoruz. 
				return false; // asal değildir
		
		return true; // asal
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Yukarıda yazılan isPrime metotlarının basit bir karşılaştırması. isPrime metotlarına sayaçlar durumu göstermek için
	eklenmiştir. iki kod karşılaştırılmıştır. isprime ime isprimeslow
	aşağıdaki kod tamemen görmek için yazılmıştır.(Count kısmı)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		IsPrimeTest.run();
	}
}

class IsPrimeTest {
	public static void run()
	{	
		System.out.println( NumberUtil.isPrime(1_000_003));
		System.out.println( NumberUtil.isPrimeSlow(1_000_003));
	}
}

class NumberUtil {
	public static boolean isPrimeSlow(long a)
	{
		if (a <= 1)
			return false;
		
		int count = 0;
		
		for (long i = 2; i <= a / 2; ++i) {
			++count;
			if (a % i == 0)
				return false;
		}
		
		
		System.out.printf("isPrimeSlow count:%d%n", count);
		
		return true;
	}
	
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;
		
		int count = 0;
		
		for (long i = 11; i * i <= a; i += 2) {
			++count;
			if (a % i == 0)
				return false;
		}
		
		System.out.printf("isPrime count:%d%n", count);
		
		return true;
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Test için kullanabileceğiniz çeşitli yeterince büyük asal sayılar:
	6750161072220585911
	1603318868174368979
	6584583408148485263
	6245098347044246839
	6285871677077738093
	5697859706174583067
	710584055392819667
	4935060337471977161
	3728803592870153407
	4331452335614730577
	1386437196678024971
	1677990107453991593
	4765603950744460867
	4498306523077899307
	4434895834573449257
	Kullanırken sayıların sonuna L koymayı unutma...
-----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyel değerine geri dönen factorial isimli metodu
	yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:
	 0! = 1 ve 1! = 1 olmak üzere
	 n! = 1 * 2 * ... * n - 1 * n
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		IsPrimeTest.run();
	}
}

class IsPrimeTest {
	public static void run()
	{	
		for (int n = 0; n < 13; ++n)
			System.out.printf("%d! = %d%n", n, NumberUtil.factorial(n));
	}
}

class NumberUtil {
	public static int factorial(int n)
	{
		int result = 1;
		
		for (int i = 2; i <= n; ++i)
			result *= i;
		
		return result;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	14.01.2023	
	Blue
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir n değeri için n-inci asal sayıyı döndüren getPrime isimli
	metodu NumberUtil sınıfı içerisinde yazınız ve test ediniz
	
	Açıklamalar:
	- iPrime metodunun hızlı versiyonunu kullanınız
	- n değerinin poziitf olmaması durumu metot içerisinde kontrol edilmeyecektir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	 
		GetPrimeTest.run();
	}
}

class GetPrimeTest {
	public static void run()
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}
			
			System.out.printf("%d.asal sayı:%d%n", n, NumberUtil.getPrime(n));
		}
				
	}
}


class NumberUtil {
	public static int getPrime(int n)
	{
		int val = 2;
		
		for (int i = 0, count = 0; count < n; ++i)
			if (isPrime(i)) {
				++count;
				val = i;
			}
		
		return val;
	}
	
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;
		
		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		return true;
		
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir n değeri için n-inci asal sayıyı döndüren getPrime isimli
	metodu NumberUtil sınıfı içerisinde yazınız ve test ediniz
	
	Açıklamalar:
	- iPrime metodunun hızlı versiyonunu kullanınız
	- n değerinin poziitf olmaması durumu metot içerisinde kontrol edilmeyecektir

	onur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		GetPrimeTest.run();
	}
}

class GetPrimeTest {
	public static void run()
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}
			
			System.out.printf("%d.asal sayı:%d%n", n, NumberUtil.getPrime(n));
		}				
	}
}


class NumberUtil {
	public static int getPrime(int n) //1. asal sayıyı istediğimizde n = 1
	{
		int val = 2;
		int count = 0;
		
		for (;;) {
			if (isPrime(val)) //val = 2
				++count; // 1 arttı
			
			if (count == n) // count: 1 ==  n: 1 oldu
				return val; // return val; den 2 geri döndü
			
			++val; //burada val 3 mü oldu?
		}
	}
	
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;
		
		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		return true;
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	İçiçe döngüler (nested loops)
	Bir döngü deyimi içerisinde başka bir döngü deyiminin bulunması durumudur. Bu durumda dıştaki döngünün her bir adımı
	için içteki döngünün her adımı tamamlanır.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		for (int i = 0; i < 5; ++i)
			for (int k = 7; k >= 0; --k)
				System.out.printf("(%d, %d)%n", i, k);
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Programcılar bazen tek bir döngü yazsalar da o döngü içerisinde çağrılan bir metot veye metotlar da döngüye girebilirler.
	Bu durumda yine içiçe döngü oluşur.
/*----------------------------------------------------------------------------------------------------------------------
	break deyimi döngüyü, döngünün koşul ifadesinden bağımsız olarak sonlandırmak (kırmak) için kullanılır. break deyimi
	döngü deyimlerinin dışında ileride göreceğimiz "switch" deyiminde de kullanılabilir. Bunlar dışında kullanımı error
	oluşturur. 
	break deyiminin genel biçimi:
		break [etiket ismi];

		Violance
-----------------------------------------------------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		for (int i = 0; i < 5; ++i)
			Util.print(i);
	}
}


class Util {
	public static void print(int i)
	{
		for (int k = 7; k >= 0; --k)
			System.out.printf("(%d, %d)%n", i, k);
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	3 basamaklı Armstrong sayılarının iç içe döngü ile bulunması
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		for (int a = 1; a <= 9; ++a)
			for (int b = 0; b <= 9; ++b)
				for (int c = 0; c <= 9; ++c)
					if (a * a * a + b * b * b + c * c * c == 100 * a + 10 * b + c)
						System.out.printf("%d%d%d%n", a, b, c);
	}
}



/*----------------------------------------------------------------------------------------------------------------------
	break deyimi break deyiminin etiketsiz kullanımında akış break deyimine geldiğinde döngü sonlandırılır. Döngüden sonraki
	koddan devam edilir. break hangi döngü içerisinde etiketsiz kullanılmışsa o döngü sonlandırılır.  
	
	Aşağdaki örnekte klavyeden sıfır girilene kadar alınan sayıların toplamı bulunmuştur. Sıfır girildiğinde break deyimi
	döngü sonlandırılmıştır.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Sayıları girmeye başlayınız:");
		
		int sum = 0;
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			if (val == 0)
				break;
			
			sum += val;
		}
		
		System.out.printf("Toplam:%d%n", sum);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir n değeri için n-inci asal sayıyı döndüren getPrime isimli
	metodu NumberUtil sınıfı içerisinde yazınız ve test ediniz.
	
	Açıklamalar:
	- iPrime metodunun hızlı versiyonunu kullanınız.
	- n değerinin poziitf olmaması durumu metot içerisinde kontrol edilmeyecektir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		GetPrimeTest.run();
	}
}

class GetPrimeTest {
	public static void run()
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0) 
				break;
			
			System.out.printf("%d.asal sayı:%d%n", n, NumberUtil.getPrime(n));
		}		
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class NumberUtil {
	public static int getPrime(int n)
	{
		int val = 2;
		int count = 0;
		
		for (;;) {
			if (isPrime(val))
				++count;
			
			if (count == n)
				return val;
			
			++val;
		}
	}
	
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;
		
		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		return true;
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	break deyiminin etiketsiz kullanımı yalnızca kullanıldığı döngüyü sonlandırır. Aşağıdaki örnekte içteki döngüde bir 
	koşul gerçekleştiğinde dıştaki döngünün de sonlandırılması flag değişken kullanılarak yapılmıştır. Ancak dikkat edilirse
	kodun karmaşıklığı artmıştır. Örnek durumu göstermek için yazılmıştır.

-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{
		boolean exitFlag = false;
		
		for (int i = 0; i < 10; ++i) {
			for (int k = 15; k >= 0; --k) {
				System.out.printf("(%d, %d)%n", i, k);
				
				if ((i + k) % 6 == 0) {
					exitFlag = true;
					break;
				}
			}
			
			if (exitFlag)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Etiketli break (labeled break) deyiminde gerektiğinde sonlandırılacak döngü deyiminin başında bir etiket bildirimi 
	yapılır. Etiket bildiriminin genel biçimi şu şekildedir:
		<etiket ismi>:
	Etiket ismi değişken isimlendirme kurallarına uygun herhangi bir isim olabilir. Genellikle programcılar etiket isminin
	tamamını büyük harfle, birden fazla kelimeden oluşuyorsa da araya alttire karakterini koyarak isimlendirirler. Yukarıdaki
	program aşağıdaki gibi yazılabilir.

	Violance

	onur


 Aqua
 -> Etiket bildirildiği döngüyü sonlandırır.Bu örnekte dıştaki döngünün etiketi vardır. Dolayısıyla o döngü sonlanır..
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		EXIT_LOOP:
		for (int i = 0; i < 10; ++i) 
			for (int k = 15; k >= 0; --k) {
				System.out.printf("(%d, %d)%n", i, k);
				
				if ((i + k) % 6 == 0) 
					break EXIT_LOOP;
			}
		
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Etiketli break deyiminin bir kullanımı. Örnek durumu göstermek için yazılmıştır.

	Aqua
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		EXIT_LOOP: // Dıştaki for' un etiketi..
		for (int i = 0; i < 10; ++i)
			EXIT_INNER_LOOP: // İçteki for'un etiketi..
			for (int j = 0; j < 10; ++j)
				for (int k = 15; k >= 0; --k) {
					System.out.printf("(%d, %d)%n", i, k);
					
					if ((i + j + k) % 10 == 0) 
						break EXIT_LOOP;
					
					if ((i + j + k) % 6 == 0) 
						break EXIT_INNER_LOOP;
					
					if ((i + j + k) % 11 == 0)
						break; // En içteki for için etiket gerekmez. Çünkü onun için break kullanımı tek başına yeterlidir..
				}
		
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	continue deyimi döngüyü değil, döngünün o anki adımını sonlandırmak için kullanılır. continue deyiminin de etiketli
	biçimi vardır. Ancak yapısal programlama ve nesne yönelimli porogramlama tekniği açısından kullanımı tavsiye edilmez.
	continue deyiminin etiketsiz biçimi break deyimi kadar sık kullanılmaz. Ancak bazı durumlarda okunabilirliği artırabilir.
	continue deyimi yalnızca döngü içerisinde kullanılabilir. 

	Violance
	
	Aşağıdaki örnekte 1 ile klavyeden girilen sayı arasındaki çift sayılar ekrana bastırılmıştır. Şüphesiz daha kolay
	yazılabilir. Sadece continue deyiminin çalışma prensibinin anlaşılması için bu şekilde yazılmıştır.

	onur -> continue olmasaydı 2 ye bölünmeyen sayıları da basar mıydı?
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		for (int i = 1; i <= n; ++i) {
			if (i % 2 != 0)
				continue;
			
			System.out.printf("%d ", i);
		}
		
		System.out.println("\nTekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Demo menü uygulaması
	(İleride daha iyisi yazılacaktır) 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		MenuApp.run();
	}
}


class MenuApp {
	public static void run()
	{
		Menu.run();
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Menu {
	public static void printMenu()
	{
		System.out.println("1.Ekle");
		System.out.println("2.Sil");
		System.out.println("3.Güncelle");
		System.out.println("4.Listele");
		System.out.println("5.Çıkış");
		System.out.print("Seçenek:");
	}
	
	public static void doInsert()
	{
		System.out.println("---------------------------------");
		System.out.println("Ekle seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doDelete()
	{
		System.out.println("---------------------------------");
		System.out.println("Sil seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doUpdate()
	{
		System.out.println("---------------------------------");
		System.out.println("Güncelle seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doList()
	{
		System.out.println("---------------------------------");
		System.out.println("Listele seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doOption(int option)
	{
		if (option == 1)
			doInsert();
		else if (option == 2)
			doDelete();
		else if (option == 3)
			doUpdate();
		else
			doList();
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			printMenu();
			int option = Integer.parseInt(kb.nextLine());
			
			if (option < 1 || option > 5) {
				System.out.println("Geçersiz Seçenek!...");
				continue;
			}
			
			if (option == 5)
				break;
			
			doOption(option);
		
		}
		
		System.out.println("Teşekkürler");
		System.out.println("C ve Sistem Programcıları Derneği");	
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Demo menü uygulaması
	(İleride daha iyisi yazılacaktır) 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		MenuApp.run();
	}
}


class MenuApp {
	public static void run()
	{
		Menu.run();
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Menu {
	public static void printMenu()
	{
		System.out.println("1.Ekle");
		System.out.println("2.Sil");
		System.out.println("3.Güncelle");
		System.out.println("4.Listele");
		System.out.println("5.Çıkış");
		System.out.print("Seçenek:");
	}
	
	public static void doInsert()
	{
		System.out.println("---------------------------------");
		System.out.println("Ekle seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doDelete()
	{
		System.out.println("---------------------------------");
		System.out.println("Sil seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doUpdate()
	{
		System.out.println("---------------------------------");
		System.out.println("Güncelle seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doList()
	{
		System.out.println("---------------------------------");
		System.out.println("Listele seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doOption(int option)
	{
		if (option == 1)
			doInsert();
		else if (option == 2)
			doDelete();
		else if (option == 3)
			doUpdate();
		else
			doList();
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			printMenu();
			int option = Integer.parseInt(kb.nextLine());
			
			if (1 <= option && option <= 5) {
				if (option == 5)
					break;
				
				doOption(option);
			}
			else
				System.out.println("Geçersiz Seçenek!...");
		}
		
		System.out.println("Teşekkürler");
		System.out.println("C ve Sistem Programcıları Derneği");	
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı n sayısı için n-inci Fibonacci sayısını döndüren fibonacciNumber isimli
	metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Açıklama:
		- Fibonacci serisi
			0 1 1 2 3 5 8 13 ...
		- Metot pozitif olmayan değerler için kontrol yapmayacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		FibaonnaciNumberTest.run();
	}
}


class FibaonnaciNumberTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n < 1)
				break;
			System.out.printf("%d.Fibonacci sayısı:%d%n", n, NumberUtil.fibonacciNumber(n));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int fibonacciNumber(int n)
	{
		if (n <= 2)
			return n - 1;
		
		int prev1 = 1, prev2 = 0, val = 0;
		
		for (int i = 2; i < n; ++i) {
			val = prev1 + prev2;
			prev2 = prev1;
			prev1 = val;
		}
		
		return val;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayıdan büyük ilk Fibonacci sayısını döndüren nextFibonacciNumber
	metodunu NumberUtil sınıfı içerisinde yazınız ve test ediniz.
	
	Dikkat: Kodda, bir önceki örnekte yazdığımız fibonacciNumber metodunu çağırsaydık içiçe döngü oluşurdu. Bu da göreceli
	yavaş olurdu.
	onur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		NextFibaonnaciNumberTest.run();
	}
}


class NextFibaonnaciNumberTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d sayısından büyük ilk Fibonacci sayısı:%d%n", val, NumberUtil.nextFibonacciNumber(val));
			
			if (val == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int nextFibonacciNumber(int val) // buradan 1 gelmiş olsaydı
	{
		if (val < 0)
			return 0;
		
		int prev1 = 1, prev2 = 0, next;
		
		for (;;) {
			next = prev1 + prev2; // next = 1 olacaktı. 
			
			if (next > val) // 1 < 1 yanlıs olacaktı. Ancak program çalıştırıldığında 1 için 1 den en buyuk fib. num. 2 sonucu vermekte..
				return next; // bir de returnden sonra akış durması lazım değil miydi?
			
			prev2 = prev1;
			prev1 = next;
		}
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminin genel biçimi:
	
	switch (<ifade>) {
		case <sabit ifadesi>:
			<deyim>
		case <sabit ifadesi>:
			<deyim>
			
		...
		[
		default:
			<deyim>
		]
	}
	
	Bu deyimde parantez içerisindeki ifade temel türler için tamsayı türlerinden biri veya char türünden olabilir. Temel
	türler dışında  String ve enum class türlerinden de olabilir. Bu türler ileride ele alınacaktır. switch deyiminin 
	default kısmı zorunlu değildir.
	
	Anahtar Notlar: switch Java 12'den itibaren ifade (expression) olarak da kullanılabilmektedir. Bu tarz deyimlere/ifadelere
	programlamada "ifadesel deyim (expression statement)" da denir. switch'in ifade olarak kullanımına yönelik sentaks ve 
	semantik eklentiler yapılmıştır. İleride ele alınacaktır.

	Violance
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki switch deyiminin if deyimi karşılığı:
	
	if (code == 34387)
		System.out.println("Mecidiyeköy, İstanbul");
	else if (code == 67100)
		System.out.println("Bahçelievler Mahallesi, ZOnguldak");
	else
		System.out.println("Geçersiz posta kodu");
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Posta kodunu giriniz:");
		int code = kb.nextInt();
		
		switch (code) {
		case 34387:
			System.out.println("Mecidiyeköy, İstanbul");
			break;
		case 67100:
			System.out.println("Bahçelievler Mahallesi, ZOnguldak");
			break;
		default:
			System.out.println("Geçersiz posta kodu");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminde default kısım olmak zorunda değildir. Aşağıdaki switch deyiminin if deyimi karşılığı:
	
	if (code == 34387)
		System.out.println("Mecidiyeköy, İstanbul");
	else if (code == 67100)
		System.out.println("Bahçelievler Mahallesi, ZOnguldak");
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Posta kodunu giriniz:");
		int code = kb.nextInt();
		
		switch (code) {
		case 34387:
			System.out.println("Mecidiyeköy, İstanbul");
			break;
		case 67100:
			System.out.println("Bahçelievler Mahallesi, ZOnguldak");
			break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminde default bölümün yerinin önemi yoktur. Şüphesiz sona koymak iyi bir tekniktir.
	Aşağıdaki switch deyiminin if deyimi karşılığı:
	
	if (code == 34387)
		System.out.println("Mecidiyeköy, İstanbul");
	else if (code == 67100)
		System.out.println("Bahçelievler Mahallesi, ZOnguldak");
	else
		System.out.println("Geçersiz posta kodu");
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Posta kodunu giriniz:");
		int code = kb.nextInt();
		
		switch (code) {
		default:
			System.out.println("Geçersiz posta kodu");
			break;
		case 34387:
			System.out.println("Mecidiyeköy, İstanbul");
			break;
		case 67100:
			System.out.println("Bahçelievler Mahallesi, ZOnguldak");
			break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: switch deyiminin bölümleri içerisinde (case ve default) çok fazla işlem yapılması okunabililik/algılanabilirlik
	açısından iyi bir teknik değildir. Bu durumda metot yazıp ilgili bölümlerde çağırmak gerekir. Bunun için net bir sınır
	olmasa da 3-4 satırı geçen kodların yazılmaması iyi bir tekniktir.
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminde case ifadelerinin sabit ifadesi olması gerekir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Posta kodunu giriniz:");
		int code = kb.nextInt();
		
		int c = 67100;
		
		switch (code) {
		case 34387:
			System.out.println("Mecidiyeköy, İstanbul");
			break;
		case c: //error
			System.out.println("Bahçelievler Mahallesi, ZOnguldak");
			break;
		default:
			System.out.println("Geçersiz posta kodu");
			break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminde aynı değere sahip 1'den fazla case bölümü geçersizdir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Posta kodunu giriniz:");
		int code = kb.nextInt();
	
		
		switch (code) {
		case 34387: //error
			System.out.println("Mecidiyeköy, İstanbul");
			break;
		case 34386 + 1: //error
			System.out.println("Mecidiyeköy, İstanbul");
			break;
		case 67102: 
			System.out.println("Bahçelievler Mahallesi, ZOnguldak");
			break;
		default:
			System.out.println("Geçersiz posta kodu");
			break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminde parantez içerisindeki ifade ve case bölümlerine ilişkin sabit ifadeleri temel türler için tamsayı
	türlerinden biri veya char türünden olabibilir.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Posta kodunu giriniz:");
		double code = kb.nextDouble(); //double olamaz. Bu sebepten error vermiştir.
	
		
		switch (code) { //error
		case 34387:
			System.out.println("Mecidiyeköy, İstanbul");
			break;
		case 67102: 
			System.out.println("Bahçelievler Mahallesi, ZOnguldak");
			break;
		default:
			System.out.println("Geçersiz posta kodu");
			break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	switch deyiminde "aşağı düşme (fall through)" özelli vardır. Bir case bölümü veya default bölüm yakalandığında aşağıya 
	doğru engelleyen herhangi bir deyim görülünceye kadar her deyim çalıştırılır. break deyimi switch deyimi sonlandırmak
	için kullanılır. Sonsuz döngü, return deyimi vb. başka aşağı düşmeyi engelleyici deyimler de olabilir. Aşağıdaki 
	kod inceleyiniz.

	onur 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Posta kodunu giriniz:");
		int code = kb.nextInt();

		switch (code) {
		case 34387:
			System.out.println("Mecidiyeköy, İstanbul");
		case 67102: 
			System.out.println("Bahçelievler Mahallesi, Zonguldak");
		default:
			System.out.println("Geçersiz posta kodu");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte switch deyiminin aşağı düşme özelliğinden yararlanılmıştır. Örnekte 212 ve 216 kodları için switch 
	dışında daha kısa yapma yöntemi yoktur.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();

		switch (code) {
		case 212:
		case 216:
			System.out.println("İstanbul");
			break;
		case 372: 
			System.out.println("Zonguldak");
			break;
		default:
			System.out.println("Geçersiz telefon kodu");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte switch deyiminin aşağı düşme özelliğinden yararlanılmıştır.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();

		switch (code) {
		case 212:
			System.out.print("Avrupa, ");
		case 216:
			System.out.println("İstanbul");
			break;
		case 372: 
			System.out.println("Zonguldak");
			break;
		default:
			System.out.println("Geçersiz telefon kodu");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Demo menü uygulaması
	(İleride daha iyisi yazılacaktır) 
 Aqua
 -> Menu uygulamasının switch deyimiyle yapılmış versiyonudur...
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		MenuApp.run();
	}
}


class MenuApp {
	public static void run()
	{
		Menu.run();
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Menu {
	public static void printMenu()
	{
		System.out.println("1.Ekle");
		System.out.println("2.Sil");
		System.out.println("3.Güncelle");
		System.out.println("4.Listele");
		System.out.println("5.Çıkış");
		System.out.print("Seçenek:");
	}
	
	public static void doInsert()
	{
		System.out.println("---------------------------------");
		System.out.println("Ekle seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doDelete()
	{
		System.out.println("---------------------------------");
		System.out.println("Sil seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doUpdate()
	{
		System.out.println("---------------------------------");
		System.out.println("Güncelle seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doList()
	{
		System.out.println("---------------------------------");
		System.out.println("Listele seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doOption(int option)
	{
		switch (option) {
		case 1:
			doInsert();
			break;
		case 2:
			doDelete();
			break;
		case 3:
			doUpdate();
			break;
		default:
			doList();	
		}
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			printMenu();
			int option = Integer.parseInt(kb.nextLine());
			
			if (1 <= option && option <= 5) {
				if (option == 5)
					break;
				
				doOption(option);
			}
			else
				System.out.println("Geçersiz Seçenek!...");
		}
		
		System.out.println("Teşekkürler");
		System.out.println("C ve Sistem Programcıları Derneği");	
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	15.01.2023
	Blue
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Hangi metot içersinde olusak olalım programı sonlandırmak için System sınıfının exit isimli metodu çağrılabilir. Bu
	metot parametre olarak int türden ismine "çıkış kodu (exit code)" denilen ve JVM ve oradan da işletim sistemine iletilen
	bir değer alır. Bu değerin çoğu zaman önemi olmaz. Bazı durumlarda okunabilirliği artırmak için başarı veya başarısızlığa
	yönelik belirlenen değerler argüman olarak verilir. main metodu normal olarak sonlandığında JVM ve oradan da işletim
	sistemine sıfır çıkış kodu iletilir. Çıkış kodunun nerede kullanılabileceği burada ele alınmayacaktır.
	
	Aşağıdaki örmnekte geçersiz giriş durumunda program sonlandırılmıştır. Örnek exit metodunu göstemek için bu şekilde 
	yazılmıştır.

	onur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		LogApp.run();
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class LogApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		double val = kb.nextDouble();
		
		if (val <= 0) {
			System.out.println("Geçersiz giriş!...");
			System.exit(1);
		}
		
		System.out.printf("log(%f) = %f%n", val, Math.log(val));
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Demo menü uygulaması
	(İleride daha iyisi yazılacaktır) 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		MenuApp.run();
	}
}


class MenuApp {
	public static void run()
	{
		Menu.run();
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Menu {
	public static void printMenu()
	{
		System.out.println("1.Ekle");
		System.out.println("2.Sil");
		System.out.println("3.Güncelle");
		System.out.println("4.Listele");
		System.out.println("5.Çıkış");
		System.out.print("Seçenek:");
	}
	
	public static void doInsert()
	{
		System.out.println("---------------------------------");
		System.out.println("Ekle seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doDelete()
	{
		System.out.println("---------------------------------");
		System.out.println("Sil seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doUpdate()
	{
		System.out.println("---------------------------------");
		System.out.println("Güncelle seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doList()
	{
		System.out.println("---------------------------------");
		System.out.println("Listele seçildi");
		System.out.println("---------------------------------");
	}
	
	public static void doExit()
	{
		System.out.println("Teşekkürler");
		System.out.println("C ve Sistem Programcıları Derneği");
		System.exit(0);
	}
	
	public static void doInvalidOption()
	{
		System.out.println("Geçersiz Seçenek!...");
	}
	
	public static void doOption(int option)
	{
		switch (option) {
		case 1:
			doInsert();
			break;
		case 2:
			doDelete();
			break;
		case 3:
			doUpdate();
			break;
		case 4:
			doList();
			break;
		case 5:
			doExit();
		default:
			doInvalidOption();	
		}
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			printMenu();
			doOption(Integer.parseInt(kb.nextLine()));
		}			
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden yıl değerinin artık yıl olup olmadığını test eden isLeapYear
	isimli metodu yazınız ve aşağıdaki kod ile test ediniz. 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		IsLeapYearTest.run();
	}
}

class IsLeapYearTest {
	public static void run()
	{
		for (int y = 1996; y <= 2104; ++y)
			if (DateUtil.isLeapYear(y))
				System.out.println(y);
	}
}

class DateUtil {
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün ay ve yıl bilgisine ilişkin tarihin geçerli olup olmadığını
	test eden isValidDate isimli metodu yazınız ve aşağıdaki kod ile test ediniz  
	(İleride daha iyisi yazılacaktır)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		IsValidDateTest.run();
	}
}

class IsValidDateTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0)
				break;
			
			if (DateUtil.isValidDate(day, month, year))
				System.out.printf("%02d/%02d/%04d tarihi geçerlidir%n", day, month, year);
			else
				System.out.println("Geçersiz tarih!...");
			
		}
	}
}

class DateUtil {
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün ay ve yıl bilgisine ilişkin tarihin geçerli olup olmadığını
	test eden isValidDate isimli metodu yazınız ve aşağıdaki kod ile test ediniz  
	(İleride daha iyisi yazılacaktır)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		IsValidDateTest.run();
	}
}

class IsValidDateTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0)
				break;
			
			if (DateUtil.isValidDate(day, month, year))
				System.out.printf("%02d/%02d/%04d tarihi geçerlidir%n", day, month, year);
			else
				System.out.println("Geçersiz tarih!...");
			
		}
	}
}

class DateUtil {
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
			break;
		default:
			days = 31;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}


/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün ay ve yıl bilgisine ilişkin tarihin yılın kaçıncı günü 
	olduğunu döndüren getDayOfYear metodunu yazınız ve aşağıdaki kod ile test ediniz.
	Açıklamalar:
	  - Metot geçersiz bir tarih için -1 değerine geri dönecektir
	  - Yılın kaçıncı günü olduğuna ilişkin algoritma için aşağıdaki örnekleri inceleyiniz:
	  	01.03.2020 -> 1 + 29 + 31 = 61
	  	01.03.2023 -> 1 + 28 + 31 = 60
	  	31.12.2020 -> 31 + 30 + ... + 29 + 31 = 366
	  	31.12.2023 -> 31 + 30 + ... + 28 + 31 = 365
	  	 
	(İleride daha iyisi yazılacaktır)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		GetDayOfYearTest.run();
	}
}

class GetDayOfYearTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0)
				break;
			
			int dayOfYear = DateUtil.getDayOfYear(day, month, year);
			
			if (dayOfYear != -1)
				System.out.printf("%02d/%02d/%04d tarihi yılın %d. günüdür%n", day, month, year, dayOfYear);
			else
				System.out.println("Geçersiz tarih!...");
			
		}
	}
}

class DateUtil {
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;
		
		int totalDays = day;
		
		switch (month - 1) {    //12. ayı niçin yazmadık?
		case 11:
			totalDays += 30;
		case 10:
			totalDays += 31;
		case 9:
			totalDays += 30;
		case 8:
			totalDays += 31;
		case 7:
			totalDays += 31;
		case 6:
			totalDays += 30;
		case 5:
			totalDays += 31;
		case 4:
			totalDays += 30;
		case 3:
			totalDays += 31;
		case 2:
			totalDays += 28;
			if (isLeapYear(year))
				++totalDays;
		case 1:
			totalDays += 31;
		}
		
		return totalDays;
		
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün ay ve yıl bilgisine ilişkin tarihin haftanın hangi gününe 
	geldiği bilgisini aşağıdaki açıklamalara göre dmndüren getDayOfWeek isimli metodu yazınız ve test ediniz
	Açıklamalar:
		- Metot geçersiz bir tarih durumunda -1 değerine geri dönecektir
		- Haftanın günü 01.01.1900 ile verilen tarih arasındaki (verilen tarih dahil) gün sayısının 7 ile bölümünden
		elde edilen kalan ile belirlenebilir. Buna göre sıfır "pazar, 1 "pazartesi", 2 "salı" ... 6 "cumartesi" günlerine
		kaşılık gelir
		
		- 01.01.1900 öncesindeki tarihler geçersiz sayılacaktır
	  	 
	(İleride daha iyisi yazılacaktır)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		GetDayOfYearTest.run();
	}
}

class GetDayOfYearTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0)
				break;
			
			DateUtil.printDateTR(day, month, year);
		}
	}
}

class DateUtil {
	public static void printDateTR(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		if (dayOfWeek == -1) {
			System.out.println("Geçeriz tarih!...");
			return;
		}
		
		switch (dayOfWeek) {
		case 0:
			System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);
			break;
		case 1:
			System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);
			break;
		case 2:
			System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);
			break;
		case 3:
			System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);
			break;
		case 4:
			System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);
			break;
		case 5:
			System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);
			break;
		case 6:
			System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);
			break;
		}
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays;
		
		if (year < 1900 || (totalDays = getDayOfYear(day, month, year)) == -1)
			return -1;
		
		return (totalDays + getTotalDays(year)) % 7;
		
	}
	
	public static int getTotalDays(int year)
	{
		int totalDays = 0;
		
		for (int y = 1900; y < year; ++y) {
			totalDays += 365;
			if (isLeapYear(y))
				++totalDays;
		}
		
		return totalDays;
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;
		
		int totalDays = day;
		
		switch (month - 1) {
		case 11:
			totalDays += 30;
		case 10:
			totalDays += 31;
		case 9:
			totalDays += 30;
		case 8:
			totalDays += 31;
		case 7:
			totalDays += 31;
		case 6:
			totalDays += 30;
		case 5:
			totalDays += 31;
		case 4:
			totalDays += 30;
		case 3:
			totalDays += 31;
		case 2:
			totalDays += 28;
			if (isLeapYear(year))
				++totalDays;
		case 1:
			totalDays += 31;
		}
		
		return totalDays;
		
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}

/*----------------------------------------------------------------------------------------------------------------------
	21.01.2023
-----------------------------------------------------------------------------------------------------------------------*/


























































