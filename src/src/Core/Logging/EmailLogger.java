package Core.Logging;

public class EmailLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Email ile loglandı : "+data);
    }
}
