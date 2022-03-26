

public class DatabaseApp {
    // bir sınıfın yapmasını istediklerimiz için kullanırız is capable of
    // ne yapması gerektiğini belirtir nasıl yapması gerektiğiyle ilgilenmez
    // bu sayede gerçekleme kısmındaki değişikliklerden istemci kod etkilenmez
    // dependency iversion prensibi base sınıfta bir değişiklik olduğu zaman deriver sınıf buna uyum sağlaması gerekir
    // ancak derived classta bir davranış değiştiiğinde base sınıf yapsıında bir bozulma meydana gelmemeli bu yüzden
    // dependency inversion üst ve alt seviyeli sınıflar arasında ikisininde kullanacağı soyutlama katmanı oluştur
    // open closed prensibi geliştirilmeye açık değişikliğe kapalı olmalı program
    public static void main(String[] args) {
        IDatabaseServer iDatabaseServer=new PostgreSQLServer();
        //IDatabaseServer iDatabaseServer1=new MySQLServer();

        //DEPENDENCY İNJECTİON NESNE DIŞARIDA OLUŞTURULUP İSTEMCİYE GÖDERİLİYOR
        DatabaseTransactionRepository databaseTransactionRepository = new DatabaseTransactionRepository(iDatabaseServer);

        // diğer modüller veri tabanı işlemleri için repository istemci modülün methodlarını çağırırlar
        databaseTransactionRepository.connect();
        databaseTransactionRepository.add();
        databaseTransactionRepository.searchİd(2);
        databaseTransactionRepository.delete();
        databaseTransactionRepository.update();
        databaseTransactionRepository.list();
        databaseTransactionRepository.executeQuery();
        databaseTransactionRepository.disconnect();

    }
}
