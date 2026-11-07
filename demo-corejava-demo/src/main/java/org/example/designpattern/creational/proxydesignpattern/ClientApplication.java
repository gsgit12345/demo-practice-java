package org.example.designpattern.creational.proxydesignpattern;

public class ClientApplication {
    public static void main(String str[])
    {
        QueryCommandExecuter executer=new QueryCoomandExecutorProxy("Admin");

        executer.executeQuery("delete command");
    }
}
