package com.epam.utils;

import java.lang.*;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str==null) {
            return false;
        }
        try {
            return (Math.round(Double.parseDouble(str)*1000)/1000) >0;
        }
        catch (NumberFormatException e){
            return false;
        }


    }
}
