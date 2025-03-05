// Exercise-09 : Creating a logger class and creating abstract methods for logging messages at various levels like info, warning and error.

interface Logger {
    void info(String message);
    void warn(String message);
    void error(String message);
}

class Console implements Logger{
    @Override
    public void info(String message){
        System.out.println("This is an Informational Message in console :" + message);
    }
    @Override
   public void warn(String message){
        System.out.println("This is a Warning Message in console :" + message);
    }
    @Override
    public void error(String message){
        System.out.println("This is an Error Message in console :" + message);
    }
}

class File implements Logger{
    @Override
    public void info(String message){
        System.out.println("This is an Informational Message in File :" + message);
    }
    @Override
    public void warn(String message){
        System.out.println("This is a Warning Message in File :" + message);
    }
    @Override
    public void error(String message){
        System.out.println("This is an Error Message in File :" + message);
    }
}

class Database implements Logger{
    @Override
    public void info(String message){
        System.out.println("This is an Informational Message in Database :" + message);
    }
    @Override
    public void warn(String message){
        System.out.println("This is a Warning Message in Database :" + message);
    }
    @Override
    public void error(String message){
        System.out.println("This is an Error Message in Database :" + message);
    }
}
public class LogMessage {
    public static void main(String[] args) {
        Logger consoleLogger = new Console();
        consoleLogger.info("Console Log");
        consoleLogger.warn("Console WARNING");
        consoleLogger.error("Console ERROR");

        Logger fileLogger = new File();
        fileLogger.info("File Log");
        fileLogger.warn("File Warn");
        fileLogger.error("File Error");

        Logger databaseLogger = new Database();
        databaseLogger.info("Database Log");
        databaseLogger.warn("Database Warning");
        databaseLogger.error("Database Error");
    }
}
