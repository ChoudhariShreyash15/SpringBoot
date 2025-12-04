package org.example.component;

import org.example.repo.Engine;
import org.springframework.core.codec.Encoder;

public class PetrolEngine implements Engine {
    public void engineType(){
        System.out.println("Petrol Engine");
    }
}
