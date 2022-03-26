public class DatabaseTransactionRepository implements IDatabaseServer {
    // veritabanı işlemlerini gerçekleştirmek istiyoruz ancak bunun için arayüzü kullanıyoruz
    // böylece bağımlılığı ortadan kaldırmış oluyoruz alt sınıf-üst sınıf

    private IDatabaseServer iDatabaseServer ;
    // her farklı veritabanı için burayı değiştirmiyoruz böylece

    // dependency injection nesne dışarıda oluşturulup istemci koda gönderiliyor
    public DatabaseTransactionRepository(IDatabaseServer iDatabaseServer){
        this.iDatabaseServer=iDatabaseServer;
    }

    public void add(){
        iDatabaseServer.connect();
        System.out.println("Adding transaction done...");
        iDatabaseServer.executeQuery();
        iDatabaseServer.disconnect();
    }
    public void searchİd(int id){
        iDatabaseServer.connect();
        System.out.println(id+"nolu kayıt için arama işlemi yapılıyor");
        iDatabaseServer.executeQuery();
        iDatabaseServer.disconnect();

    }
    public void list(){
        iDatabaseServer.connect();
        System.out.println("Listing transaction done...");
        iDatabaseServer.executeQuery();
        iDatabaseServer.disconnect();
    }
    public void delete(){
        iDatabaseServer.connect();
        System.out.println("Deleting transaction done");
        iDatabaseServer.executeQuery();
        iDatabaseServer.disconnect();
    }

    public void update(){
        iDatabaseServer.connect();
        System.out.println("Updating transaction done");
        iDatabaseServer.executeQuery();
        iDatabaseServer.disconnect();
    }


    @Override
    public void connect() {
        iDatabaseServer.connect();
    }

    @Override
    public void executeQuery() {
        iDatabaseServer.executeQuery();
    }

    @Override
    public void disconnect() {
        iDatabaseServer.disconnect();
    }
}
