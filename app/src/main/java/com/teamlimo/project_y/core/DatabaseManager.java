package com.teamlimo.project_y.core;

/**
 * Created by Project0rion on 27.03.2016.
 */
public class DatabaseManager {

    private static DatabaseManager instance;

    private DatabaseManager() {

    }

    public static DatabaseManager getInstance() {
        if (instance == null)
            instance = new DatabaseManager();

        return instance;
    }

    public void connect() {

    }
}
