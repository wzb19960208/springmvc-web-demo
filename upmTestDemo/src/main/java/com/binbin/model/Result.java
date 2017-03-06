package com.binbin.model;

/**
 * Created by weizhibin on 2017/3/6.
 */
public class Result {

    private Error error;
    private Object object;

    public Result(Error error, Object object) {
        this.error = error;
        this.object = object;
    }

    public Result(Error error) {
        this(error,null);
    }


    public Result(Object object) {
        this(null,object);
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
