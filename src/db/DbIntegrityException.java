package db;

import java.io.Serial;

public class DbIntegrityException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -2480251639477580514L;
    public DbIntegrityException (String msg){
        super(msg);
    }
}
