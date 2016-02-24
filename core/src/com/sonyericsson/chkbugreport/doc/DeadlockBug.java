package com.sonyericsson.chkbugreport.doc;

public class DeadlockBug extends Bug {
    public DeadlockBug(Type type, int prio, long timeStamp, String name) {
        super(type, prio, timeStamp, name);
    }

    public DeadlockBug(StringBuffer procNames) {
        super(Bug.Type.PHONE_ERR, Bug.PRIO_DEADLOCK, 0, "Deadlock in process(es) " + procNames);
    }
}
