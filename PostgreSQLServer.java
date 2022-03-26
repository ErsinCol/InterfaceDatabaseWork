public class PostgreSQLServer implements IDatabaseServer{
    @Override
    public void connect(){
        System.out.println("PostgreSql veritabanına bağlanıyor...");
    }
    @Override
    public void executeQuery(){
        System.out.println("PostgreSql sorgusu çalıştırılıyor...");
    }
     @Override
    public void disconnect(){
        System.out.println("PostgreSql veritabanı bağlantısı sonlandırılıyor...");
     }
}
