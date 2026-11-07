package org.example.designpattern.creational.proxydesignpattern;

public class QueryCoomandExecutorProxy implements QueryCommandExecuter {

    String userType;
    QueryCommandExecuter queryCommandExecuter;

    QueryCoomandExecutorProxy(String userTypey) {
        this.userType = userType;
        queryCommandExecuter = new QueryCommandExecuterImpl();
    }
    QueryCoomandExecutorProxy()
    {

    }
    @Override
    public void executeQuery(String query) {
        if (userType.equalsIgnoreCase("admin")) {
            queryCommandExecuter.executeQuery(query);
            System.out.println("admin is able to execute the delete command");
        } else {
            queryCommandExecuter.executeQuery(query);
        }
    }
}
