package Results;

import javax.lang.model.element.NestingKind;

public class DataResult<T> extends Result{
    T data;

    public DataResult(T data, boolean success, String message ) {
        super(message, success);
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
