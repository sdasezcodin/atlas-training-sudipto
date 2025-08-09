import java.util.Objects;

interface DBExecutor {
    void runQuery(String type);
}

class DB {
    public DB() { }

    public void runIt(String type, String id) {
        System.out.println("We are running a query: " + type + " by " + id);
    }
}

class DBProxy implements DBExecutor {
    private String id;
    private DB db;

    public DBProxy(String id) {
        this.id = id;
        this.db = new DB();
    }
    @Override
    public void runQuery(String type) {
        if (type.equalsIgnoreCase("DELETE") && !Objects.equals(this.id, "ADMIN")) {
            System.out.println("Sorry, access denied for user: " + id);
            return;
        }
        db.runIt(type, this.id);
    }
}

public class ClientProxyDP {
    public static void main(String[] args) {
        DBExecutor adminExecutor = new DBProxy("ADMIN");
        adminExecutor.runQuery("READ");
        adminExecutor.runQuery("UPDATE");
        adminExecutor.runQuery("DELETE");

        System.out.println("----------------");

        DBExecutor managerExecutor = new DBProxy("MANAGER");
        managerExecutor.runQuery("READ");
        managerExecutor.runQuery("UPDATE");
        managerExecutor.runQuery("DELETE");
    }
}
















