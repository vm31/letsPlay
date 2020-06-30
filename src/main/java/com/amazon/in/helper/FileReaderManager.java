package com.amazon.in.helper;


import com.amazon.in.dataProviders.ConfigFileReader;

public class FileReaderManager {
    private static com.amazon.in.helper.FileReaderManager fileReaderManager = new com.amazon.in.helper.FileReaderManager();
    private static ConfigFileReader configFileReader;

    private FileReaderManager() {
    }

    public static com.amazon.in.helper.FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }

}

