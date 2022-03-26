package com.cinquantacinque;

public class Test
{
    public static void main(String[] args) {
        A[] arr = new B[10];
        C gamma = new C();
        B beta = gamma;
        A alfa = gamma;
        //System.out.println(beta.f(gamma,arr));
        // metodo non implementato e ambiguo in quanto passa in input
        // un oggetto C e un array di oggetti di tipo A
        //necessita di almeno un cast(A) per poter girare
        System.out.println(gamma.f(arr,alfa)) ;
        System.out.println(gamma.f(beta,alfa));
        System.out.println(5 | 7);
    }

}
