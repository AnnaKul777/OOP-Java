package org.example.Seminar1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClassStatic {
    private String name;

    public String getName() {
        int i = 0;
        i ++;
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}

