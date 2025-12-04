package org.example.Basic;

public class Synchronized_Keyword {
    public synchronized void m1(){} //Thread safe because of keyword synchronized

    //String Builder is not Thread safe - Asynchronized
    //String Buffer is Thread safe - synchronized
}
