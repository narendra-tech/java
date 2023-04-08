package com.haritech.service.Apr4;

public interface Test extends Training, Practice{

    String name = "Hello world";
    int score();
}

interface Training{
    String trainer = "Dravid";
    void trainingTime();
}

interface Practice{
    void practiceTime();
}
