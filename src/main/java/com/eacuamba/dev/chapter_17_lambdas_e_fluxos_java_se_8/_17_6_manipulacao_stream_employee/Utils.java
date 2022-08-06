package com.eacuamba.dev.chapter_17_lambdas_e_fluxos_java_se_8._17_6_manipulacao_stream_employee;

import java.math.MathContext;
import java.math.RoundingMode;

public class Utils {
    private Utils(){}
    public static MathContext getMC(){
        return new MathContext(2, RoundingMode.HALF_UP);
    }
}
