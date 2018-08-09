package com.example.db;

import com.example.db.impl.SqlDataBaseServerImpl;

import java.util.List;

public class Business {
   private DataBaseServer dataBaseServer ;

    public DataBaseServer getDataBaseServer() {
        return dataBaseServer;
    }

    public void setDataBaseServer(DataBaseServer dataBaseServer) {
        this.dataBaseServer = dataBaseServer;
    }

    public void getData() {
       List lst = dataBaseServer.getData();
       System.out.println(lst.toString());
   }
}
