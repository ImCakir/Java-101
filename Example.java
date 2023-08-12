/*----------------------------------------------------------------------------------------------------------------------
										Java ile Nesne Yönelimli Programlama

											   Eğitmen: Oğuz KARAN

										C ve Sistem Programcıları Derneği
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	26.11.2022
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
	Aşağı örneği çalıştırıp yuvarlama hatasını gözlemleyiniz. Örneğin detaylarını şu an önemsemeyiniz. İleride hepsi
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
	türü ile aynıdır
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
	Bir metodun parametre değişkenleri aynı türden olsa bile tür bilgisi yazılmalıdır. Aksi durumunda error oluşur
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
	 Metodun paramaetre değişkenlerine değer metot çağrılırken verilir. Metot çağrılırken bir parametreye verilen 
	 ifadeye "argüman" denir. Bir metodun kaç tane parametresi varsa o kadar sayıda sayıda argüman ile çağrılmalıdır.
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
		
		NumberUtil.printTotal(x, y);
		int result = NumberUtil.multiply(x, y);
		
		System.out.println(result);
		result = NumberUtil.square(y);
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
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.println(NumberUtil.multiply(a * 2, b - 4));
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
	Aşağıdaki örnekte iki multiply çağrısı arasında argmanlarda bir değişiklik olmamasına karşın programcı iki kere multiply
	metodunu çağırmıştır. Bu durumda kod hem iki defa çağırmanın gereksizliğiğ hem de okunabilirlik algılanabilirlik
	açısından kötü yazılmıştır. Yani aslında koda okuyan bir programcı için bu metotların iki defa çağrıldığını gördüğünde
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
-----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Metot ne işe yarar? Ya da başka bir deyişle bir problemin çözümünde neden metotlar yazalım? Bu sorular genel 
	olarak aşağıdaki durumlar ile özetlenebilir:
	
	- Bir işi çok fazla yerde yapmak kod tekrarına yol açar. Yazılım geliştirmede temel prensip "zorunlu olmadıkça 
	kod tekrarı yapılmamalıdır (do not repeat yourself)" şeklindedir. Bu durumda programcı önreğin bir metot yazar
	ve ilgili yerlerde çağırır.
	
	- Bir problemin çözümü metot çağırma yerine her yerde kodun yazılması biçiminde gerçekleştirimişse (implementation),
	bu durumda programcı problem için algoritmasında bir değişiklik yapmak isterse veya bir hata olduğunu anlayıp düzeltmek
	isterse her yerde bu değişiklikleri yapmak zorunda kalır. Bu da çoğu zaman zor olabilir. Halbuki programcı bu problemin
	çözümü için bir metot yazarsa değişikliği daha kolay yapabilir.
	
	- Bir problemin çözümü metot çağırma yerine her yerde kodun yazılması biçiminde gerçekleştirimişse (implementation),
	bu durumda kodun okunabilirliği/algılanabilirliği de azalabilir. Yani bu durumda metot çağırarak kodun okunabilirliği/algılanabilirliği
	artırılmış olur.
	
	- Metot yazıldığında başka projelere taşınarak da kullanılabilir (code re-usability).
	
	- Metodu çağıran programcı metodun nasıl yazıldığına ilişkin detayları bilmek zorunda değildir. Çünkü metodun
	çağrıldığı noktada metodun nasıl yazıldığının doğrudan önemi yoktur.
	
	Anahtar Notlar: İleride ele alacağımız "nesne yönelimli programlama tekniği"'ne ilişkin 
	kavramlar ile kodun yönetilmesi anlamında örneğin parçalara ayırma kavramı metotlar
	ile birlikte daha yüksek seviyede başka elemanlar ile de yapılabilecektir. Yani kabaca 
	programlamanın temelinde metotlar vardır  
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
	printf metodunda f format karakteri ile ondalık kısmın kaç basamak olarak formatlanacağı aşağıdaki bibi % ve f
	arasında . ve sayı yazılarak yapılabilir. Geri kalan basamaklar bilimsel olarak yuvarlanır
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
	- Geçme notu arasınavın % 40'ı ile final notunun %60'ının toplamında elde medilecektir
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
	Bölme işlemi tamsayılar ile yapıldığınmda sonuç her zaman tamsayı çıkar. İşlem sonucunda eldeedilen değerin noktadan
	sonraki kısmı yuvarlanmadan atılır. 
	
	Tamsayılar ile bölme işleminde paydanın sıfır olması durumunda exception oluşur
	
	Bu durumların ayrıntıları ileride ele alınacaktır
	
	Aşağıdaki örneği çeşitli değer ile çalıştırıp sonuçları gözlemleyiniz
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
	içerisinde genel olarak Matematik'teki "belirsizlik" için kullanılan "Not a Number (NaN)" değeri vardır. Ayrıca genel 
	olarak sonsuzluk (Matematik'teki tanımsız) için kullanbılan -Infinity ve +Infinity değerleri de vardır. Bu değerler
	dışında da başka özel değerler vardır. Bu durumda gerçek sayılar ile bölme işleminde pay sıfırdan farklı, payda sıfır
	ise payın işaretine göre + veya - Infinity, pay ve paydanın her ikisi birden sıfır ise NaN sonucu elde edilir
	
	Aşağıdaki örneği çeşitli değer ile çalıştırıp sonuçları gözlemleyiniz
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
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}



