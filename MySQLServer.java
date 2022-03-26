public class MySQLServer implements IDatabaseServer{

    @Override
    public void connect(){
        System.out.println("MySql veritabanına bağlanıyor...");
    }
    @Override
    public void executeQuery(){
        System.out.println("MySql sorgusu çalıştırılıyor...");
    }
    @Override
    public void disconnect(){
        System.out.println("MySql veritabanı bağlantısı sonlandırılıyor...");
    }
}
