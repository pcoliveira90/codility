package br.oliveira.codility.tasks.task01;

public class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int sequence = 0, aux = 0;
        for(char value : binary.toCharArray()){
            if(value == '0')
                aux++;
            else{
                if(sequence < aux)
                    sequence = aux;
                aux = 0;
            }
        }
        return sequence;
    }
}
