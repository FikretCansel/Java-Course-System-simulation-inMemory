package Log;

import Log.Database.BaseDatabase;
import Log.Database.MySqlManager;
import Log.Database.OracleManager;
import Log.Database.SqlServerManager;

public class mainLog {
    public static void main(String[] args) {



        BaseDatabase database=new MySqlManager();

        database.save();

        database.delete();

        database.Update();

        database.save();

        database.delete();

        database.Update();
        database.save();

        database.delete();

        database.Update();
        database.save();

        database.delete();

        database.Update();
        database.save();

        database.delete();

        database.Update();





    }
}
