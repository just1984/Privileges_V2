val fragenFaktenTURK = listOf(
    Pair(
        "Çocukken düzenli olarak okula gittin mi (en az 9. sınıfa kadar)?",
        "Gerçek: UNESCO'ya göre, dünya genelinde 260 milyon çocuk ve genç okula gitmiyor. Bu, ilkokul çağındaki çocukların ve gençlerin 1'ini oluşturuyor. - Federal İstatistik Ofisi"
    ),
    Pair(
        "Daima temiz içme suyuna erişimin oldu mu?",
        "Gerçek: Küresel ilerlemelere rağmen, temiz içme suyuna erişim hala bir ayrıcalık olup, dünya genelinde yaklaşık iki milyar kişi düzenli olarak temiz suya erişim sağlayamıyor. İklim değişikliği ve devam eden silahlı çatışmalar, bu durumu özellikle dünyanın daha fakir ve kırsal bölgelerinde ağırlaştırıyor. Su eksikliği ve yetersiz hijyenin etkileri bu bölgelerde özellikle dramatik olabiliyor ve hatta eğitim fırsatlarını ve sağlık hizmetlerini bile etkileyebiliyor. - UNICEF"
    ),
    Pair(
        "Büyüdüğün evde çok sayıda kitap var mıydı?",
        "Gerçek: 20 yıllık bir araştırmaya göre, evlerinde kitap bulunan ebeveynler, kendi eğitim seviyelerinden bağımsız olarak, çocuklarının ulaşacağı eğitim seviyesini artırıyor. Hatta 20 kitaplık küçük bir kütüphanenin bile önemli bir etkisi olabiliyor. - ScienceDaily"
    ),
    Pair(
        "Cildin rengi veya diğer dış özellikler nedeniyle hiç hakaret ya da dışlama yaşamadın mı?",
        "Gerçek: Cilt rengi veya diğer dış özelliklere dayalı zorbalık ve ayrımcılık, çocukların mental ve fiziksel sağlığını olumsuz etkileyebilecek kronik strese yol açabilir. Ayrıca, bir çocuğun özgüvenini ve kendine olan güvenini zayıflatarak, daha zayıf okul performansına ve sınırlı gelecek beklentilerine yol açabilir."
    ),
    Pair(
        "Telefon, televizyon ve internet bağlantısı olan bir evde mi yaşıyorsun?",
        "Gerçek: Uluslararası Telekomünikasyon Birliği (ITU) verilerine göre, 2019 sonu itibarıyla dünya nüfusunun yaklaşık %46'sı internete erişim sağlayamıyor ve böylece eğitime, bilgiye ve iletişime kolay erişim sağlayamıyor."
    ),
    Pair(
        "Hasta olduğunda tıbbi bakımın konusunda endişelenmiyor musun?",
        "Gerçek: Bir milyar kişi yeterli ve uygun fiyatlı sağlık hizmetlerine erişememekte. Yoksulluk, hastalığın önemli bir nedeni olup, genellikle tıbbi bakım, temiz su ve sağlık tesislerine erişimi engeller, bu da sağlık sorunlarına yol açabilir, sosyal bozulmalar ve buna bağlı riskler de dahil olmak üzere, fuhuş ve şiddet gibi. Dünya Sağlık Örgütü ve Dünya Bankası'na göre, her yıl sağlık maliyetleri nedeniyle yaklaşık 100 milyon insan yoksulluk sınırının altına düşerken, işsizlik, eğitim eksikliği ve aile planlaması seçeneklerinin yetersizliği sağlık durumunu daha da kötüleştiriyor. - Federal Ekonomik İşbirliği ve Kalkınma Bakanlığı"
    ),
    Pair(
        "Yılda en az bir kez tatil yapabiliyor musun?",
        "Gerçek: Tatil bir lükstür. 2021 yılında, AB vatandaşlarının yaklaşık %27.6'sı bir haftalık tatil gezisine çıkacak kadar paraya sahip olamadı. - Statista"
    ),
    Pair(
        "Arzu ettiğin mesleği mi yapıyorsun veya gelecekte bunu yapabileceğine inanıyor musun?",
        "Gerçek: 2013 yılında Gallup tarafından yapılan bir araştırmaya göre, dünya genelindeki insanların sadece %13'ü işlerini seviyor. Almanya'da bu oran %15."
    ),
    Pair(
        "Her üç ayda bir yeni kıyafet alabiliyor musun?",
        "Gerçek: 2017 tarihli bir Greenpeace araştırmasına göre, Almanlar yılda ortalama 60 yeni giysi alıyor. Bu, ayda 5 yeni giysi anlamına geliyor."
    ),
    Pair(
        "İlgilenecek bir hayatın var mı ve geleceğe güvenle mi bakıyorsun?",
        "Gerçek: Our World in Data tarafından yapılan bir çalışmaya göre, yaşam memnuniyeti ve mutluluk dünya genelinde büyük farklılıklar gösteriyor. Zengin insanlar genellikle kendilerini yoksul insanlardan daha mutlu olarak nitelendiriyor; zengin ülkeler genellikle daha yüksek ortalama mutluluk seviyelerine sahip; ve zaman içinde, sürdürülebilir ekonomik büyüme yaşayan çoğu ülkede mutluluk seviyeleri artıyor."
    ),
    Pair(
        "Toplu taşıma araçlarıyla kolayca bir sonraki şehre gidebilir misin?",
        "Gerçek: Almanya'da, Federal Ulaştırma ve Dijital Altyapı Bakanlığı tarafından yapılan bir çalışmaya göre, nüfusun %23'ü kaliteli bir toplu taşıma hizmetine erişemiyor."
    ),
    Pair(
        "Geceleyin bir yatakta mı uyuyorsun?",
        "Gerçek: Bertelsmann Vakfı'nın 2019 tarihli bir çalışmasına göre, Almanya'da yaklaşık 678.000 kişi evsiz. Bu, nüfusun %0.8'ini oluşturuyor. Dünya genelinde ise yaklaşık 1.6 milyar kişi evsizlikten etkileniyor. Bu da dünya nüfusunun %22'sini oluşturuyor."
    ),
    Pair(
        "Siyasi veya sosyal konularda fikirlerini ifade ettiğinde, fikrinin değerli olduğunu hissediyor musun?",
        ".."
    ),
    Pair(
        "İstediğin zaman diş tedavisi olabilir misin?",
        "Gerçek: Dünya Sağlık Örgütü, dünya genelinde yaklaşık 3.5 milyar kişinin temel ağız sağlığı hizmetlerine erişim sağlayamadığını bildiriyor."
    ),
    Pair(
        "Sokakta partnerini öperek düşmanlık korkusu olmadan davranabilir misin?",
        "Gerçek: Human Rights Watch, dünyanın birçok bölgesinde, özellikle de LGBT topluluğunun üyelerinin katı anti-LGBT yasaları olan ülkelerde, insanların halka açık yerlerde sevgi gösterilerinden korkabileceğini bildiriyor."
    ),
    Pair(
        "Sınır dışı edilme korkun yok mu?",
        "Gerçek: UNHCR'ye göre, 2020 sonunda dünya genelinde çatışma ve zulüm nedeniyle yaklaşık 82.4 milyon kişi yerlerinden edildi, bunların yaklaşık 13 milyonu çocuk. Bu kişilerin birçoğu sürekli olarak sınır dışı edilme korkusu yaşıyor."
    ),
    Pair(
        "Dinini açıkça ve sorunsuz bir şekilde uygulayabiliyor musun?",
        "Gerçek: Dünya nüfusunun iki üçünün yaşadığı tüm ülkelerin üçte birinde (%31.6), dini özgürlükler ihlal ediliyor. Yaklaşık 5.2 milyar kişi, dini özgürlüklerin ağır bir şekilde ihlal edildiği 62 ülkede yaşıyor, bu ülkeler arasında Çin, Hindistan ve Pakistan gibi nüfusça büyük ülkeler de bulunuyor."
    ),
    Pair(
        "Gece karanlığında sokakta güvende hissediyor musun?",
        "Gerçek: Kadınlar ve genç kızlar genellikle erkeklerden daha fazla sokakta güvende hissetmezler. Dünya genelinde kadınların %35'i fiziksel veya cinsel şiddete maruz kaldığını bildiriyor."
    ),
    Pair(
        "Yeterli ve düzenli bir gelirin var mı?",
        "Gerçek: Dünya Bankası'na göre, dünya genelinde 1.3 milyar kişi yoksulluk sınırının altında yaşamakta ve düzenli bir gelir elde edememekte."
    ),
    Pair(
        "Aileni veya arkadaşlarını her zaman arayabilir veya ziyaret edebilir misin?",
        "Gerçek: Global Detention Project'e göre, dünya genelinde bir milyondan fazla kişi, genellikle geçiş veya sınır dışı edilme nedeniyle gözaltına alınmakta ve ailelerinden veya arkadaşlarından uzaklaştırılmakta."
    ),
    Pair(
        "Eve giderken hiç dilenci veya evsiz insan görüyor musun?",
        "Gerçek: Dünya genelinde 100 milyon kişi sokaklarda yaşıyor ve yaklaşık 1.6 milyar kişi düzgün bir konut sağlama konusunda zorluk çekiyor."
    )
)