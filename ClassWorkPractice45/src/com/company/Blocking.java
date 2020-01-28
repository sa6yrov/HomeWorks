package com.company;


import java.util.List;

public interface Blocking {
    void blockingUsers(List<UserLogs> userLogsList);

    boolean checkStatusUsers(UserLogs userLogs);
}